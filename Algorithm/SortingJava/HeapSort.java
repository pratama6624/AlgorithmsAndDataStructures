package Algorithm.SortingJava;

import java.util.Arrays;
class Heap {
    private int arrayCapacity = 10;
    private int[] data = new int[arrayCapacity];
    private int size = 0;
    private int step = 1;
    private int getLeftIndex(int parentIndex) { return (parentIndex * 2) + 1; }
    private int getRightIndex(int parentIndex) { return (parentIndex * 2) + 2; }
    private int getParentIndex(int childIndex) { return (childIndex - 1) / 2; }
    private int left(int index) {  return this.data[getLeftIndex(index)]; }
    private int right(int index) {  return this.data[getRightIndex(index)]; }
    private int parent(int index) {  return this.data[getParentIndex(index)]; }
    private boolean hasLeft(int index) { return getLeftIndex(index) < size; }
    private boolean hasRight(int index) { return getRightIndex(index) < size; }
    
    public void add(int[] array) {
        // Adding new element to heap
        for(var index = 0; index < array.length; index++) {
            add(array[index]);
        }
    }

    public void add(int value) {
        // Adding new element to heap
        ensureCapacity();
        this.data[size] = value;
        size++;
        heapifyUp();
        System.out.println("After heap up\t: " + Arrays.toString(this.data));
    }

    public int[] sort() {
        // Sorting
        for(var index = size - 1; index > 0; index--) {
            System.out.println("\nStep " + (step++) + "\t: " + " swapping " + this.data[0] + " with " + this.data[index]);
            pool(index);
        }

        return this.data;
    }

    private void pool(int index) {
        swap(0, index);
        System.out.println("After swapping\t: " + Arrays.toString(this.data));
        size--;
        heapifyDown();
    }
    
    private void ensureCapacity() {
        if(size >= arrayCapacity) {
            arrayCapacity *= 2;
            this.data = Arrays.copyOf(this.data, arrayCapacity);
        }
    }

    private void heapifyUp() {
        int index = size - 1;
        while(parent(index) < this.data[index]) {
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }

    private void heapifyDown() {
        int index = 0;
        while(hasLeft(index)) {
            int biggest = getLeftIndex(index);
            if(right(index) > left(index) && hasRight(index)) {
                biggest = getRightIndex(index);
            }
            if(this.data[index] > this.data[biggest] || biggest == size) {
                break;
            } else {
                swap(index, biggest);
            }
            index = biggest;
        }
        System.out.println("After heap down : " + Arrays.toString(this.data));
    }

    private void swap(int indexOne, int indexTwo) {
        int temp = this.data[indexOne];
        this.data[indexOne] = this.data[indexTwo];
        this.data[indexTwo] = temp;
    }
}

public class HeapSort {
    public static void main(String[] args) {
        int[] numbers2 = {4, 10, 3, 5, 1};

        Heap heap = new Heap();
        heap.add(40);
        heap.add(31);
        heap.add(23);
        heap.add(numbers2);

        int[] data = heap.sort();
        System.out.println("\n\nData Sorted : " + Arrays.toString(data));
    }
}
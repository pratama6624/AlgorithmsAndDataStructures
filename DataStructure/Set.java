package DataStructure;

import java.util.Arrays;

// In the data set structure, double data is not allowed, and must be unique
class SetDataStucture {
    private int size = 0;
    private Integer[] data;

    SetDataStucture(int maxSize) {
        this.data = new Integer[maxSize];
    }

    SetDataStucture() {
        this.data = new Integer[10];
    }

    // Add data
    public boolean add(Integer value) {
        // Always check the capacity of the array every time you add new data
        capacityCheck();
        if(contains(value)) {
            return false;
        }
        data[size] = value;
        size++;
        return true;
    }

    // Checksif if a value is in the set
    public boolean contains(Integer value) {
        for(var i = 0; i < data.length; i++) {
            if(value.equals(data[i])) {
                return true;
            }
        }
        return false;
    }

    // Capacity increases automatically
    private boolean capacityCheck() {
        if(data.length <= size) {
            Integer[] tempData = new Integer[data.length * 2];
            for(var i = 0; i < size; i++) {
                tempData[i] = data[i];
            }
            data = tempData;
            return true;
        }
        return false;
    }

    // See which index will be deleted and shifted
    private int indexOf(Integer value) {
        for(var i = 0; i <= size; i++) {
            if(value == data[i]) return i;
        }
        return -1;
    }

    // Remove
    public boolean remove(Integer value) {
        if(contains(value)) {
            for(var i = indexOf(value); i < size; i++) {
                data[i] = data[i + 1];
            }
            size--;
            return true;
        }
        return false;
    }

    // Check size
    public int getSize() {
        return this.size;
    }

    // To String Override
    public String toString() {
        return Arrays.toString(data);
    }

    // Print data to the screen
    public void print() {
        if(size > 0) {
            System.out.print("Set : ");
            for(var i = 0; i < size - 1; i++) {
                System.out.print(data[i] + ", ");
            }
            System.out.println(data[size - 1]);
        } else {
            System.out.println("Set is empty");
        }
    }
}

public class Set {
    public static void main(String[] args) {
        SetDataStucture myData = new SetDataStucture(5);
        myData.add(10);
        myData.add(3);

        System.out.println(myData);
        System.out.println("Size : " + myData.getSize());

        myData.remove(10);

        System.out.println(myData);
        System.out.println("Size : " + myData.getSize());

        myData.add(21);
        myData.add(20);
        myData.add(3);
        myData.add(5);

        System.out.println(myData);
        System.out.println("Size : " + myData.getSize());

        System.out.println();

        // myData.remove(3);

        myData.print();
    }
}

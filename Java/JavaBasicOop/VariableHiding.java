package JavaBasicOop;

class ParentVH {
    String name;

    public void doIt() {
        System.out.println("Do it from parent");
    }
}

class ChildVH extends ParentVH {
    String name;

    public void doIt() {
        System.out.println("Do it from child");
    }
}

public class VariableHiding {
    public static void main(String[] args) {
        ChildVH childVH = new ChildVH();
        childVH.name = "Chaeyoung";
        childVH.doIt();
        System.out.println(childVH.name);

        // When changed to parent the name will be null
        ParentVH parentVH = (ParentVH) childVH;
        parentVH.doIt();
        System.out.println(parentVH.name);

        ParentVH parentVH2 = new ParentVH();
        parentVH2.name = "Nayeon";
        parentVH2.doIt();
        System.out.println(parentVH2.name);
    }
}

package Lab7.Task3;

public class Main {
    public static void main(String[] args) {
        System.out.println(new SuperClassTest3(42));
        System.out.println(new Subclass1(42, 'F'));
        System.out.println(new Subclass2(42, 'F', "text"));

        var sup = new SuperClassTest3(42);
        var inherited = new Subclass1(42, 'F');
        var finalObject = new Subclass2(42, 'F', "text");

        sup.setValue(43);
        inherited.setValue(43, 'A');
        finalObject.setValue(43, 'A', "test text");

        System.out.println(sup);
        System.out.println(inherited);
        System.out.println(finalObject);
    }
}

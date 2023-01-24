package Lab7.Task3;

public class Main {
    public static void main(String[] args) {
        System.out.println(new SuperClassTest3(42));
        System.out.println(new Subclass1(42, 'O'));
        System.out.println(new Subclass2(42, 'O', "Тест"));

        var sup = new SuperClassTest3(42);
        var inherited = new Subclass1(42, 'V');
        var finalObject = new Subclass2(42, 'V', "Тест");

        sup.setValue(43);
        inherited.setValue(43, 'H');
        finalObject.setValue(43, 'H', "Тест!");

        System.out.println(sup);
        System.out.println(inherited);
        System.out.println(finalObject);
    }
}

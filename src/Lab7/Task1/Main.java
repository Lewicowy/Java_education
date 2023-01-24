package Lab7.Task1;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject = new SuperClassTest("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);
        subClassTest subClassObject1 = new subClassTest("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);
        subClassTest subClassObject2 = new subClassTest("передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}
package Lab7.Task4;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        var base = new SuperClassTest4('X');
        System.out.println("Признак: " + base.character);
        var cloneBase = base.clone();
        cloneBase.character = 'Y';
        System.out.println("Признак: " + base.character);
        System.out.println("Признак: " + cloneBase.character);

        var inherited = new SuperClassTest41('X', "Проект");
        System.out.println("Признак: " + inherited.character + ", Проект: " + inherited.text);
        var cloneInherited = inherited.clone();
        cloneInherited.character = 'Y';
        System.out.println("Признак: " + inherited.character);
        System.out.println("Признак: " + cloneInherited.character + ", Клонирование: " + (cloneInherited.text != inherited.text));

        var finalObject = new SuperClassTest411('X', "Тест", 42);
        System.out.println("Признак: " + finalObject.character + ", Проект: " + finalObject.text + ", Величина: " + finalObject.value);
        var cloneFinal = finalObject.clone();
        cloneFinal.character = 'Y';
        cloneFinal.value = 43;
        System.out.println("Признак: " + finalObject.character + ", Величина: " + finalObject.value);
        System.out.println("Признак: " + cloneFinal.character + ", Величина: " + cloneFinal.value + ", Клонирование: " + (cloneFinal.text != finalObject.text));
    }
}

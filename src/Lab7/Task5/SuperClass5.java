package Lab7.Task5;

public class SuperClass5 {
    protected String text;

    public SuperClass5(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "SuperClassTest5{" + "Проект =' " + text + '\'' + '}';
    }
}

class SuperClass51 extends SuperClass5 {
    protected char character;

    public SuperClass51(String text, char character) {
        super(text);
        this.character = character;
    }

    @Override
    public String toString() {
        return "InheritedClass3{" + "Признак = " + character + ", Проект =' " + text + '\'' + '}';
    }
}

class SuperClass511 extends SuperClass5 {
    protected int value;

    public SuperClass511(String text, int value) {
        super(text);
        this.value = value;
    }

    @Override
    public String toString() {
        return "InheritedClass4{" + "Величина = " + value + ", Проект =' " + text + '\'' + '}';
    }
}

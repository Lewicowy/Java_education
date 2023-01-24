package Lab7.Task3;

public class SuperClassTest3 {
    protected int value;

    public SuperClassTest3(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "SuperClassTest3{" + "Величена = " + value + '}';
    }
}

class Subclass1 extends SuperClassTest3 {
    public char character;

    public Subclass1(int value, char character) {
        super(value);
        this.character = character;
    }

    public void setValue(int value, char character) {
        this.value = value;
        this.character = character;
    }

    @Override
    public String toString() {
        return "Subclass1{" + "Признак = " + character + ", Величена = " + value + '}';
    }
}

final class Subclass2 extends Subclass1 {
    public String text;

    public Subclass2(int value, char character, String text) {
        super(value, character);
        this.text = text;
    }

    public void setValue(int value, char character, String text) {
        this.value = value;
        this.character = character;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Subclass2{" + "Тест =' " + text + '\'' + ", Признак = " + character + ", Величина=" + value + '}';
    }
}

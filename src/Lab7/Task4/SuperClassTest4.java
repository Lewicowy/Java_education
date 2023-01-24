package Lab7.Task4;

public class SuperClassTest4 implements Cloneable {
    public char character;

    public SuperClassTest4(char character) {
        this.character = character;
    }

    @Override
    protected SuperClassTest4 clone() throws CloneNotSupportedException {
        return (SuperClassTest4) super.clone();
    }
}

class SuperClassTest41 extends SuperClassTest4 {
    public String text;

    public SuperClassTest41(char character, String text) {
        super(character);
        this.text = text;
    }

    @Override
    protected SuperClassTest41 clone() throws CloneNotSupportedException {
        var result = (SuperClassTest41) super.clone();
        result.text = new String(this.text);
        return result;
    }
}

final class SuperClassTest411 extends SuperClassTest41 {
    public int value;

    public SuperClassTest411(char character, String text, int value) {
        super(character, text);
        this.value = value;
    }

    @Override
    protected SuperClassTest411 clone() throws CloneNotSupportedException {
        return (SuperClassTest411) super.clone();
    }
}

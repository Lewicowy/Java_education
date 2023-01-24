package Lab7.Task2;

public class SubClassTest2 extends SuperClassTest2 {
        public int value;

        SubClassTest2(String strEx) {
            super(strEx);
            this.value = 0;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setStr(String str, int value) {
            super.setStr(str);
            this.value = value;
        }

        @Override
        public void setStr(String str) {
            super.setStr(str);
        }

        public void setStr() {
            super.setStr();
        }
}

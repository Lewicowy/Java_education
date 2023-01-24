package Lab5;

public class Task2 {
        public char ch1;
        public char ch2;
        public void setS1(char x, char y) { this.ch1 = x; this.ch2 = y;
        }
        public void viewS1() { int n1 =ch1; int n2 =ch2;
            if (ch1 > ch2) {
                n1 = ch2;
                n2 = ch1;
            }
            for (int i = n1; i <= n2; i++) {
                System.out.println((char) i);
            }
        }
    }
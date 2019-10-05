package question11;

import java.util.Scanner;

public class Question11 {
    private String string;
    private char ch;

    public Question11(String string, char ch) {
        this.string = string;
        this.ch = ch;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public void allIndexesOfCharacter() {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                System.out.println(i);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine().trim();
        char ch = scanner.next().charAt(0);
        scanner.close();

    }
}
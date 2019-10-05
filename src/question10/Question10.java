package question10;

import java.util.Scanner;

public class Question10 {
    private String string;
    private char ch;

    public Question10(String string, char ch) {
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

    public void indexOfGivenCharacter() {
        int index = string.indexOf(ch);
        System.out.println(index);
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
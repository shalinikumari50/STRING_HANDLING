package question1;

import java.util.Scanner;

public class Question1 {
    private String string;

    public Question1(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void indexChar() {
        StringBuilder index = new StringBuilder("index:\t");
        StringBuilder characters = new StringBuilder("chars:\t");
        for (int i = 0; i < string.length(); i++) {
            index.append(i + "\t");
            characters.append(string.charAt(i) + "\t");
        }
        System.out.println(index);
        System.out.println(characters);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
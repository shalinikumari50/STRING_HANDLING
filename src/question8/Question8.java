package question8;

import java.util.Scanner;

public class Question8 {
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Question8(String string) {
        this.string = string;
    }

    public int calculateUpperWeight() {
        char[] characters = string.toCharArray();
        int upperWeight = 0;
        for (char var : characters) {
            if (Character.toUpperCase(var) == var) {
                upperWeight += var;
            }
        }
        return upperWeight;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Question8 ques8 = new Question8(string);
        int upperWeight = ques8.calculateUpperWeight();
        System.out.println(upperWeight);
        scanner.close();

    }
}
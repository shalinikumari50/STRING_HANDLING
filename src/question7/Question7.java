package question7;

import java.util.Scanner;

public class Question7 {
    private String string;

    public Question7(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void calculateTotalWeight() {
        char[] characters = string.toCharArray();
        int weight = 0;
        for (char var : characters) {
            weight += var;
        }
        System.out.println(weight);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Question7 ques7 = new Question7(string);
        ques7.calculateTotalWeight();
        scanner.close();

    }
}
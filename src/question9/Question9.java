package question9;

import question8.Question8;

import java.util.Scanner;

public class Question9 extends Question8 {
    public Question9(String string) {
        super(string);
    }

    public int calculateLowerWeight() {
        char[] characters = getString().toCharArray();
        int lowerWeight = 0;
        for (char var : characters) {
            if (Character.toLowerCase(var) == var) {
                lowerWeight += var;
            }
        }
        return lowerWeight;
    }

    public int calculateAbsoluteWeight() {
        int absoluteWeight = Math.abs(calculateUpperWeight() - calculateLowerWeight());
        return absoluteWeight;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Question9 ques9 = new Question9(string);
        int absoluteWeight = ques9.calculateAbsoluteWeight();
        System.out.println(absoluteWeight);
        scanner.close();
    }
}
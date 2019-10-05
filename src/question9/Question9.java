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
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
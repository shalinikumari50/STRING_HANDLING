package question4;

import question3.Question3;

import java.util.Scanner;

public class Question4 extends Question3 {
    public Question4(String string) {
        super(string);
    }

    @Override
    public void replaceVowels() {

        int count = 0;
        for (int i = 0; i < getString().length(); i++) {

            if (count == 0) {
                setString(getString().replaceFirst("[aeiou]", "*"));
                count += 1;
            } else if (count == 1) {
                setString(getString().replaceFirst("[aeiou]", "^"));
                count += 1;
            } else {
                setString(getString().replaceFirst("[aeiou]", "!"));
                count = (count + 1) % 3;
            }
        }

        System.out.println(getString());
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Question4 ques4 = new Question4(string);

        scanner.close();
    }
}
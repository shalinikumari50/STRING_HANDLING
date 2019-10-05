package question6;

import java.util.Scanner;

public class Question6 {
    private String string;

    public Question6(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void upperCase() {
        string = string.toUpperCase();
        System.out.println(string);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Question6 ques6 = new Question6(string);
        ques6.upperCase();
        scanner.close();
    }

}
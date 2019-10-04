package question3;

import java.util.Scanner;

public class Question3 {
    private String string;

    public Question3(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void replaceVowels() {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        for (char var : arr) {
            string = string.replace(var, '*');
        }
        System.out.println(string);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

    }
}

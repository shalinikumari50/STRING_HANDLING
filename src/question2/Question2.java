package question2;

import java.util.Scanner;

public class Question2 {
    private String string;
    private int index;

    public Question2(String string, int index) {
        this.string = string;
        this.index = index;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void substring() {
        System.out.println(string.substring(index));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());
        Question2 ques2 = new Question2(string, index);
        ques2.substring();
        scanner.close();
    }
}

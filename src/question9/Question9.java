package question9;

import question8.Question8;

public class Question9 extends Question8 {
    public Question9(String string) {
        super(string);
    }

    public void calculateLowerWeight() {
        char[] characters = getString().toCharArray();
        int lowerWeight = 0;
        for (char var : characters) {
            if (Character.toLowerCase(var) == var) {
                lowerWeight += var;
            }
        }
        System.out.println(lowerWeight);
    }
}

package question4;

import question3.Question3;

public class Question4 extends Question3 {
    public Question4(String string) {
        super(string);
    }

    @Override
    public void replaceVowels() {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (char var : arr) {
            if (count == 0) {
                setString(getString().replace(var, '*'));
                count += 1;
            } else if (count == 1) {
                setString(getString().replace(var, '^'));
                count += 1;
            } else {
                setString(getString().replace(var, '!'));
                count = (count + 1) % 3;
            }

        }
        System.out.println(getString());
    }
}

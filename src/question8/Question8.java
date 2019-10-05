package question8;

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

    public void calculateUpperWeight() {
        char[] characters = string.toCharArray();
        int upperWeight = 0;
        for (char var : characters) {
            if (Character.toUpperCase(var) == var) {
                upperWeight += var;
            }
        }
        System.out.println(upperWeight);
    }
}

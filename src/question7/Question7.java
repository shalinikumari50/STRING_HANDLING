package question7;

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

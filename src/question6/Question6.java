package question6;

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

}
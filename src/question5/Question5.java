package question5;

public class Question5 {
    private String string;
    private String substring;

    public Question5(String string, String substring) {
        this.string = string;
        this.substring = substring;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getSubstring() {
        return substring;
    }

    public void setSubstring(String substring) {
        this.substring = substring;
    }


    public void replaceSubstring() {
        string = string.replaceAll(substring, "*");
        System.out.println(string);
    }
}

class Main {
}
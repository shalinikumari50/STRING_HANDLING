package question2;

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

}

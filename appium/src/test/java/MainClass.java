

public class MainClass {

    private String class_string = "Hello, world!";

    public String getClass_string() {
        return class_string;
    }


    public int getLocalNumber() {
        return 14;
    }


    public Boolean getClassNumber(int number) {
        if (number <= 45) {
            System.out.println("Number can't be equal "+number+"");
            return false;
        } else {
            return true;
        }
    }

}

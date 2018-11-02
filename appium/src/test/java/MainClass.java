public class MainClass {

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

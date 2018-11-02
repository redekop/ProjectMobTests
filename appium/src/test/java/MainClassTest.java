import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    private int value;
    private String subString = "hello";

    @Test
    public void testGetLocalNumber() {
        this.value = 14;
        //assert getLocalNumber() == this.value : ""+getLocalNumber()+" != "+this.value+"";
        Assert.assertEquals( ""+getLocalNumber()+" != "+this.value+"" , getLocalNumber(), this.value);
    }


    @Test
    public void testGetClassNumber() {
        this.value = 46;
        assert getClassNumber(this.value);
    }


    @Test
    public void testGetClassString() {
        if (getClass_string().toLowerCase().contains(subString)) {
            System.out.println("The string="+getClass_string()+" contains a substring="+subString+"" );
        } else {
            System.out.println("The string="+getClass_string()+" does not contain a substring="+subString+"" );
            Assert.fail();
        }

    }
}

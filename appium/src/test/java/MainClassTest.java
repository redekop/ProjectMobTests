import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    private int value;

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
}

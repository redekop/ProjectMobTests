import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    private int value = 14;

    @Test
    public void testGetLocalNumber() {
        //assert getLocalNumber() == this.value : ""+getLocalNumber()+" != "+this.value+"";
        Assert.assertEquals( ""+getLocalNumber()+" != "+this.value+"" , getLocalNumber(), this.value);
    }
}

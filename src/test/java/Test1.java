import org.junit.Assert;
import org.junit.Test;

public class Test1
{

    @Test
    public void test1()
    {
        System.out.println("Eseguo il test1");
        Assert.assertTrue("True == false!",true != false);
    }
}

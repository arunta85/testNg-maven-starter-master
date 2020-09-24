package samples;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by trierra on 7/23/15.
 */
public class SampleTest {

    @Test(groups = {"unit"})
    public void first(){
        System.out.println("unit3");
    }

    @Test(groups = {"web"})
    public void second(){
        System.out.println("web2");
        Assert.assertEquals("2", "2");
    }

    @Test(groups = {"db"})
    public void third(){
        System.out.println("db--");
    }
}

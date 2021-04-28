import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void simpleTest(){
        Assert.assertEquals(Main.position('b'), "Position of alphabet: 2");

    }

    @Test
    public void nullTest(){
        Assert.assertEquals(Main.position('0'), "Position of alphabet: 0");

    }

    @Test
    public void numberTest(){
        Assert.assertEquals(Main.position('9'),"Position of alphabet: 0");
    }
}

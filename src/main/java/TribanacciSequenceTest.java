import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TribanacciSequenceTest {

    TribanacciSequence tribanacciSequence;

    double[] signature1 = {0, 0, 1};
    double[] signature2 = {0, 1, 1};
    double[] signature3 = {1, 1, 1};

    @Before
    public void init(){
        TribanacciSequence tribanacciSequence = new TribanacciSequence();
    }

    @Test
    public void generateTribanacciSequenceTest(){
        double[] signature = {4, 7, 14};
        int precision = 0;

        String expected = "";

        double[] output = TribanacciSequence.generateTribanacciSequence(signature, precision);
        String actual = "";
        for (double number : output){
            actual += number + "\n";
        }

        Assert.assertEquals(expected, actual);
    }

}
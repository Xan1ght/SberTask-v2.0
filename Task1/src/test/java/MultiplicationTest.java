import ok.exceptions.CheckedParity;
import ok.exceptions.Multiplication;
import org.junit.Assert;

import static org.junit.Assert.*;
import java.nio.file.AccessDeniedException;

public class MultiplicationTest {
    @org.junit.Test
    public void multiplicationTest1() throws CheckedParity {
        Multiplication test1 = new Multiplication();
        int res = test1.multiplication(2, 6);
        Assert.assertEquals(res, 12);
    }

    @org.junit.Test
    public void multiplicationTest2() throws CheckedParity {
        Multiplication test2 = new Multiplication();
        int res = test2.multiplication(3, 6);
        Assert.assertEquals(res, 18);
    }
}
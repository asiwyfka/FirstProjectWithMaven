package avdeyev.vik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Sample {
    @Test
    public void someTest(){
        Calculator calculator = new Calculator();
        int result = calculator.add(10,5);
        Assertions.assertEquals(15,result);
    }
}

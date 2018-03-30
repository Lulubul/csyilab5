package amazon.cloudshape.core;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.junit.Test;

import static org.junit.Assert.fail;

public class BadTest {

    @Test
    public void meant_to_fail() throws Exception {
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
    }
}

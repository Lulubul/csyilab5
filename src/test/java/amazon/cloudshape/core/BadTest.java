package amazon.cloudshape.core;


import org.junit.Test;

import static org.junit.Assert.fail;

public class BadTest {

    @Test
    public void meant_to_fail() throws Exception {
        assertEquals(1, 1);
    }
}

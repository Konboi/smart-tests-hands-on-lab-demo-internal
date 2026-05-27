package example;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class MulTest {
    @Test
    public void calc() {
        assertThat(new Mul().calc(8,3), is(24));
    }
}

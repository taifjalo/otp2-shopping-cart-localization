import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    public void multiMe() {
        assertEquals(8.0, ShoppingCart.multiMe(2,4));
        assertEquals(0.0, ShoppingCart.multiMe(0,4));
        assertEquals(-8.0, ShoppingCart.multiMe(2,-4));

    }
}
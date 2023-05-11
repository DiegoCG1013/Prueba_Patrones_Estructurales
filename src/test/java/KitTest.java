import Composite.Elemento;
import Composite.Kit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KitTest {


    @Test
    void addComponenteGetPrecio() {
        //Test
        Elemento e1 = new Elemento(10, 1);
        Elemento e2 = new Elemento(20, 2);
        Kit k = new Kit();
        k.addComponente(e1);
        k.addComponente(e2);
        Kit k2 = new Kit();
        k2.addComponente(e1);
        k2.addComponente(k);
        //Assert
        assertEquals(27, k.getPrecio());

    }
}
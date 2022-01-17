package clases;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAplicarTarifa {
    AplicarTarifa aplicarTarifa = new AplicarTarifa();

    @Test
    public void testObtenerPrecioDeProducto() {
        String productoIngresado = "pizza";
        Integer precioEsperado = 4000;
        Integer precioDevuelto;

        precioDevuelto = aplicarTarifa.precioProducto(productoIngresado);
        assertEquals(precioEsperado, precioDevuelto);
    }
}

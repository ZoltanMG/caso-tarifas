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

    @Test
    public void testAplicarDescuentoProducto() {
        Integer precioPoducto = aplicarTarifa.precioProducto("mazorcada");
        Integer porcentajeDescuento = 50;
        Integer precioEsperado = 5000;
        Integer precioDevuelto;

        precioDevuelto = aplicarTarifa.descuento(precioPoducto, porcentajeDescuento);
        assertEquals(precioEsperado, precioDevuelto);
    }
}

package clases;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAplicarTarifa {
    AplicarTarifa aplicarTarifa = new AplicarTarifa();

    @Test
    public void testObtenerPrecioDeProducto() {
        String productoIngresado = "pizza";
        int precioEsperado = 4000;
        int precioDevuelto;

        precioDevuelto = aplicarTarifa.precioProducto(productoIngresado);
        assertEquals(precioEsperado, precioDevuelto);
    }

    @Test
    public void testAplicarDescuentoProducto() {
        int precioPoducto = aplicarTarifa.precioProducto("mazorcada");
        int porcentajeDescuento = 20;
        int precioEsperado = 8000;
        int precioConDescuento;

        precioConDescuento = aplicarTarifa.descuento(precioPoducto, porcentajeDescuento);
        assertEquals(precioEsperado, precioConDescuento);
    }

    @Test
    public void testAplicarIva() {
        int precioSinIva = aplicarTarifa.precioProducto("hamburguesa");
        int precioEsperado = 9520;
        int precioConIva;

        precioConIva = aplicarTarifa.iva(precioSinIva);
        assertEquals(precioEsperado, precioConIva);
    }

    @Test
    public void testTarifaFinal() {
        int porcentajdeDescuento = 50;
        int porcentajdeDescuentoCero = 0;
        String producto = "choriperro";
        int tarifaFinalEsperada = 4165;
        int tarifaFinalEsperadaCero = 8330;
        int tarifaFinalDevuelta;
        int tarifaFinalDevueltaCero;

        tarifaFinalDevuelta = aplicarTarifa.tarifaFinal(producto, porcentajdeDescuento);
        tarifaFinalDevueltaCero = aplicarTarifa.tarifaFinal(producto, porcentajdeDescuentoCero);
        assertEquals(tarifaFinalEsperada, tarifaFinalDevuelta);
        assertEquals(tarifaFinalEsperadaCero, tarifaFinalDevueltaCero);
    }
}

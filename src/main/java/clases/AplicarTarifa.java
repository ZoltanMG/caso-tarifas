package clases;

public class AplicarTarifa {
    public int precioProducto(String productoIngresado) {
        int precioProducto;
        Productos productos = new Productos();
        precioProducto = productos.stack.get(productoIngresado);
        return precioProducto;
    }

    public int descuento(int precioProducto, int porcentajeDescuento) {
        int precioConDescuento;
        precioConDescuento = precioProducto - ((precioProducto * porcentajeDescuento) / 100);
        return precioConDescuento;
    }

    public int iva(int precioSinIva) {
        int precioConIva;
        precioConIva = precioSinIva + ((precioSinIva * 19) / 100);
        return precioConIva;
    }

    public int tarifaFinal(String producto, int porcentajdeDescuento) {
        int precioProducto;
        int precioFinal;

        precioProducto = this.precioProducto(producto);
        if (porcentajdeDescuento == 0) {
            precioFinal = this.iva(precioProducto);
            return precioFinal;
        }
        precioFinal = this.iva(this.descuento(precioProducto, porcentajdeDescuento));
        return precioFinal;
    }
}

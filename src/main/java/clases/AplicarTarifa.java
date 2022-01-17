package clases;

public class AplicarTarifa {
    public Integer precioProducto(String productoIngresado) {
        Integer precioProducto;
        Productos productos = new Productos();
        precioProducto = productos.stack.get(productoIngresado);
        return precioProducto;
    }
}

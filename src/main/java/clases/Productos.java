package clases;

import com.sun.deploy.cache.BaseLocalApplicationProperties;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Productos {
    public static Hashtable<String, Integer> stack = new Hashtable<String, Integer>();

    public Productos() {
        stack.put("hamburguesa", 8000);
        stack.put("perro", 5000);
        stack.put("salchipapa", 9000);
        stack.put("pizza", 4000);
        stack.put("mazorcada", 10000);
        stack.put("choriperro", 7000);
    }

    public static void imprimirProductos() {
        Productos productos = new Productos();
        Enumeration e1 = Productos.stack.elements();
        Enumeration e2 = Productos.stack.keys();

        while (e1.hasMoreElements()) {
            System.out.print(e2.nextElement() + ": ");
            System.out.println("$" + e1.nextElement());
        }
    }
}

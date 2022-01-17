package clases;

import java.util.HashMap;

public class Productos {
    HashMap<String, Integer> stack = new HashMap();

    public Productos() {
        stack.put("hamburguesa", 8000);
        stack.put("perro caliente", 5000);
        stack.put("salchipapa", 9000);
        stack.put("pizza", 4000);
        stack.put("mazorcada", 10000);
        stack.put("choriperro", 7000);
    }
}

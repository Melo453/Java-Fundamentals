package Main.Model.inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static final int MAX_ITEMS = 10;
    private List<String> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public Inventario(List<String> items) {
        this.items = items;
    }

    public List<String> items() {
        return items;
    }

    public Inventario setItems(List<String> items) {
        this.items = items;
        return this;
    }

    public boolean addItem(String item){
        if (items.size() < MAX_ITEMS){
            items.add(item);
            return true;
        }
        else {
            System.out.println("inventario lleno");
            return false;
        }
    }
}

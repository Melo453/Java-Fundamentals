import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<String> items;

    public Inventario() {
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
}

package dev.Model.inventario;

import dev.fabri.rpg.Interfaces.IConsumible;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static final int MAX_ITEMS = 10;
    private List<IConsumible> items;

    public Inventario() {
        this.items = new ArrayList<>();
    }

    public Inventario(List<IConsumible> items) {
        this.items = items;
    }

    public List<IConsumible> items() {
        return items;
    }

    public Inventario setItems(List<IConsumible> items) {
        this.items = items;
        return this;
    }

    public boolean addItem(IConsumible item){
        if (items.size() < MAX_ITEMS){
            items.add(item);
            return true;
        }
        else {
            System.out.println("inventario lleno");
            return false;
        }
    }

    public boolean removeItem(IConsumible item){
        return items.remove(item);
    }
}
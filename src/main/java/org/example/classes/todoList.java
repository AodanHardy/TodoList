package org.example.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class todoList {
    private List<Item> todoList;


    public todoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(Item item){
        this.todoList.add(item);
    }

    public void remove(Item item){
        this.todoList.removeIf(todos -> todos == item);
    }

    public void remove(String title){
        this.todoList.removeIf(item -> Objects.equals(item.getTitle(), title));
    }
    public int size(){
        return this.todoList.size();
    }


}

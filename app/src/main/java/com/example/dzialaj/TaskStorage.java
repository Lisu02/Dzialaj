package com.example.dzialaj;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TaskStorage {
    private static final TaskStorage taskStorage = new TaskStorage();
    private final List<Task> listaZadan = new ArrayList<>();
    private TaskStorage(){
        for (int i = 0; i < 100; i++) {
            Task noweZadanie = new Task();
            noweZadanie.setName("Imie zadania " + i);
            noweZadanie.setDone(i % 3 == 0);
            listaZadan.add(noweZadanie);
        }
    }

    public static TaskStorage getInstance() {
        return taskStorage;
    }
    public List<Task> getListaZadan() { return listaZadan; }
    public Task getTask(UUID id) {
        for(Task t : listaZadan) {
            if(t.getId().equals(id))
                return t;
        }
        return null;
    }
}

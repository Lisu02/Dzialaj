package com.example.dzialaj;

import java.util.Date;
import java.util.UUID;

public class Task {
    private UUID id;
    private String name;
    private Date date;
    private boolean done = false;

    private Category category = Category.STUDIA;

    public Task() {
        id = UUID.randomUUID();
        date = new Date();
    }

    public Category getCategory(){return category;}

    public void setCategory(Category category){this.category = category;}

    public Date getDate() {
        return date;
    }
    public void setDate(Date time){date = time;}
    public boolean isDone() {
        return done;
    }
    public void setDone(boolean isChecked) {
        done = isChecked;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public UUID getId() {
        return id;
    }
}

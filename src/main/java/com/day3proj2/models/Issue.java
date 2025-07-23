package com.day3proj2.models;

import com.day3proj2.interfaces.Reportable;

public abstract class Issue implements Reportable {
    protected String title;
    protected String description;

    public Issue(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public abstract void display();
}
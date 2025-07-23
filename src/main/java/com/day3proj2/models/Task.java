package com.day3proj2.models;

public class Task extends Issue {

    private String assignee;

    public Task(String title, String description, String assignee) {
        super(title, description);
        this.assignee = assignee;
    }

    @Override
    public void display() {
        System.out.println("Task");
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Assigned To: " + assignee);
    }

    @Override
    public void reportStatus() {
        System.out.println("Task status: Assigned and in progress.");
    }
}
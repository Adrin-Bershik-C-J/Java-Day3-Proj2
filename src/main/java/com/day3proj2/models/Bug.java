package com.day3proj2.models;

public class Bug extends Issue {

    private String severity;

    public Bug(String title, String description, String severity) {
        super(title, description);
        this.severity = severity;
    }

    @Override
    public void display() {
        System.out.println("Bug");
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Severity: " + severity);
    }

    @Override
    public void reportStatus() {
        System.out.println("Bug status: Reported to QA team.");
    }
}
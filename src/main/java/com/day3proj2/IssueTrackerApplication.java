package com.day3proj2;

import java.util.*;

import com.day3proj2.models.Bug;
import com.day3proj2.models.Issue;
import com.day3proj2.models.Task;

public class IssueTrackerApplication {

    public static void main(String[] args) {

        Issue bug = new Bug("Login Failure", "Fails on correct credentials", "High");
        Issue task = new Task("Update Docs", "Revise API documentation", "Adrin");

        List<Issue> issues = Arrays.asList(bug, task);

        for (Issue issue : issues) {
            issue.display();
            System.out.println();
            issue.reportStatus();
            System.out.println();
        }
    }
}
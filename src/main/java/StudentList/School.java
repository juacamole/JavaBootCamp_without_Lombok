package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {

    List<String> studentList = new ArrayList<>();

    public void addStudent (String student){
        studentList.add(student);
        System.out.println(student + " has ben added to the list");
        System.out.println(studentList.contains(student));
    }
}

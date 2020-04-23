package com.company;

import java.util.ArrayList;
import java.util.List;

public class UniversityCourses {
    List students=new ArrayList();
    String course;
    String instructor;

    UniversityCourses(String courseName,String instructorName){
        this.course=courseName;
        this.instructor=instructorName;
    }
    void registration(String studentName){
        students.add(studentName);
    }
    void drop(String studentName){
        students.remove(studentName);
    }

}

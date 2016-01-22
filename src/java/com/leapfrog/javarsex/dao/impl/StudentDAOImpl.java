/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.javarsex.dao.impl;

import com.leapfrog.javarsex.dao.StudentDAO;
import com.leapfrog.javarsex.entity.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sajjan
 */
public class StudentDAOImpl implements StudentDAO{

    List<Student> studentList = null;
    
    public StudentDAOImpl(){
        studentList = new ArrayList<>();
    }
    
    @Override
    public List<Student> getAll() {
        
        studentList.add(new Student(1, "sajjan", "mishra", "lifeof069@gmail.com", true));
        studentList.add(new Student(2, "saman", "kapali", "punk_rock@gmail.com", false));
        studentList.add(new Student(3, "sakar", "dahal", "sak_4204@gmail.com", true));
        studentList.add(new Student(4, "sabal", "shrestha", "sabal@gmail.com", false));
        return studentList;
    }

    @Override
    public Student getById(int id) {
        for(Student s: getAll()){
            if(s.getId()==id){
                return s;
            }
        }
        return null;
    }
    
}

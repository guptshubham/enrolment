package com.varietyinnovation.enrolment.dao;

import java.util.List;
import com.varietyinnovation.enrolment.modal.*;
public interface StudentDAO {
 
 List<Student> get();
 
 Student get(int SNo);
 
 void save(Student student);
 
 void delete(int SNo);
}
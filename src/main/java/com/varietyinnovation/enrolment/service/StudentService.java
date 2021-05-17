package com.varietyinnovation.enrolment.service;

import java.util.List;
import com.varietyinnovation.enrolment.modal.*;
public interface StudentService {
List<Student> get();
 
Student get(int SNo);
 
 void save(Student student);
 
 void delete(int SNo);
}
package com.varietyinnovation.enrolment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.varietyinnovation.enrolment.service.*;
import com.varietyinnovation.enrolment.modal.*;
@RestController
@RequestMapping("/api")
public class StudentController {
 
 @Autowired
 private StudentService studentService;
 
 @GetMapping("/student")
 public List<Student> get() {
  return studentService.get();
 }
 
 @PostMapping("/student")
 public Student save(@RequestBody Student student) {
	 studentService.save(student);
  return student;
 }
 
 @GetMapping("/student/{SNo}")
 public Student get(@PathVariable int SNo) {
  return studentService.get(SNo);
 }
 
 @DeleteMapping("/student/{SNo}")
 public String delete(@PathVariable int SNo) {
  
	 studentService.delete(SNo);
  
  return "Student removed with SNo "+SNo;
  
 }
 
 @PutMapping("/student")
 public Student update(@RequestBody Student student) {
	 studentService.save(student);
  return student;
 }
}

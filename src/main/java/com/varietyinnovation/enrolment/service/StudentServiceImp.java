package com.varietyinnovation.enrolment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.varietyinnovation.enrolment.dao.*;
import com.varietyinnovation.enrolment.modal.*;
@Service
public class StudentServiceImp implements StudentService {
 
 @Autowired
 private StudentDAO studentDao;
@Transactional
 @Override
 public List<Student> get() {
  return studentDao.get();
 }
@Transactional
 @Override
 public Student get(int SNo) {
  return studentDao.get(SNo);
 }
@Transactional
 @Override
 public void save(Student student) {
	studentDao.save(student);
  
 }
@Transactional
 @Override
 public void delete(int SNo) {
	studentDao.delete(SNo);
  
 }
}

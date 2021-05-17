package com.varietyinnovation.enrolment.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.varietyinnovation.enrolment.modal.*;
@Repository
public class StudentDAOImp implements StudentDAO {
@Autowired
 private EntityManager entityManager;
@Override
 public List<Student> get() {
Session currSession = entityManager.unwrap(Session.class);
  Query<Student> query = currSession.createQuery("from Student", Student.class);
  List<Student> list = query.getResultList();
  return list;
}
@Override
 public Student get(int SNo) {
  Session currSession = entityManager.unwrap(Session.class);
  Student emp = currSession.get(Student.class, SNo);
  return emp;
 }
@Override
 public void save(Student student) {
  
  Session currSession = entityManager.unwrap(Session.class);
  currSession.saveOrUpdate(student);
}
@Override
 public void delete(int SNo) {
  Session currSession = entityManager.unwrap(Session.class);
  Student emp = currSession.get(Student.class, SNo);
  currSession.delete(emp);
}
}

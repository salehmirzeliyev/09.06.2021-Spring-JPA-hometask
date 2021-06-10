package az.code.springjpahometask.services;

import az.code.springjpahometask.models.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    List<Student> find(String name, String surname);
    Student getById(long id);
    Student save(Student student);
    Student delete(long id);
}

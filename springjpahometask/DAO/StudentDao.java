package az.code.springjpahometask.DAO;

import az.code.springjpahometask.models.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAll();
    List<Student> find(String name, String surname);
    Student getById(long id);
    Student save(Student student);
    Student delete(long id);

}
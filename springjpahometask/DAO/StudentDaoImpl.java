package az.code.springjpahometask.DAO;

import az.code.springjpahometask.models.Student;
import az.code.springjpahometask.repositories.StudentRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Component
public class StudentDaoImpl implements StudentDao{

    StudentRepository studentRepository;

    EntityManager entityManager;

    public StudentDaoImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    public Student generate(){
        return entityManager.merge(Student.builder().name("Saleh").surname("Mirze").build());
    }


    @Override
    public List<Student> getAll() {
        return Streamable.of(studentRepository.findAll()).toList();
    }

    @Override
    public List<Student> find(String name, String surname) {
        return null;
    }

    @Override
    public Student getById(long id) {
        return (Student) Streamable.of(studentRepository.findById(id)).toList();
    }

    @Override
    public Student save(Student student) {
        return (Student) Streamable.of(studentRepository.save(student)).toList();
    }

    @Override
    public Student delete(long id) {
        studentRepository.deleteById(id) ;
        return null;
    }
}

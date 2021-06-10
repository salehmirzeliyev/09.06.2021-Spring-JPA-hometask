package az.code.springjpahometask.repositories;

import az.code.springjpahometask.models.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}

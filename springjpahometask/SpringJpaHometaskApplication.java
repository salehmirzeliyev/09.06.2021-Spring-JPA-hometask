package az.code.springjpahometask;

import az.code.springjpahometask.DAO.StudentDaoImpl;
import az.code.springjpahometask.models.Student;
import az.code.springjpahometask.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringJpaHometaskApplication implements CommandLineRunner {
    private ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaHometaskApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        StudentService studentService = context.getBean(StudentService.class);
    }

    @Autowired
    public void setContext(ApplicationContext context){
        this.context = context;
    }
}

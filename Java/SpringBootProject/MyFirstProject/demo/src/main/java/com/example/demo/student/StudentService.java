package com.example.demo.student;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/*This is the service layer that helps in getting the data from database and
establish connection between data access layer(StudentRepository) and API layer(StudentController)*/
/*Note: This is the business logic layer.*/
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
//        return List.of( new Student(1L,"Gaurav","g@gmail.com", LocalDate.of(2000, Month.APRIL,22),22),new Student("Harsh","h@gmail.com",LocalDate.of(2001,Month.JUNE,26),28));
    }
    public void addNewStudent(Student student){
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if(studentOptional.isPresent()){
            throw new IllegalStateException("Already exists");
        }
        studentRepository.save(student);
        System.out.println(student);
    }

    public void deleteStudent(Long id) {
        boolean exists = studentRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException("There is no id "+ id);
        }else{
            studentRepository.deleteById(id);
        }
    }

    public void updateStudent(Student student) {
        boolean exists = studentRepository.existsById(student.getId());

        if(!exists){
            throw new IllegalStateException("There is no data in for studentID" + student.getId());
        }else{
            studentRepository.deleteById(student.getId());
        }
    }
@Transactional
    public void updateStudent(Long id, String name, String email) {
       Student student = studentRepository.findById(id)
               .orElseThrow(()-> new IllegalStateException(
                       "The id does not exists" + id
               ));
       if(name != null && name.length() > 0 && !Objects.equals(student.getName(),name)){
           student.setName(name);
       }
       if(email != null && email.length() > 0 && !Objects.equals(student.getEmail(),email)){
           Optional <Student> studentOptional = studentRepository.findStudentByEmail(email);
           if(studentOptional.isPresent()){
               throw new IllegalStateException("The email already exists" + email);
           }else{
               student.setEmail(email);
           }
       }
    }
}

package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Dinusha",
                        "dinushamadhuranga77@gmail.com",
                        LocalDate.of(2001, Month.JULY, 27),
                        27
                )
        );
    }

}

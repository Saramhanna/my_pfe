package ma.ges.students.services;

import ma.ges.students.dto.StudentDto;

import java.util.List;

public interface StudentService {

  StudentDto create(StudentDto dto);
    StudentDto update(StudentDto dto);
    boolean delete(long id);
    List<StudentDto> readAll(StudentDto dto);
}

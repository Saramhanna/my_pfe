package ma.ges.students.mapper;

import ma.ges.students.dto.StudentDto;
import ma.ges.students.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    public StudentEntity convertDtoToEntity(StudentDto dto){
        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
    public StudentDto convertEntityToDto(StudentEntity entity){
        StudentDto dto = new StudentDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;

    }
    public List<StudentEntity> concertDtoToEntities(List<StudentDto> entities){
        return entities
                .stream()
                .map(dto -> convertDtoToEntity(dto))
                .collect(Collectors.toList());
    }

    public List<StudentDto> convertEntityToDto(List<StudentEntity> dto){
        return dto
                .stream()
                .map(entity -> convertEntityToDto(entity))
                .collect(Collectors.toList());
    }
}


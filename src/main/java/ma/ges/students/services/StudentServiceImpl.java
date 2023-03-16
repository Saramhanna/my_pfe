package ma.ges.students.services;

import ma.ges.students.dto.StudentDto;
import ma.ges.students.mapper.StudentMapper;
import ma.ges.students.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{

    public static final Logger
            LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);
    private StudentRepository repository;
    private StudentMapper mapper;

    public StudentServiceImpl(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public StudentDto create(StudentDto dto) {
        LOGGER.debug("Star method name {} ", dto);
        LOGGER.debug("end method name {} ", dto);
        return mapper.convertEntityToDto(repository.create(mapper.convertDtoToEntity(dto)));
    }

    @Override
    public StudentDto update(StudentDto dto) {
        LOGGER.debug("Star method name {}", dto);
        LOGGER.debug("end method name {}", dto);
        return mapper.convertEntityToDto(repository.update(mapper.convertDtoToEntity(dto)));
    }

    @Override
    public boolean delete(long id) {
        LOGGER.debug("Star method delete id {} ", id);
        LOGGER.debug("end method id {}", id);
        return repository.delete(id);
    }

    @Override
    public List<StudentDto> readAll(StudentDto dto) {
        LOGGER.debug("Star method readAll ");
        LOGGER.debug("end method name {}");
        return mapper.convertEntityToDto(repository.readAll(mapper.convertDtoToEntity(dto)));
    }}

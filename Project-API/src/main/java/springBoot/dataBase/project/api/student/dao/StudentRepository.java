package springBoot.dataBase.project.api.student.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springBoot.dataBase.project.api.student.bean.Student;

@Repository

public interface StudentRepository extends CrudRepository<Student,Integer> {

}

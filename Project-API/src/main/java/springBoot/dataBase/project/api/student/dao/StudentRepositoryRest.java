package springBoot.dataBase.project.api.student.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import springBoot.dataBase.project.api.student.bean.Student;

@Controller
public interface StudentRepositoryRest extends JpaRepository<Student,Integer>{

	public Student findByStdId(int id);

}

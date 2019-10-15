package springBoot.dataBase.project.api.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import springBoot.dataBase.project.api.student.bean.Student;
import springBoot.dataBase.project.api.student.dao.StudentRepositoryRest;


@RestController
public class StudentControllerRest {
	
    @Autowired
    private StudentRepositoryRest stdRest;

	@GetMapping(path="/allStudents")
	public List<Student> getStudents()
	{
		return stdRest.findAll();
		
		
	}
	
	@PostMapping(path="/addStudent")
	public List<Student> addStudent(@RequestBody Student student)
	{
		
		stdRest.save(student);
		return stdRest.findAll();
	}
}

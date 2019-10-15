package springBoot.dataBase.project.api.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import springBoot.dataBase.project.api.student.bean.Student;
import springBoot.dataBase.project.api.student.dao.StudentRepository;
import springBoot.dataBase.project.api.student.dao.StudentRepositoryRest;

@Controller
public class StudentController {
   
	@Autowired
	private StudentRepository stuRepo;
	
	@Autowired
	private StudentRepositoryRest stuRest;
	
	@RequestMapping("addStudent")
	public String addStudent()
	{
		
		System.out.println("Inside addStudent");
		
		return "addStudent";
	}
	/*
	@RequestMapping("checkStudentExist")
	public ModelAndView checkStudentExist(Student stu)
	{
		
		System.out.println("Inside checkStudentExist");
		Boolean isExist = false;
		System.out.println("The student id is : "+stu.getStdId()+stu.getStdName());
		isExist = stuRepo.exists(stu.getStdId())   ;
		ModelAndView mv=new ModelAndView();
		mv.addObject("isExist",isExist);// can add multiple objects i.e. data along with it to the next page
		mv.setViewName("addStudent");
		return mv;
	}*/
	
	@RequestMapping("checkStudentExist")
	public ModelAndView checkStudentExist(@RequestParam int stdId)
	{
		
		System.out.println("Inside checkStudentExist");
		Boolean isExist = false;
		System.out.println("The student id is : "+stdId);
		isExist = stuRepo.exists(stdId)   ;
		ModelAndView mv=new ModelAndView();
		mv.addObject("isExist",isExist);// can add multiple objects i.e. data along with it to the next page
		mv.setViewName("addStudent");
		return mv;
	}
	
	@RequestMapping("addNewStudent")
	public String addNewStudent(Student stu)
	{
		
		System.out.println("Inside addNewStudent"+stu.getStdId());
		stuRepo.save(stu);
		return "addStudent";
	}
	
	// Testing Rest service
	// get all the students
	@RequestMapping("/Students")
	@ResponseBody
	public List<Student> getStudents()
	{ 
		
		
		return stuRest.findAll();
		
	}
	 //get the student based on student id
	
	@RequestMapping("/Students/{stuId}")
	@ResponseBody
	public Student getStudentsById(@PathVariable("stuId") int stuId)
	{
		
		
		return stuRest.findByStdId(stuId);
		
	}
	
}

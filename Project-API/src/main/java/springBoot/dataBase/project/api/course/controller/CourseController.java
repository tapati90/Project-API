package springBoot.dataBase.project.api.course.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springBoot.dataBase.project.api.course.bean.Course;
import springBoot.dataBase.project.api.course.service.CourseService;
import springBoot.dataBase.project.api.topic.bean.Topic;



//import springBoot.dataBase.CourseApi.topic.TopicService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;


	@RequestMapping("/getAllTheCourses")
	@CrossOrigin(origins = "http://localhost:4200")
	public String getAllTheCourses()
	{
		return "Default return all the course Tapati";
	}
	
	@RequestMapping("/getHello")
	@CrossOrigin(origins = "http://localhost:4200")
	public String getHello()
	{
		return "Hello";
	}
	
	//View all the courses for a particular topic
	@RequestMapping("/topics/{topicId}/courses")
	public List<Course> getAllCourses(@PathVariable String topicId)
	{
		return courseService.getAllCourses(topicId);
	}
	
	//View the courses based on CourseId
	@RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return courseService.getCourse(courseId);
	}
	
	//Add new Course based 
	@RequestMapping(method=RequestMethod.POST , value="topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course , @PathVariable String topicId)
	{
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	//Update new Course
	@RequestMapping(method=RequestMethod.PUT, value="topics/{topicId}/courses/{courseId}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId , @PathVariable String courseId)
	{
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course , courseId);
	}
	
	//Delete Course based on courseId
	@RequestMapping(method=RequestMethod.DELETE, value="topics/{topicId}/courses/{courseId}")
	public void deleteCourse(@PathVariable String courseId)
	{
		courseService.deleteCourse(courseId);
	}
	
}

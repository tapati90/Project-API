package springBoot.dataBase.project.api.course.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import springBoot.dataBase.project.api.course.bean.Course;

public interface CourseRepository extends CrudRepository<Course,String>{
	public List<Course> findByTopicId(String topicId);

}

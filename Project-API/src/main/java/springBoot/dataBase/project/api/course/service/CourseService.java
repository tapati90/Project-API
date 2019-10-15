package springBoot.dataBase.project.api.course.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBoot.dataBase.project.api.course.bean.Course;
import springBoot.dataBase.project.api.course.dao.CourseRepository;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	/*private List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("1001","JavaPlus","Training"),
			new Topic("1002","Teradata","Infosys"),
			new Topic("1003","java","Tcss")
			));*/

    public List<Course> getAllCourses(String topicId)
    {
    	//return topics;
    	List<Course> courses=new ArrayList<>();
    	courseRepository.findByTopicId(topicId)
    	.forEach(courses::add);
    	return courses;
    }
    
    public Course getCourse(String id)
    {
    	//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return courseRepository.findOne(id);
    }

	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
	}

	/*public void updateTopic(Topic topic, String id) {
		topics.forEach(topicEach ->
		{
			if(topicEach.getId().equals(id))
				topics.set(topics.indexOf(topicEach),topic);
		});
	}*/
	
	public void updateCourse(Course course, String courseId) {
	/*for(int i=0 ;i<topics.size();i++)
	{
		Topic topicNew = topics.get(i);
		if(topicNew.getId().equals(id))
		{
			topics.set(i, topic);
			return;
		}
	}*/
		courseRepository.save(course);// save works for both save and update, if entity exist it does an update ele it add
		
	
}

	public void deleteCourse(String courseId) {
		//topics.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(courseId);
	}
}


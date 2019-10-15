package springBoot.dataBase.project.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import springBoot.dataBase.project.api.course.bean.Course;
import springBoot.dataBase.project.api.topic.bean.Topic;


@SpringBootApplication
public class ProjectApiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ProjectApiApplication.class, args);
		
		ConfigurableApplicationContext context = SpringApplication.run(ProjectApiApplication.class, args);
		   //To get the object of Topic directly from the Spring container we need to add @component 
			Topic topic1=context.getBean(Topic.class);
		    topic1.TopicTest();
		    Topic topic2=context.getBean(Topic.class);
		    topic2.TopicTest();
		    
		    Course course1=context.getBean(Course.class);
		    course1.courseTest();
		    Course course2=context.getBean(Course.class);
		    course2.courseTest();
	}

}

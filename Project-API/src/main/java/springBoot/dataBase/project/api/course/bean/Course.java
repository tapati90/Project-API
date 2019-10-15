package springBoot.dataBase.project.api.course.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import springBoot.dataBase.project.api.topic.bean.Topic;



@Entity
@Component
@Scope(value="prototype")
public class Course {
    @Id
	private String id;
	private String name;
	private String description;
	
	@ManyToOne
	private Topic topic;
	

	public Course() {
		System.out.println("creating course object");
	}
	
	
	public Course(String id, String name, String description ,String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic=new Topic(topicId,"","");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	
	public void courseTest()
	{
		System.out.println("inside course test");
	}
}

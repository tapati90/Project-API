package springBoot.dataBase.project.api.topic.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Topic {
    @Id
	private String id;
	private String name;
	private String description;
	
	public Topic() {
		System.out.println("Topic object created");
	}
	
	
	public Topic(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
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
	 public void TopicTest()
	 {
		 System.out.println("inside Topic Test");
	 }
	 
	
}

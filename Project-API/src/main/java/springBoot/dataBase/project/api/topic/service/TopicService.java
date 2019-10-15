package springBoot.dataBase.project.api.topic.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springBoot.dataBase.project.api.topic.bean.Topic;
import springBoot.dataBase.project.api.topic.dao.TopicRepository;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	/*private List<Topic> topics= new ArrayList<>(Arrays.asList(
			new Topic("1001","JavaPlus","Training"),
			new Topic("1002","Teradata","Infosys"),
			new Topic("1003","java","Tcss")
			));*/

    public List<Topic> getAllTopics()
    {
    	//return topics;
    	List<Topic> topics=new ArrayList<>();
    	topicRepository.findAll()
    	.forEach(topics::add);
    	return topics;
    }
    
    public Topic getTopic(String id)
    {
    	//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        return topicRepository.findOne(id);
    }

	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	/*public void updateTopic(Topic topic, String id) {
		topics.forEach(topicEach ->
		{
			if(topicEach.getId().equals(id))
				topics.set(topics.indexOf(topicEach),topic);
		});
	}*/
	
	public void updateTopic(Topic topic, String id) {
	/*for(int i=0 ;i<topics.size();i++)
	{
		Topic topicNew = topics.get(i);
		if(topicNew.getId().equals(id))
		{
			topics.set(i, topic);
			return;
		}
	}*/
		topicRepository.save(topic);// save works for both save and update, if entity exist it does an update else it add
		
	
}

	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}
}


package springBoot.dataBase.project.api.topic.dao;

import org.springframework.data.repository.CrudRepository;

import springBoot.dataBase.project.api.topic.bean.Topic;

public interface TopicRepository extends CrudRepository<Topic,String>{

}

package io.tutorial.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
	   new Topic("Spring", "Spring Framework", "Spring Framework Description"),
	   new Topic("Java", "Java", "Java Description"),
	   new Topic("JavaScript", "Java Script", "Description"),
	   new Topic("TypeScript", "Type Script", "Description")
	   ));

	public List<Topic> getAllTopics() {
		System.out.println("Entering getAllTopics " + topics);
		return topics;
	}

	public Topic getTopicByID(String id) {
		System.out.println("Entering TopicService:getTopicByID with " + id);

		Topic topicByID = null;

		for (Topic topic : topics) {
			if (topic.getId().equals(id)) {
				topicByID = topic;
			}
		}
		System.out.println("Returning from TopicService topic " + topicByID);
		return topicByID;
	}

	public void addTopic(Topic topic) {
		System.out.println("Entering TopicService:addTopic with " + topic);
		topics.add(topic);
	}

	public void removeTopic(String id) {
		System.out.println("Entering TopicService:removeTopic with " + id);

		Topic topicByID = null;

		for (Topic topic : topics) {
			if (topic.getId().equals(id)) {
				topicByID = topic;
			}
		}

		topics.remove(topicByID);
		System.out.println("Final Topic List from TopicService After Removal " + topics);
	}

	public void updateTopic(Topic topicToUpdate) {
		System.out.println("Entering TopicService:updateTopic with " + topicToUpdate);

		removeTopic(topicToUpdate.getId());
		addTopic(topicToUpdate);
		
		System.out.println("Final Topic List After Removal " + topics);
	}

}

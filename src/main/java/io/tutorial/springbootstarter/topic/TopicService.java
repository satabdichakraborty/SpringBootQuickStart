package io.tutorial.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(

			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Java", "Java Description"), 
			new Topic("JavaScript", "Java Script", "Description"),
			new Topic("TypeScript", "Type Script", "Description"));
	
	
	public List<Topic> getAllTopics() {
		System.out.println("Entering getAllTopics "+topics);
		return topics;
	}
	
	public Topic getTopicByID(String id) {
		System.out.println("Entering getTopicByID with "+id);
		
		Topic topicByID=null;
		
		for (Topic topic : topics) {
			if(topic.getId().equals(id)) {
				topicByID = topic;
			}
		}
		System.out.println("Returning topic "+topicByID);
		return topicByID;
	}

}

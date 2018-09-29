package io.tutorial.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(

			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Java", "Java Description"), 
			new Topic("Java Script", "Java Script", "Description"),
			new Topic("Type Script", "Type Script", "Description"));
	
	
	public List<Topic> getAllTopics() {
		return topics;
	}

}

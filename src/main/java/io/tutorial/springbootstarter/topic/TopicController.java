package io.tutorial.springbootstarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topic")
	public String getTopics() {
		return "topic";
	}

	@GetMapping("/topics")
	@ResponseBody
	public List<Topic> getAllTopics() {

		List<Topic> topics = new ArrayList<Topic>();

		topics.add(new Topic("Spring", "Spring Framework", "Spring Framework Description"));
		topics.add(new Topic("Java", "Java", "Java Description"));
		topics.add(new Topic("Java Script", "Java Script", "Description"));
		topics.add(new Topic("Type Script", "Type Script", "Description"));

		System.out.println(topics);
		return topics;
	}
}

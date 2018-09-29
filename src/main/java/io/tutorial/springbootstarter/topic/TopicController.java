package io.tutorial.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topic")
	public String getTopics() {
		return "topic";
	}

	@GetMapping("/topics")
	@ResponseBody
	public List<Topic> getAllTopics() {
	
		return topicService.getAllTopics();
	}
	
	@GetMapping("/topics/{topicId}")
	public Topic getTopicByID(@PathVariable String topicId) {
	    System.out.println("Entering getTopicByID with "+topicId);
		return topicService.getTopicByID(topicId);
	}
	
}

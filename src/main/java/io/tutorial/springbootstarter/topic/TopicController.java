package io.tutorial.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
		System.out.println("Entering getTopicByID with " + topicId);
		return topicService.getTopicByID(topicId);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic t) {
		System.out.println("Entering addTopic with " + t);
		topicService.addTopic(t);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicId}")
	public void removeTopic(@PathVariable String topicId) {
		System.out.println("Entering removeTopic with topicId = " + topicId);
		topicService.removeTopic(topicId);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}")
	public void updateTopic(@RequestBody Topic topic) {
		System.out.println("Entering updateTopic with = " + topic);
		topicService.updateTopic(topic);
	}

}

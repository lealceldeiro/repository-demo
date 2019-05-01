package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	@PostConstruct
	private void showTopicRepositoryInfo() {
		System.out.println("*************TopicRepository autowired******************  \n ->" + topicRepository.getClass().getCanonicalName());
	}
}

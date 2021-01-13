package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class TopicService {
    private static final Logger log = LoggerFactory.getLogger(TopicService.class);
    @Autowired
    private TopicRepository topicRepository;

    @PostConstruct
    private void showTopicRepositoryInfo() {
        String lineSeparator = System.lineSeparator();
        String message = lineSeparator
                         + "************ TopicRepository autowired ************  "
                         + lineSeparator
                         + " ->" + topicRepository.getClass().getCanonicalName();
        log.info(message);
    }
}

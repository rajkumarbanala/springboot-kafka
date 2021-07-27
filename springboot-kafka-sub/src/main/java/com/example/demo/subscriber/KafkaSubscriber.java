package com.example.demo.subscriber;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author Rajkumar Banala 27-Jul-2021
 *
 */

@Configuration
public class KafkaSubscriber {

	private static final Logger LOG = LoggerFactory.getLogger(KafkaSubscriber.class);

	@KafkaListener(topics = "TOPIC_1", groupId = "GROUP_1")
	public void receiveMessage(String message) {
		LOG.debug("receiveMessage()");

		LOG.debug("receiveMessage().message:" + message);
	}
}

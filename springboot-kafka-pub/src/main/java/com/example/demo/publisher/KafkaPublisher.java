package com.example.demo.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.enums.EnumUtil;

/**
 * @author Rajkumar Banala 27-Jul-2021
 *
 */

@Service
public class KafkaPublisher {
	
	private static final Logger LOG = LoggerFactory.getLogger(KafkaPublisher.class);

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String msg) {
		LOG.debug("sendMessage()");
		
		kafkaTemplate.send(EnumUtil.TopicName.TOPIC_1.toString(), msg);
	}

}

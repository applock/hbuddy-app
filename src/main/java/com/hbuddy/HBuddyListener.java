package com.hbuddy;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;

/**
 * kafka-streams requires at least one listener
 */
@KafkaListener(groupId = "HBuddyListener")
public class HBuddyListener {

    @Topic("supportRequest")
    void supportRequest() {
        System.out.println("Added supportRequest");
    }
}

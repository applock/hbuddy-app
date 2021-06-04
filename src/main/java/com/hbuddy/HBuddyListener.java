package com.hbuddy;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;

/**
 * kafka-streams requires at least one listener
 */
@KafkaListener(groupId = "HBuddyListener")
public class HBuddyListener {

    @Topic("localfeed")
    void addLocalFeed() {
        System.out.println("Listened a localfeed");
    }
    
    @Topic("session")
    void addWorkoutSessions() {
        System.out.println("Listened a session");
    }
}

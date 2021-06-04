package com.hbuddy;

import com.hbuddy.beans.Feed;

import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaClient
public interface EventPublisher {

    @Topic("localfeed")
    void localFeedEvent(@KafkaKey String feedId, Feed event);

    @Topic("session")
    void sessionEvent(@KafkaKey String sessionId, String event);
}

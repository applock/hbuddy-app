package com.hbuddy.messaging;

import io.micronaut.configuration.kafka.streams.ConfiguredStreamBuilder;
import io.micronaut.context.annotation.Factory;
import org.apache.kafka.streams.kstream.KStream;

import javax.inject.Named;
import javax.inject.Singleton;

@Factory
public class SupportFactory {

    @Singleton
    @Named("support")
    KStream<String, String> supportRequestStream(ConfiguredStreamBuilder builder) {
        return builder.stream("streams-plaintext-input");
    }
    
    @Singleton
    @Named("session")
    KStream<String, String> sessionUpdateStream(ConfiguredStreamBuilder builder) {
    	return builder.stream("streams-plaintext-input");
    }
}
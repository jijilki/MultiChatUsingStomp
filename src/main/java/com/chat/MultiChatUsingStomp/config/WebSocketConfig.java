package com.chat.MultiChatUsingStomp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;


@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer  {

    /**
     *  method is used to register a websocket endpoint that the clients will use to connect to the server.
     * @param registry
     */
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {

        registry.addEndpoint("/websocket").withSockJS();

    }

    /**
     *
     * @param registry
     * method is used to configure our message broker which will be used to route messages from one client to another.
     */
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {

        //Add multiple destination prefixes
        registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");


    }
}

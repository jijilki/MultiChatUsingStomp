package com.chat.MultiChatUsingStomp.model;

public class ChatMessage {

    private String sender;
    private String content;
    private MessageType messageType;

    public enum MessageType{
        CHAT, LEAVE, JOIN
    };


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}

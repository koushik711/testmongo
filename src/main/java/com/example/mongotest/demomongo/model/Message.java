package com.example.mongotest.demomongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Message {

    @Id
    private String id;
    private String messageType;
    private String orderId;
    private String MessageBody;
    private String TimeStamp;
    
    
    

    public Message(String messageType, String orderId, String MessageBody,String TimeStamp) {
		this.messageType = messageType;
		this.orderId = orderId;
		this.MessageBody = MessageBody;
		this.TimeStamp = TimeStamp;
	}

//	public Users(String id, String messageType, String orderId, Long MessageBody) {
//        this.id = id;
//        this.messageType = messageType;
//        this.orderId = orderId;
//        this.MessageBody = MessageBody;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getmessageType() {
        return messageType;
    }

    public void setmessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getorderId() {
        return orderId;
    }

    public void setorderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMessageBody() {
        return MessageBody;
    }

    public void setMessageBody(String MessageBody) {
        this.MessageBody = MessageBody;
    }

	public String getTimeStamp() {
		return TimeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
    
    
}

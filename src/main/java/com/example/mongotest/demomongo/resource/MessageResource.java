package com.example.mongotest.demomongo.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mongotest.demomongo.Repository.MessageRepository;
import com.example.mongotest.demomongo.model.Message;

import java.time.Instant;
import java.util.List;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/rest/message")
public class MessageResource {

    private MessageRepository userRepository;

    public MessageResource(MessageRepository userRepository) {
        this.userRepository = userRepository;
    }
  

    @GetMapping("/all")
    public List<Message> getAll() {
        return userRepository.findAll();
    }
    
    @GetMapping("/insert")
    public List<Message> printer(String Type,String orderID,String value, HttpSession session) {
    	Instant instant = Instant.now();
    	userRepository.save(new Message(Type, orderID, value,instant.toString()));
        return userRepository.findAll();
    }
    
}

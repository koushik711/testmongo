package com.example.mongotest.demomongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongotest.demomongo.model.Message;

public interface MessageRepository extends MongoRepository<Message, Integer> {
}

package com.example.demo.service;

import com.example.demo.persistence.Feedback;
import com.example.demo.persistence.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public void sendNotification(String feedBackId){
        //TODO Implement notification
        System.out.println("Sending notification via email");
        Optional<Feedback> feedbackOptional = feedbackRepository.findById(feedBackId);
        Feedback feedback = feedbackOptional.get();
        feedback.setDelivered(true);
        feedbackRepository.save(feedback);
    }
}

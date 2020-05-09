package com.example.demo.controller;

import com.example.demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events/feedback/notification")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping("/{feedbackId}")
    public ResponseEntity notifyFeedback(@PathVariable String feedbackId) {

        notificationService.sendNotification(feedbackId);
        return new ResponseEntity("Feedback notified successfully", HttpStatus.OK);
    }

}

package kz.kaspilab.service1.service;

import org.springframework.stereotype.Service;

@Service
public class ModerationService {

    public void processEvent(String event) {
        // позже здесь будет логика модерации
        System.out.println("Received event: " + event);
    }
}
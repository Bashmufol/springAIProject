package com.bash.springaiproject;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.model.ChatModel;

@RequiredArgsConstructor
public class ChatService {
    private final ChatModel chatModel;

    public String getResponse(String prompt) {
       return chatModel.call(prompt);
    }
}

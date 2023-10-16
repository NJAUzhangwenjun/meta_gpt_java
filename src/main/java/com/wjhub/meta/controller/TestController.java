package cn.wjhub.meta_gpt_java.controller;

import com.wjhub.meta.gpt.chatgpt.ChatGPT;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("test")
@AllArgsConstructor
@Slf4j
public class TestController {
    private final ChatGPT chatGPT;

    @PutMapping("{message}")
    public String chat(@PathVariable("message") String message) {
        log.info("req:{}",message);
        String chat = chatGPT.chat(message);
        log.info("rep:{}",chat);
        return chat;
    }
}

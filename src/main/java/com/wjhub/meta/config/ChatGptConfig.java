package com.wjhub.meta.config;

import com.wjhub.meta.gpt.chatgpt.ChatGPT;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChatGptConfig {

    @Value("${chatgpt.apiKey}")
    private String apiKey;

    @Bean
    public ChatGPT chatGPT() {
        // Proxy proxy = Proxys.http("127.0.0.1", 1080);

        return ChatGPT.builder()
                .apiKey(apiKey)
                .timeout(900)
                // .proxy(proxy)
                .apiHost("https://api.openai.com/") // 代理地址
                .build()
                .init();
    }


}

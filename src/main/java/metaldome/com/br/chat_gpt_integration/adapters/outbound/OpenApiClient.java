package metaldome.com.br.chat_gpt_integration.adapters.outbound;

import metaldome.com.br.chat_gpt_integration.adapters.inbound.ChatGPTRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "openai-client", url = "https://${openai.url}")
public interface OpenApiClient {

    @PostMapping("/responses")
    OpenAiResponse consultingChatGPT(@RequestBody ChatGPTRequest request,
                                     @RequestHeader("Authorization") String authorization,
                                     @RequestHeader("Content-Type") String contentType);
}

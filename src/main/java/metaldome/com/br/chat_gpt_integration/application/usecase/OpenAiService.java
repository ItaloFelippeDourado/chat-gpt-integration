package metaldome.com.br.chat_gpt_integration.application.usecase;

import metaldome.com.br.chat_gpt_integration.adapters.inbound.ChatGPTRequest;
import metaldome.com.br.chat_gpt_integration.adapters.outbound.OpenAiResponse;
import metaldome.com.br.chat_gpt_integration.adapters.outbound.OpenApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenAiService {

    @Autowired
    private final OpenApiClient openApiClient;

    public OpenAiService(OpenApiClient openApiClient) {
        this.openApiClient = openApiClient;
    }

    public OpenAiResponse consultingChatGPT(ChatGPTRequest request, String apiKey) {
        OpenAiResponse response = openApiClient.consultingChatGPT(request,
                "Bearer " + apiKey,
                "application/json");

        return response;
    }
}

package metaldome.com.br.chat_gpt_integration.adapters.inbound;

import metaldome.com.br.chat_gpt_integration.adapters.outbound.OpenAiResponse;
import metaldome.com.br.chat_gpt_integration.application.usecase.OpenAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/openai")
public class OpenAiController {

    @Autowired
    private final OpenAiService openAiService;

    public OpenAiController(OpenAiService openAiService) {
        this.openAiService = openAiService;
    }

    @PostMapping("/chatgpt")
    public ResponseEntity<OpenAiResponse> gerarResposta(
            @RequestHeader("Authorization") String authorizationHeader,
            @RequestBody ChatGPTRequest input) {
        OpenAiResponse resposta = openAiService.consultingChatGPT(input, authorizationHeader);
        return ResponseEntity.ok(resposta);
    }
}

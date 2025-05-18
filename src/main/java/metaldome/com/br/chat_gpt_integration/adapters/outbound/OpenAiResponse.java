package metaldome.com.br.chat_gpt_integration.adapters.outbound;

public record OpenAiResponse(String id,
                             String type,
                             String role,
                             Content content) {
}

package metaldome.com.br.chat_gpt_integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "metaldome.com.br.chat_gpt_integration.adapters.outbound")
public class ChatGptIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatGptIntegrationApplication.class, args);
	}

}

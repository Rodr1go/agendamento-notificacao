package rodrigo.projects.AgendamentoNotificacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class AgendamentoNotificacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendamentoNotificacaoApplication.class, args);
	}

}

package rodrigo.projects.AgendamentoNotificacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rodrigo.projects.AgendamentoNotificacao.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}

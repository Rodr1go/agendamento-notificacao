package rodrigo.projects.AgendamentoNotificacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rodrigo.projects.AgendamentoNotificacao.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}

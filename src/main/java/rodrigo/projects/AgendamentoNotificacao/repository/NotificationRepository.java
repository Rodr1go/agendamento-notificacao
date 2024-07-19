package rodrigo.projects.AgendamentoNotificacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rodrigo.projects.AgendamentoNotificacao.entity.Notification;
import rodrigo.projects.AgendamentoNotificacao.entity.Status;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
}

package rodrigo.projects.AgendamentoNotificacao.service;

import org.springframework.stereotype.Service;
import rodrigo.projects.AgendamentoNotificacao.dto.ScheduleNotificationDto;
import rodrigo.projects.AgendamentoNotificacao.entity.Notification;
import rodrigo.projects.AgendamentoNotificacao.entity.Status;
import rodrigo.projects.AgendamentoNotificacao.repository.NotificationRepository;

import java.util.Optional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDto dto) {
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }

    public void cancelNotification(Long notificationId) {
        var notification = findById(notificationId);
        if(notification.isPresent()) {
            notification.get().setStatus(Status.Values.CANCELED.toStatus());
            notificationRepository.save(notification.get());
        }
    }
}

package rodrigo.projects.AgendamentoNotificacao.dto;

import java.time.LocalDateTime;
import rodrigo.projects.AgendamentoNotificacao.entity.Channel;
import rodrigo.projects.AgendamentoNotificacao.entity.Notification;
import rodrigo.projects.AgendamentoNotificacao.entity.Status;

public record ScheduleNotificationDto(LocalDateTime dteTime, String destination, String message, Channel.Values channel) {

    public Notification toNotification() {
        return new Notification(
            dteTime,
            destination,
            message,
            channel.toChannel(),
            Status.Values.PENDING.toStatus()
        );
    }
}

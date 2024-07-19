package rodrigo.projects.AgendamentoNotificacao.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rodrigo.projects.AgendamentoNotificacao.dto.ScheduleNotificationDto;
import rodrigo.projects.AgendamentoNotificacao.entity.Notification;
import rodrigo.projects.AgendamentoNotificacao.service.NotificationService;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<?> scheduleNotification(@RequestBody ScheduleNotificationDto dto) {
        notificationService.scheduleNotification(dto);

        return ResponseEntity.accepted().build();
    }

    @GetMapping("/{notificationId}")
    public ResponseEntity<Notification> getNotification(@PathVariable("notificationId") Long notificationId) {
        var notification = notificationService.findById(notificationId);
        if(notification.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(notification.get());
    }

    @DeleteMapping("/{notificationId}")
    public ResponseEntity<Void> cancelNotification(@PathVariable("notificationId") Long notificationId) {
        notificationService.cancelNotification(notificationId);

        return ResponseEntity.noContent().build();
    }
}

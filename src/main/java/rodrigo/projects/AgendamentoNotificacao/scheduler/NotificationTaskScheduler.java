package rodrigo.projects.AgendamentoNotificacao.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import rodrigo.projects.AgendamentoNotificacao.service.NotificationService;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

@Component
public class NotificationTaskScheduler {

    private static final Logger logger = LoggerFactory.getLogger(NotificationTaskScheduler.class);
    private final NotificationService notificationService;

    public NotificationTaskScheduler(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Scheduled(fixedDelay = 1, timeUnit = TimeUnit.MINUTES)
    public void checkTasks() {
        var dateTime = LocalDateTime.now();
        logger.info("Running at {}", dateTime);
        notificationService.checkAndSend(dateTime);
    }
}

package rodrigo.projects.AgendamentoNotificacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rodrigo.projects.AgendamentoNotificacao.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}

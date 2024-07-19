package rodrigo.projects.AgendamentoNotificacao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_channel")
public class Channel {

    @Id
    private Long channelId;

    private String description;

    public Channel() {
    }

    public Channel(Long id, String description) {
        this.channelId = id;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public enum Values {
        SMS(1L, "SMS"),
        PUSH(2L, "PUSH"),
        EMAIL(3L, "EMAIL"),
        WHATSAPP(4L, "WHATSAPP");

        private Long id;
        private String description;

        Values(Long id, String description) {
            this.id = id;
            this.description = description;
        }

        public Channel toChannel() {
            return new Channel(this.id, this.description);
        }
    }

}

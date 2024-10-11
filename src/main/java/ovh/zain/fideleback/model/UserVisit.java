package ovh.zain.fideleback.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Data
@Table("user_visits")
public class UserVisit {
    @Id
    @PrimaryKey
    private UUID userId;
    private UUID merchantId;
    private int visitCount;
}
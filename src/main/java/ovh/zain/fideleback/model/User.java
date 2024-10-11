package ovh.zain.fideleback.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@Table("users")
public class User {
    @Id
    @PrimaryKey
    @Column("user_id")
    private UUID userId;
    private String email;
    private String name;
    @Column("unique_id")
    private String uniqueId;
    @Column("created_at")
    private Timestamp createdAt;
    @Column("qr_code")
    private String qrCode;
    @Column("bar_code")
    private String barCode;
}
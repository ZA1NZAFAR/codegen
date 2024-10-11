package ovh.zain.fideleback.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@Table("merchants")
public class Merchant {
    @Id
    @PrimaryKey
    @Column("merchant_id")
    private UUID merchantId;
    private String name;
    private String location;
    @Column("created_at")
    private Timestamp createdAt;
}

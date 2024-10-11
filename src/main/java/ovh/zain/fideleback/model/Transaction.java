package ovh.zain.fideleback.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Data
@Table("transactions")
public class Transaction {
    @Id
    @PrimaryKey
    private UUID transactionId;
    private UUID merchantId;
    private UUID userId;
    private double amountSpent;
    private long timestamp;
}
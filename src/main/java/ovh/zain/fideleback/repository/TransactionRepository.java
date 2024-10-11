package ovh.zain.fideleback.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ovh.zain.fideleback.model.Transaction;

import java.util.UUID;

@Repository
public interface TransactionRepository extends CassandraRepository<Transaction, UUID> {
}

package ovh.zain.fideleback.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ovh.zain.fideleback.model.UserVisit;

import java.util.UUID;

@Repository
public interface UserVisitRepository extends CassandraRepository<UserVisit, UUID> {
}

package ovh.zain.fideleback.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;
import ovh.zain.fideleback.model.User;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends CassandraRepository<User, UUID> {
    @Query("SELECT * FROM users WHERE unique_id = :uniqueId ALLOW FILTERING")
    Optional<User> findByUniqueId(String uniqueId);
}


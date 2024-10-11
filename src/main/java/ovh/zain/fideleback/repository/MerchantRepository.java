package ovh.zain.fideleback.repository;


import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import ovh.zain.fideleback.model.Merchant;

import java.util.UUID;

@Repository
public interface MerchantRepository extends CassandraRepository<Merchant, UUID> {
}


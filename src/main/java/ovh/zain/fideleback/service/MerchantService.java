package ovh.zain.fideleback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ovh.zain.fideleback.model.Merchant;
import ovh.zain.fideleback.repository.MerchantRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class MerchantService {
    @Autowired
    private MerchantRepository merchantRepository;

    public List<Merchant> getAllMerchants() {
        return merchantRepository.findAll();
    }

    public Optional<Merchant> getMerchantById(UUID merchantId) {
        return merchantRepository.findById(merchantId);
    }

    public Merchant saveMerchant(Merchant merchant) {
        return merchantRepository.save(merchant);
    }
}

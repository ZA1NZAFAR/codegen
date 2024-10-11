package ovh.zain.fideleback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ovh.zain.fideleback.model.Merchant;
import ovh.zain.fideleback.service.MerchantService;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/merchants")
public class MerchantController {
    @Autowired
    private MerchantService merchantService;

    @GetMapping
    public List<Merchant> getAllMerchants() {
        return merchantService.getAllMerchants();
    }

    @GetMapping("/{merchantId}")
    public ResponseEntity<Merchant> getMerchantById(@PathVariable UUID merchantId) {
        Optional<Merchant> merchant = merchantService.getMerchantById(merchantId);
        return merchant.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Merchant createMerchant(@RequestBody Merchant merchant) {
        merchant.setMerchantId(UUID.randomUUID());
        merchant.setCreatedAt(new Timestamp(System.currentTimeMillis()));
        return merchantService.saveMerchant(merchant);
    }
}

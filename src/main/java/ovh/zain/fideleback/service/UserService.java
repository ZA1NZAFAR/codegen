package ovh.zain.fideleback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ovh.zain.fideleback.model.User;
import ovh.zain.fideleback.repository.UserRepository;
import ovh.zain.fideleback.util.BarcodeGenerator;
import ovh.zain.fideleback.util.QRCodeGenerator;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(UUID userId) {
        return userRepository.findById(userId);
    }

    public Optional<User> getUserByUniqueId(String uniqueId) {
        return userRepository.findByUniqueId(uniqueId);
    }

    public User saveUser(User user) {
        try {
            user.setUserId(UUID.randomUUID());
            user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
            String qrCode = QRCodeGenerator.generateQRCodeBase64(user.getUserId().toString());
            user.setQrCode(qrCode);

            // Generate barcode
            String barcode = BarcodeGenerator.generateBarcodeBase64(user.getUserId().toString());
            user.setBarCode(barcode);
        }catch (Exception e){
            throw new RuntimeException("Could not generate QR code or barcode");
        }

        return userRepository.save(user);
    }
}

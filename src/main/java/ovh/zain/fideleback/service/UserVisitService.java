package ovh.zain.fideleback.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ovh.zain.fideleback.model.UserVisit;
import ovh.zain.fideleback.repository.UserVisitRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserVisitService {
    @Autowired
    private UserVisitRepository userVisitRepository;

    public List<UserVisit> getAllUserVisits() {
        return userVisitRepository.findAll();
    }

    public Optional<UserVisit> getUserVisitById(UUID userId) {
        return userVisitRepository.findById(userId);
    }

    public UserVisit saveUserVisit(UserVisit userVisit) {
        return userVisitRepository.save(userVisit);
    }
}


package ovh.zain.fideleback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ovh.zain.fideleback.model.UserVisit;
import ovh.zain.fideleback.service.UserVisitService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/user-visits")
public class UserVisitController {
    @Autowired
    private UserVisitService userVisitService;

    @GetMapping
    public List<UserVisit> getAllUserVisits() {
        return userVisitService.getAllUserVisits();
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserVisit> getUserVisitById(@PathVariable UUID userId) {
        Optional<UserVisit> userVisit = userVisitService.getUserVisitById(userId);
        return userVisit.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public UserVisit createUserVisit(@RequestBody UserVisit userVisit) {
        return userVisitService.saveUserVisit(userVisit);
    }
}

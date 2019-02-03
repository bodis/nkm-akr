package hu.nitrowise.nkm.akr.service;

import hu.nitrowise.nkm.akr.jpa.model.AdUser;
import hu.nitrowise.nkm.akr.jpa.repository.AdUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
@Slf4j
@RequiredArgsConstructor
public class UserServices {

    private final AdUserRepository userRepository;

    public List<AdUser> getAllUser() {
        return userRepository.findAll();
    }
}

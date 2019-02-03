package hu.nitrowise.nkm.akr.api;

import hu.nitrowise.nkm.akr.jpa.model.AdUser;
import hu.nitrowise.nkm.akr.service.UserServices;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@Slf4j
@RequiredArgsConstructor
public class UserAPI {

    private final UserServices userServices;

    @GetMapping("/me")
    public String getMe() {
        return "me";
    }

    @GetMapping
    public List<AdUser> findAll(){
        return userServices.getAllUser();
    }


}

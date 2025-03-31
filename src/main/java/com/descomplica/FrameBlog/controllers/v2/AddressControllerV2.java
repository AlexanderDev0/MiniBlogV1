package com.descomplica.FrameBlog.controllers.v2;


import com.descomplica.FrameBlog.models.UserV2;
import com.descomplica.FrameBlog.services.UserServiceV2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/v2/address")
public class AdressControllerV2 {

    private final UserServiceV2 userServiceV2;
    public AdressControllerV2(UserServiceV2 userServiceV2){
        this.userServiceV2 = userServiceV2;
    }
}

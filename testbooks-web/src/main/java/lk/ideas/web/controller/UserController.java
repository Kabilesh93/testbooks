package lk.ideas.web.controller;

import lk.ideas.domain.application.User;
import lk.ideas.web.services.UserService;
import lk.ideas.web.util.APIResponse;
import lk.ideas.web.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/getUsers")
    public ResponseEntity<APIResponse> getUsersByUserName(
            @PathVariable String username
    ) {
        ResponseEntity<APIResponse> apiResponseResponseEntity;
        List<User> users;
        try {
            users = userService.getUsersByUserName(username);
        }catch (Exception ex){
            apiResponseResponseEntity = ResponseBuilder.build(ResponseBuilder.failedWithResponseStatus(null, ex, HttpStatus.BAD_REQUEST));
            return  apiResponseResponseEntity;
        }
        apiResponseResponseEntity = ResponseBuilder.build(ResponseBuilder.success(users));
        return apiResponseResponseEntity;
    }
}

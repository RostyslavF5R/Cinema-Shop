package cinema.shop.controller;

import cinema.shop.dto.response.UserResponseDto;
import cinema.shop.exception.DataProcessingException;
import cinema.shop.model.User;
import cinema.shop.service.UserService;
import cinema.shop.service.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserMapper userMapper;
    private final UserService userService;

    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/by-email")
    public UserResponseDto getByEmail(@RequestParam String email) {
        User user = userService.findByEmail(email).orElseThrow(
                () -> new DataProcessingException("User with email " + email + " not found"));
        return userMapper.mapToDto(user);
    }
}

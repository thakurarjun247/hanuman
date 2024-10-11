package hanuman;

import hanuman.entity.User;
import hanuman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

@RestController
@RequestMapping("/hanuman")
public class HanumanController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home() {
        return "Jai Shree Ram, Jai Hanuman Ji Maharaj " +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    // Insert username into the database
    @PostMapping("/insert")
    public String insertUsername(@RequestParam String username) {
        User user = userService.saveUsername(username);
        return "Username " + user.getUsername() + " has been saved!";
    }

    // Get username from the database
    @GetMapping("/get")
    public String getUsername(@RequestParam String username) {
        Optional<User> user = userService.getUsername(username);
        return user.map(u -> "Found username: " + u.getUsername())
                .orElse("Username not found!");
    }
}

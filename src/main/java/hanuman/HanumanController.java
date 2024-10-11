package hanuman;

import hanuman.entity.User;
import hanuman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HanumanController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String home() {
        return "Jai Shree Ram, Jai Hanuman Ji Maharaj " + java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
    }

    // Insert a new user
    @PostMapping("/insert")
    public String insertUsername(@RequestParam String username) {
        User savedUser = userService.saveUser(username);
        return "User inserted: " + savedUser.getUsername();
    }

    // Get a user by username
    @GetMapping("/get")
    public String getUsername(@RequestParam String username) {
        User user = userService.getUserByUsername(username);
        if (user != null) {
            return "Found user: " + user.getUsername();
        } else {
            return "User not found.";
        }
    }
}

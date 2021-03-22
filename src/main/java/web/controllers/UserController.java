package web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.services.UserServiceImp;

@Controller
public class UserController {

    private UserServiceImp userServiceImp;

    @Autowired
    public UserController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("users", userServiceImp.getAllUsers());
        return "users";
    }

    @GetMapping("/{id}")
    public String showUser(@PathVariable("id") long id, Model model) {
        User user = userServiceImp.getUser(id);
        model.addAttribute("user", user);
        return "user";
    }

    @GetMapping("/new")
    public String ShowNewUser(Model model) {
        model.addAttribute("user", new User());
        return "new";
    }

    @PostMapping()
    public String createUser(@RequestParam String name, @RequestParam String lastName, @RequestParam String email) {
        userServiceImp.saveUser(name, lastName, email);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        userServiceImp.deleteUser(id);
        return "redirect:/";
    }

    @GetMapping("/{id}/edit")
    public String ShowUpdateUser(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userServiceImp.getUser(id));
        return "/edit";
    }

    @PatchMapping("/{id}")
    public String updateUser(@ModelAttribute("user") User user) {
        userServiceImp.updateUser(user);
        return "redirect:/";
    }
}



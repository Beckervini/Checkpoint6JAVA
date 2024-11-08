package CP3.Gerenciamento.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/default")
    public String defaultAfterLogin(Authentication authentication) {
        // Log para depuração das authorities do usuário
        System.out.println("User Authorities: " + authentication.getAuthorities());

        if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
            System.out.println("Redirecting to /admin/dashboard");
            return "redirect:/admin/dashboard";
        } else if (authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ALUNO"))) {
            System.out.println("Redirecting to /aluno/courses");
            return "redirect:/aluno/courses";
        }

        System.out.println("Redirecting to /home=");
        return "redirect:/home";
    }
}

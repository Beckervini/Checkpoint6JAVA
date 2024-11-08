package CP3.Gerenciamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/dashboard")
    public String dashboard() {
        return "admin/dashboard";
    }

    @GetMapping("/gerenciamento-cursos")
    public String gerenciamentoCursos() {
        return "admin/gerenciamento-cursos";
    }

    @GetMapping("/visualizar-matriculas")
    public String visualizarMatriculas() {
        return "admin/visualizar-matriculas";
    }
}

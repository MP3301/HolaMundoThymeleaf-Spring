package mx.com.gm.holaSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
@Slf4j
public class ControladorInicio {

    @GetMapping("/")
    public String inicio (Model model) {
       
       
       String mensaje = "Hola mundo con thymeleaf";
       
       model.addAttribute("mensaje", mensaje);
       
       log.info("Ejecutando controlador index");
    
    return "index";
    }
}
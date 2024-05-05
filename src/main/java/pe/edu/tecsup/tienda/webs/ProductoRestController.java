package pe.edu.tecsup.tienda.webs;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoRestController {

    @GetMapping("/inicio")
    public String index(){
        return "Hello World.....!";
    }

}

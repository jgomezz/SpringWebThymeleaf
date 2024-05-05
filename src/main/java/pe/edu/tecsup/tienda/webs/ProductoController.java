package pe.edu.tecsup.tienda.webs;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.tecsup.tienda.api.domain.ProductoTO;

import java.util.ArrayList;
import java.util.List;

@Log
@Controller
public class ProductoController {

    @GetMapping("/productos")
    public String index(Model model) {

        log.info("call index");

        String mensaje = "Hello Everyone!!!";

        model.addAttribute("mensaje", mensaje);

        List<ProductoTO> productos = new ArrayList<>();
        productos.add(new ProductoTO("IPhone", 2000.0));
        productos.add(new ProductoTO("Galaxy", 2500.0));
        productos.add(new ProductoTO("Huawei", 1600.0));
        productos.add(new ProductoTO("Xiaomi", 1200.1));

        model.addAttribute("productos", productos);

        return "productos";
    }


}

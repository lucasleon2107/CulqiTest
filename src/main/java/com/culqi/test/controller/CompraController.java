package com.culqi.test.controller;

import com.culqi.test.common.APIMethods;
import com.culqi.test.dto.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * Created by lucas on 9/02/2017.
 */
@Controller
public class CompraController {
    @GetMapping("/")
    public String getCompraView(Model model){
        model.addAttribute("usuarioForm", new UsuarioForm());
        return "compra";
    }

    @PostMapping("/realizarCompra")
    public String realizarCompra(@ModelAttribute UsuarioForm usuarioForm){
        TokenRequest token = new TokenRequest(usuarioForm.getFirstName(), usuarioForm.getLastName(), usuarioForm.getEmail(), usuarioForm.getCardNumber(), usuarioForm.getCvv(), usuarioForm.getExpirationMonth(), usuarioForm.getExpirationYear());
        TokenResponse tokenResponse = APIMethods.crearToken(token);

        CargoRequest cargo = new CargoRequest(tokenResponse.getId(), usuarioForm.getFirstName(), usuarioForm.getLastName(), usuarioForm.getEmail(), usuarioForm.getAddress(), usuarioForm.getAddressCity(), usuarioForm.getPhoneNumber(), usuarioForm.getAmount(), usuarioForm.getCvv());
        APIMethods.crearCargo(cargo);

        return "redirect:/compraExitosa";
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.gov.financas.eFatura.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author barro
 */
@RestController
public class CLienteController {

    @RequestMapping(method = RequestMethod.GET, value = "/clientesController")
    public String buscar() {
        return "Meu Primeiro teste de spring boot";

    }

}

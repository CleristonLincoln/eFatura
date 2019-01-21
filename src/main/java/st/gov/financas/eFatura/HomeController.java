/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.gov.financas.eFatura;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author barro
 */
@RestController
public class HomeController {
    
    @RequestMapping ("/")
    public String home(){
        return "Welcome to Spring Boot hoje";
    }
    
}

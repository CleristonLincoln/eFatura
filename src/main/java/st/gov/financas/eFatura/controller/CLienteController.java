/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.gov.financas.eFatura.controller;

import java.util.Collection;
import java.util.HashMap;
import st.gov.financas.eFatura.model.Cliente;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import st.gov.financas.eFatura.services.ClienteService;

/**
 *
 * @author barro
 */
@RestController
public class CLienteController {
    
    @Autowired
    ClienteService clienteService;

   
    //End Points
    @RequestMapping(method = RequestMethod.POST, value = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> cadastrarClientes(@RequestBody Cliente cliente) {
        Cliente ClienteCadastrado = clienteService.cadastrar(cliente);
        return new ResponseEntity<>(ClienteCadastrado, HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/clientes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Cliente>> buscarTodosClientes() {
        Collection<Cliente> buscaClientes = clienteService.buscarTodos();
        return new ResponseEntity<>(buscaClientes, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/clientes/{id}")
    public ResponseEntity<Cliente> excluirClientes(@PathVariable Integer id) {

        Cliente ClienteEncontrado = clienteService.buscarPorId(id);

        if (ClienteEncontrado == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        clienteService.excluirCliente(ClienteEncontrado);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/clientes", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Cliente> AlterarClientes(@RequestBody Cliente cliente) {
        Cliente ClienteAlterado = clienteService.alterar(cliente);
        return new ResponseEntity<>(ClienteAlterado, HttpStatus.OK);
    }
}

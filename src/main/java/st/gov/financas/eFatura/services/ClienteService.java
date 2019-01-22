/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.gov.financas.eFatura.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import st.gov.financas.eFatura.model.Cliente;
import st.gov.financas.eFatura.repository.ClienteRepository;

/**
 *
 * @author Impostos
 */
@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    //metodos de negocio
    public Cliente cadastrar(Cliente cliente) {

        return clienteRepository.save(cliente);

    }

    public Collection<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Integer id) {
        return clienteRepository.findById(id).get();
    }

    public void excluirCliente(Cliente cliente) {
        clienteRepository.delete(cliente);

    }

    public Cliente alterar(Cliente cliente) {
        return clienteRepository.save(cliente);

    }

}

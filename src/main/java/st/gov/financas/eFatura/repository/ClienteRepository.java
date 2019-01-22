/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.gov.financas.eFatura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import st.gov.financas.eFatura.model.Cliente;

/**
 *
 * @author Impostos
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer>{
    
}

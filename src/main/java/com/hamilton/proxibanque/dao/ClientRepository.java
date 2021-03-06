package com.hamilton.proxibanque.dao;

import com.hamilton.proxibanque.model.Client;
import com.hamilton.proxibanque.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
   // public List<Client> findAll();
   List<Client> findByEmployeId(Long conseillerId);

}

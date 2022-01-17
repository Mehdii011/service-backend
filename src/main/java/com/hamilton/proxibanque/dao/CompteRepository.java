package com.hamilton.proxibanque.dao;

import com.hamilton.proxibanque.model.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CompteRepository extends JpaRepository<Compte,Long> {

}

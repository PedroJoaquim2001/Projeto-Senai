package com.SpringTest.Teste.repositories;

import com.SpringTest.Teste.models.Clients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Clients, Long> {

}

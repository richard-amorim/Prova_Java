package com.senai.prova_ezequias.repository;

import com.senai.prova_ezequias.models.Movimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentoRepository extends JpaRepository<Movimento, Long> {

}

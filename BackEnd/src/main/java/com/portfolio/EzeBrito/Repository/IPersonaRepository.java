package com.portfolio.EzeBrito.Repository;

import com.portfolio.EzeBrito.Entry.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}

package com.portfolio.EzeBrito.Interface;

import com.portfolio.EzeBrito.Entry.Persona;
import java.util.List;


public interface IPersonaService {
    //Para traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar objeto de tipo Persona
    public void savePersona(Persona persona);
   
   //Eliminar objeto con busqueda por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}

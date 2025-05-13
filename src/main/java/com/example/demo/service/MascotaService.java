package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MascotaDTO;
import com.example.demo.model.Mascota;
import com.example.demo.model.Persona;
import com.example.demo.repository.MascotaRepository;
import com.example.demo.repository.PersonaRepository;

@Service
public class MascotaService {
    @Autowired
    private MascotaRepository mascotaRepository;
    @Autowired
    private PersonaRepository personaRepository;


    public String almacenar(MascotaDTO mascotaDTO) {
        if(!personaRepository.existsById(mascotaDTO.getRut())) {
            return "Persona no existe!";
        }else {
            Persona persona = personaRepository.findById(mascotaDTO.getRut()).get();

            Mascota mascota = new Mascota();
            mascota.setNombre(mascotaDTO.getNombre());
            mascota.setTipo(mascotaDTO.getTipo());
            mascota.setPersona(persona);

            mascotaRepository.save(mascota);
            return "Mascota almacenada correctamente!";
        }
        
    }


    //ALMACENAR
    public List<Mascota> listar() {
        return mascotaRepository.findAll();
    }
}

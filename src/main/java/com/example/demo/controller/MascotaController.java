package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MascotaDTO;
import com.example.demo.model.Mascota;
import com.example.demo.service.MascotaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/mascotas")
public class MascotaController {
    @Autowired
    private MascotaService mascotaService;

    @PostMapping
    public String almacenar(@RequestBody  MascotaDTO mascotaDTO) {
        return mascotaService.almacenar(mascotaDTO);
    }

    @GetMapping
    public List<Mascota> listar() {
        return mascotaService.listar();
    }
    

}

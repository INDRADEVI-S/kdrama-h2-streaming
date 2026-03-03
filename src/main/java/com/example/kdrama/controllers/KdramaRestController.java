package com.example.kdrama.controllers;

import com.example.kdrama.models.Kdrama;
import com.example.kdrama.service.KdramaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/kdramas")
@CrossOrigin
public class KdramaRestController {

    private final KdramaService service;

    public KdramaRestController(KdramaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Kdrama> getAll() {
        return service.getAllKdramas();
    }
}

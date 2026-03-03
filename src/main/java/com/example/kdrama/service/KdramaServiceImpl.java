package com.example.kdrama.service;

import com.example.kdrama.models.Kdrama;
import com.example.kdrama.repositories.KdramaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class KdramaServiceImpl implements KdramaService {

    private final KdramaRepository repository;

    public KdramaServiceImpl(KdramaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Kdrama> getAllKdramas() {
        return repository.findAll();
    }
}

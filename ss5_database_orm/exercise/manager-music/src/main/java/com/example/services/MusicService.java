package com.example.services;

import com.example.model.AudioFile;
import com.example.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService implements IMusicService {
    @Autowired
    private IMusicRepository productRepository;

    @Override
    public List<AudioFile> findAll () {
        return productRepository.findAll();
    }

    @Override
    public void save (AudioFile audioFile) {
        productRepository.save(audioFile);
    }

    @Override
    public void update (AudioFile audioFile) {
        productRepository.update(audioFile);
    }

    @Override
    public void delete (AudioFile audioFile) {
        productRepository.delete(audioFile);
    }

    @Override
    public List<AudioFile> search (String name) {
        return productRepository.search(name);
    }

    @Override
    public AudioFile detail (Integer codeProduct) {
        return productRepository.detail(codeProduct);
    }
}

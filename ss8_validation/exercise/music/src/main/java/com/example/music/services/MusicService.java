package com.example.music.services;

import com.example.music.model.Music;
import com.example.music.repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MusicService implements IMusicService{
    @Autowired
    private IMusicRepository musicRepository;

    @Override
    public Page<Music> findAll (Pageable pageable) {
        return musicRepository.findAll(pageable);
    }

    @Override
    public void save (Music music) {
        musicRepository.save(music);
    }
}

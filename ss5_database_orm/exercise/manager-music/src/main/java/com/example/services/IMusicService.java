package com.example.services;

import com.example.model.AudioFile;

import java.util.List;

public interface IMusicService {

    List<AudioFile> findAll ();

    void save (AudioFile audioFile);

    void update (AudioFile audioFile);

    void delete (AudioFile audioFile);

    List<AudioFile> search (String name);

    AudioFile detail (Integer codeProduct);
}

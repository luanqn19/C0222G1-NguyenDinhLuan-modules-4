package com.example.services;

import com.example.model.Word;
import com.example.repository.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionaryService implements IDictionaryService{
    @Autowired
    IDictionaryRepository dictionaryRepository;

    @Override
    public Word find (String key) {
        return dictionaryRepository.find(key);
    }
}

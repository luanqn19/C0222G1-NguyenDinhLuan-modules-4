package com.example.repository;

import com.example.model.Word;

public interface IDictionaryRepository {
    Word find(String key);
}

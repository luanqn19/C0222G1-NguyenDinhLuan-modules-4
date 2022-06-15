package com.example.repository;

import com.example.model.Word;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
    private List<Word> dic = new ArrayList<>();

    public DictionaryRepository () {
        dic.add(new Word("World", "Thế Giới"));
        dic.add(new Word("Walk", "Đi bộ"));
        dic.add(new Word("Warning", "Cảnh báo"));
        dic.add(new Word("Weak", "Yếu"));
    }

    @Override
    public Word find (String key) {
        for (Word item : dic) {
            if (item.getEnWord().equalsIgnoreCase(key)) return item;
        }
        return null;
    }
}

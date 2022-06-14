package com.example.services;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    public static Map<String, String> dic = new HashMap<>();
    static {
        dic.put("World", "Thế Giới");
        dic.put("Walk", "Đi bộ");
        dic.put("Warning", "Cảnh báo");
        dic.put("Weak", "Yếu");
    }
}

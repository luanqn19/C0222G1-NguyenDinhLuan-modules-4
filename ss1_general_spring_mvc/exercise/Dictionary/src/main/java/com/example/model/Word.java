package com.example.model;

public class Word {
    String enWord, vnWord;

    public Word (String enWord , String vnWord) {
        this.enWord = enWord;
        this.vnWord = vnWord;
    }

    public String getEnWord () {
        return enWord;
    }

    public void setEnWord (String enWord) {
        this.enWord = enWord;
    }

    public String getVnWord () {
        return vnWord;
    }

    public void setVnWord (String vnWord) {
        this.vnWord = vnWord;
    }
}

package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AudioFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codeMusic;
    private String titleMusic;
    private String artistMusic;
    private String albumMusic;
    private String genreDescription;
    private String copyRight;
    private String pathMedia;
    private String pathCover;

    public AudioFile () {
    }

    public AudioFile (Integer codeMusic , String titleMusic , String artistMusic , String albumMusic ,
                      String genreDescription , String copyRight , String pathMedia , String pathCover) {
        this.codeMusic = codeMusic;
        this.titleMusic = titleMusic;
        this.artistMusic = artistMusic;
        this.albumMusic = albumMusic;
        this.genreDescription = genreDescription;
        this.copyRight = copyRight;
        this.pathMedia = pathMedia;
        this.pathCover = pathCover;
    }

    public Integer getCodeMusic () {
        return codeMusic;
    }

    public void setCodeMusic (Integer codeMusic) {
        this.codeMusic = codeMusic;
    }

    public String getTitleMusic () {
        return titleMusic;
    }

    public void setTitleMusic (String titleMusic) {
        this.titleMusic = titleMusic;
    }

    public String getArtistMusic () {
        return artistMusic;
    }

    public void setArtistMusic (String artistMusic) {
        this.artistMusic = artistMusic;
    }

    public String getAlbumMusic () {
        return albumMusic;
    }

    public void setAlbumMusic (String albumMusic) {
        this.albumMusic = albumMusic;
    }

    public String getGenreDescription () {
        return genreDescription;
    }

    public void setGenreDescription (String genreDescription) {
        this.genreDescription = genreDescription;
    }

    public String getCopyRight () {
        return copyRight;
    }

    public void setCopyRight (String copyRight) {
        this.copyRight = copyRight;
    }

    public String getPathMedia () {
        return pathMedia;
    }

    public void setPathMedia (String pathMedia) {
        this.pathMedia = pathMedia;
    }

    public String getPathCover () {
        return pathCover;
    }

    public void setPathCover (String pathCover) {
        this.pathCover = pathCover;
    }
}

package com.example.music.model;

import com.example.music.utils.annotation.NameConstraint;
import com.example.music.utils.annotation.TypeConstraint;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NameConstraint(message = "Tiêu đề bài hát không hợp lệ")
    @Length(max = 800, message = "Độ dài tiêu đề không quá 800 ký tự")
    @NotBlank(message = "Tiêu đề bài hát không được để trống")
    private String title;

    @NameConstraint(message = "Tên nghệ sĩ không hợp lệ")
    @Length(max = 300, message = "Độ dài tên nghệ sĩ không quá 300 ký tự")
    @NotBlank(message = "Tên Nghệ sĩ không được để trống")
    private String artist;

    @TypeConstraint
    @Length(max = 1000, message = "Độ dài thể loại nhạc không quá 1000 ký tự")
    @NotBlank(message = "Thể loại bài hát không được để trống")
    private String type;

    private String external;

    public Music () {
    }

    public Music (int id , String title , String artist , String type , String external) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.type = type;
        this.external = external;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getArtist () {
        return artist;
    }

    public void setArtist (String artist) {
        this.artist = artist;
    }

    public String getType () {
        return type;
    }

    public void setType (String type) {
        this.type = type;
    }

    public String getExternal () {
        return external;
    }

    public void setExternal (String external) {
        this.external = external;
    }
}

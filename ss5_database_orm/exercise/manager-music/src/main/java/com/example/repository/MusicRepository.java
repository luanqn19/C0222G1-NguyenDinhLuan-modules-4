package com.example.repository;

import com.example.model.AudioFile;
import com.mpatric.mp3agic.*;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

@Repository
public class MusicRepository implements IMusicRepository {
    private List<AudioFile> list = new ArrayList<>();

    public String splitName (String pathFile) {
        System.out.println(pathFile.substring(pathFile.indexOf("\\music") + 7, pathFile.lastIndexOf('.')));
        return pathFile.substring(pathFile.indexOf("\\music") + 7, pathFile.lastIndexOf('.')) + ".jpeg";
    }
    public void getAlbumArt (String pathFile) {
        Mp3File mp3file = null;
        try {
            mp3file = new Mp3File(pathFile);
            if (mp3file.hasId3v2Tag()) {
                ID3v2 id3v2Tag = mp3file.getId3v2Tag();
                byte[] imageData = id3v2Tag.getAlbumImage();
                if (imageData != null) {
                    String mimeType = id3v2Tag.getAlbumImageMimeType();
                    System.out.println(mimeType);
                    RandomAccessFile file = new RandomAccessFile
                            ("D:\\TestGit\\modules4\\ss5_database_orm\\exercise\\manager-music\\src\\main\\webapp\\WEB-INF\\views\\image\\" + splitName(pathFile) , "rw");

                    file.write(imageData);
                    file.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedTagException e) {
            e.printStackTrace();
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
    }

    public void initData () {
        AudioFile audioFile;
        Mp3File mp3File;
        ID3v2 id3v2;
        String[] link = new String[]{
                "D:\\TestGit\\modules4\\ss5_database_orm\\exercise\\manager-music\\src\\main\\webapp\\WEB-INF\\views\\music\\Vi-Me-Anh-Bat-Chia-Tay-Miu-Le-Karik-Chau-Dang-Khoa.mp3" ,
                "D:\\TestGit\\modules4\\ss5_database_orm\\exercise\\manager-music\\src\\main\\webapp\\WEB-INF\\views\\music\\Thuong-Em-Chau-Khai-Phong-ACV.mp3" ,
                "D:\\TestGit\\modules4\\ss5_database_orm\\exercise\\manager-music\\src\\main\\webapp\\WEB-INF\\views\\music\\Nhin-May-Ve-Nguoi-Huong-Ly-Jombie-LY-M.mp3" };
        try {
            for (int i = 0 ; i < link.length ; i++) {
                mp3File = new Mp3File(link[i]);
                if (mp3File.hasId3v2Tag()) {
                    id3v2 = mp3File.getId3v2Tag();
                    getAlbumArt(link[i]);
                    System.out.println("Artist: " + id3v2.getArtist());
                    System.out.println("Title: " + id3v2.getTitle());
                    System.out.println("Type: " + id3v2.getGenreDescription());
                    System.out.println("Copyright: " + id3v2.getCopyright());
                    System.out.println("Album image mime type: " + id3v2.getAlbumImageMimeType());
                    audioFile = new AudioFile(i + 1 , id3v2.getTitle() , id3v2.getArtist() ,
                            id3v2.getAlbum() , id3v2.getGenreDescription(), id3v2.getCopyright());
                    list.add(audioFile);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (UnsupportedTagException e) {
            e.printStackTrace();
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<AudioFile> findAll () {
        initData();
//        String hql = "SELECT a FROM AudioFile as a";
//        list = BaseRepository.entityManager.createQuery(hql , AudioFile.class).getResultList();
        return list;
    }

    @Override
    public void save (AudioFile audioFile) {
//        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
//        entityTransaction.begin();
//        BaseRepository.entityManager.merge(audioFile);
//        entityTransaction.commit();
    }

    @Override
    public void update (AudioFile audioFile) {
//        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
//        entityTransaction.begin();
//        BaseRepository.entityManager.merge(audioFile);
//        entityTransaction.commit();
    }

    @Override
    public void delete (AudioFile audioFile) {
//        EntityTransaction entityTransaction = BaseRepository.entityManager.getTransaction();
//        entityTransaction.begin();
//        BaseRepository.entityManager.remove(audioFile);
//        entityTransaction.commit();
    }

    @Override
    public List<AudioFile> search (String name) {
//        String hql = "SELECT p FROM Product AS p WHERE p.nameProduct like :name";
//        list = BaseRepository.entityManager.createQuery
//                (hql , AudioFile.class).setParameter("name" , "%" + name + "%").getResultList();
        return list;
    }

    @Override
    public AudioFile detail (Integer codeProduct) {
//        String hql = "select p from Product p WHERE p.codeProduct = :code";
//        AudioFile audioFile = BaseRepository.entityManager.createQuery
//                (hql , AudioFile.class).setParameter("code" , codeProduct).getSingleResult();
        return null;
    }
}

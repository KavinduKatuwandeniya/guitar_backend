package com.app.guitar.Service;

import com.app.guitar.Entity.Song;
import com.app.guitar.Repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SongsService {



    @Autowired
    private SongsRepository songsRepository;

    public List<Song> getAllSongs(){
        List<Song> allSongs = (List<Song>) songsRepository.findAll();
        System.out.println(allSongs);
        return allSongs;
    }

}

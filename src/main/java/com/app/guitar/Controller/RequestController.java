package com.app.guitar.Controller;

import com.app.guitar.Entity.Song;
import com.app.guitar.Repository.SongsRepository;
import com.app.guitar.Service.SongsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/guitar/")
public class RequestController {
    @Autowired
    private SongsService songsService;

    @GetMapping("all-songs")
    public List<Song> allSongs(){
        List<Song> allSongs = songsService.getAllSongs();
        return allSongs;
    }

}

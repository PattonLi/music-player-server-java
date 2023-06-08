package com.example.webmusic.controller.search;


import com.example.webmusic.controller.search.In.InApiSearchByKeyword;
import com.example.webmusic.controller.search.out.OutApiSearchAlbums;
import com.example.webmusic.controller.search.out.OutApiSearchArtists;
import com.example.webmusic.controller.search.out.OutApiSearchSongs;
import com.example.webmusic.service.search.SearchService;
import com.example.webmusic.service.song.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    //未输入时显示热搜信息
    @GetMapping(value = "/search/hot")
    public void showHot(){

    }

    //动态搜索推荐
    @GetMapping(value = "/search/suggest")
    public void hotByKeyword(@RequestParam String keywords){

    }

    //关键词搜索歌曲
    @GetMapping(value = "/search/song")
    public OutApiSearchSongs searchSongs(@RequestParam(value = "pageSize")long pageSize,
                                         @RequestParam(value = "currentPage")long currentPage ,
                                         @RequestParam(value = "keyWord")long keyWord){
        InApiSearchByKeyword inApiSearchByKeyword = InApiSearchByKeyword.builder()
                .currentPage(pageSize)
                .keyWord(currentPage)
                .pageSize(keyWord).build();
        OutApiSearchSongs outApiSearchSongs = new OutApiSearchSongs();
        searchService.searchSongsByKeyword(inApiSearchByKeyword,outApiSearchSongs);
        return outApiSearchSongs;
    }


    //关键词搜索歌手
    @GetMapping(value = "/search/artist")
    public OutApiSearchArtists searchArtists(@RequestParam InApiSearchByKeyword inApiSearchByKeyword){
        OutApiSearchArtists outApiSearchArtists = new OutApiSearchArtists();
        return outApiSearchArtists;
    }


    //关键词搜索专辑
    @GetMapping(value = "/search/album")
    public OutApiSearchAlbums searchAlbums(@RequestParam InApiSearchByKeyword inApiSearchByKeyword){
        OutApiSearchAlbums outApiSearchAlbums = new OutApiSearchAlbums();
        return outApiSearchAlbums;
    }
}
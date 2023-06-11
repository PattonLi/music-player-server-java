package com.example.webmusic.service.album;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.webmusic.controller.album.in.*;
import com.example.webmusic.controller.album.out.*;
import com.example.webmusic.controller.song.in.InApiGetSongsByArtist;
import com.example.webmusic.controller.song.out.OutApiDeleteSong;
import com.example.webmusic.controller.album.out.*;
import com.example.webmusic.controller.song.out.OutApiGetPageSong;
import com.example.webmusic.controller.song.out.OutApiGetSongsByArtist;
import com.example.webmusic.models.album.Album;

public interface AlbumService extends IService<Album> {
    //获取特定页专辑
    void getPageAlbum(InApiGetPageAlbum inApiGetPageAlbum, OutApiGetPageSong outApiGetPageSong);

    //获取特定专辑
    void getAlbum(InApiGetAlbum inApiGetAlbum, OutApiGetAlbum outApiGetAlbum);

    //添加专辑
    void addAlbum(InApiAddAlbum inApiAddAlbum, OutApiAddAlbum outApiAddAlbum);

    //修改专辑信息
    void modifyAlbumInfo(InApiModifyAlbumInfo inApiModifyAlbumInfo, OutApiModifyAlbum outApiModifyAlbumInfo);

    //删除专辑
    void deleteAlbum(InApiDeleteAlbum inApiDeleteAlbum, OutApiDeleteAlbum outApiDeleteAlbum);

    //歌曲推荐；随机返回歌曲
    void getRandomAlbum (OutApiGetRecommendAlbum out);

    //专辑详情页
    void albumDetail(InApiAlbumDetail inApiAlbumDetail, OutApiAlbumDetail outApiAlbumDetail);

    void getAlbumByArtist(InApiGetAlbumByArtist inApiGetAlbumByArtist, OutApiGetAlbumByArtist outApiGetAlbumByArtist);
}

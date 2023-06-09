package com.example.webmusic.frontend_model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SongFront {
    /**
     * 歌曲专辑名
     */
    private String album;
    private Long albumId;
    /**
     * 歌手名称
     */
    private String artist;
    private Long artistId;
    /**
     * 歌曲秒数时长
     */
    private long duration;
    private String lyricUrl;
    /**
     * 评论数
     */
    private long mark;
    /**
     * 歌曲名称
     */
    private String name;
    private String picUrl;
    /**
     * 歌曲播放次数
     */
    private long pop;
    /**
     * 发行时间
     */
    private String publishTime;
    private Long songId;
    private String type;
    private String url;
}

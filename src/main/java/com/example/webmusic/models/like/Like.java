package com.example.webmusic.models.like;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName("likes")
public class Like {
    /**
     * 数据库表项唯一标识id，因为userid不唯一(一个人喜欢多首歌)，songid也不唯一(多个人喜欢同一首歌)
     */
    @TableId(type = IdType.AUTO)
    @JsonProperty("likeId")
    private Long like_id;
    /**
     * 喜欢的专辑的id
     */
    @JsonProperty("albumId")
    private Long album_id;
    /**
     * 喜欢的歌手的id
     */
    @JsonProperty("artistId")
    private Long artist_id;
    /**
     * 喜欢的播放列表的id
     */
    @JsonProperty("playListId")
    private Long playlist_id;
    /**
     * 喜欢的歌曲的id
     */
    @JsonProperty("songId")
    private Long song_id;
    /**
     * 喜欢类型(1：歌曲 2：歌手 3：专辑 4：播放列表)
     */
    private Long type;
    /**
     * 喜欢的歌曲的所有者，可以通过这个所有者来遍历找到这个人所有喜欢的歌
     */
    @JsonProperty("userId")
    private Long user_id;
}

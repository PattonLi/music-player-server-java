package com.example.webmusic.models.playlist;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@TableName("playlist")
public class PlayList {
    /**
     * 播放列表ID
     */
    @TableId(type = IdType.AUTO)
    @JsonProperty("playListId")
    private long playlist_id;
    /**
     * 创建时间
     */
    @JsonProperty("createTime")
    private String create_time;
    /**
     * 评论数
     */
    private long mark;
    /**
     * 封面
     */
    @JsonProperty("picUrl")
    private String pic_url;
    /**
     * 歌单名称
     */
    @JsonProperty("playList")
    private String playlist;

    /**
     * 歌单描述
     */
    private String profile;
    /**
     * 歌曲数量
     */
    private long size;
    /**
     * 歌单类别 #流行#国语
     */
    private String tag;
    /**
     * 创建人名称
     */
    private String user;
    /**
     * 创建人id
     */
    @JsonProperty("userId")
    private long user_id;
}

package com.example.webmusic.service.user;

import com.baomidou.mybatisplus.extension.service.IService;

import com.example.webmusic.controller.user.in.User.*;
import com.example.webmusic.controller.user.out.User.*;
import com.example.webmusic.models.user.User;
import com.example.webmusic.utils.oss.OutApi_uploadFile;
import org.springframework.web.multipart.MultipartFile;

public interface UserService extends IService<User> {
    void userLogin(InApiLogin inApiLogin, OutApiLogin outApiLogin);
    void userRegister(InApiRegister inApiRegister, OutApiRegister outApiRegister);
    void getAllUserInfo(int page, int pagesize, OutApi_getAllUserInfo out);
    void getUserInfo(String name,OutApi_getUserInfo out);
    void addUserInfo(User user,OutApi_addUserInfo out);
    int modifyUserInfo(User user);
    long deleteUserInfo(long userID);
    void updateUserPic(int userID, MultipartFile file, OutApi_uploadFile out);
    void getUserProfile(long userId,OutApiGetUserProfile outApiGetUserProfile);
    void getAUser(long index,OutApi_getAUser out);

}

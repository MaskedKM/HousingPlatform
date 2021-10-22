package com.football.housingplatform.service;

import com.football.housingplatform.dao.domain.Content;

import java.util.List;

public interface ContentService {
    List<Content> showAll(int infoId);
    void deleteContent(int replyId);
    void addContent(Content c, int Infoid, int userId);
    void updateVote(int replyId);
    int findUserId(int replyId);
}

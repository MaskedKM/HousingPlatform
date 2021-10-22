package com.football.housingplatform.dao.mapper;

import com.football.housingplatform.dao.domain.Content;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContentMapper {

    int addContent(Content c);
    List<Content> showAllForId(int ContentId); // show all
    void deleteContent(int replyId);
    void deleteRelation(int replyId);
    void addRelation(int infoid, int replyid, int userId);
    void updateVote(int replyId);
    Integer findUR(int replyid, int userid);
    void insertUR(int replyid, int userid);
    void deleteUR(int replyid, int userid);
    int findUserId(int replyId);
    void deleteVote(int replyid);
}
package com.football.housingplatform.service.impl;

import com.football.housingplatform.dao.domain.Content;
import com.football.housingplatform.dao.mapper.ContentMapper;
import com.football.housingplatform.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper cm;

    public List<Content> showAll(int infoId) {return cm.showAllForId(infoId);}

    @Transactional
    public void addContent(Content c,int Infoid, int userId){
        cm.addContent(c);
        int replyid = c.getId();
        System.out.println(replyid);
        cm.addRelation(Infoid, replyid, userId);
    }

    @Transactional
    @Override
    public void updateVote(int replyId, int userId) {
        if (cm.findUR(replyId, userId) == null){
            cm.updateVote(replyId);
            cm.insertUR(replyId, userId);
        }else {
            cm.deleteVote(replyId);
            cm.deleteUR(replyId, userId);
        }
    }

    @Transactional
    public void deleteContent(int replyId){
        cm.deleteRelation(replyId);
        cm.deleteURByReplyId(replyId);
        cm.deleteContent(replyId);
    }

    @Override
    public int findUserId(int replyId){
        return cm.findUserId(replyId);
    }
}

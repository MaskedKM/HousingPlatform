package com.football.housingplatform.service.impl;

import com.football.housingplatform.dao.domain.HousingInfo;
import com.football.housingplatform.dao.mapper.InfoMapper;
import com.football.housingplatform.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InfoServiceImpl implements InfoService {
    @Autowired
    private InfoMapper infoMapper;

    @Override
    public List<HousingInfo> getList() {
        List<HousingInfo> housingInfos = infoMapper.selectAll();
        return housingInfos;
    }

    @Transactional
    @Override
    public void addInfo(HousingInfo HI,int userId) {
        int infoid = infoMapper.addInfo(HI);
        infoMapper.mergeInfo(infoid,userId);
    }

    @Transactional
    @Override
    public void deleteInfoById(int id) {
        infoMapper.deleteRelation(id);
        infoMapper.deleteInfoById(id);
    }

    @Override
    public List<HousingInfo> findBySite(String site) {
        return infoMapper.findBySite(site);
    }

    @Override
    public int findIdByReplyId(int replyId) {
        return infoMapper.findIdByReplyId(replyId);
    }

    @Override
    public HousingInfo findById(int infoId) {
        return infoMapper.findById(infoId);
    }
}

package com.football.housingplatform.service;

import com.football.housingplatform.dao.domain.HousingInfo;

import java.util.List;

public interface InfoService {
    List<HousingInfo> getList();

    void addInfo(HousingInfo HI);

    void deleteInfoById(int id);

    List<HousingInfo> findBySite(String site);

    int findIdByReplyId(int replyId);

    HousingInfo findById(int infoId);
}

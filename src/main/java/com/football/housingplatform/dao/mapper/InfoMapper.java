package com.football.housingplatform.dao.mapper;

import com.football.housingplatform.dao.domain.HousingInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface InfoMapper {

    List<HousingInfo> selectAll();

    void addInfo(HousingInfo HI);

    void deleteInfoById(int id);

    List<HousingInfo> findBySite(String site);

    int findIdByReplyId(int replyId);

    HousingInfo findById(int infoId);

    void deleteRelation(int infoId);
}

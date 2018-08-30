package com.kingdee.ssm.dao.impl;

import com.kingdee.ssm.dao.PaperDao;
import com.kingdee.ssm.vo.Paper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by zyq on 18/8/26.
 */
@Component
public class PaperDaoImpl implements PaperDao{

    @Autowired
    private SqlSession sqlSession;


    @Override
    public int addPaper(Paper paper) {
        return sqlSession.insert("addPaper",paper);
    }

    @Override
    public int deletePaperById(long id) {
        return sqlSession.delete("deletePaperById",id);
    }

    @Override
    public int updatePaper(Paper paper) {
        return sqlSession.update("updatePaper",paper);
    }

    @Override
    public Paper queryById(long id) {
        return sqlSession.selectOne("queryById",id);
    }

    @Override
    public List<Paper> queryAllPaper() {
        return sqlSession.selectList("queryAllPaper");
    }
}

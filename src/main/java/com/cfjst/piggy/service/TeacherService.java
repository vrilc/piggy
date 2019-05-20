package com.cfjst.piggy.service;

import com.cfjst.piggy.bean.Teacher;
import com.cfjst.piggy.dao.TeacherDao;
import com.cfjst.piggy.util.SqlUtil;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
@Service
public class TeacherService {

    SqlSession sqlSession;
    TeacherDao dao;

    public TeacherService() {
        sqlSession = new SqlUtil().openSession();
        dao = sqlSession.getMapper(TeacherDao.class);
    }

    /**
     * 登录
     * @param student 教师信息，至少包含Id和密码
     * @return 是否登陆成功
     */
    public Teacher login(Long id, String password){
        Teacher tea = dao.findById(id);
        if(null!=tea){
            if(tea.getPassword().equals(password)){
                return tea;
            }
        }
        return null;
        
    }
    
    public Teacher getById(Long id){
        
        return dao.findById(id);
    }
}
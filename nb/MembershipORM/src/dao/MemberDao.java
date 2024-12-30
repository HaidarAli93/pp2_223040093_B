/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Member;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


/**
 *
 * @author Haida
 */
public class MemberDao {
    private final SqlSessionFactory sqlSessionFactory;
    
    public MemberDao(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    
    public int insert(Member member) {
        int result;
        try (SqlSession session = sqlSessionFactory.openSession()) {
            result = session.insert("mapper.MemberMapper.insert", member);
        }
        return result;
    }
    
    public int update(Member member) {
        int result;
        try (SqlSession session = sqlSessionFactory.openSession()) {
            result = session.insert("mapper.MemberMapper.update", member);
        }
        return result;
    }
    
    public int delete(Member member) {
        int result;
        try (SqlSession session = sqlSessionFactory.openSession()) {
            result = session.insert("mapper.MemberMapper.delete", member);
        }
        return result;
    }
    
    public List<Member> findAll() {
        List<Member> result;
        try (SqlSession session = sqlSessionFactory.openSession()) {
            result = session.insert("mapper.MemberMapper.findAll");
        }
        return result;
    }
}
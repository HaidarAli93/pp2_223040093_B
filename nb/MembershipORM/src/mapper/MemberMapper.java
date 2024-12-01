/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mapper;

import java.util.List;
import model.JenisMember;
import model.Member;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 *
 * @author Haida
 */
public interface MemberMapper {
    @Insert("insert into member (id, nama) values (#{id}, #{nama})")
    public Integer insert(Member jenisMember);
    
    @Update("update member set nama = #{nama}, jenis_member_id = #{memberId} where id = #{id}")
    public Integer update(Member member);
    
    @Delete("delete from member where id = #{id}")
    public Integer delete(Member member);
    
    @Select("select * from member")
    @Results(value = {
        @Result(property = "id", column = "id"),
        @Result(property = "nama", column = "nama"),
        @Result(property = "jenisMember", column = "jeni_member_id",
                javaType = JenisMember.class, @One(select = "getJenisMember"))
    })
    List<Member>findAll();
    
    @Insert("insert into jenis_member (id, nama) values (#{id}, #{nama})")
    public Integer insert(JenisMember jenisMember);
    
    @Update("update jenis_member set nama = #{nama}, jenis_member_id = #{jenisMemberId} where id = #{id}")
    public Integer update(JenisMember jenisMember);
    
    @Delete("delete from jenis_member where id = #{id}")
    public Integer delete(JenisMember jenisMember);
    
    @Select("select * from jenis_member where id = #{id}")
    @Results(value = {
        @Result(property = "id", column = "id"),
        @Result(property = "nama", column = "nama")
    })
    JenisMember getJenisMember(String jenisMemberId);
}

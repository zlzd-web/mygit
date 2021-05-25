package com.hnjd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.hnjd.pojo.Composition;

@Repository
public interface CompositionMapper {
    //查询网站所有优秀作文
	List<Composition> queryComposition(@Param("composition_name")String composition_name,@Param("author_id")String author_id,@Param("author")String author);
	//先修改composition（可以使用触发器）
	@Update("update composition set composition_name = #{composition_name},composition_brief=#{composition_brief} where author_id=#{author_id}")
	void editComposition(@Param("composition_name")String composition_name,@Param("composition_brief")String compsition_brief,@Param("author_id")int author_id);
	//修改competitor
	@Update("update competitor set author=#{author},author_phone=#{author_phone} where author_id=#{author_id}")
	void editCompetitor(@Param("author")String author,@Param("author_phone")String author_phone,@Param("author_id")int author_id);
}

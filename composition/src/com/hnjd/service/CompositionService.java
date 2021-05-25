package com.hnjd.service;

import java.util.List;

import com.hnjd.pojo.Composition;

public interface CompositionService {
     //查询所有优秀作品
	 List<Composition> queryComposition(String composition_name,String author_id,String author);
	 //修改优秀作品
	 void edit(Composition composition);
}

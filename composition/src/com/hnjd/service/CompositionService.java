package com.hnjd.service;

import java.util.List;

import com.hnjd.pojo.Composition;

public interface CompositionService {
     //��ѯ����������Ʒ
	 List<Composition> queryComposition(String composition_name,String author_id,String author);
	 //�޸�������Ʒ
	 void edit(Composition composition);
}

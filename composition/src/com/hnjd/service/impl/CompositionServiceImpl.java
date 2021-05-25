package com.hnjd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnjd.mapper.CompositionMapper;
import com.hnjd.pojo.Composition;
import com.hnjd.service.CompositionService;
@Service
public class CompositionServiceImpl implements CompositionService {
    @Autowired private CompositionMapper mapper;

	@Override
	public List<Composition> queryComposition(String composition_name,String author_id,String author) {
		List<Composition> list = mapper.queryComposition(composition_name,author_id,author);
		return list;
	}

	@Override
	public void edit(Composition composition) {
		mapper.editComposition(composition.getComposition_name(), composition.getComposition_brief(), composition.getComposition_id());
		System.out.println(composition.getCompetitor());
		mapper.editCompetitor(composition.getCompetitor().getAuthor(), composition.getCompetitor().getAuthor_phone(),composition.getCompetitor().getAuthor_id());
	}
    
}

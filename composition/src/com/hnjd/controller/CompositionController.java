package com.hnjd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.hnjd.pojo.Composition;
import com.hnjd.service.impl.CompositionServiceImpl;

@Controller
public class CompositionController {
    @Autowired private CompositionServiceImpl csi;
    //第一次查询的数据
    @RequestMapping("/queryComposition")
    public String queryComposition(HttpServletRequest request){
    	List<Composition> list = csi.queryComposition(null,null,null);
    	request.getSession().setAttribute("list",list);
    	return "queryComposition.jsp";
    }
    //使用ajax进行高级查询
    @ResponseBody
    @RequestMapping("/likeQuery")
    public String likeQuery(String key){
    	List<Composition> list = csi.queryComposition(key,key,key);
    	Gson gson = new Gson();
    	String str = gson.toJson(list);
    	System.out.println(str+"这是json数据");
    	return str;
    }
    //编辑
    @RequestMapping("/editComposition")
    public String editComposition(Composition composition){
    	csi.edit(composition);
    	return "queryComposition";
    }
    @RequestMapping("/pageEdit")
    public String pageEdit(String author_id,HttpServletRequest request){
        List<Composition> list1 = csi.queryComposition(author_id, author_id, author_id);
        for (Composition composition : list1) {
			System.out.println(composition);
		}
        request.getSession().setAttribute("list1",list1);
    	return "pageEdit.jsp";
    }
}

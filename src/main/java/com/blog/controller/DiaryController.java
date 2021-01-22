package com.blog.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blog.model.Diary;
import com.blog.service.DiaryService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class DiaryController {
	@Autowired
	DiaryService diaryService;
	
	/**
	 * 编写心情
	 * @param diary
	 * @return
	 */
	@RequestMapping("writediary")
	public String writediary(Diary diary){
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = formatter.format(currentTime);
		diary.setTime(dateString);
		this.diaryService.writediary(diary);
		return "Dsuccess";
	}
	/**
	 * 查询所有心情
	 * @param request
	 * @return
	 */
	@RequestMapping("selectAllDiary")
	public String selectAllDiary(
			@RequestParam(value="pn",defaultValue="1")Integer pn,
			Model model){
		try {
			PageHelper.startPage(pn, 10);
			List<Diary> diarys =  diaryService.selectAllDiary();
			PageInfo page = new PageInfo(diarys);
			model.addAttribute("diarys", page);
			return "saylist";
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
	/**
	 * 管理员的心情所有列表
	 * @param request
	 * @return
	 */
	@RequestMapping("/admindiary")
	public String admindiary(
			@RequestParam(value="pn",defaultValue="1")Integer pn,
			Model model){
		try {
			PageHelper.startPage(pn, 10);
			List<Diary> diarys = diaryService.selectAllDiary();
			PageInfo page1 = new PageInfo(diarys);
			model.addAttribute("diarys", page1);
			return "adminDiaryList";
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		
	}
	/**
	 * 删除心情
	 * @param request
	 * @return
	 */
	@RequestMapping("/deleteDiaryById")
	public String deleteDiaryById(HttpServletRequest request){
		try {
			String id = request.getParameter("diaryid");
			int diaryid = Integer.parseInt(id);
			this.diaryService.deleteDiaryById(diaryid);
			return "redirect:admindiary";
		} catch (Exception e) {
			return null;	
		}
	}
}

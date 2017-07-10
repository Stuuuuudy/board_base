package com.ieee1986.board.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.ieee1986.board.model.Article;

@Service
public class BoardServiceImpl implements BoardService {

	private List<Article> list;

	@PostConstruct
	public void initDummyData() {
		list = new ArrayList<Article>();
		list.add(new Article(0, 0, "타이틀0", "내용0", 0, "2017-06-20", "admin"));
		list.add(new Article(1, 0, "타이틀1", "내용1", 0, "2017-06-21", "admin"));
		list.add(new Article(2, 0, "타이틀2", "내용2", 0, "2017-06-22", "admin"));
		list.add(new Article(3, 0, "타이틀3", "내용3", 0, "2017-06-23", "admin"));
		list.add(new Article(4, 0, "타이틀4", "내용4", 0, "2017-06-24", "admin"));
		list.add(new Article(5, 0, "타이틀5", "내용5", 0, "2017-06-25", "admin"));
		list.add(new Article(6, 0, "타이틀6", "내용6", 0, "2017-06-26", "admin"));
		list.add(new Article(7, 0, "타이틀7", "내용7", 0, "2017-06-27", "admin"));
		list.add(new Article(8, 0, "타이틀8", "내용8", 0, "2017-06-28", "admin"));
		list.add(new Article(9, 0, "타이틀9", "내용9", 0, "2017-06-29", "admin"));
	}

	@Override
	public List<Article> getAllArticle() {
		return list;
	}

	@Override
	public Article getArticleById(String id) {
		for (Article article : list) {
			if (String.valueOf(article.getIdx()).equals(id)) {
				return article;
			}
		}

		return null;
	}

	@Override
	public void insertArticle(Article newArticle) {
		newArticle.setIdx(getLastIndex() + 1);
		list.add(newArticle);

	}

	private int getLastIndex() {
		return list.get(list.size() - 1).getIdx();
	}

	@Override
	public void deleteArticle(String id) {
		Article targetObject = null;

		for (Article article : list) {
			if (String.valueOf(article.getIdx()).equals(id)) {
				targetObject = article;
				break;
			}
		}
		list.remove(targetObject);

	}

	@Override
	public void updateArticle(Article article) {

	}

}

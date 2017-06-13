package com.ieee1986.board.service;

import java.util.List;

import com.ieee1986.board.model.Article;

public interface BoardService {

	public List<Article> getAllArticle();

	public Article getArticleById(String id);

	public void insertArticle(Article article);

	public void deleteArticle(String id);

	public void updateArticle(Article article);

}

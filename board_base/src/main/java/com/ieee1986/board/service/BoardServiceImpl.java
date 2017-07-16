package com.ieee1986.board.service;

import com.ieee1986.board.dao.Dao;
import com.ieee1986.board.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private Dao dao;


    @Override
    public List<Article> getAllArticle() {
        return dao.getAllArticle();
    }

    @Override
    public Article getArticleById(String id) {
        return dao.getArticleById(id);
    }

    @Override
    public void insertArticle(Article article) {
        dao.insertArticle(article);
    }

    @Override
    public void deleteArticle(String id) {
        dao.deleteArticle(id);
    }

    @Override
    public void updateArticle(Article article) {
        dao.updateArticle(article);
    }

}

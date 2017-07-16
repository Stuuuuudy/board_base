package com.ieee1986.board.dao;

import com.ieee1986.board.model.Article;

import java.util.List;

/**
 * Created by jehunjeon on 2017. 7. 16..
 */
public interface Dao {

    List<Article> getAllArticle();

    Article getArticleById(String id);

    void insertArticle(Article article);

    void deleteArticle(String id);

    void updateArticle(Article article);

}

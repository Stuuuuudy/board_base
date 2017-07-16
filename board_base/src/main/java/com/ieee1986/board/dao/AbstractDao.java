package com.ieee1986.board.dao;

import com.ieee1986.board.model.Article;

import java.util.List;

/**
 * Created by jehunjeon on 2017. 7. 16..
 */
public abstract class AbstractDao implements Dao {

    public abstract List<Article> getAllArticle();

    public abstract Article getArticleById(String id);

    public abstract void insertArticle(Article article);

    public abstract void deleteArticle(String id);

    public abstract void updateArticle(Article article);

}

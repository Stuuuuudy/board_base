package com.ieee1986.board.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ieee1986.board.model.Article;
import com.ieee1986.board.service.BoardService;

@RestController
public class BoardController {

	private Log log = LogFactory.getLog(BoardController.class);

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public ResponseEntity<List<Article>> getAllArticle() {
		return new ResponseEntity<List<Article>>(boardService.getAllArticle(), HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Article> getArticleById(@PathVariable String id) {
		return new ResponseEntity<Article>(boardService.getArticleById(id), HttpStatus.OK);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.PUT)
	public ResponseEntity<Void> insertArticle(@RequestBody Article article) {
		if (log.isInfoEnabled()) {
			log.info("BoardController.insertArticle()");
		}

		boardService.insertArticle(article);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}

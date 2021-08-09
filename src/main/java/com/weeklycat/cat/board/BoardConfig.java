package com.weeklycat.cat.board;

import com.weeklycat.cat.board.repository.BoardRepository;
import com.weeklycat.cat.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    private final BoardRepository boardRepository;

    @Autowired
    public BoardConfig(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }


    @Bean
    public BoardService boardService(){
        return new BoardService(boardRepository);
    }
}

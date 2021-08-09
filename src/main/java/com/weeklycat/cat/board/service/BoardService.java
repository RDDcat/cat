package com.weeklycat.cat.board.service;

import com.weeklycat.cat.board.domain.Board;
import com.weeklycat.cat.board.repository.BoardRepository;

import java.util.List;

public class BoardService {

    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }


    public void saveBoard(Board board){
        boardRepository.save(board);
    }

    // 전체 글 조회
    public List<Board> findBoards(){
        return boardRepository.findAll();
    }

}

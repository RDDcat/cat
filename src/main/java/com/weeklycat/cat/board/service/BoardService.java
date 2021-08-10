package com.weeklycat.cat.board.service;

import com.weeklycat.cat.board.domain.Board;
import com.weeklycat.cat.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class BoardService {

    private final BoardRepository boardRepository;

    @Autowired
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

    public Optional<Board> findByID(Long id){
        return boardRepository.findById(id);
    }

}

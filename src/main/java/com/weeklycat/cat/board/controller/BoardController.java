package com.weeklycat.cat.board.controller;

import com.weeklycat.cat.board.domain.Board;
import com.weeklycat.cat.board.domain.BoardForm;
import com.weeklycat.cat.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 썸네일


    // id로 제목 내용 텍스트 가져오기


    //
    @GetMapping("board")
    public String list(Model model){
        List<Board> boards = boardService.findBoards();
        model.addAttribute("boards", boards);
        return "board/home";
    }

    //
    @GetMapping("board/write")
    public String goWritePage(){
        return "board/write";
    }


    // 글쓰기
    @PostMapping("board/new")
    public String createBoard(BoardForm boardForm){
        Board board = new Board();
        board.setTitle(boardForm.getTitle());
        board.setText(boardForm.getText());
        boardService.saveBoard(board);
        return "redirect:/board";
    }


    // test 에러남 ...? 왜지...
    @GetMapping("board-api")
    public Board apitest(){
        Board board = new Board();
        board.setBid(1L);
        board.setTitle("test dummy title");
        board.setText("test dummy text text");
        return board;
    }

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "weekly-cat";
    }
}

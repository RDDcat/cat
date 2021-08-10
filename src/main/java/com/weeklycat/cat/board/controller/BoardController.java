package com.weeklycat.cat.board.controller;

import com.weeklycat.cat.board.domain.Board;
import com.weeklycat.cat.board.domain.BoardForm;
import com.weeklycat.cat.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    // 썸네일


    // id로 제목 내용 텍스트 가져오기


    //
    @GetMapping("/list")
    public String list(Model model){
        List<Board> boards = boardService.findBoards();
        model.addAttribute("boards", boards);
        return "board/list";
    }

    //
    @GetMapping("/write")
    public String writeBoard(Model model, @RequestParam(required = false) Long id){
        if(id == null){
            model.addAttribute("board",new Board());
        } else{
            Board board = boardService.findByID(id).orElse(null);
            model.addAttribute("board", board);
        }

        return "board/write";
    }


    // 글쓰기
    @PostMapping("/write")
    public String createBoard(@ModelAttribute Board board){
        boardService.saveBoard(board);
        return "redirect:/board/list";
    }


    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!!");
        return "weekly-cat";
    }
}

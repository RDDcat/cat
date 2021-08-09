package com.weeklycat.cat.board.repository;

import com.weeklycat.cat.board.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class LocalBoardRepository implements BoardRepository{

    private static Map<Long, Board> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Board save(Board board) {
        board.setBid(++sequence);
        store.put(board.getBid(), board);
        return board;
    }

    @Override
    public Optional<Board> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Board> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Board> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}

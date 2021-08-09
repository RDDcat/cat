package com.weeklycat.cat.board.repository;

import com.weeklycat.cat.board.domain.Board;

import java.util.List;
import java.util.Optional;

public class H2BoardRepository implements BoardRepository {
    @Override
    public Board save(Board member) {
        return null;
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
        return null;
    }
}

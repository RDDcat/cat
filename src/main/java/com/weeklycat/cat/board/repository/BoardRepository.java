package com.weeklycat.cat.board.repository;

import com.weeklycat.cat.board.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BoardRepository {
    Board save(Board member);
    Optional<Board> findById(Long id);
    Optional<Board> findByName(String name);
    List<Board> findAll();
}

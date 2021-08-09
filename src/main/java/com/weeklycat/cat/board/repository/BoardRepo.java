package com.weeklycat.cat.board.repository;

import com.weeklycat.cat.board.domain.Board;
import org.springframework.data.repository.CrudRepository;

public interface BoardRepo extends CrudRepository<Board, Integer> {
}

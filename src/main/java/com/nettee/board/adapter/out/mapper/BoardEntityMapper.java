package com.nettee.board.adapter.out.mapper;

import com.nettee.board.adapter.out.persistence.entity.BoardEntity;
import com.nettee.board.application.domain.Board;
import com.nettee.board.application.domain.type.BoardStatus;
import org.mapstruct.Mapper;

import java.time.Instant;
import java.util.Optional;

@Mapper(componentModel = "spring")
public interface BoardEntityMapper {

    Board toDomain(BoardEntity boardEntity);
    BoardEntity toEntity(Board board);
    default Optional<Board> toOptionalDomain(BoardEntity boardEntity) {
        return Optional.ofNullable(toDomain(boardEntity));
    }
}

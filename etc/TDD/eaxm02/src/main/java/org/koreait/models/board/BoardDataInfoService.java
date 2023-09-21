package org.koreait.models.board;

import lombok.RequiredArgsConstructor;
import org.koreait.entities.BoardData;
import org.koreait.repositories.BoardDataRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardDataInfoService {
    private final BoardDataRepository repository; // 의존성 주입

    public BoardData get(Long id) {
        BoardData data = repository.findById(id).orElseThrow(BoardDataNotFoundException::new);

        return data;
    }
}

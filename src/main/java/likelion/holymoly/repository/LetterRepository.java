package likelion.holymoly.repository;

import likelion.holymoly.entity.Board;
import likelion.holymoly.entity.Letter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LetterRepository extends JpaRepository<Letter, Long> {
    List<Letter> findByBoard(Board board);
}
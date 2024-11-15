package likelion.holymoly.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Letter extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "letter_id")
    private Long letterId;

    @ManyToOne
    @JoinColumn(name = "invitation_id", nullable = false)
    private Board board;

    @Column(nullable = false)
    private String content;

    @Column(name = "author_nickname", length = 10, nullable = false)
    private String authorNickname;

    @Builder
    public Letter(Board board, String content, String authorNickname) {
        this.board = board;
        this.content = content;
        this.authorNickname = authorNickname;
    }
}

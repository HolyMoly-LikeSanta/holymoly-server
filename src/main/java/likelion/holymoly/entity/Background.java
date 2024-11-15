package likelion.holymoly.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Background {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bg_id")
    private Long bgId;

    @Column(name = "background_name", nullable = false)
    private String name;

    @Column(name = "image_url")
    private String imageUrl;

    private String description;

    @Builder
    public Background(String name, String imageUrl, String description) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.description = description;
    }
}

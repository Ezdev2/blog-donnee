package school.hei.demo.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="\"user\"")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    // int, float, char, long
    // Integer, Float, Character, Long
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //serial generated value
    private Long id;

    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(length = 100)
    private String lastName;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String passWord;
}

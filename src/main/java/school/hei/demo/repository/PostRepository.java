package school.hei.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import school.hei.demo.model.Post;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    // SELECT * FROM post WHERE id_user = 1
    List<Post> findByUserId(Long id);

    // SELECT * FROM post WHERE content ILIKE '%query%'
    List<Post> findByContentContainingIgnoreCase(String query);

    // SELECT * FROM post WHERE title = title AND content LIKE '%query'
    List<Post> findByTitleAndContentEndingWith(String title, String query);

    //au cas ou on ne sait pas les syntaxe de JPA on peut utiliser JPQL en utilisant
    // @Query(value = 'syntaxe psotgresql par exemple', nativeQuery = true)
    // dans ce cas on peut ecrire ce qu'on veut à la place de syntaxe de JPA
}

package lk.ideas.repository;

import lk.ideas.domain.application.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findUsersByUserName(String username);

}

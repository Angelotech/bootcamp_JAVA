package DIO.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Model.User;


public interface UserRepository extends JpaRepository<User, Integer> {

}

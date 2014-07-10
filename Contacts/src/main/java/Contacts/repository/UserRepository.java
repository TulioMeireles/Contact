package Contacts.repository;

import org.springframework.data.repository.CrudRepository;
import Contacts.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByEmail(String email);
}

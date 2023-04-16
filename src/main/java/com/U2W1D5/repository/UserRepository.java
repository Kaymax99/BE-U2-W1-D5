package com.U2W1D5.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.U2W1D5.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}

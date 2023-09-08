package org.fi.bootresthiber1.repository;

import org.fi.bootresthiber1.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

}

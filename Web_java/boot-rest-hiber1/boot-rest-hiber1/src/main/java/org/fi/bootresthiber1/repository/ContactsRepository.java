package org.fi.bootresthiber1.repository;

import org.fi.bootresthiber1.entity.Contacts;
import org.springframework.data.repository.CrudRepository;

public interface ContactsRepository extends CrudRepository<Contacts, Integer> {

}

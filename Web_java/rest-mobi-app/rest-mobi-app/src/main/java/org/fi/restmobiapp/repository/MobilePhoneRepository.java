package org.fi.restmobiapp.repository;

import java.util.Optional;

import org.fi.restmobiapp.entity.MobilePhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MobilePhoneRepository extends JpaRepository<MobilePhone, Long> {

	

}

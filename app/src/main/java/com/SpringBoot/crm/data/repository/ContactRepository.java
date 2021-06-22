package com.SpringBoot.crm.data.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SpringBoot.crm.domain.Contact;
import com.SpringBoot.crm.model.ContactUser;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{
	
	@Query("from Contact where gender= :gender")
	List<ContactUser> returnUserByGender(@Param("gender")String gender);
}

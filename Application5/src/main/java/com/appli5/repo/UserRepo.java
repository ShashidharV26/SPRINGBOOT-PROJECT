package com.appli5.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.appli5.modle.User;

public interface UserRepo extends JpaRepository<User, Integer> {

//	@Query(value="delete from User where id=?1;",nativeQuery = true)
//	List<User> deleteById(int id);

}

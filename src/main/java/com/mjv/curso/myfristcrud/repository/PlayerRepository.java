package com.mjv.curso.myfristcrud.repository;
import com.mjv.curso.myfristcrud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<User, Long>{
}
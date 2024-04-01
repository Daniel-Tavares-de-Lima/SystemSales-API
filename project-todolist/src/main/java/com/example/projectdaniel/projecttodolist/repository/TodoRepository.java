package com.example.projectdaniel.projecttodolist.repository;

/*--IMPORTS */
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projectdaniel.projecttodolist.entity.Todo;

/*---- */
public interface TodoRepository extends JpaRepository<Todo, Long> {

}

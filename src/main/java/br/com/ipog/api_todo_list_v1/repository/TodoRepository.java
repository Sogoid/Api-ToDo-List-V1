package br.com.ipog.api_todo_list_v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ipog.api_todo_list_v1.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}

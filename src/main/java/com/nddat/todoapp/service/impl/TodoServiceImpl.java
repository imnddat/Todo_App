package com.nddat.todoapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nddat.todoapp.entity.Todo;
import com.nddat.todoapp.repository.TodoRepository;
import com.nddat.todoapp.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {

    public static int increase = 0;

    @Autowired
    TodoRepository todoRepository;

    public void addTodo(String title) {
        Todo todo = new Todo();
        todo.setTitle(title);
        todo.setCompleted(false);
        todoRepository.save(todo);
    }

    public List<Todo> getAllTodo() {
        return todoRepository.findAll();
    }

    public void deleteTodo(int id) {
        todoRepository.deleteById(id);;
    }

    public void toggleTodo(int id) {
        Todo oldTodo = todoRepository.findById(id).get();
        oldTodo.setCompleted(!oldTodo.isCompleted());
        todoRepository.save(oldTodo);
    }
}

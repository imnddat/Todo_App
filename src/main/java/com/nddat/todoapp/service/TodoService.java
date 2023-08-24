package com.nddat.todoapp.service;

import java.util.List;

import com.nddat.todoapp.entity.Todo;

public interface TodoService {
    public void addTodo(String title);

    public List<Todo> getAllTodo();

    public void deleteTodo(int id);

    public void toggleTodo(int id);
}

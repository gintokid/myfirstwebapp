package com.madroid.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {

    private static List<Todo> todos;

    private static int todosCount = 0;

    static {
        todos = new ArrayList<>();
        todos.add(new Todo(++todosCount, "mad", "Learn Aws", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "in28min.com", "Learn Spring", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "udemy.com", "Learn DevOpds", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "mad", "Learn Docker", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(++todosCount, "mad", "Learn Spring Batch", LocalDate.now().plusYears(3), false));
        todos.add(new Todo(++todosCount, "mad", "Learn Spring Cloud", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findAll() {
        return todos;
    }

    public List<Todo> findByUserName(String username) {
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equals(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        todos.add(new Todo(++todosCount, username, description, targetDate, done));
    }


    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findByID(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}

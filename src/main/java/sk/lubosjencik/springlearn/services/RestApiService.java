package sk.lubosjencik.springlearn.services;

import sk.lubosjencik.springlearn.model.Todo;

import java.util.List;

public interface RestApiService {
    Todo getTodo(Long id);
    List<Todo> getTodos();
}

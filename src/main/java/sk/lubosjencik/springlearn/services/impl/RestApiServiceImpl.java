package sk.lubosjencik.springlearn.services.impl;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sk.lubosjencik.springlearn.model.Todo;
import sk.lubosjencik.springlearn.services.RestApiService;

import java.util.List;
@Service
public class RestApiServiceImpl implements RestApiService {


    RestTemplate restTemplate;

    public RestApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    public static void main(String[] args){
//        RestApiServiceImpl restApiService = new RestApiServiceImpl();
//        Todo todo = restApiService.getTodo(1L);
//        System.out.println(todo.getTitle());
//
//        System.out.println(restApiService.getTodos());
//    }

    @Override
    public Todo getTodo(Long id) {
        Todo todo = restTemplate.getForObject("http://jsonplaceholder.typicode.com/todos/1", Todo.class);
        return todo;
    }

    @Override
    public List<Todo> getTodos() {

        ResponseEntity<List<Todo>> responseEntity = restTemplate.exchange(
                "http://jsonplaceholder.typicode.com/todos",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Todo>>() {
                }
        );

        List<Todo> todos = responseEntity.getBody();
        return todos;
    }
}

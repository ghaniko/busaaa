package com.greenfoxacademy.demo.Controllers;

import com.greenfoxacademy.demo.Models.Todo;
import com.greenfoxacademy.demo.Repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class ToDoController {

  @Autowired
  TodoRepository cruds;

  @GetMapping("/todo")
  public String todoGetController(){
    return "todo";
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model){
    List<Todo> todos = new ArrayList<>();
    cruds.findAll().forEach(todos::add);
    model.addAttribute("todos", todos);
    return "todo";
  }

}

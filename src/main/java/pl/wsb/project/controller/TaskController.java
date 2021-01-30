package pl.wsb.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.ModelAndView;
import pl.wsb.project.model.Task;
import pl.wsb.project.service.TaskService;

@Controller
@RequestMapping("/")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("listTasks", taskService.listAll());
        return "index";
    }

    @RequestMapping("/new")
    public String create(Model model){
        Task task = new Task();
        model.addAttribute("task",task);
        return "new";
    }

    @RequestMapping("/save")
    public String saveTask(@ModelAttribute("task") Task task){
        taskService.save(task);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable(name = "id") int id){
        ModelAndView modelAndView = new ModelAndView("edit");
        modelAndView.addObject("task", taskService.find(id));
        return modelAndView;
    }

    @RequestMapping("/delete/{id}")
    public String deleteTask(@PathVariable(name = "id") int id){
        taskService.delete(id);
        return "redirect:/";
    }
}

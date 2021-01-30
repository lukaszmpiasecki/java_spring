package pl.wsb.project.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.wsb.project.model.Task;
import pl.wsb.project.repository.TaskRepository;

@Service
@Transactional
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    public Iterable<Task> listAll() {
        return taskRepository.findAll();
    }

    public void save(Task task){
        taskRepository.save(task);
    }

    public Task find(Integer id){
        return taskRepository.findById(id).orElse(null);
    }

    public void delete(Integer id){
        taskRepository.deleteById(id);
    }
}

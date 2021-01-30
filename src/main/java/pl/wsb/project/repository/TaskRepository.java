package pl.wsb.project.repository;

import org.springframework.data.repository.CrudRepository;
import pl.wsb.project.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer> {
}

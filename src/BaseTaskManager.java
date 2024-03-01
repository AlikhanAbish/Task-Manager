package Taskmanage;
import java.util.*;
class BaseTaskManager implements TaskManager {
    private List<Task> tasks;

    BaseTaskManager() {
        this.tasks = new ArrayList<>();
    }

    @Override
    public void addTask(String title, String description, String deadline, String status) {
        Task tasks = new Task(title, description, deadline, status)
        tasks.add(tasks);
    }

    @Override
    public void editTaskStatus(String title, String newStatus) {
        for (Task task : tasks) {
            if (Objects.equals(task.getTitle(), title)) {
                task.setStatus(newStatus);
            }
        }
    }

    @Override
    public void printAllTasks() {
        tasks.forEach(System.out::println);
    }

    @Override
    public void printDoneTasks() {
        tasks.stream()
                .filter(task -> Objects.equals(task.getStatus(), "Done"))
                .forEach(System.out::println);
    }

    @Override
    public void printInProcessTasks() {
        tasks.stream()
                .filter(task -> Objects.equals(task.getStatus(), "In process"))
                .forEach(System.out::println);
    }
}

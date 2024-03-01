package Taskmanage;

import java.util.Objects;

// Task interface defining common operations
interface Task {
    String getTitle();
    String getDescription();
    String getDeadline();
    String getStatus();
    void setStatus(String status);

    void add(Task tasks);
}

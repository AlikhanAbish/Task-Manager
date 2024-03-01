package Taskmanage;

interface TaskManager {


    static void addTask(String title, String description, String deadline, String status) {
    }

    static void editStatus(String title, String newStatus) {
    }
    static void removeTask(String title) {

    }

    void printAllTasks();
    void printDoneTasks();
    void printInProcessTasks();
}

package org.example.quiz3.task3taskmanagementsystem;

import java.util.List;

public class TaskMain {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        taskManager.createTask(1, "Task 1", 3);
        taskManager.createTask(2, "Task 2", 1);
        taskManager.createTask(3, "Task 3", 2);
        taskManager.createTask(4, "Task 4", 3);
        taskManager.createTask(5, "Task 5", 1);

        taskManager.printTasks();
        taskManager.changePriority(3, 4);
        taskManager.printTasks();

        List<List<Task>> tasksByPriority = taskManager.getTasksByPriority();
        for (List<Task> tasks : tasksByPriority) {
            for (Task task : tasks) {
                System.out.println(task);
            }
        }

        System.out.println();

        taskManager.removeTask(3);
        taskManager.printTasks();

    }
}

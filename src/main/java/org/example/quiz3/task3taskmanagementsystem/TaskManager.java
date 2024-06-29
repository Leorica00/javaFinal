package org.example.quiz3.task3taskmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class TaskManager {
    private final ArrayList<Task> tasks = new ArrayList<>();

    public void createTask(int id, String name, int priority) {
        tasks.add(new Task(id, name, priority));
    }

    public void removeTask(int id) {
        tasks.removeIf(task -> task.getId() == id);
    }

    public void printTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
        System.out.println();
    }

    public Task findTaskById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    public void changePriority(int id, int newPriority) {
        Task task = findTaskById(id);
        if (task != null) {
            tasks.remove(task);
            task.setPriority(newPriority);
            tasks.add(task);
        } else {
            System.out.println("Task with ID " + id + " not found.");
        }
    }

    public List<List<Task>> getTasksByPriority() {
        List<List<Task>> tasksByPriority = new ArrayList<>();
        PriorityQueue<Task> tempQueue = new PriorityQueue<>(tasks);
        while (!tempQueue.isEmpty()) {
            int priority = tempQueue.peek().getPriority();
            List<Task> tempList = new ArrayList<>();
            while (!tempQueue.isEmpty() && tempQueue.peek().getPriority() == priority) {
                tempList.add(tempQueue.poll());
            }
            tasksByPriority.add(tempList);
        }
        return tasksByPriority;
    }
}

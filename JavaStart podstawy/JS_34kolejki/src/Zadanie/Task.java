package Zadanie;

public class Task implements Comparable<Task> {
    @Override
    public int compareTo(Task o) {
        return priority.compareTo(o.priority);
    }

    public enum Priority {
        HIGH, MODERATE, LOW;
    }

    private String taskName;
    private String describe;
    private Priority priority;


    public Task(String taskName, String describe, Priority priority) {
        this.taskName = taskName;
        this.describe = describe;
        this.priority = priority;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", describe='" + describe + '\'' +
                ", priority=" + priority +
                '}';
    }
}

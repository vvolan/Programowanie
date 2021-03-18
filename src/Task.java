public class Task {
    private String taskName;
    private String taskDescription;
    private taskCategory taskCategory;
    private String taskDateTimeStart;
    private String taskDateTimeStop;
}

    public Task (String taskName, String taskDescription, taskCategory taskCategory, String taskDateTimeStop) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskCategory = taskCategory;
        this.taskDateTimeStop = taskDateTimeStop;


        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        taskDateTimeStart = date.toString();
    }



    public String toString() {
        return "Name: " + taskName + ", Description: " + taskDescription + ", Category: " + taskCategory.name() +
                ", Time start: " + taskDateTimeStart + ", Time stop: " + taskDateTimeStop;
    }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public taskCategory getTaskCategory() {
        return taskCategory;
    }

    public String getTaskDateTimeStart() {
        return taskDateTimeStart;
    }

    public String getTaskDateTimeStop() {
        return taskDateTimeStop;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setTaskCategory(taskCategory taskCategory) {
        this.taskCategory = taskCategory;
    }

    public void setTaskDateTimeStart(String taskDateTimeStart) {
        this.taskDateTimeStart = taskDateTimeStart;
    }

    public void setTaskDateTimeStop(String taskDateTimeStop) {
        this.taskDateTimeStop = taskDateTimeStop;
    }
}
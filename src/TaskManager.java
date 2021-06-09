package lab04;

import Lab02.Task;
import Lab02.taskCategory;

public interface TaskManager {
    Task addTask(Task t);
    void removeTask(Task t);
    Task[] getAllTasks();
    Task getTaskByName(String taskName);
    public static final Task [] tasks = {
            new Task("Marszobieg", "Przemarszowac 10km", taskCategory.NEW),
            new Task("Czytanie", "Przeczytac ksiazke", taskCategory.DONE),
            new Task("Spacer", "Isc na spacer z psem",taskCategory.NEW),
            new Task("Ogrodnictwo", "Pielegnowac ogrod", taskCategory.IN_PROGRESS),
            new Task("Szachy", "Zagrac w szachy",taskCategory.DONE),
            new Task("Pieczenie", "Upiec ciasto", taskCategory.NEW),
            new Task("Sprzatanie", "Posprzatac", taskCategory.IN_PROGRESS),
            new Task("Spotkanie", "Spotkac sie ze znajomymi", taskCategory.DONE),
            new Task("Nauka", "Nauczyc sie jezyka", taskCategory.NEW),
            new Task("Programowanie", "Zrobic zadanie na programowanie", taskCategory.IN_PROGRESS),
    };
}
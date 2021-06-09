package lab04;
import Lab02.Task;

import java.util.Random;

import static lab04.TaskManager.tasks;

public abstract class DBConnector {

    public abstract boolean connect();
    public abstract void close();
    public Task[] executeQuery() {
        return  tasks;
    }
    boolean executeUpdate() {
        Random random = new Random();
        boolean b = random.nextBoolean();
        return b;
    }
}

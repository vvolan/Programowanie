public class Main {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date dateToEnd1 = new Date(System.currentTimeMillis() + 7200000);
        Date dateToEnd2 = new Date(System.currentTimeMillis() + 54300000);
        Date dateToEnd3 = new Date(System.currentTimeMillis() + 98308000);

        Task task1 = new Task("Fryzjer", "Umówić wizytę", taskCategory.NEW, dateToEnd1.toString());
        Task task2 = new Task("Zakupy", "Kupić mleko , ser , szynke", taskCategory.IN_PROGRESS, dateToEnd2.toString());
        Task task3 = new Task("Sprzątanie", "Odkurzyć mieszkanie", taskCategory.DONE, dateToEnd3.toString());
        Date dateToEnd4 = new Date(System.currentTimeMillis() + TimeUnit.DAYS.toMillis(90));
        Task task4 = new Task("Jazda na rowerze", "Przejechać 40km, taskCategory.NEW, dateToEnd4.toString());

        List<Task> taskList = new ArrayList<Task>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);

        for (Task task : taskList) {
            System.out.println(task.toString());
        }

    }
}

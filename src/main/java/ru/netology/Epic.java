package ru.netology;

public class Epic extends Task{
    protected String[] subTasks;

    public Epic(int id, String[] subTasks) {
        super(id);
        this.subTasks = subTasks;
    }

    public String[] getSubTasks() {
        return subTasks;
    }

    @Override
    public boolean matches(String query) {
        for(String subTask: subTasks) {
            if(subTask.contains(query)) {
                return true;
            }
        }
        return false;
    }
}

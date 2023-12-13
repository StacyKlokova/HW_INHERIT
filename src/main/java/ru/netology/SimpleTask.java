package ru.netology;

public class SimpleTask extends Task{
    protected String title; //protected видно в этом классе и в классе наследников

    public SimpleTask(int id, String title) {
        super(id); // унаследованное поле
        this.title = title; //свое поле
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        if(title.contains(query)) {
            return true;
        }
        return false;
    }
}

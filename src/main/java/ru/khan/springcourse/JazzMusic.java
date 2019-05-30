package ru.khan.springcourse;

public class JazzMusic implements Music {
    @Override
    public void init() {
        System.out.println("Doing my initialization...");
    }

    @Override
    public void destroy() {
        System.out.println("Doing my destroy...");
    }
    @Override
    public String getSong() {
        return "Caravan";
    }
}

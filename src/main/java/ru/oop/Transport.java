package ru.oop;

public class Transport implements Positioned, Comparable<Transport>{

    public Transport(Person person){};
    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public void setPosition(Position position) {

    }
    public void getToPosition(Position position){};

    /**
     * Меньше тот объект, который находится ближе к человеку
     */
    @Override
    public int compareTo(Transport o) {
        return 0;
    }
}

package ru.oop;

public class Transport implements Positioned{

    public Transport(Person person){};
    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public void setPosition(Position position) {

    }

    /**
     * Добраться до места destination
     * Метод меняет местоположение человека
     * @param destination
     */
    public void getToPosition(Position destination){};
}

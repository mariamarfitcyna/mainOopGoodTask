package ru.oop;

public interface Transport extends Positioned{

    /**
     * Добраться до места destination
     * Метод меняет местоположение человека
     * @param destination
     */
    void go(Position destination);
}

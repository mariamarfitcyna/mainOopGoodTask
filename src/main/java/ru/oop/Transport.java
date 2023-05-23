package ru.oop;

public interface Transport extends Positioned{

    void go(Position position);

    /**
     * Меньше тот объект, который находится ближе к человеку
     */

}

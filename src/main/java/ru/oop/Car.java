package ru.oop;

public interface Car {

    /**
     * Подвезти максимально близко до destination
     * Пусть внутри еще меняет местоположение человека (person)
     * @param destination место назначения
     * @param person человек которого подвозим
     */
    Position movePersonTo(Position destination, Person person);

}
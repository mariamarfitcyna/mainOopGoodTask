package ru.oop.transports;

import ru.oop.Person;
import ru.oop.location.Position;

public class Car implements Transport {

    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public void setPosition(Position position) {

    }

    @Override
    public Position movePersonTo(Position destination, Person person) {
        return null;
    }
}

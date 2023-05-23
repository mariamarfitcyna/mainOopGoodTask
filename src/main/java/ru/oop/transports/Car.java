package ru.oop.transports;

import ru.oop.Person;
import ru.oop.Position;

public class Car implements Transport {
    @Override
    public Position getPosition() {
        return null;
    }

    @Override
    public void setPosition(Position position) {

    }

    @Override
    public Position go(Position position, Person person) {
        return null;
    }
}

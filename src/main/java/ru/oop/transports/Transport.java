package ru.oop.transports;

import ru.oop.Person;
import ru.oop.location.Position;
import ru.oop.location.Positioned;

public interface Transport extends Positioned {

    /**
     * Подвозим человека максимально близко до destination
     * @param destination
     * @param person - человек которого подвозим
     * @return position куда приехали
     */
    Position movePersonTo(Position destination, Person person);
}

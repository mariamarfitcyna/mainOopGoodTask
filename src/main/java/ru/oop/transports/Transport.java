package ru.oop.transports;

import ru.oop.Person;
import ru.oop.Position;
import ru.oop.Positioned;

public interface Transport extends Positioned {

    /**
     * Подвозим человека максимально близко к position
     * @param position
     * @param person
     * @return position - куда добрались
     */
    Position go(Position position, Person person);


}

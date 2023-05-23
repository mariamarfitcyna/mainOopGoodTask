package ru.oop.location;

/**
 * Обозначает что объект позиционируемый,
 * т.е. знает своё местоположение и может его изменить
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public interface Positioned {

    /**
     * Текущее местоположение
     */
    Position getPosition();

    /**
     * Установить текущее местоположение
     */
    void setPosition(Position position);
}

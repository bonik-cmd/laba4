package com.example;
/**
 * Класс для папоротников
 * @author Student
 * @version 1.0
 */
public class Fern extends HousePlant {
    /** Тип вай (листьев) */
    private String frondType;

    public Fern() {
        super();
        this.frondType = "Неизвестно";
    }

    public Fern(String name, double height, int lifespan, String frondType) {
        super(name, height, lifespan);
        this.frondType = frondType;
    }

    public String getFrondType() { return frondType; }
    public void setFrondType(String frondType) { this.frondType = frondType; }

    @Override
    public String toString() {
        return String.format("Папоротник: %s, Высота: %.1f см, Жизнь: %d лет, Тип вай: %s",
                name, height, lifespan, frondType);
    }
}

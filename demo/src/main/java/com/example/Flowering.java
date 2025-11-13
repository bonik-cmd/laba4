package com.example;
/**
 * Класс для красивоцветущих растений
 * @author Student
 * @version 1.0
 */
public class Flowering extends HousePlant {
    /** Продолжительность цветения в месяцах */
    private int bloomDuration;

    public Flowering() {
        super();
        this.bloomDuration = 0;
    }

    public Flowering(String name, double height, int lifespan, int bloomDuration) {
        super(name, height, lifespan);
        this.bloomDuration = bloomDuration;
    }

    public int getBloomDuration() { return bloomDuration; }
    public void setBloomDuration(int bloomDuration) { this.bloomDuration = bloomDuration; }

    @Override
    public String toString() {
        return String.format("Красивоцветущее: %s, Высота: %.1f см, Жизнь: %d лет, Цветение: %d мес.",
                name, height, lifespan, bloomDuration);
    }
}

package com.example;
/**
 * Класс для суккулентов
 * @author Student
 * @version 1.0
 */
public class Succulent extends HousePlant {
    /** Объем хранения воды в мл */
    private double waterStorage;

    public Succulent() {
        super();
        this.waterStorage = 0.0;
    }

    public Succulent(String name, double height, int lifespan, double waterStorage) {
        super(name, height, lifespan);
        this.waterStorage = waterStorage;
    }

    public double getWaterStorage() { return waterStorage; }
    public void setWaterStorage(double waterStorage) { this.waterStorage = waterStorage; }

    @Override
    public String toString() {
        return String.format("Суккулент: %s, Высота: %.1f см, Жизнь: %d лет, Запас воды: %.1f мл",
                name, height, lifespan, waterStorage);
    }
}

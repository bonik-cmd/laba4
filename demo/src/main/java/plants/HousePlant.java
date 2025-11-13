package plants;
/**
 * Базовый класс для всех комнатных растений
 * @author Student
 * @version 1.0
 */
public class HousePlant {
    /** Название растения */
    protected String name;

    /** Высота растения в см */
    protected double height;

    /** Продолжительность жизни в годах */
    protected int lifespan;

    /**
     * Конструктор по умолчанию
     */
    public HousePlant() {
        this.name = "Неизвестное растение";
        this.height = 0.0;
        this.lifespan = 0;
    }

    /**
     * Конструктор с параметрами
     * @param name название растения
     * @param height высота растения в см
     * @param lifespan продолжительность жизни в годах
     */
    public HousePlant(String name, double height, int lifespan) {
        this.name = name;
        this.height = height;
        this.lifespan = lifespan;
    }

    // --- Геттеры и сеттеры ---
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getHeight() { return height; }
    public void setHeight(double height) { this.height = height; }

    public int getLifespan() { return lifespan; }
    public void setLifespan(int lifespan) { this.lifespan = lifespan; }

    @Override
    public String toString() {
        return String.format("Растение: %s, Высота: %.1f см, Продолжительность жизни: %d лет",
                name, height, lifespan);
    }
}

package plants;

import java.util.ArrayList;
import java.util.List;

/**
 * Репозиторий для хранения коллекции комнатных растений
 */
public class PlantRepository {

    /** Коллекция всех растений */
    private List<HousePlant> plants = new ArrayList<>();

    /**
     * Добавить растение в коллекцию
     * @param plant объект HousePlant
     */
    public void add(HousePlant plant) {
        plants.add(plant);
    }

    /**
     * Удалить растение из коллекции
     * @param plant объект HousePlant
     */
    public void remove(HousePlant plant) {
        plants.remove(plant);
    }

    /**
     * Изменить элемент коллекции
     * @param index индекс в списке
     * @param newPlant новый объект HousePlant
     */
    public void update(int index, HousePlant newPlant) {
        if (index >= 0 && index < plants.size()) {
            plants.set(index, newPlant);
        }
    }

    /**
     * Получить весь список растений
     * @return коллекция HousePlant
     */
    public List<HousePlant> getAll() {
        return plants;
    }
}

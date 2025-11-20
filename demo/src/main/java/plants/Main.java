package plants;

public class Main {
    public static void main(String[] args) {

        // Создаем репозиторий
        PlantRepository repo = new PlantRepository();

        // Создаем растения
        Fern fern = new Fern("Папоротник лесной", 45.5, 8, "Раздельные");
        Flowering rose = new Flowering("Роза", 30.0, 5, 4);
        Succulent aloe = new Succulent("Алоэ", 25.0, 12, 120.5);

        // Добавляем в репозиторий
        repo.add(fern);
        repo.add(rose);
        repo.add(aloe);

        // Выводим все растения
        System.out.println("=== Список растений ===");
        for (HousePlant p : repo.getAll()) {
            System.out.println(p);
        }

        // Изменение элемента
        repo.update(1, new Flowering("Фиалка", 15.0, 3, 6));

        System.out.println("\n=== После изменения ===");
        for (HousePlant p : repo.getAll()) {
            System.out.println(p);
        }

        // Удаление растения
        repo.remove(fern);

        System.out.println("\n=== После удаления ===");
        for (HousePlant p : repo.getAll()) {
            System.out.println(p);
        }
    }
}

package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<HousePlant> plants = new ArrayList<>();

        // --- 3. Создаем минимум 10 различных объектов ---
        plants.add(new Flowering("Роза", 35.5, 3, 6));
        plants.add(new Flowering("Орхидея", 45.0, 5, 10));
        plants.add(new Flowering("Фиалка", 20.0, 2, 8));
        plants.add(new Flowering("Герань", 30.0, 4, 5));
        plants.add(new Succulent("Алоэ", 25.0, 8, 150.0));
        plants.add(new Succulent("Кактус", 15.0, 10, 200.0));
        plants.add(new Succulent("Эхеверия", 12.0, 6, 120.0));
        plants.add(new Fern("Щитовник", 50.0, 4, "Перьевые"));
        plants.add(new Fern("Орляк", 60.0, 5, "Крупные рассечённые"));
        plants.add(new Fern("Кочедыжник", 40.0, 3, "Пальчатые"));

        // --- 4. Вывести всю информацию по красивоцветущим ---
        System.out.println("Красивоцветущие растения:");
        for (HousePlant p : plants) {
            if (p instanceof Flowering) {
                System.out.println(p);
            }
        }

        // --- 5. Вывести все растения, у которых жизнь < 5 лет ---
        System.out.println("\nРастения с продолжительностью жизни менее 5 лет:");
        for (HousePlant p : plants) {
            if (p.getLifespan() < 5) {
                System.out.println(p);
            }
        }

        // --- 6. Вывести папоротники с высотой больше заданной ---
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите минимальную высоту папоротников: ");
        double minHeight = sc.nextDouble();

        System.out.println("Папоротники с высотой больше " + minHeight + " см:");
        for (HousePlant p : plants) {
            if (p instanceof Fern && p.getHeight() > minHeight) {
                System.out.println(p);
            }
        }

        sc.close();
    }
}

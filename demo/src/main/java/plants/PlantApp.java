package plants;

import javax.swing.*;
import java.awt.*;

public class PlantApp extends JFrame {

    private PlantRepository repository = new PlantRepository();

    private DefaultListModel<String> listModel = new DefaultListModel<>();
    private JList<String> plantList = new JList<>(listModel);

    private JTextField nameField = new JTextField(15);
    private JTextField heightField = new JTextField(5);
    private JTextField lifeField = new JTextField(5);

    public PlantApp() {
        super("Управление растениями");
        setLayout(new BorderLayout());
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // ------ ЛЕВАЯ ПАНЕЛЬ (список) ------
        add(new JScrollPane(plantList), BorderLayout.CENTER);

        // ------ ПРАВАЯ ПАНЕЛЬ (формы + кнопки) ------
        JPanel right = new JPanel();
        right.setLayout(new GridLayout(10, 1));

        right.add(new JLabel("Название:"));
        right.add(nameField);
        right.add(new JLabel("Высота:"));
        right.add(heightField);
        right.add(new JLabel("Жизнь (лет):"));
        right.add(lifeField);

        JButton addBtn = new JButton("Добавить");
        JButton deleteBtn = new JButton("Удалить");
        JButton updateBtn = new JButton("Обновить");

        right.add(addBtn);
        right.add(updateBtn);
        right.add(deleteBtn);

        add(right, BorderLayout.EAST);

        // ------ ЛОГИКА КНОПОК ------

        addBtn.addActionListener(e -> {
            String name = nameField.getText();
            double height = Double.parseDouble(heightField.getText());
            int life = Integer.parseInt(lifeField.getText());

            HousePlant plant = new HousePlant(name, height, life);
            repository.add(plant);

            listModel.addElement(plant.toString());
        });

        deleteBtn.addActionListener(e -> {
            int index = plantList.getSelectedIndex();
            if (index >= 0) {
                repository.remove(repository.getAll().get(index));
                listModel.remove(index);
            }
        });

        updateBtn.addActionListener(e -> {
            int index = plantList.getSelectedIndex();
            if (index >= 0) {
                String name = nameField.getText();
                double height = Double.parseDouble(heightField.getText());
                int life = Integer.parseInt(lifeField.getText());

                HousePlant newPlant = new HousePlant(name, height, life);

                repository.update(index, newPlant);
                listModel.set(index, newPlant.toString());
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PlantApp::new);
    }
}

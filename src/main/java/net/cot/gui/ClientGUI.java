package net.cot.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientGUI extends JFrame {
    private JPanel mainPanel;
    private JList<String> modulesList;
    private DefaultListModel<String> listModel;

    public ClientGUI() {
        setTitle("Lunar Client GUI");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // Create modules list
        listModel = new DefaultListModel<>();
        modulesList = new JList<>(listModel);
        modulesList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modulesList.setBackground(new Color(28, 28, 28));
        modulesList.setForeground(Color.WHITE);
        modulesList.setFont(new Font("Arial", Font.PLAIN, 16));

        // Add sample modules
        listModel.addElement("Module 1");
        listModel.addElement("Module 2");
        listModel.addElement("Module 3");

        JScrollPane scrollPane = new JScrollPane(modulesList);
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Smooth animations button
        JButton animateButton = new JButton("Start Animation");
        animateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startSmoothAnimation();
            }
        });

        mainPanel.add(animateButton, BorderLayout.SOUTH);
        add(mainPanel);
    }

    private void startSmoothAnimation() {
        // Placeholder for smooth animation implementation
        JOptionPane.showMessageDialog(this, "Smooth animations will be implemented here.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ClientGUI gui = new ClientGUI();
            gui.setVisible(true);
        });
    }
}

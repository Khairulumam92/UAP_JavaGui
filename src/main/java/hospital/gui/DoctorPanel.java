package hospital.gui;

import javax.swing.*;
import java.awt.*;
import hospital.service.DoctorService;

private JTextField nameField;
private JTextField specializationField;
private JTextField phoneField;

public DoctorPanel() {
    doctorService = new DoctorService();
    initComponents();
    setupLayout();
    addListeners();
}

private void initComponents() {
    nameField = new JTextField(20);
    specializationField = new JTextField(20);
    phoneField = new JTextField(15);
}

private JTable doctorTable;
private JButton addButton;
private JButton deleteButton;
private JButton clearButton;

private void initComponents() {
    // previous components...
    doctorTable = new JTable(doctorService.getTableModel());
    addButton = new JButton("Add Doctor");
    deleteButton = new JButton("Delete");
    clearButton = new JButton("Clear");
}

private JComboBox<String> startDayCombo;
private JComboBox<String> endDayCombo;
private JComboBox<String> startHourCombo;
private JComboBox<String> endHourCombo;

private void initComponents() {
    String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    String[] hours = getHours();

    startDayCombo = new JComboBox<>(days);
    endDayCombo = new JComboBox<>(days);
    startHourCombo = new JComboBox<>(hours);
    endHourCombo = new JComboBox<>(hours);
}

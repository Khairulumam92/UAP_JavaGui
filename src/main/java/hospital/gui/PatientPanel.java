package hospital.gui;

import javax.swing.*;
import java.awt.*;

public class PatientPanel extends JPanel {
    private JTable patientTable;

    public PatientPanel() {
        initComponents();
        setupLayout();
    }

    private void initComponents() {
        patientTable = new JTable(10, 5);  // Dummy table model for example
    }

    private void setupLayout() {
        setLayout(new BorderLayout(10, 10));
        JScrollPane scrollPane = new JScrollPane(patientTable);
        add(scrollPane, BorderLayout.CENTER);
    }
}

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addListeners() {
        addButton.addActionListener(e -> addPatient());
        clearButton.addActionListener(e -> clearForm());
    }

    private void addPatient() {
        // Add patient logic
    }

    private void clearForm() {
        // Clear form logic
    }
}

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addListeners() {
        addButton.addActionListener(e -> addPatient());
        clearButton.addActionListener(e -> clearForm());
    }

    private void addPatient() {
        // Add patient logic
    }

    private void clearForm() {
        // Clear form logic
    }
}
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void addListeners() {
        addButton.addActionListener(e -> addPatient());
        clearButton.addActionListener(e -> clearForm());
    }

    private void addPatient() {
        // Add patient logic
    }

    private void clearForm() {
        // Clear form logic
    }
}

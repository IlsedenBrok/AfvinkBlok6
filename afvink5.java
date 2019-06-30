
import java.util.*;
import javax.swing.*;

public class afvink5 extends javax.swing.JFrame {

    String option1 = "Compare 1 & 2";
    String option2 = "Compare 1 & 3";
    String option3 = "Compare 2 & 3";
    String option4 = "Compare all";
    List<String> overeenkomsten = new ArrayList<>();

    public afvink5() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OutputArea = new javax.swing.JTextField();
        DropDown = new javax.swing.JComboBox<>();
        CalcButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compare 1 & 2", "Compare 1 & 3", "Compare 2 & 3" , "Compare all"}));

        CalcButton.setText("Calculate");
        CalcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcButtonActionPerformed(evt);
            }
        });

        ListArea1.setColumns(20);
        ListArea1.setRows(5);
        jScrollPane2.setViewportView(ListArea1);

        ListArea2.setColumns(20);
        ListArea2.setRows(5);
        jScrollPane3.setViewportView(ListArea2);

        ListArea3.setColumns(20);
        ListArea3.setRows(5);
        jScrollPane4.setViewportView(ListArea3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CalcButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OutputArea, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CalcButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 83, Short.MAX_VALUE))
                    .addComponent(OutputArea))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcButtonActionPerformed
        String firstList = ListArea1.getText();
        String genes1[] = firstList.split("\\r?\\n");
        String secondList = ListArea2.getText();
        String genes2[] = secondList.split("\\r?\\n");
        String thirdList = ListArea3.getText();
        String genes3[] = thirdList.split("\\r?\\n");
        String selected = (String) DropDown.getSelectedItem();
        if (selected.equals(option1)) {
            for (String genes11 : genes1) {
                for (String genes21 : genes2) {
                    if (genes11.equals(genes21)) {
                        overeenkomsten.add(genes11);
                        OutputArea.setText(overeenkomsten.toString());
                    }
                }
            }
        } else if (selected.equals(option2)) {
            for (String genes11 : genes1) {
                for (String genes31 : genes3) {
                    if (genes11.equals(genes31)) {
                        overeenkomsten.add(genes11);
                        OutputArea.setText(overeenkomsten.toString());
                    }
                }
            }
        } else if (selected.equals(option3)) {
            for (String genes21 : genes2) {
                for (String genes31 : genes3) {
                    if (genes21.equals(genes31)) {
                        overeenkomsten.add(genes21);
                        OutputArea.setText(overeenkomsten.toString());
                    }
                }
            }
        } else if (selected.equals(option4)) {
            for (String genes31 : genes3) {
                for (String genes21 : genes2) {
                    for (String genes11 : genes1) {
                        if (genes31.equals(genes21) && genes21.equals(genes11)) {
                            overeenkomsten.add(genes31);
                            OutputArea.setText(overeenkomsten.toString());
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "You seem to not have selected anything from the menu! Please try again.");
        }
    }//GEN-LAST:event_CalcButtonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new afvink5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcButton;
    private javax.swing.JComboBox<String> DropDown;
    private javax.swing.JTextArea ListArea1;
    private javax.swing.JTextArea ListArea2;
    private javax.swing.JTextArea ListArea3;
    private javax.swing.JTextField OutputArea;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicoperators;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author Admin
 */
public class LogicGUI extends javax.swing.JFrame {
    
    public LogicGUI() {
        super.setTitle("Logic Operators");
        initComponents();
        
        
        MouseListener ml = new MouseAdapter() {};
   
        
        
        backgroundLabel.setSize(1100,700);
        ScrollLabel.setSize(200,700);
        LearnButton.setBorderPainted(false);
        graphPanel.setSize(300,300);
        
        RateSlider.setMinimum(1);
        RateSlider.setMaximum(9);
        RateSlider.setMinorTickSpacing(1);
        RateSlider.setValue(0);
        
        sliderValue.setSize(50,20);
        sliderValue.setText("0.1");
        
        AND.setSize(200,70);
        OR.setSize(200,70);
        NAND.setSize(200,70);
        NOR.setSize(200,70);
        XOR.setSize(200,70);
        XNOR.setSize(200,70);
        
        X3.setEditable(false);
        
        
        ButtonGroup bg = new ButtonGroup();
        
        bg.add(AND);
        bg.add(OR);
        bg.add(NAND);
        bg.add(NOR);
        bg.add(XOR);
        bg.add(XNOR);
        
        LearnButton.addMouseListener(ml);

        
        this.setSize(1100,700);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LearnButton = new javax.swing.JButton();
        AND = new javax.swing.JRadioButton();
        OR = new javax.swing.JRadioButton();
        NAND = new javax.swing.JRadioButton();
        NOR = new javax.swing.JRadioButton();
        XOR = new javax.swing.JRadioButton();
        XNOR = new javax.swing.JRadioButton();
        RateSlider = new javax.swing.JSlider();
        epochLabel = new javax.swing.JLabel();
        epochNum = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        sliderValue = new javax.swing.JLabel();
        graphPanel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Method = new javax.swing.JLabel();
        NumOfEpochLabel = new javax.swing.JLabel();
        NumOfEpoch = new javax.swing.JLabel();
        ErrorNumLabel = new javax.swing.JLabel();
        ErrorNum = new javax.swing.JLabel();
        ErrorNumLabel1 = new javax.swing.JLabel();
        BestEpoch = new javax.swing.JLabel();
        RateLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ErrorNumLabel2 = new javax.swing.JLabel();
        accuracy_rate = new javax.swing.JLabel();
        ErrorNumLabel3 = new javax.swing.JLabel();
        misclass_rate = new javax.swing.JLabel();
        X1 = new javax.swing.JTextField();
        X2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        X3 = new javax.swing.JTextField();
        check = new javax.swing.JButton();
        ScrollLabel = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LearnButton.setBackground(new java.awt.Color(137, 61, 149));
        LearnButton.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LearnButton.setForeground(new java.awt.Color(255, 255, 255));
        LearnButton.setText("Learn");
        LearnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LearnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LearnButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LearnButtonMouseExited(evt);
            }
        });
        LearnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LearnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(LearnButton);
        LearnButton.setBounds(930, 30, 130, 50);

        AND.setBackground(new java.awt.Color(180, 101, 191));
        AND.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AND.setText("  AND");
        AND.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicoperators/and.png"))); // NOI18N
        AND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANDActionPerformed(evt);
            }
        });
        getContentPane().add(AND);
        AND.setBounds(0, 140, 130, 51);

        OR.setBackground(new java.awt.Color(180, 101, 191));
        OR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        OR.setText("  OR");
        OR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicoperators/or.png"))); // NOI18N
        OR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ORActionPerformed(evt);
            }
        });
        getContentPane().add(OR);
        OR.setBounds(0, 230, 130, 51);

        NAND.setBackground(new java.awt.Color(180, 101, 191));
        NAND.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NAND.setText("  NAND");
        NAND.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NAND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicoperators/nand.png"))); // NOI18N
        NAND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NANDActionPerformed(evt);
            }
        });
        getContentPane().add(NAND);
        NAND.setBounds(0, 320, 140, 51);

        NOR.setBackground(new java.awt.Color(180, 101, 191));
        NOR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NOR.setText("  NOR");
        NOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicoperators/nor.png"))); // NOI18N
        NOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NORActionPerformed(evt);
            }
        });
        getContentPane().add(NOR);
        NOR.setBounds(0, 410, 130, 51);

        XOR.setBackground(new java.awt.Color(180, 101, 191));
        XOR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        XOR.setText("  XOR");
        XOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicoperators/xor.png"))); // NOI18N
        XOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XORActionPerformed(evt);
            }
        });
        getContentPane().add(XOR);
        XOR.setBounds(0, 490, 130, 40);

        XNOR.setBackground(new java.awt.Color(180, 101, 191));
        XNOR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        XNOR.setText("  XNOR");
        XNOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XNOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicoperators/xnor.png"))); // NOI18N
        XNOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XNORActionPerformed(evt);
            }
        });
        getContentPane().add(XNOR);
        XNOR.setBounds(0, 580, 140, 51);

        RateSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RateSlider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RateSliderMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RateSliderMouseExited(evt);
            }
        });
        getContentPane().add(RateSlider);
        RateSlider.setBounds(620, 40, 200, 30);

        epochLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        epochLabel.setText("Max Epoch :");
        getContentPane().add(epochLabel);
        epochLabel.setBounds(250, 40, 80, 30);

        epochNum.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        getContentPane().add(epochNum);
        epochNum.setBounds(340, 40, 140, 30);

        jSeparator1.setBackground(new java.awt.Color(180, 101, 191));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(220, 440, 850, 20);

        jSeparator2.setBackground(new java.awt.Color(228, 194, 237));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 100, 180, 10);

        jSeparator3.setBackground(new java.awt.Color(180, 101, 191));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(220, 100, 850, 20);

        sliderValue.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        getContentPane().add(sliderValue);
        sliderValue.setBounds(840, 40, 20, 30);

        graphPanel.setBackground(new java.awt.Color(233, 233, 233));
        graphPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        graphPanel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        getContentPane().add(graphPanel);
        graphPanel.setBounds(760, 120, 300, 290);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logicoperators/logo.png"))); // NOI18N
        getContentPane().add(logo);
        logo.setBounds(10, 10, 180, 80);

        Method.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Method.setForeground(new java.awt.Color(0, 0, 153));
        getContentPane().add(Method);
        Method.setBounds(250, 130, 230, 30);

        NumOfEpochLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        NumOfEpochLabel.setText("Number Of Epochs  : ");
        getContentPane().add(NumOfEpochLabel);
        NumOfEpochLabel.setBounds(250, 180, 140, 30);

        NumOfEpoch.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        NumOfEpoch.setForeground(new java.awt.Color(0, 0, 153));
        NumOfEpoch.setText("Num Of Epoch");
        getContentPane().add(NumOfEpoch);
        NumOfEpoch.setBounds(410, 180, 240, 30);

        ErrorNumLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        ErrorNumLabel.setText("MSE for last Epoch :");
        getContentPane().add(ErrorNumLabel);
        ErrorNumLabel.setBounds(250, 230, 140, 30);

        ErrorNum.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        ErrorNum.setForeground(new java.awt.Color(0, 0, 153));
        ErrorNum.setText("MSE Error");
        getContentPane().add(ErrorNum);
        ErrorNum.setBounds(410, 230, 240, 30);

        ErrorNumLabel1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        ErrorNumLabel1.setText("Best Epoch (less MSE) :");
        getContentPane().add(ErrorNumLabel1);
        ErrorNumLabel1.setBounds(250, 280, 150, 30);

        BestEpoch.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        BestEpoch.setForeground(new java.awt.Color(0, 0, 153));
        BestEpoch.setText("Less MSE Error");
        getContentPane().add(BestEpoch);
        BestEpoch.setBounds(410, 280, 280, 30);

        RateLabel.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        RateLabel.setText("Learning Rate :");
        getContentPane().add(RateLabel);
        RateLabel.setBounds(510, 40, 100, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("Check Data After Learning :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 460, 240, 30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel2.setText("Input 2 : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 530, 70, 16);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel3.setText("Input 1 : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(260, 530, 60, 15);

        ErrorNumLabel2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        ErrorNumLabel2.setText("Accuracy : ");
        getContentPane().add(ErrorNumLabel2);
        ErrorNumLabel2.setBounds(250, 330, 150, 30);

        accuracy_rate.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        accuracy_rate.setForeground(new java.awt.Color(0, 0, 153));
        accuracy_rate.setText("Accuracy");
        getContentPane().add(accuracy_rate);
        accuracy_rate.setBounds(410, 330, 280, 30);

        ErrorNumLabel3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        ErrorNumLabel3.setText("Misclassification Rate : ");
        getContentPane().add(ErrorNumLabel3);
        ErrorNumLabel3.setBounds(250, 380, 160, 30);

        misclass_rate.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        misclass_rate.setForeground(new java.awt.Color(0, 0, 153));
        misclass_rate.setText("Misclassification Rate");
        getContentPane().add(misclass_rate);
        misclass_rate.setBounds(410, 380, 280, 30);

        X1.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        getContentPane().add(X1);
        X1.setBounds(340, 520, 140, 30);

        X2.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        getContentPane().add(X2);
        X2.setBounds(580, 520, 140, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        jLabel4.setText("Y - acual : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 590, 70, 15);

        X3.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        getContentPane().add(X3);
        X3.setBounds(340, 580, 170, 30);

        check.setBackground(new java.awt.Color(137, 61, 149));
        check.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("Check");
        check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkMouseExited(evt);
            }
        });
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        getContentPane().add(check);
        check.setBounds(760, 510, 130, 50);

        ScrollLabel.setBackground(new java.awt.Color(180, 101, 191));
        ScrollLabel.setOpaque(true);
        getContentPane().add(ScrollLabel);
        ScrollLabel.setBounds(0, 0, 200, 660);

        backgroundLabel.setBackground(new java.awt.Color(228, 194, 237));
        backgroundLabel.setForeground(new java.awt.Color(228, 194, 237));
        backgroundLabel.setOpaque(true);
        getContentPane().add(backgroundLabel);
        backgroundLabel.setBounds(0, 0, 1120, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LearnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LearnButtonMouseExited
        LearnButton.setBackground(new Color(137,61,149)); 
        LearnButton.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_LearnButtonMouseExited

    private void LearnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LearnButtonMouseEntered
        LearnButton.setBackground(new Color(184, 136, 191));
        LearnButton.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_LearnButtonMouseEntered

    private void ANDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANDActionPerformed
        AND.setBackground(new Color(228,194,237));
        OR.setBackground(new Color(180,101,191));
        NAND.setBackground(new Color(180,101,191));
        NOR.setBackground(new Color(180,101,191));
        XOR.setBackground(new Color(180,101,191));
        XNOR.setBackground(new Color(180,101,191));
    }//GEN-LAST:event_ANDActionPerformed

    private void ORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ORActionPerformed
        OR.setBackground(new Color(228,194,237));
        AND.setBackground(new Color(180,101,191));
        NAND.setBackground(new Color(180,101,191));
        NOR.setBackground(new Color(180,101,191));
        XOR.setBackground(new Color(180,101,191));
        XNOR.setBackground(new Color(180,101,191));
    }//GEN-LAST:event_ORActionPerformed

    private void NANDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NANDActionPerformed
        NAND.setBackground(new Color(228,194,237));
        AND.setBackground(new Color(180,101,191));
        OR.setBackground(new Color(180,101,191));
        NOR.setBackground(new Color(180,101,191));
        XOR.setBackground(new Color(180,101,191));
        XNOR.setBackground(new Color(180,101,191));
    }//GEN-LAST:event_NANDActionPerformed

    private void NORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NORActionPerformed
        NOR.setBackground(new Color(228,194,237));
        AND.setBackground(new Color(180,101,191));
        OR.setBackground(new Color(180,101,191));
        NAND.setBackground(new Color(180,101,191));
        XOR.setBackground(new Color(180,101,191));
        XNOR.setBackground(new Color(180,101,191));
    }//GEN-LAST:event_NORActionPerformed

    private void XORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XORActionPerformed
        XOR.setBackground(new Color(228,194,237));
        AND.setBackground(new Color(180,101,191));
        OR.setBackground(new Color(180,101,191));
        NAND.setBackground(new Color(180,101,191));
        NOR.setBackground(new Color(180,101,191));
        XNOR.setBackground(new Color(180,101,191));
    }//GEN-LAST:event_XORActionPerformed

    private void XNORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XNORActionPerformed
        XNOR.setBackground(new Color(228,194,237));
        AND.setBackground(new Color(180,101,191));
        OR.setBackground(new Color(180,101,191));
        NAND.setBackground(new Color(180,101,191));
        NOR.setBackground(new Color(180,101,191));
        XOR.setBackground(new Color(180,101,191));
    }//GEN-LAST:event_XNORActionPerformed

    private void RateSliderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RateSliderMouseExited
        sliderValue.setText(Double.toString(Double.valueOf(String.valueOf(RateSlider.getValue()))/10));
    }//GEN-LAST:event_RateSliderMouseExited

    private void RateSliderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RateSliderMouseClicked
        sliderValue.setText(Double.toString(Double.valueOf(String.valueOf(RateSlider.getValue()))/10));
    }//GEN-LAST:event_RateSliderMouseClicked

    private void LearnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LearnButtonActionPerformed

        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 2; j++)
                this.perf[i][j] = 0;
        
        this.perfSum = 0;
        
        this.NumOfEpoch.setText("Num Of Epoch");
        this.ErrorNum.setText("MSE Error");
        this.ErrorNum.setText("Less MSE Error");

        if(epochNum.getText().equals("") || epochNum.getText().equals("0") || Integer.valueOf(epochNum.getText()) <= 0)
            JOptionPane.showMessageDialog(null, "Insert valid Max Num. Of Epoch");
        else if(AND.isSelected()){
            this.Method.setText("Perseptron");
            this.Perseptron(andGate, Integer.valueOf(epochNum.getText()), Double.valueOf(String.valueOf(RateSlider.getValue()))/10);
        }
        else if(OR.isSelected()){
            this.Method.setText("Perseptron");
            this.Perseptron(orGate, Integer.valueOf(epochNum.getText()), Double.valueOf(String.valueOf(RateSlider.getValue()))/10);
        }
        else if(NAND.isSelected()){
            this.Method.setText("Perseptron");
            this.Perseptron(nandGate, Integer.valueOf(epochNum.getText()), Double.valueOf(String.valueOf(RateSlider.getValue()))/10);
        }
        else if(NOR.isSelected()){
            this.Method.setText("Perseptron");
            this.Perseptron(norGate, Integer.valueOf(epochNum.getText()), Double.valueOf(String.valueOf(RateSlider.getValue()))/10);
        }
        else if(XOR.isSelected()){
            this.Method.setText("Multilyer");
            this.Multilyer(xorGate, Integer.valueOf(epochNum.getText()), Double.valueOf(String.valueOf(RateSlider.getValue()))/10);
        }
        else if(XNOR.isSelected()){
            this.Method.setText("Multilyer");
            this.Multilyer(xnorGate, Integer.valueOf(epochNum.getText()), Double.valueOf(String.valueOf(RateSlider.getValue()))/10);
        }
        else 
            JOptionPane.showMessageDialog(null, "Choose a logic gate");
    }//GEN-LAST:event_LearnButtonActionPerformed

    private void checkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseExited
        check.setBackground(new Color(137,61,149)); 
        check.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_checkMouseExited

    private void checkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkMouseEntered
        check.setBackground(new Color(184, 136, 191));
        check.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_checkMouseEntered

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if(this.Method.getText().equals("Multilyer") || this.Method.getText().equals("Perseptron"))
        {
            if(!this.X1.getText().equals("") && !this.X2.getText().equals("")){
                
                if(this.Method.getText().equals("Perseptron")){
                    double sum = (this.w1_p * Double.valueOf(this.X1.getText())) + (this.w2_p * Double.valueOf(this.X2.getText())) + (-1 * this.threshold_p);
                    this.X3.setText(String.valueOf(this.StepFunction(sum)));
                }
                else {
                    for(int i = 0; i < 4; i++){
                        if(Double.valueOf(this.X1.getText()) == this.yGate_acual[i][0] && Double.valueOf(this.X2.getText()) == this.yGate_acual[i][1]){
                            this.X3.setText(String.valueOf(this.yGate_acual[i][2]));
                            break;
                        }
                    }
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Insert Inputs :)");
        }
        else
            JOptionPane.showMessageDialog(null, "Start learning first :)");
    }//GEN-LAST:event_checkActionPerformed
    
    /********************************************************** Perseptron *************************************************/
    private double StepFunction(double sum){
        
        double Ya;
        
        if(sum >= 0.0)        // Step Activation Function
            Ya = 1.0;
        else
            Ya = 0.0;
        
        return Ya;
    }
    
    private boolean CalculatePoints(double w1, double w2, double threshold){
        
        double Ypoint;
        double Xpoint;
        
        Ypoint = (threshold / w2) * 100;        // w1 * x1 + w2 * x2 = threshold
        Xpoint = (threshold / w1) * 100;
        
        if(Ypoint < 0.0)
            Ypoint = Ypoint * -1;
        if(Xpoint < 0.0)
            Xpoint = Xpoint * -1;
        
        this.ClearPanel();
        return this.DrawInGraph(0, (int)Xpoint, (int)Ypoint, 0);
    }
    
    private void Perseptron(int [][]gate , int Epoch, double rate) {          // Perseptron Function
        
        double [][]y_acual = {{0.0, 0.0, 0.0}, {0.0, 1.0 ,0.0}, {1.0, 0.0, 0.0}, {1.0, 1.0, 0.0}};
        double []mse = new double[Epoch];
        double []error = new double[4];
        int ep = 0;
        
        double weight1;
        double weight2;
        double threshold;
        
        // Set initial weights and threshold to random numbers between [ -0.5 , 0.5 ]
        double max = 0.5;
        double min = -0.5;
        
        Random rand_p = new Random();
        
        weight1 = min + (max - min) * rand_p.nextDouble();
        weight2 = min + (max - min) * rand_p.nextDouble();
        threshold = min + (max - min) * rand_p.nextDouble();
        
        // Activate the perseptron
        for(int i = 0; i < Epoch; i++){
            for(int j = 0; j < 4; j++){
                
                double sum = (gate[j][0] * weight1) + (gate[j][1] * weight2) + (-1 * threshold); // -1 threshold

                y_acual[j][2] = this.StepFunction(sum);
                
                error[j] = gate[j][2] - y_acual[j][2];  // Calculate Error
                
                // weight training
                double weight_corr1 = rate * gate[j][0] * error[j];
                double weight_corr2 = rate * gate[j][1] * error[j];
                double threshold_corr = rate * -1 * error[j];
                
                weight1 = weight1 + weight_corr1;      // weight update
                weight2 = weight2 + weight_corr2;      // weight update
                threshold = threshold + threshold_corr;     // threshold update
                
                this.Performance((double)gate[j][2], y_acual[j][2]);    // calculate performance
            }
            this.CalculatePoints(weight1, weight2, threshold);  // Draw line in graph
            double mse_e = (Math.pow(error[0], 2) + Math.pow(error[1], 2) + Math.pow(error[2], 2) + Math.pow(error[3], 2)) / 4;
            mse[i] = mse_e;
            ep = i + 1;
            if(mse_e == 0.0)
                break;
        } 
        this.w1_p = weight1;
        this.w2_p = weight2;
        this.threshold_p = threshold;
        
        this.yGate_acual = y_acual;
        this.mse_error = mse;
        this.ep_num = ep;
        this.ShowData();
        
    }
    /********************************************************** End Perseptron *************************************************/
    
    /********************************************************** Multilyer *************************************************/
    private double ReLU_Function(double sum){
        double Ya;
        
        if(sum >= 0.0)        // ReLU Activation Function
            Ya = sum;
        else
            Ya = 0.0;
        
        return Ya;
    }
    
    private double SigmoidFunction(double sum){
        double Ya;
        Ya = (1 / (1 + Math.exp(-1.0 * sum)));
        return Ya;
    }
    
    private boolean MultilyerCalculation (double w13, double w23, double threshold3, double w14, double w24, double threshold4){
        
        double Ypoint1, Ypoint2;
        double Xpoint1, Xpoint2;
        
        // line 1
        Ypoint1 = (threshold3 / w23) * 100;      // w13 * x1 + w23 * x2 = threshold3
        Xpoint1 = (threshold3 / w13) * 100;
        
        if(Ypoint1 < 0.0)
            Ypoint1 = Ypoint1 * -1;
        if(Xpoint1 < 0.0)
            Xpoint1 = Xpoint1 * -1;
        
        // line 2
        Ypoint2 = (threshold4 / w24) * 100;        // w14 * x1 + w24 * x2 = threshold4
        Xpoint2 = (threshold4 / w14) * 100;
        
        if(Ypoint2 < 0.0)
            Ypoint2 = Ypoint2 * -1;
        if(Xpoint2 < 0.0)
            Xpoint2 = Xpoint2 * -1;


        this.ClearPanel();
        this.DrawInGraph(0, (int)Xpoint1 + 50, (int)Ypoint1 + 50, 0);
        this.DrawInGraph(0, (int)Xpoint2 + 50, (int)Ypoint2 + 50, 0);
        return true;
    }
    
    private void Multilyer(int [][]gate , int Epoch, double rate) {
        
        double [][]y_acual = {{0.0, 0.0, 0.0}, {0.0, 1.0 ,0.0}, {1.0, 0.0, 0.0}, {1.0, 1.0, 0.0}};
        double []mse = new double[Epoch];
        double []error = new double[4];
        int ep = 0;
        
        double weight13, weight14;
        double weight23, weight24;
        double weight35, weight45;
        double threshold3, threshold4, threshold5;
        
        double Y3, Y4;
        
        // Set initial weights and threshold to random numbers between [ -2.4 / Fi , 2.4 / Fi ]  :  Fi = 2
        double max = 2.4 / 2.0;
        double min = -2.4 / 2.0;
        
        Random rand_m = new Random();
        
        weight13 = min + (max - min) * rand_m.nextDouble();
        weight14 = min + (max - min) * rand_m.nextDouble();
        weight23 = min + (max - min) * rand_m.nextDouble();
        weight24 = min + (max - min) * rand_m.nextDouble();
        weight35 = min + (max - min) * rand_m.nextDouble();
        weight45 = min + (max - min) * rand_m.nextDouble();
        
        threshold3 = min + (max - min) * rand_m.nextDouble();
        threshold4 = min + (max - min) * rand_m.nextDouble();
        threshold5 = min + (max - min) * rand_m.nextDouble();
        
        // Activate the Multilyer
        for(int i = 0; i < Epoch; i++){
            for(int j = 0; j < 4; j++){
                
                double sum3 = (gate[j][0] * weight13) + (gate[j][1] * weight23) + (-1 * threshold3); // -1 threshold
                double sum4 = (gate[j][0] * weight14) + (gate[j][1] * weight24) + (-1 * threshold4); // -1 threshold
                
                Y3 = this.ReLU_Function(sum3);
                Y4 = this.ReLU_Function(sum4);
                
                double sum5 = (Y3 * weight35) + (Y4 * weight45) + (-1 * threshold5); // -1 threshold
                y_acual[j][2] = this.SigmoidFunction(sum5);          // Sigmoid Activation Function
                
                error[j] = gate[j][2] - y_acual[j][2];  // Calculate Error
                
                // weight training
                double Gradient5 = y_acual[j][2] * (1 - y_acual[j][2]) * error[j];
                double weight_corr35 = rate * Y3 * Gradient5;
                double weight_corr45 = rate * Y4 * Gradient5;
                double threshold_corr5 = rate * -1 * Gradient5;
                
                double Y3_prime, Y4_prime;
                if(sum3 >= 0.0)         // prime ReLU Function
                    Y3_prime = 1.0;
                else
                    Y3_prime = 0.0;
                
                if(sum4 >= 0.0)         // prime ReLU Function
                    Y4_prime = 1.0;
                else
                    Y4_prime = 0.0;
                
                double Gradient3 = Y3_prime * Gradient5 * weight35; // Y3 * (1 - Y3) * Gradient5 * weight35;
                double Gradient4 = Y4_prime * Gradient5 * weight45; //Y4 * (1 - Y4) * Gradient5 * weight45;
                
                double weight_corr13 = rate * gate[j][0] * Gradient3;
                double weight_corr23 = rate * gate[j][1] * Gradient3;
                double threshold_corr3 = rate * -1 * Gradient3;
                
                double weight_corr14 = rate * gate[j][0] * Gradient4;
                double weight_corr24 = rate * gate[j][1] * Gradient4;
                double threshold_corr4 = rate * -1 * Gradient4;
                
                weight13 = weight13 + weight_corr13;      // weight update
                weight14 = weight14 + weight_corr14;      // weight update
                weight23 = weight23 + weight_corr23;      // weight update
                weight24 = weight24 + weight_corr24;      // weight update
                weight35 = weight35 + weight_corr35;      // weight update
                weight45 = weight45 + weight_corr45;      // weight update
                threshold3 = threshold3 + threshold_corr3;     // threshold update
                threshold4 = threshold4 + threshold_corr4;     // threshold update
                threshold5 = threshold5 + threshold_corr5;     // threshold update
                
                this.Performance((double)gate[j][2], y_acual[j][2]);   // calculate performance
              
            }
            this.MultilyerCalculation(weight13, weight23, threshold3, weight14, weight24, threshold4);
            double mse_e = (Math.pow(error[0], 2) + Math.pow(error[1], 2) + Math.pow(error[2], 2) + Math.pow(error[3], 2)) / 4;
            mse[i] = mse_e;
            ep = i + 1;
            System.out.println(mse_e + "\n");
            if(mse_e <= 0.001)
                break;

        }
        this.yGate_acual = y_acual;
        this.mse_error = mse;
        this.ep_num = ep;
        this.ShowData();
    }
    
    /********************************************************** End Multilyer *************************************************/
    
    private boolean Performance(double acual, double pedicated){
        
        if(acual == 0.0){
            if(pedicated < 0.5 && pedicated >= 0.0)           //     0     1
                perf[0][0] += 1;                              //  0  TN    FN
            else                                              //  1  FP    TP
                perf[0][1] += 1;
        }
        else{
            if(pedicated >= 0.5 && pedicated <= 1.0)
                perf[1][1] += 1;
            else
                perf[1][0] += 1;
        }
        
        return true;
    }
    
    private void ShowData(){
        double []compare = new double[2];
        compare[0] = this.mse_error[0];
        this.NumOfEpoch.setText(String.valueOf(this.ep_num));
        
        for(int i = 0; i < this.ep_num; i++){
            if(i == this.ep_num - 1){
                this.ErrorNum.setText(String.valueOf(this.mse_error[i]));
                compare[0] = this.mse_error[i];
                compare[1] = (double)this.ep_num;
            }
        }
        if(this.ep_num == Integer.valueOf(this.epochNum.getText())){
            compare[0] = this.mse_error[0];
            compare[1] = 1.0;
            for(int i = 1; i < this.mse_error.length; i++){
                if(compare[0] >= this.mse_error[i]){
                    compare[0] = this.mse_error[i];
                    compare[1] = (double)(i + 1);
                }
            }
        }
        
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 2; j++)
                this.perfSum += (double)perf[i][j];
        
        this.accuracy = (perf[0][0] + perf[1][1]) / this.perfSum;
        this.MisclassRate = 1.0 - this.accuracy;
        
        this.BestEpoch.setText(String.valueOf(compare[0]) + " ( Epoch " + String.valueOf((int)compare[1]) + " )");
        this.accuracy_rate.setText(String.valueOf(accuracy));
        this.misclass_rate.setText(String.valueOf(MisclassRate));
    }
    
    private boolean ClearPanel(){
        
        this.graphPanel.getGraphics().clearRect(0, 0, graphPanel.getWidth(), graphPanel.getHeight());
        
        return true;
    }
    private boolean DrawInGraph(int x1, int y1, int x2, int y2){
        
        Graphics2D graph = (Graphics2D) graphPanel.getGraphics();
        int w2 = graphPanel.getWidth() / 2;
        int h2 = graphPanel.getHeight() / 2;
        graph.rotate(-Math.PI / 2, w2, h2);
        
        graph.setColor(Color.gray);
        graph.drawLine(55, 0, 55, 300); // x - axis
        graph.drawLine(0, 45, 300, 45); // y - axis

        if(AND.isSelected()){
            graph.setColor(Color.red);
            graph.drawString("0", 50, 50);
            graph.drawString("1", 50, 150);
            graph.drawString("1", 150, 50);
            graph.setColor(Color.blue);
            graph.drawString("1", 150, 150);
        }
        else if(OR.isSelected()){
            graph.setColor(Color.red);
            graph.drawString("0", 50, 50);
            graph.setColor(Color.blue);
            graph.drawString("1", 50, 150);
            graph.drawString("1", 150, 50);
            graph.drawString("1", 150, 150);
        }
        else if(NAND.isSelected()){
            graph.setColor(Color.blue);
            graph.drawString("0", 50, 50);
            graph.drawString("1", 50, 150);
            graph.drawString("1", 150, 50);
            graph.setColor(Color.red);
            graph.drawString("1", 150, 150);
        }
        else if(NOR.isSelected()){
            graph.setColor(Color.blue);
            graph.drawString("0", 50, 50);
            graph.setColor(Color.red);
            graph.drawString("1", 50, 150);
            graph.drawString("1", 150, 50);
            graph.drawString("1", 150, 150);
        }
        else if(XOR.isSelected()){
            graph.setColor(Color.red);
            graph.drawString("0", 50, 50);
            graph.setColor(Color.blue);
            graph.drawString("1", 50, 150);
            graph.drawString("1", 150, 50);
            graph.setColor(Color.red);
            graph.drawString("1", 150, 150);
        }
        else if(XNOR.isSelected()){
            graph.setColor(Color.blue);
            graph.drawString("0", 50, 50);
            graph.setColor(Color.red);
            graph.drawString("1", 50, 150);
            graph.drawString("1", 150, 50);
            graph.setColor(Color.blue);
            graph.drawString("1", 150, 150);
        }
        
        graph.setColor(Color.BLACK);
        graph.drawLine(x1, y1 + 100, x2 + 100, y2); // x1 + y1 : point in x - axis , x2 + y2 : point in y - axis
        
        if(AND.isSelected() || OR.isSelected() || NAND.isSelected() || NOR.isSelected()){
            try{
                TimeUnit.MICROSECONDS.sleep(300000);
            }
            catch(Exception e){
            
            }
        }
        
        return true;
    }
    /*************************************************** Main *****************************************/
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogicGUI().setVisible(true);
            }
        });
    }
    /*************************************************** End Main *****************************************/
    
    private int [][]perf = {{0, 0},
                            {0, 0}};
    private double accuracy;
    private double MisclassRate;
    private double perfSum = 0;
    
    private double [][]yGate_acual = new double[4][3];
    private double []mse_error;
    private int ep_num;
    
    private double w1_p, w2_p, threshold_p;
    
    private int [][]andGate = {{0, 0, 0},       // And Gate Truth Table
                               {0, 1, 0}, 
                               {1, 0, 0}, 
                               {1, 1, 1}}; 
        
    private int [][]orGate = {{0, 0, 0},        // Or Gate Truth Table
                              {0, 1, 1}, 
                              {1, 0, 1}, 
                              {1, 1, 1}};
        
    private int [][]nandGate = {{0, 0, 1},      // Nand Gate Truth Table
                                {0, 1, 1}, 
                                {1, 0, 1}, 
                                {1, 1, 0}};
        
    private int [][]norGate = {{0, 0, 1},       // Nor Gate Truth Table
                               {0, 1, 0}, 
                               {1, 0, 0}, 
                               {1, 1, 0}};
        
    private int [][]xorGate = {{0, 0, 0},       // Xor Gate Truth Table
                               {0, 1, 1}, 
                               {1, 0, 1}, 
                               {1, 1, 0}};
        
    private int [][]xnorGate = {{0, 0, 1},      // Xnor Gate Truth Table
                                {0, 1, 0}, 
                                {1, 0, 0}, 
                                {1, 1, 1}};
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AND;
    private javax.swing.JLabel BestEpoch;
    private javax.swing.JLabel ErrorNum;
    private javax.swing.JLabel ErrorNumLabel;
    private javax.swing.JLabel ErrorNumLabel1;
    private javax.swing.JLabel ErrorNumLabel2;
    private javax.swing.JLabel ErrorNumLabel3;
    private javax.swing.JButton LearnButton;
    private javax.swing.JLabel Method;
    private javax.swing.JRadioButton NAND;
    private javax.swing.JRadioButton NOR;
    private javax.swing.JLabel NumOfEpoch;
    private javax.swing.JLabel NumOfEpochLabel;
    private javax.swing.JRadioButton OR;
    private javax.swing.JLabel RateLabel;
    private javax.swing.JSlider RateSlider;
    private javax.swing.JLabel ScrollLabel;
    private javax.swing.JTextField X1;
    private javax.swing.JTextField X2;
    private javax.swing.JTextField X3;
    private javax.swing.JRadioButton XNOR;
    private javax.swing.JRadioButton XOR;
    private javax.swing.JLabel accuracy_rate;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton check;
    private javax.swing.JLabel epochLabel;
    private javax.swing.JTextField epochNum;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel misclass_rate;
    private javax.swing.JLabel sliderValue;
    // End of variables declaration//GEN-END:variables
}


/*
This is my implementation of very famous game 2048 in Java Swing
I have developed my own implementations without seeing any tutorial.
*/

package main;

import java.util.Random;
import javax.swing.JOptionPane;

public class game_2048 extends javax.swing.JFrame {
    
    int[] x = new int[3];
    int[][] tiles = new int[4][4];
    int score;
    int winner = 0;

    public game_2048() {
        x[0] = 2;
        x[1] = 4;
        x[2] = 2;
        score = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tiles[i][j] = 0;
            }
        }
        initComponents();
        int v = new Random().nextInt(15);
        int a = getVal();
        placeVal(a, v);
        updateTile(a, v);
        int b = new Random().nextInt(15);
        while (b == v) {
            b = new Random().nextInt(15);
        }
        placeVal(a, b);
        updateTile(a, b);
        lblScoreVal.setText(score + "");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cell0 = new javax.swing.JButton();
        cell1 = new javax.swing.JButton();
        cell2 = new javax.swing.JButton();
        cell3 = new javax.swing.JButton();
        cell4 = new javax.swing.JButton();
        cell7 = new javax.swing.JButton();
        cell6 = new javax.swing.JButton();
        cell5 = new javax.swing.JButton();
        cell8 = new javax.swing.JButton();
        cell9 = new javax.swing.JButton();
        cell10 = new javax.swing.JButton();
        cell11 = new javax.swing.JButton();
        cell12 = new javax.swing.JButton();
        cell15 = new javax.swing.JButton();
        cell14 = new javax.swing.JButton();
        cell13 = new javax.swing.JButton();
        btnUp = new javax.swing.JButton();
        btnDown = new javax.swing.JButton();
        btnLeft = new javax.swing.JButton();
        btnRight = new javax.swing.JButton();
        lblScore = new javax.swing.JLabel();
        lblScoreVal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cell0.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell0.setEnabled(false);
        cell0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell0ActionPerformed(evt);
            }
        });

        cell1.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell1.setEnabled(false);
        cell1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell1ActionPerformed(evt);
            }
        });

        cell2.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell2.setEnabled(false);
        cell2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell2ActionPerformed(evt);
            }
        });

        cell3.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell3.setEnabled(false);
        cell3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cell3ActionPerformed(evt);
            }
        });

        cell4.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell4.setEnabled(false);

        cell7.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell7.setEnabled(false);

        cell6.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell6.setEnabled(false);

        cell5.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell5.setEnabled(false);

        cell8.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell8.setEnabled(false);

        cell9.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell9.setEnabled(false);

        cell10.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell10.setEnabled(false);

        cell11.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell11.setEnabled(false);

        cell12.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell12.setEnabled(false);

        cell15.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell15.setEnabled(false);

        cell14.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell14.setEnabled(false);

        cell13.setFont(new java.awt.Font("Tahoma", 1, 24));
        cell13.setEnabled(false);

        btnUp.setText("Up");
        btnUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpActionPerformed(evt);
            }
        });

        btnDown.setText("Down");
        btnDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDownActionPerformed(evt);
            }
        });

        btnLeft.setText("Left");
        btnLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftActionPerformed(evt);
            }
        });

        btnRight.setText("Right");
        btnRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRightActionPerformed(evt);
            }
        });

        lblScore.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblScore.setText("SCORE :");

        lblScoreVal.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblScoreVal.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnLeft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDown, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRight)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cell4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cell0, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cell8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell10, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell11, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cell12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell14, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cell15, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(lblScore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblScoreVal)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblScore)
                    .addComponent(lblScoreVal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cell0, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cell4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cell8, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell9, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell10, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cell12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell14, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cell15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDown)
                    .addComponent(btnLeft)
                    .addComponent(btnRight))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cell2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell2ActionPerformed

    private void cell3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell3ActionPerformed

    private void cell1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell1ActionPerformed

    private void cell0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cell0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cell0ActionPerformed

    private void btnRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRightActionPerformed
        int p = 0;
        int[][] temp_tiles = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp_tiles[i][j] = tiles[i][j];
            }
        }
        while (p < 4) {
            int r = 3;
            String seq = "";
            for (int i = 3; i >= 0; i--) {
                if (tiles[p][i] == 0) {
                    continue;
                }
                seq += tiles[p][i] + ":";
            }
            seq += "s";
            
            for (int i = 0; i < 4; i++) {
                tiles[p][i] = 0;
            }
            String[] vals = seq.split(":");
            for (int i = 0; i < vals.length - 1; i++) {
                tiles[p][3 - i] = Integer.parseInt(vals[i]);
            }
            for (int i = 3; i >= 1; i--) {
                if (tiles[p][i] == tiles[p][i - 1]) {
                    tiles[p][i] *= 2;
                    tiles[p][i - 1] = 0;
                    score += tiles[p][i];
                    lblScoreVal.setText(score + "");
                    //System.out.println(p + "  " + i + "  " + tiles[p][i]);
                }
            }
            seq = "";
            for (int i = 3; i >= 0; i--) {
                if (tiles[p][i] == 0) {
                    continue;
                }
                seq += tiles[p][i] + ":";
            }
            seq += "s";
            for (int i = 0; i < 4; i++) {
                tiles[p][i] = 0;
            }
            vals = seq.split(":");
            for (int i = 0; i < vals.length - 1; i++) {
                tiles[p][3 - i] = Integer.parseInt(vals[i]);
            }
            p++;
        }
        if (!isStateSame(temp_tiles, tiles)) {
            int tile = createTile();
            int k = new Random().nextInt(2);
            tiles[tile / 4][tile % 4] = x[k];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    placeVal(tiles[i][j], i * 4 + j);
                }
            }
        } else {
            if (isGameOver()) {
                btnDown.setEnabled(false);
                btnUp.setEnabled(false);
                btnRight.setEnabled(false);
                btnLeft.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Sorry!!! You have lost this game.\nYour score is " + score + ".\nBetter luck next time...:)");
            }
        }
        if (0 == winner && isWinner()) {
            winner = 1;
            JOptionPane.showMessageDialog(null, "Congratulations!!! You have won!!!\n Keep playing and score more!!!");
        }
        //printTiles();
    }//GEN-LAST:event_btnRightActionPerformed

    private void btnDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDownActionPerformed
        int p = 0;
        int[][] temp_tiles = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp_tiles[i][j] = tiles[i][j];
            }
        }
        while (p < 4) {
            int r = 3;
            String seq = "";
            for (int i = 3; i >= 0; i--) {
                if (tiles[i][p] == 0) {
                    continue;
                }
                seq += tiles[i][p] + ":";
            }
            seq += "s";
            
            for (int i = 0; i < 4; i++) {
                tiles[i][p] = 0;
            }
            String[] vals = seq.split(":");
            for (int i = 0; i < vals.length - 1; i++) {
                tiles[3 - i][p] = Integer.parseInt(vals[i]);
            }
            for (int i = 3; i >= 1; i--) {
                if (tiles[i][p] == tiles[i - 1][p]) {
                    tiles[i][p] *= 2;
                    tiles[i - 1][p] = 0;
                    score += tiles[i][p];
                    lblScoreVal.setText(score + "");
                    //System.out.println(p + "  " + i + "  " + tiles[p][i]);
                }
                //printTiles();
            }
            seq = "";
            for (int i = 3; i >= 0; i--) {
                if (tiles[i][p] == 0) {
                    continue;
                }
                seq += tiles[i][p] + ":";
            }
            seq += "s";
            for (int i = 0; i < 4; i++) {
                tiles[i][p] = 0;
            }
            vals = seq.split(":");
            for (int i = 0; i < vals.length - 1; i++) {
                tiles[3 - i][p] = Integer.parseInt(vals[i]);
            }
            p++;
        }
        if (!isStateSame(temp_tiles, tiles)) {
            int tile = createTile();
            int k = new Random().nextInt(2);
            tiles[tile / 4][tile % 4] = x[k];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    placeVal(tiles[i][j], i * 4 + j);
                }
            }
        } else {
            if (isGameOver()) {
                btnDown.setEnabled(false);
                btnUp.setEnabled(false);
                btnRight.setEnabled(false);
                btnLeft.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Sorry!!! You have lost this game.\nYour score is " + score + ".\nBetter luck next time...:)");
            }
        }
        if (0 == winner && isWinner()) {
            winner = 1;
            JOptionPane.showMessageDialog(null, "Congratulations!!! You have won!!!\n Keep playing and score more!!!");
        }
    }//GEN-LAST:event_btnDownActionPerformed

    private void btnUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpActionPerformed
        int p = 0;
        int[][] temp_tiles = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp_tiles[i][j] = tiles[i][j];
            }
        }
        while (p < 4) {
            int r = 3;
            String seq = "";
            for (int i = 0; i <= 3; i++) {
                if (tiles[i][p] == 0) {
                    continue;
                }
                seq += tiles[i][p] + ":";
            }
            seq += "s";
            for (int i = 0; i <= 3; i++) {
                tiles[i][p] = 0;
            }
            String[] vals = seq.split(":");
            for (int i = 0; i < vals.length - 1; i++) {
                tiles[i][p] = Integer.parseInt(vals[i]);
            }
            for (int i = 0; i < 3; i++) {
                if (tiles[i][p] == tiles[i + 1][p]) {
                    tiles[i][p] *= 2;
                    tiles[i + 1][p] = 0;
                    score += tiles[i][p];
                    lblScoreVal.setText(score + "");
                   // System.out.println(p + "  " + i + "  " + tiles[i][p]);
                }
            }
            seq = "";
            for (int i = 0; i <= 3; i++) {
                if (tiles[i][p] == 0) {
                    continue;
                }
                seq += tiles[i][p] + ":";
            }
            seq += "s";
            for (int i = 0; i < 4; i++) {
                tiles[i][p] = 0;
            }
            vals = seq.split(":");
            for (int i = 0; i < vals.length - 1; i++) {
                tiles[i][p] = Integer.parseInt(vals[i]);
            }
            p++;
        }
        if (!isStateSame(temp_tiles, tiles)) {
            int tile = createTile();
            int k = new Random().nextInt(2);
            tiles[tile / 4][tile % 4] = x[k];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    placeVal(tiles[i][j], i * 4 + j);
                }
            }
        } else {
            if (isGameOver()) {
                btnDown.setEnabled(false);
                btnUp.setEnabled(false);
                btnRight.setEnabled(false);
                btnLeft.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Sorry!!! You have lost this game.\nYour score is " + score + ".\nBetter luck next time...:)");
            }
        }
        if (0 == winner && isWinner()) {
            winner = 1;
            JOptionPane.showMessageDialog(null, "Congratulations!!! You have won!!!\n Keep playing and score more!!!");
        }
    }//GEN-LAST:event_btnUpActionPerformed

    private void btnLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftActionPerformed
        int p = 0;
        int[][] temp_tiles = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                temp_tiles[i][j] = tiles[i][j];
            }
        }
        while (p < 4) {
            int r = 3;
            String seq = "";
            for (int i = 0; i <= 3; i++) {
                if (tiles[p][i] == 0) {
                    continue;
                }
                seq += tiles[p][i] + ":";
            }
            seq += "s";
            for (int i = 0; i <= 3; i++) {
                tiles[p][i] = 0;
            }
            String[] vals = seq.split(":");
            for (int i = 0; i < vals.length - 1; i++) {
                tiles[p][i] = Integer.parseInt(vals[i]);
            }
            for (int i = 0; i < 3; i++) {
                if (tiles[p][i] == tiles[p][i + 1]) {
                    tiles[p][i] *= 2;
                    tiles[p][i + 1] = 0;
                    score += tiles[p][i];
                    lblScoreVal.setText(score + "");
                    //System.out.println(p + "  " + i + "  " + tiles[p][i]);
                }
            }
            seq = "";
            for (int i = 0; i <= 3; i++) {
                if (tiles[p][i] == 0) {
                    continue;
                }
                seq += tiles[p][i] + ":";
            }
            seq += "s";
            for (int i = 0; i < 4; i++) {
                tiles[p][i] = 0;
            }
            vals = seq.split(":");
            for (int i = 0; i < vals.length - 1; i++) {
                tiles[p][i] = Integer.parseInt(vals[i]);
            }
            p++;
        }
        if (!isStateSame(temp_tiles, tiles)) {
            int tile = createTile();
            int k = new Random().nextInt(2);
            tiles[tile / 4][tile % 4] = x[k];

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    placeVal(tiles[i][j], i * 4 + j);
                }
            }
        } else {
            if (isGameOver()) {
                btnDown.setEnabled(false);
                btnUp.setEnabled(false);
                btnRight.setEnabled(false);
                btnLeft.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Sorry!!! You have lost this game.\nYour score is " + score + ".\nBetter luck next time...:)");
            }
        }
        if (0 == winner && isWinner()) {
            winner = 1;
            JOptionPane.showMessageDialog(null, "Congratulations!!! You have won!!!\n Keep playing and score more!!!");
        }
    }//GEN-LAST:event_btnLeftActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new game_2048().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDown;
    private javax.swing.JButton btnLeft;
    private javax.swing.JButton btnRight;
    private javax.swing.JButton btnUp;
    private javax.swing.JButton cell0;
    private javax.swing.JButton cell1;
    private javax.swing.JButton cell10;
    private javax.swing.JButton cell11;
    private javax.swing.JButton cell12;
    private javax.swing.JButton cell13;
    private javax.swing.JButton cell14;
    private javax.swing.JButton cell15;
    private javax.swing.JButton cell2;
    private javax.swing.JButton cell3;
    private javax.swing.JButton cell4;
    private javax.swing.JButton cell5;
    private javax.swing.JButton cell6;
    private javax.swing.JButton cell7;
    private javax.swing.JButton cell8;
    private javax.swing.JButton cell9;
    private javax.swing.JLabel lblScore;
    private javax.swing.JLabel lblScoreVal;
    // End of variables declaration//GEN-END:variables

    private int getVal() {
        int pos = new Random().nextInt(2);
        return x[pos];
    }

    private void placeVal(int a, int v) {
        String val = "";
        if (a != 0) {
            val += a;
        }
        if (0 == v) {
            cell0.setText(val);
        } else if (1 == v) {
            cell1.setText(val);
        } else if (2 == v) {
            cell2.setText(val);
        } else if (3 == v) {
            cell3.setText(val);
        } else if (4 == v) {
            cell4.setText(val);
        } else if (5 == v) {
            cell5.setText(val);
        } else if (6 == v) {
            cell6.setText(val);
        } else if (7 == v) {
            cell7.setText(val);
        } else if (8 == v) {
            cell8.setText(val);
        } else if (9 == v) {
            cell9.setText(val);
        } else if (10 == v) {
            cell10.setText(val);
        } else if (11 == v) {
            cell11.setText(val);
        } else if (12 == v) {
            cell12.setText(val);
        } else if (13 == v) {
            cell13.setText(val);
        } else if (14 == v) {
            cell14.setText(val);
        } else if (15 == v) {
            cell15.setText(val);
        }
    }

    void startGame() {
    }

    private void updateTile(int a, int b) {
        int p = (int) b / 4;
        int q = b % 4;
        tiles[p][q] = a;
    }

    private boolean isOver() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (2048 == tiles[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private void printTiles() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tiles[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private int createTile() {
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (tiles[i][j] == 0) {
                    count++;
                }
            }
        }
        //System.out.println(count);
        int num;
        if (count - 1 == 0) {
            num = 0;
        } else {
            num = new Random().nextInt(count - 1);
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (tiles[i][j] == 0) {
                    num--;
                    if (num == 0 || num == -1) {
                        return (i * 4 + j);
                    }
                }
            }
        }
        return 0;
    }

    private boolean isStateSame(int[][] temp_tiles, int[][] tiles) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                if (tiles[i][j] != temp_tiles[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isGameOver() {
        if (tiles[0][0] == tiles[0][1] || tiles[0][0] == tiles[1][0]) {
            return false;
        } else if (tiles[0][3] == tiles[0][2] || tiles[0][3] == tiles[1][3]) {
            return false;
        } else if (tiles[3][0] == tiles[2][0] || tiles[3][0] == tiles[3][1]) {
            return false;
        } else if (tiles[3][3] == tiles[3][2] || tiles[3][3] == tiles[2][3]) {
            return false;
        } else if (tiles[0][1] == tiles[0][2] || tiles[1][0] == tiles[2][0] || tiles[1][3] == tiles[2][3] || tiles[3][1] == tiles[3][2]) {
            return false;
        } else if (tiles[1][1] == tiles[0][1] || tiles[1][1] == tiles[1][0] || tiles[1][1] == tiles[2][1] || tiles[1][1] == tiles[1][2]) {
            return false;
        } else if (tiles[1][2] == tiles[0][2] || tiles[1][2] == tiles[1][1] || tiles[1][2] == tiles[1][3] || tiles[1][2] == tiles[2][2]) {
            return false;
        } else if (tiles[2][1] == tiles[1][1] || tiles[2][1] == tiles[2][0] || tiles[2][1] == tiles[2][2] || tiles[2][1] == tiles[3][1]) {
            return false;
        } else if (tiles[2][2] == tiles[2][1] || tiles[2][2] == tiles[1][2] || tiles[2][2] == tiles[2][3] || tiles[2][2] == tiles[3][2]) {
            return false;
        } else {
            return true;
        }
    }

    private boolean isWinner() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (tiles[i][j] == 2048) {
                    return true;
                }
            }
        }
        return false;
    }
}

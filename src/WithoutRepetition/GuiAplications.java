
package WithoutRepetition;

import java.util.logging.Level;
import java.util.logging.Logger;


public class GuiAplications extends javax.swing.JFrame {

    private WithoutRepetition operation = new WithoutRepetition();
    public GuiAplications() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jb_reset = new javax.swing.JButton();
        lb_vector1 = new javax.swing.JLabel();
        lb_Vector2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_AinterB = new javax.swing.JLabel();
        lb_AunionB = new javax.swing.JLabel();
        lb_BminusA = new javax.swing.JLabel();
        lb_AminusB = new javax.swing.JLabel();
        lb_resultUnion = new javax.swing.JLabel();
        lb_ResultBA = new javax.swing.JLabel();
        lb_ResultAB = new javax.swing.JLabel();
        lb_resultInter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jb_reset.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jb_reset.setText("Reset");
        jb_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_resetActionPerformed(evt);
            }
        });

        lb_vector1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_vector1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_vector1.setText("Vector2");

        lb_Vector2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_Vector2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_Vector2.setText("Vector1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jb_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lb_Vector2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_vector1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_Vector2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_vector1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jb_reset)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        lb_AinterB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_AinterB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_AinterB.setText("A n B");

        lb_AunionB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_AunionB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_AunionB.setText("A U B");

        lb_BminusA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_BminusA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_BminusA.setText("B -A");

        lb_AminusB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_AminusB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_AminusB.setText("A - B");

        lb_resultUnion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_resultUnion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lb_ResultBA.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_ResultBA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lb_ResultAB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_ResultAB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lb_resultInter.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lb_resultInter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_AinterB, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_AminusB, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_BminusA, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(199, 199, 199)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_ResultBA, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_ResultAB, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_resultInter, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lb_AunionB, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_resultUnion, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_AunionB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_resultUnion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_AinterB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_resultInter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_AminusB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_ResultAB, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_BminusA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_ResultBA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_resetActionPerformed
        int[] vectorA = operation.fillVector();
        int[] vectorB = operation.fillVector();
        int[] vector = operation.fillVector();
        lb_vector1.setText(changeToString(vectorB));
        lb_Vector2.setText(changeToString(vectorA));
        lb_resultUnion.setText(changeToString(operation.union(vectorA, vectorB)));
        try {
            lb_resultInter.setText(changeToString(operation.intersection(vectorA, vectorB)));
        } catch (Exception ex) {
            lb_resultInter.setText(ex.getMessage());
        }
        try {
            lb_ResultAB.setText(changeToString(operation.vectorsubtraction(vectorA, vectorB)));
        } catch (Exception ex) {
             lb_ResultAB.setText(ex.getMessage());
        }
         try {
            lb_ResultBA.setText(changeToString(operation.vectorsubtraction(vectorB, vectorA)));
        } catch (Exception ex) {
             lb_ResultBA.setText(ex.getMessage());
        }
        
        
        
    }//GEN-LAST:event_jb_resetActionPerformed

    
    private static String changeToString(int[] vector){
        String result = "{"; 
        for (int i = 0; i < vector.length; i++) {
            String number = Integer.toString(vector[i]);
            if(i != vector.length-1){
                result = result + " " + number + ",";
            }else{
                result = result + " " + number + " }";
                System.out.println("Si");
            } 
            
        }
        return result;
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiAplications().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_reset;
    private javax.swing.JLabel lb_AinterB;
    private javax.swing.JLabel lb_AminusB;
    private javax.swing.JLabel lb_AunionB;
    private javax.swing.JLabel lb_BminusA;
    private javax.swing.JLabel lb_ResultAB;
    private javax.swing.JLabel lb_ResultBA;
    private javax.swing.JLabel lb_Vector2;
    private javax.swing.JLabel lb_resultInter;
    private javax.swing.JLabel lb_resultUnion;
    private javax.swing.JLabel lb_vector1;
    // End of variables declaration//GEN-END:variables
}

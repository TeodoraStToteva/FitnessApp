/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fitnessapp;

/**
 *
 * @author sofiyald
 */
public class Exercise extends javax.swing.JFrame {

    /**
     * Creates new form Exercise
     */
    public Exercise() {
        initComponents();
        //Area();
    }
    private static String day;
    private static String pol;
    private static String cel;

    public static String getDay() 
    {
        return day;
    }
    public static void setDay(String day) 
    {
        Exercise.day = day;
    }
    public static String getPol() 
    {
        return pol;
    }
    public static void setPol(String pol) 
    {
        Exercise.pol = pol;
    }
    public static String getCel() 
    {
        return cel;
    }
    public static void setCel(String cel)
    {
        Exercise.cel = cel;
    }
    
    
    
    public void Area()
    {
        if(getPol().equals("Female"))
        {
            if(getCel().equals("Stay fit"))
            {
                if(getDay().equals("Monday"))
                {
                    jTextArea1.setText("Jumping jacks x40\n"
                    + "Push-ups x8\n");
                }
                else if(getDay().equals("Tuesday"))
                {
                    
                }
                else if(getDay().equals("Wednesday"))
                {
                    
                }
                else if(getDay().equals("Thursday"))
                {
                    
                }
                else if(getDay().equals("Friday"))
                {
                    
                }
                else if(getDay().equals("Saturday"))
                {
                    
                }
                else
                {
                    
                }
            }
            else if(getCel().equals("Lose weight"))
            {
                if(getDay().equals("Monday"))
                {
                    
                }
                else if(getDay().equals("Tuesday"))
                {
                    
                }
                else if(getDay().equals("Wednesday"))
                {
                    
                }
                else if(getDay().equals("Thursday"))
                {
                    
                }
                else if(getDay().equals("Friday"))
                {
                    
                }
                else if(getDay().equals("Saturday"))
                {
                    
                }
                else
                {
                    
                }
            }
            else
            {
                if(getDay().equals("Monday"))
                {
                    
                }
                else if(getDay().equals("Tuesday"))
                {
                    
                }
                else if(getDay().equals("Wednesday"))
                {
                    
                }
                else if(getDay().equals("Thursday"))
                {
                    
                }
                else if(getDay().equals("Friday"))
                {
                    
                }
                else if(getDay().equals("Saturday"))
                {
                    
                }
                else
                {
                    
                }
            }
        }
        else //muje
        {
            if(getCel().equals("Stay fit"))
            {
                if(getDay().equals("Monday"))
                {
                    
                }
                else if(getDay().equals("Tuesday"))
                {
                    
                }
                else if(getDay().equals("Wednesday"))
                {
                    
                }
                else if(getDay().equals("Thursday"))
                {
                    
                }
                else if(getDay().equals("Friday"))
                {
                    
                }
                else if(getDay().equals("Saturday"))
                {
                    
                }
                else
                {
                    
                }
            }
            else if(getCel().equals("Lose weight"))
            {
                if(getDay().equals("Monday"))
                {
                    
                }
                else if(getDay().equals("Tuesday"))
                {
                    
                }
                else if(getDay().equals("Wednesday"))
                {
                    
                }
                else if(getDay().equals("Thursday"))
                {
                    
                }
                else if(getDay().equals("Friday"))
                {
                    
                }
                else if(getDay().equals("Saturday"))
                {
                    
                }
                else
                {
                    
                }
            }
            else
            {
                if(getDay().equals("Monday"))
                {
                    
                }
                else if(getDay().equals("Tuesday"))
                {
                    
                }
                else if(getDay().equals("Wednesday"))
                {
                    
                }
                else if(getDay().equals("Thursday"))
                {
                    
                }
                else if(getDay().equals("Friday"))
                {
                    
                }
                else if(getDay().equals("Saturday"))
                {
                    
                }
                else
                {
                    
                }
            }
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.out.println(getDay());
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Exercise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exercise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exercise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exercise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exercise().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

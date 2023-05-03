
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author alvar
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tTitulo = new javax.swing.JTextField();
        tInicio = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        mNavegación = new javax.swing.JMenu();
        mSobremesa = new javax.swing.JMenuItem();
        mPortatiles = new javax.swing.JMenuItem();
        mMoviles = new javax.swing.JMenuItem();
        mTablets = new javax.swing.JMenuItem();
        mComponentes = new javax.swing.JMenuItem();
        mSalir = new javax.swing.JMenuItem();
        mCesta = new javax.swing.JMenu();
        mVisuCesta = new javax.swing.JMenuItem();
        mPagar = new javax.swing.JMenuItem();
        mInfo = new javax.swing.JMenu();
        mSobreN = new javax.swing.JMenuItem();
        mPregF = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/perro2.jpg"))); // NOI18N

        tTitulo.setEditable(false);
        tTitulo.setBackground(new java.awt.Color(38, 51, 69));
        tTitulo.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        tTitulo.setForeground(new java.awt.Color(255, 255, 255));
        tTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tTitulo.setText("ELECTRÓNICA ÁLVARO");
        tTitulo.setBorder(null);
        tTitulo.setOpaque(false);
        tTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tTituloActionPerformed(evt);
            }
        });

        tInicio.setEditable(false);
        tInicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tInicio.setText("Puede navegar por nuestra tienda mediante el menú situado en la parte superior. Gracias por visitar nuestra página web ;)");
        tInicio.setDisabledTextColor(new java.awt.Color(150, 150, 150));

        mNavegación.setText("Navegación");

        mSobremesa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSobremesa.setText("PCs Sobremesa");
        mSobremesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSobremesaActionPerformed(evt);
            }
        });
        mNavegación.add(mSobremesa);

        mPortatiles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mPortatiles.setText("Portátiles");
        mPortatiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPortatilesActionPerformed(evt);
            }
        });
        mNavegación.add(mPortatiles);

        mMoviles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mMoviles.setText("Móviles");
        mNavegación.add(mMoviles);

        mTablets.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mTablets.setText("Tablets");
        mNavegación.add(mTablets);

        mComponentes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mComponentes.setText("Componentes");
        mNavegación.add(mComponentes);

        mSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSalir.setText("Salir");
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });
        mNavegación.add(mSalir);

        jMenuBar1.add(mNavegación);

        mCesta.setText("Cesta");

        mVisuCesta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mVisuCesta.setText("Visualizar Cesta");
        mVisuCesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mVisuCestaActionPerformed(evt);
            }
        });
        mCesta.add(mVisuCesta);

        mPagar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mPagar.setText("Pagar");
        mPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPagarActionPerformed(evt);
            }
        });
        mCesta.add(mPagar);

        jMenuBar1.add(mCesta);

        mInfo.setText("Información");

        mSobreN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mSobreN.setText("Sobre nosotros");
        mInfo.add(mSobreN);

        mPregF.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mPregF.setText("Preguntas frecuentes");
        mInfo.add(mPregF);

        jMenuBar1.add(mInfo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tInicio)
                    .addComponent(tTitulo))
                .addContainerGap())
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tTituloActionPerformed

    private void mSobremesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSobremesaActionPerformed
        PCsobremesa pcsobremesa = new PCsobremesa();
        pcsobremesa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mSobremesaActionPerformed

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mSalirActionPerformed

    private void mPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPagarActionPerformed
        Pagar pagar = new Pagar();
        pagar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mPagarActionPerformed

    private void mVisuCestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mVisuCestaActionPerformed
        Cesta cesta = new Cesta();
        cesta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mVisuCestaActionPerformed

    private void mPortatilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPortatilesActionPerformed
        Portatiles portatiles = new Portatiles();
        portatiles.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_mPortatilesActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mCesta;
    private javax.swing.JMenuItem mComponentes;
    private javax.swing.JMenu mInfo;
    private javax.swing.JMenuItem mMoviles;
    private javax.swing.JMenu mNavegación;
    private javax.swing.JMenuItem mPagar;
    private javax.swing.JMenuItem mPortatiles;
    private javax.swing.JMenuItem mPregF;
    private javax.swing.JMenuItem mSalir;
    private javax.swing.JMenuItem mSobreN;
    private javax.swing.JMenuItem mSobremesa;
    private javax.swing.JMenuItem mTablets;
    private javax.swing.JMenuItem mVisuCesta;
    private javax.swing.JTextField tInicio;
    private javax.swing.JTextField tTitulo;
    // End of variables declaration//GEN-END:variables
}

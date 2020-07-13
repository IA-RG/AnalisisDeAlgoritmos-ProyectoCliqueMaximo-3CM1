

package Ventanas;

import Clases.Arboles;
import java.awt.Frame;


public class Matrices extends javax.swing.JFrame {

    /**
     * Crea nuevas matrices de formularios
     */
    Arboles arbol;
    Frame frame;
    public Matrices(int i,Arboles arboles,int matriz,Frame frame ) {
        this.i=i;
        this.arbol=arboles;
        this.frame = frame;
        
        initComponents();
        if(matriz==1){
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                jTextArea1.append(""+arbol.getmAdyacencia(j, k)+"\t");
                
            }
            jTextArea1.append("\n");
            
        }
        }
        if(matriz==2){
         for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                jTextArea1.append(""+arbol.getmCoeficiente(j, k)+"\t");
            }
            jTextArea1.append("\n");
         }
        }
    }

    /**
    * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(":::::Matriz::::"));
        jPanel1.setLayout(null);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(16, 16, 560, 400);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 600, 430);

        setSize(new java.awt.Dimension(635, 494));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frame.setEnabled(true);       
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args los argumentos de la línea de comando
     */
    public static void main(String args[]) {
        /* Configura el aspecto y la sensación de Nimbus*/
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
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Crea y muestra el formulario*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new Matrices().setVisible(true);
            }
        });
    }
int i;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

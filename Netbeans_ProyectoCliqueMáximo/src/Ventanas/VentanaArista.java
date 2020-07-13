
package Ventanas;

import Clases.Arboles;
import Clases.Pintar;
import java.awt.Frame;
import javax.swing.JOptionPane;


public class VentanaArista extends javax.swing.JFrame {

    /**
     * crear nuevo formulario en NewJFrame
     */  
      Pintar pintar ;
      Arboles arboles ;
      Frame frame1;
    public VentanaArista(Arboles arbole,Pintar pinta ,int I,Frame frame){
       this.pintar =pinta;
       this.arboles=arbole;
       this.i=I;
       frame1 = frame;
        
        initComponents();
      
        
        
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * ADVERTENCIA: NO modifique este código. El contenido de este método es siempre
     * regenerado por el Editor de formularios.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        n2 = new javax.swing.JTextField();
        tm = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setTitle("::Crear::");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        panel.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Arista"));
        panel.setLayout(null);

        jLabel1.setText("Digite el Nodo 1");
        panel.add(jLabel1);
        jLabel1.setBounds(10, 30, 90, 20);

        jLabel2.setText("Digite el Nodo 2");
        panel.add(jLabel2);
        jLabel2.setBounds(10, 60, 90, 20);

        jLabel3.setText("digite el Tamaño");
        panel.add(jLabel3);
        jLabel3.setBounds(10, 90, 100, 20);

        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });
        n1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                n1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n1KeyReleased(evt);
            }
        });
        panel.add(n1);
        n1.setBounds(110, 30, 30, 26);

        n2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                n2KeyReleased(evt);
            }
        });
        panel.add(n2);
        n2.setBounds(110, 60, 30, 26);

        tm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmActionPerformed(evt);
            }
        });
        tm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tmKeyReleased(evt);
            }
        });
        panel.add(tm);
        tm.setBounds(110, 90, 30, 26);

        getContentPane().add(panel);
        panel.setBounds(10, 10, 150, 130);

        jButton1.setText("Trazar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 140, 90, 29);

        setBounds(60, 150, 226, 234);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int x;int y;int ta;
         if(n1.getText().length()<1 || n2.getText().length()<1 ||tm.getText().length()<1)
           JOptionPane.showMessageDialog(null,"Error.. Faltan datos : ");
         else{
           x=Integer.parseInt(n1.getText());
           y=Integer.parseInt(n2.getText());
           ta=Integer.parseInt(tm.getText());         
     
         if(x==y)
           JOptionPane.showMessageDialog(null,"Error.. Debe digitar un nodo diferente a : "+y);
         else if(x<0 || x>=i || y<0 || y>=i){
            JOptionPane.showMessageDialog(null,"Error.. Nodos No validos "); 
         }else{
             arboles.setmAdyacencia(x, y, 1);
             arboles.setmAdyacencia(y, x, 1);
             arboles.setmCoeficiente(x, y, ta);
             arboles.setmCoeficiente(y, x, ta);
             n1.setText(null);
             n2.setText(null);
             tm.setText(null);
            Pintar.pintarLinea(VentanaPrincipal.jPanel1.getGraphics(),arboles.getCordeX(x), arboles.getCordeY(x), arboles.getCordeX(y), arboles.getCordeY(y), ta);
            
         } 
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void n1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyReleased
     String tem = new String(n1.getText());
       StringBuffer tem2= new StringBuffer();       
        for (int j = 0; j < tem.length(); j++) {          
            if(Character.isDigit(tem.charAt(j))){                
             tem2.append(tem.charAt(j));
            } 
        }
        n1.setText(""+tem2);  
    }//GEN-LAST:event_n1KeyReleased

    private void n1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n1KeyPressed
        
    }//GEN-LAST:event_n1KeyPressed

    private void n2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_n2KeyReleased
      String tem = new String(n2.getText());
       StringBuffer tem2= new StringBuffer();       
        for (int j = 0; j < tem.length(); j++) {          
            if(Character.isDigit(tem.charAt(j))){                
             tem2.append(tem.charAt(j));
            } 
        }
        n2.setText(""+tem2);        
    }//GEN-LAST:event_n2KeyReleased

    private void tmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tmKeyReleased
       String tem = new String(tm.getText());
       StringBuffer tem2= new StringBuffer();       
        for (int j = 0; j < tem.length(); j++) {          
            if(Character.isDigit(tem.charAt(j))){                
             tem2.append(tem.charAt(j));
            } 
        }
        tm.setText(""+tem2); 
    }//GEN-LAST:event_tmKeyReleased

    private void tmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmActionPerformed
       
    }//GEN-LAST:event_tmActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
       
    }//GEN-LAST:event_n1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
         
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        frame1.setEnabled(true); 
    }//GEN-LAST:event_formWindowClosing

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaArista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaArista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaArista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaArista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new VentanaArista().setVisible(true);
            }
        });
    }
private int i=0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField tm;
    // End of variables declaration//GEN-END:variables
}

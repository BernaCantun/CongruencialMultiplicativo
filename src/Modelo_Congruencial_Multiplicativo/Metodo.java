/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_Congruencial_Multiplicativo;


import java.io.*;

import java.util.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import sun.util.logging.PlatformLogger.Level;

/**
 *
 * @author PC_Cantun
 */
public class Metodo extends javax.swing.JFrame {

    public Metodo() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(true);
    }

    int numero=0, valor1=0, veces=0, cantidad=0, x=0, k=0, g=0, m=1, num=2, a=0;
 String valor, ccuadrado="", sale="", cua="", erre="";
 String cero="0.";
 int[] v;
 double[] r;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        MInicio = new javax.swing.JMenu();
        inicio = new javax.swing.JMenuItem();
        MPruebas = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        MAYUDA = new javax.swing.JMenu();
        creditos = new javax.swing.JMenuItem();
        MMetodo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        a1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        a2 = new javax.swing.JTextArea();
        jMenuBar3 = new javax.swing.JMenuBar();
        MInicio1 = new javax.swing.JMenu();
        inicio1 = new javax.swing.JMenuItem();
        MPruebas1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        MAYUDA1 = new javax.swing.JMenu();
        creditos1 = new javax.swing.JMenuItem();
        MMetodo1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        MInicio.setText("INICIO");

        inicio.setText("INICIO");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });
        MInicio.add(inicio);

        jMenuBar2.add(MInicio);

        MPruebas.setText("PRUEBAS");

        jMenuItem2.setText(" Comprobacion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        MPruebas.add(jMenuItem2);

        jMenuBar2.add(MPruebas);

        MAYUDA.setText(" AYUDA");

        creditos.setText("CREDITOS");
        creditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditosActionPerformed(evt);
            }
        });
        MAYUDA.add(creditos);

        jMenuBar2.add(MAYUDA);

        MMetodo.setText("METODO");

        jMenuItem1.setText("Congruencial Multiplicativo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MMetodo.add(jMenuItem1);

        jMenuBar2.add(MMetodo);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ALGORITMO CONGRUENCIAL MULTIPLICATIVO");

        jLabel2.setText("INGRESA EL VALOR DE LA SEMILLA");

        jLabel3.setText("VALOR DE K");

        jLabel4.setText("VALOR DE G");

        b1.setText("LIMPIAR");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("GENERAR");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Xi");

        jLabel6.setText("Ri");

        a1.setColumns(20);
        a1.setRows(5);
        jScrollPane1.setViewportView(a1);

        a2.setColumns(20);
        a2.setRows(5);
        jScrollPane2.setViewportView(a2);

        MInicio1.setText("INICIO");

        inicio1.setText("INICIO");
        inicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio1ActionPerformed(evt);
            }
        });
        MInicio1.add(inicio1);

        jMenuBar3.add(MInicio1);

        MPruebas1.setText("PRUEBAS");

        jMenuItem3.setText(" Comprobacion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        MPruebas1.add(jMenuItem3);

        jMenuBar3.add(MPruebas1);

        MAYUDA1.setText(" AYUDA");

        creditos1.setText("CREDITOS");
        creditos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditos1ActionPerformed(evt);
            }
        });
        MAYUDA1.add(creditos1);

        jMenuBar3.add(MAYUDA1);

        MMetodo1.setText("METODO");

        jMenuItem4.setText("Congruencial Multiplicativo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        MMetodo1.add(jMenuItem4);

        jMenuBar3.add(MMetodo1);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t1)
                            .addComponent(t2)
                            .addComponent(t3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(b1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(b2)
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(118, 118, 118))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1)
                    .addComponent(b2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
    if(t1.getText().equals("")|| t2.getText().equals(""))
    {
     JOptionPane.showMessageDialog(null,"Ingresa dato faltante","error",JOptionPane.ERROR_MESSAGE);
    }
        
    else
    {
         
    try
    {
    x=Integer.parseInt(t1.getText());
    k=Integer.parseInt(t2.getText());
    g=Integer.parseInt(t3.getText());
  
    if(x%2==0)
    {
     JOptionPane.showMessageDialog(null,"X debe ser numero impar","error",JOptionPane.ERROR_MESSAGE);
     t1.setText("");
    }
    
    else
    {
     
    if(x<=0)
    {
     JOptionPane.showMessageDialog(null,"X debe ser valor positivo","error",JOptionPane.ERROR_MESSAGE);
     t1.setText("");
    }     
 
    else
    {
    
    if(k<=0)
    {
     JOptionPane.showMessageDialog(null,"K debe ser mayor a 0","error",JOptionPane.ERROR_MESSAGE);
     t2.setText("");     
    } 
        
    else
    {

    if(g<=0)
    {
     JOptionPane.showMessageDialog(null,"G debe ser mayor a 0","error",JOptionPane.ERROR_MESSAGE);
     t3.setText("");     
    }     
    
    else
    {
     
     for(int j=0; j<g; j++)
      {
       m*=num;
       System.out.println(m);
      }
      
      int cantidad=m/4;
      
      a=5+(8*k); 
            
     for(int i=0; i<cantidad; i++)
     {  
      numero=(a*x)%m;
      
      String n1=String.valueOf(numero);
      x=Integer.parseInt(n1);

      
   v=new int[cantidad];
   r=new double[cantidad];
   v[i]=x;
   r[i]=(v[i]*1.0)/(m-1);   
   sale+="x"+(i+1)+":  "+v[i]+"\n";
 
   String err=String.valueOf(r[i]);
   String yo=String.format("%.5f", r[i]);
   erre+="r"+(i+1)+":  "+yo+"\n";     
     
     }      
     }
    }
    }
    }
     
     a1.setText(sale);
     a2.setText(erre);
     
    }
    
    catch(java.lang.NumberFormatException e)
    {
     JOptionPane.showMessageDialog(null,"Dato invalido","error",JOptionPane.ERROR_MESSAGE);
     t1.setText("");
     t2.setText("");
     t3.setText("");


    }
     
    }
      
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if(evt.getSource()==b1)
   {
    t1.setText("");
    t2.setText("");
    t3.setText("");
    a1.setText("");
    a2.setText("");
       m=1;
       num=2; }
        
     if(sale != null && erre != null)
     {
      sale="";
      erre="";
     }
     
     if(v != null && r != null)
     {
      for(int l=0; l<cantidad; l++)
      {
       v=null;
       r=null;
      
      }
     }


    }//GEN-LAST:event_b1ActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        // TODO add your handling code here:
        INICIO ini = new INICIO();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inicioActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Comprobacion comp = new Comprobacion();
        comp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void creditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditosActionPerformed
        // TODO add your handling code here:
        Creditos cred = new Creditos(this, rootPaneCheckingEnabled);
        cred.setVisible(true);
    }//GEN-LAST:event_creditosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Metodo Met = new Metodo();
        Met.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void inicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio1ActionPerformed
        // TODO add your handling code here:
        INICIO ini = new INICIO();
        ini.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_inicio1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Comprobacion comp = new Comprobacion();
        comp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void creditos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditos1ActionPerformed
        // TODO add your handling code here:
        Creditos cred = new Creditos(this, rootPaneCheckingEnabled);
        cred.setVisible(true);
    }//GEN-LAST:event_creditos1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Metodo Met = new Metodo();
        Met.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    public static void main(String args[]) {
       new Metodo();

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MAYUDA;
    private javax.swing.JMenu MAYUDA1;
    private javax.swing.JMenu MInicio;
    private javax.swing.JMenu MInicio1;
    private javax.swing.JMenu MMetodo;
    private javax.swing.JMenu MMetodo1;
    private javax.swing.JMenu MPruebas;
    private javax.swing.JMenu MPruebas1;
    private javax.swing.JTextArea a1;
    private javax.swing.JTextArea a2;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JMenuItem creditos;
    private javax.swing.JMenuItem creditos1;
    private javax.swing.JMenuItem inicio;
    private javax.swing.JMenuItem inicio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}

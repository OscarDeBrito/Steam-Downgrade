/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interface_grafica;

import Controle.ImagemDAO;
import Controle.ManipularImagem;
import static interface_grafica.Tela_Perfil2.perfil;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;
import teste.Imagem;
import teste.Jogo;


/**
 *
 * @author gustavofbs
 */
public class Tela_Biblioteca extends javax.swing.JFrame {
    public static ArrayList<Jogo> listabiblioteca = new ArrayList<Jogo>();

    /**
     * Creates new form Tela_Biblioteca
     */
    public Tela_Biblioteca() {
        initComponents();
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2 - getHeight()/2);
        
        if(perfil.isEmpty()){
        
        }else{
            jLabel1.setText(perfil.get(0).getNome());
        }
        
        if(listabiblioteca.isEmpty()){
        
        }else{
            
            verificaimg1(listabiblioteca.get(0).getId());
        }
        
        if(verifica(1)){
        verificaimg2(listabiblioteca.get(1).getId());
            
        }
        
        if(verifica(2)){
        verificaimg3(listabiblioteca.get(2).getId());
        }
        
        if(verifica(3)){
        verificaimg4(listabiblioteca.get(3).getId());
        }
        
        if(verifica(4)){
         verificaimg5(listabiblioteca.get(4).getId());
        }
        
        if(verifica(5)){
         verificaimg6(listabiblioteca.get(5).getId());
        }
        
        if(verifica(6)){
        verificaimg7(listabiblioteca.get(6).getId());
        }
        
        if(verifica(7)){
        verificaimg8(listabiblioteca.get(7).getId());
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel32 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        imgj1 = new javax.swing.JLabel();
        imgj2 = new javax.swing.JLabel();
        imgj3 = new javax.swing.JLabel();
        imgj4 = new javax.swing.JLabel();
        imgj5 = new javax.swing.JLabel();
        imgj6 = new javax.swing.JLabel();
        imgj7 = new javax.swing.JLabel();
        imgj8 = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/avatardefault_92824.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome do usuário");

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        imgj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgj1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        imgj1.setMaximumSize(new java.awt.Dimension(150, 150));
        imgj1.setMinimumSize(new java.awt.Dimension(150, 150));
        imgj1.setName(""); // NOI18N
        imgj1.setPreferredSize(new java.awt.Dimension(150, 150));

        imgj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgj2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        imgj2.setMaximumSize(new java.awt.Dimension(150, 150));
        imgj2.setMinimumSize(new java.awt.Dimension(150, 150));
        imgj2.setName(""); // NOI18N
        imgj2.setPreferredSize(new java.awt.Dimension(150, 150));

        imgj3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgj3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        imgj3.setMaximumSize(new java.awt.Dimension(150, 150));
        imgj3.setMinimumSize(new java.awt.Dimension(150, 150));
        imgj3.setName(""); // NOI18N
        imgj3.setPreferredSize(new java.awt.Dimension(150, 150));

        imgj4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgj4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        imgj4.setMaximumSize(new java.awt.Dimension(150, 150));
        imgj4.setMinimumSize(new java.awt.Dimension(150, 150));
        imgj4.setName(""); // NOI18N
        imgj4.setPreferredSize(new java.awt.Dimension(150, 150));

        imgj5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgj5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        imgj5.setMaximumSize(new java.awt.Dimension(150, 150));
        imgj5.setMinimumSize(new java.awt.Dimension(150, 150));
        imgj5.setName(""); // NOI18N
        imgj5.setPreferredSize(new java.awt.Dimension(150, 150));

        imgj6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgj6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        imgj6.setMaximumSize(new java.awt.Dimension(150, 150));
        imgj6.setMinimumSize(new java.awt.Dimension(150, 150));
        imgj6.setName(""); // NOI18N
        imgj6.setPreferredSize(new java.awt.Dimension(150, 150));

        imgj7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgj7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        imgj7.setMaximumSize(new java.awt.Dimension(150, 150));
        imgj7.setMinimumSize(new java.awt.Dimension(150, 150));
        imgj7.setName(""); // NOI18N
        imgj7.setPreferredSize(new java.awt.Dimension(150, 150));

        imgj8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgj8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        imgj8.setMaximumSize(new java.awt.Dimension(150, 150));
        imgj8.setMinimumSize(new java.awt.Dimension(150, 150));
        imgj8.setName(""); // NOI18N
        imgj8.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imgj5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(imgj6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(imgj7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(imgj8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imgj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(imgj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(imgj3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(imgj4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgj2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgj3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgj4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imgj6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgj5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgj7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgj8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jDesktopPane1.setLayer(jLabel32, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnVoltar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel32)
                    .addComponent(jLabel1)
                    .addComponent(btnVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        Tela_Loja2 x = new Tela_Loja2();
        this.dispose();
        x.setVisible(true);
    }//GEN-LAST:event_btnVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Biblioteca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Biblioteca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JLabel imgj1;
    private javax.swing.JLabel imgj2;
    private javax.swing.JLabel imgj3;
    private javax.swing.JLabel imgj4;
    private javax.swing.JLabel imgj5;
    private javax.swing.JLabel imgj6;
    private javax.swing.JLabel imgj7;
    private javax.swing.JLabel imgj8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
  
private boolean verifica(int x){
    if(listabiblioteca.size()>x){
        return true;
    }else{
        return false;
    }
}

private void verificaimg1(int idx){
    if(idx == 1){
        int id = 1;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj1); 
    }
    if(idx == 2){
        int id = 2;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj1); 
    }
    
    if(idx == 3){
        int id = 3;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj1); 
    }
    if(idx == 4){
        int id = 4;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj1); 
    }
   if(idx == 5){
        int id = 5;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj1); 
    }
   if(idx == 6){
        int id = 6;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj1); 
    }
   if(idx == 7){
        int id = 7;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj1); 
    }
   if(idx == 8){
        int id = 8;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj1); 
    }
    
}

private void verificaimg2(int idx){
    if(idx == 1){
        int id = 1;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj2); 
    }
    if(idx == 2){
        int id = 2;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj2); 
    }
    
    if(idx == 3){
        int id = 3;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj2); 
    }
    if(idx == 4){
        int id = 4;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj2); 
    }
   if(idx == 5){
        int id = 5;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj2); 
    }
   if(idx == 6){
        int id = 6;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj2); 
    }
   if(idx == 7){
        int id = 7;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj2); 
    }
   if(idx == 8){
        int id = 8;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj2); 
    }
    
}

private void verificaimg3(int idx){
    if(idx == 1){
        int id = 1;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj3); 
    }
    if(idx == 2){
        int id = 2;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj3); 
    }
    
    if(idx == 3){
        int id = 3;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj3); 
    }
    if(idx == 4){
        int id = 4;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj3); 
    }
   if(idx == 5){
        int id = 5;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj3); 
    }
   if(idx == 6){
        int id = 6;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj3); 
    }
   if(idx == 7){
        int id = 7;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj3); 
    }
   if(idx == 8){
        int id = 8;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj3); 
    }
    
}

private void verificaimg4(int idx){
    if(idx == 1){
        int id = 1;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj4); 
    }
    if(idx == 2){
        int id = 2;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj4); 
    }
    
    if(idx == 3){
        int id = 3;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj4); 
    }
    if(idx == 4){
        int id = 4;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj4); 
    }
   if(idx == 5){
        int id = 5;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj4); 
    }
   if(idx == 6){
        int id = 6;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj4); 
    }
   if(idx == 7){
        int id = 7;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj4); 
    }
   if(idx == 8){
        int id = 8;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj4); 
    }
    
}

private void verificaimg5(int idx){
    if(idx == 1){
        int id = 1;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj5); 
    }
    if(idx == 2){
        int id = 2;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj5); 
    }
    
    if(idx == 3){
        int id = 3;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj5); 
    }
    if(idx == 4){
        int id = 4;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj5); 
    }
   if(idx == 5){
        int id = 5;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj5); 
    }
   if(idx == 6){
        int id = 6;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj5); 
    }
   if(idx == 7){
        int id = 7;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj5); 
    }
   if(idx == 8){
        int id = 8;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj5); 
    }
    
}

private void verificaimg6(int idx){
    if(idx == 1){
        int id = 1;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj6); 
    }
    if(idx == 2){
        int id = 2;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj6); 
    }
    
    if(idx == 3){
        int id = 3;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj6); 
    }
    if(idx == 4){
        int id = 4;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj6); 
    }
   if(idx == 5){
        int id = 5;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj6); 
    }
   if(idx == 6){
        int id = 6;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj6); 
    }
   if(idx == 7){
        int id = 7;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj6); 
    }
   if(idx == 8){
        int id = 8;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj6); 
    }
    
}

private void verificaimg7(int idx){
    if(idx == 1){
        int id = 1;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj7); 
    }
    if(idx == 2){
        int id = 2;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj7); 
    }
    
    if(idx == 3){
        int id = 3;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj7); 
    }
    if(idx == 4){
        int id = 4;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj7); 
    }
   if(idx == 5){
        int id = 5;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj7); 
    }
   if(idx == 6){
        int id = 6;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj7); 
    }
   if(idx == 7){
        int id = 7;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj7); 
    }
   if(idx == 8){
        int id = 8;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj7); 
    }
    
}

private void verificaimg8(int idx){
    if(idx == 1){
        int id = 1;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj8); 
    }
    if(idx == 2){
        int id = 2;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj8); 
    }
    
    if(idx == 3){
        int id = 3;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj8); 
    }
    if(idx == 4){
        int id = 4;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj8); 
    }
   if(idx == 5){
        int id = 5;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj8); 
    }
   if(idx == 6){
        int id = 6;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj8); 
    }
   if(idx == 7){
        int id = 7;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj8); 
    }
   if(idx == 8){
        int id = 8;
        ImagemDAO dao = new ImagemDAO();
        Imagem exe = dao.buscar(id);
        ManipularImagem.exibiImagemLabel(exe.getImagem(), imgj8); 
    }
    
}

}

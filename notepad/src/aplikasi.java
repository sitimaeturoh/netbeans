
import java.awt.FileDialog;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaySM
 */
public class aplikasi extends javax.swing.JFrame {
public class Aplikasi extends javax.swing.JFrame {
    String file, view, fn, dir;
    String nameApp="Aplikasi";
    int format=0;
    private String line;
    /**
     * Creates new form aplikasi
     */
    public Aplikasi() {
        initComponents();
        //U/Full Screen
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }
    //Pengaturan Word Wrap
    private void getWordWrap(int w){
        if(w==1){
            TextArea.setLineWrap(true);
        }else{
            TextArea.setLineWrap(false);
        }
    
    }
    //Pengaturan File Baru
    private void getNewFile(){
        if (TextArea.getText().equals("")||TextArea.getText().equals(view)){
            TextArea.setFont(new Font("Monospaced", 0, 14));
            setTitle("Untitled - notepad");
        }else{
            int i = JOptionPane.showConfirmDialog(null,"Jangan lupa simpan dahulu gan ?");
            if(i == 0) {
                getSaveFile();
            }else if(i == 1){
                TextArea.setText("");
                TextArea.setFont(new Font("Monospaced", 0, 14));
                setTitle("Untitled - AR Notepad");
            }else if(i == 2)
                return;
        }
    }
  //Pengaturan Buka File
    private void getOpenFile(){
        FileDialog fd = new FileDialog(Aplikasi.this, "Simpan File", FileDialog.LOAD);
        fd.show();
        if (fd.getFile() != null) {
            file = fd.getDirectory() + fd.getFile();
            setTitle(file);
            readFile();
        }
        TextArea.requestFocus();
    }
     
    //Pengaturan Baca File
    private void readFile() {
        BufferedReader data;
        StringBuilder sb = new StringBuilder();
        try {
            data = new BufferedReader(new FileReader(file));
            String line;
            while ((line = data.readLine()) != null) {
                sb.append(line).append("\n");
            }
            TextArea.setText(sb.toString());
            data.close();
        } 
            catch (IOException ioe) {
        }
    }
    
    //Pengaturan Simpan File
    private void getSaveFile(){  
       FileDialog fd = new FileDialog(Aplikasi.this, "Save", FileDialog.SAVE);
        fd.show();
        if (fd.getFile() != null) {
            fn = fd.getFile();
            dir = fd.getDirectory(); 
            file = dir + fn  + ".txt";
            setTitle(file);
        try{
            DataOutputStream data = new DataOutputStream(new FileOutputStream(file));
            line = TextArea.getText();
            BufferedReader buffer = new BufferedReader(new StringReader(line));
            while ((line = buffer.readLine()) != null) {
                data.writeBytes(line + "\r\n");
                data.close();
            }
        }catch (Exception err){
        }
      }
   }
    
    private void getSaveAsFile(){
        FileDialog fd = new FileDialog(Aplikasi.this, "Save As", FileDialog.SAVE);
        fd.show();
        if (fd.getFile() != null) {
            fn = fd.getFile();
            dir = fd.getDirectory(); 
            file = dir + fn  + ".txt";  
            setTitle(file);
        try {
            DataOutputStream data = new DataOutputStream(new FileOutputStream(file));
            line = TextArea.getText();
            BufferedReader buffer = new BufferedReader(new StringReader(line));
            while ((line = buffer.readLine()) != null) {
                data.writeBytes(line + "\r\n");
                data.close();
            }
        } catch (Exception e){
            TextArea.requestFocus();
        }
      }
  }
    
    //Pengaturan Jenis Huruf
    public void getFont(int font){
        switch (font){
            case 1 :
                TextArea.setFont(new Font ("Lucida Console ",Font.PLAIN, 14));
                break;
            case 2 : 
                TextArea.setFont(new Font ("Arial",Font.PLAIN, 14));
                break;
            case 3 : 
                TextArea.setFont(new Font ("Times New Roman",Font.PLAIN, 14));
                break;
            case 4 :
                TextArea.setFont(new Font ("Monospaced",Font.PLAIN, 14));
                break;
            case 5 :
                TextArea.setFont(new Font ("Courier Now",Font.PLAIN, 14));
                break;
            case 6 :
                TextArea.setFont(new Font ("Tahoma",Font.PLAIN, 14));
                break;
            case 7 :
                TextArea.setFont(new Font ("Kartika",Font.PLAIN, 14));
                break;
        }
    }
    
    //Pengaturan Gaya Huruf
   
    public void getFontStyle(int fontStyle){
        switch (fontStyle){
        case 1:
            TextArea.setFont(new Font(TextArea.getName(),Font.PLAIN, 14));
            break;
        case 2:
            TextArea.setFont(new Font(TextArea.getName(),Font.ITALIC, 14));
            break;
        case 3:
            TextArea.setFont(new Font(TextArea.getName(),Font.BOLD, 14));
            break;
        case 4:
            TextArea.setFont(new Font(TextArea.getName(),3,14));
            break;
        }
    }
         
    //Pengaturan Ukuran Huruf
    public void getFontSize(int fontSize){
        switch (fontSize){
            case 1:
                //TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),Font.BOLD));
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),10));
                break;
            case 2:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),12));
                break;
            case 3:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),14));
                break;
            case 4:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),16));
                break;
            case 5:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),18));
                break;
            case 6:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),20));
                break;
            case 7:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),22));
                break;
            case 8:
                TextArea.setFont(new Font(TextArea.getFont().getName(),TextArea.getFont().getStyle(),24));
        }
        
    }
    
    //Text Color
    public void getTextColor(){
        Color c = JColorChooser.showDialog(null,"Text Color",TextArea.getForeground());
        TextArea.setForeground(c);
    }
    
    //Konfirmasi keluar
    public void getExit(){
        int confirm =JOptionPane.showConfirmDialog(this,"Anda yakin mau keluar dr aplikasi ini?","Keluar Aplikasi",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION){
            System.exit(0);
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

        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuNewActionPerformed = new javax.swing.JMenuItem();
        jMenuOpenActionPerformed = new javax.swing.JMenuItem();
        jMenuSaveActionPerformed = new javax.swing.JMenuItem();
        jMenuSaveAsActionPerformed = new javax.swing.JMenuItem();
        jMenuExitActionPerformed = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuTextColorActionPerformed = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        jMenuNewActionPerformed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuNewActionPerformed.setText("New");
        jMenuNewActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNewActionPerformedActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuNewActionPerformed);

        jMenuOpenActionPerformed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuOpenActionPerformed.setText("Open");
        jMenuOpenActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuOpenActionPerformedActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuOpenActionPerformed);

        jMenuSaveActionPerformed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuSaveActionPerformed.setText("Save");
        jMenuSaveActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSaveActionPerformedActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSaveActionPerformed);

        jMenuSaveAsActionPerformed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuSaveAsActionPerformed.setText("Save As");
        jMenuSaveAsActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSaveAsActionPerformedActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSaveAsActionPerformed);

        jMenuExitActionPerformed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuExitActionPerformed.setText("Exit");
        jMenuExitActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExitActionPerformedActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuExitActionPerformed);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Format");

        jMenuTextColorActionPerformed.setText("Text Color");
        jMenuTextColorActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTextColorActionPerformedActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuTextColorActionPerformed);

        jMenu4.setText("Word Wrap");

        jMenuItem1.setText("Yes");
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("No");
        jMenu4.add(jMenuItem2);

        jMenu2.add(jMenu4);

        jMenu6.setText("Font");

        jMenuItem3.setText("Lucida Console");
        jMenu6.add(jMenuItem3);

        jMenuItem5.setText("Arial");
        jMenu6.add(jMenuItem5);

        jMenuItem8.setText("Times New Roman");
        jMenu6.add(jMenuItem8);

        jMenuItem6.setText("Mono Spaced");
        jMenu6.add(jMenuItem6);

        jMenuItem10.setText("Courier New");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Tohama");
        jMenu6.add(jMenuItem11);

        jMenuItem9.setText("Kartika");
        jMenu6.add(jMenuItem9);

        jMenu2.add(jMenu6);

        jMenu5.setText("Font Style");

        jMenuItem13.setText("Plain");
        jMenu5.add(jMenuItem13);

        jMenuItem12.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jMenuItem12.setText("Italic");
        jMenu5.add(jMenuItem12);

        jMenuItem14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuItem14.setText("Bold");
        jMenu5.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuItem15.setText("Bold Italic");
        jMenu5.add(jMenuItem15);

        jMenu2.add(jMenu5);

        jMenu3.setText("Size");

        jMenuItem16.setText("10");
        jMenu3.add(jMenuItem16);

        jMenuItem18.setText("12");
        jMenu3.add(jMenuItem18);

        jMenuItem22.setText("14");
        jMenu3.add(jMenuItem22);

        jMenuItem23.setText("16");
        jMenu3.add(jMenuItem23);

        jMenuItem20.setText("18");
        jMenu3.add(jMenuItem20);

        jMenuItem21.setText("20");
        jMenu3.add(jMenuItem21);

        jMenuItem17.setText("22");
        jMenu3.add(jMenuItem17);

        jMenuItem19.setText("24");
        jMenu3.add(jMenuItem19);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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

    private void jMenuNewActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNewActionPerformedActionPerformed
        // TODO add your handling code here:
        getNewFile();
    }//GEN-LAST:event_jMenuNewActionPerformedActionPerformed

    private void jMenuOpenActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuOpenActionPerformedActionPerformed
        // TODO add your handling code here:
        getOpenFile();
    }//GEN-LAST:event_jMenuOpenActionPerformedActionPerformed

    private void jMenuSaveActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSaveActionPerformedActionPerformed
        // TODO add your handling code here:
        getSaveFile();
    }//GEN-LAST:event_jMenuSaveActionPerformedActionPerformed

    private void jMenuSaveAsActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSaveAsActionPerformedActionPerformed
        // TODO add your handling code here:
        getSaveAsFile();
    }//GEN-LAST:event_jMenuSaveAsActionPerformedActionPerformed

    private void jMenuExitActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExitActionPerformedActionPerformed
        // TODO add your handling code here:
        getExitFile();
    }//GEN-LAST:event_jMenuExitActionPerformedActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuTextColorActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTextColorActionPerformedActionPerformed
        // TODO add your handling code here:
        getTextColor();
    }//GEN-LAST:event_jMenuTextColorActionPerformedActionPerformed

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
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuExitActionPerformed;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuNewActionPerformed;
    private javax.swing.JMenuItem jMenuOpenActionPerformed;
    private javax.swing.JMenuItem jMenuSaveActionPerformed;
    private javax.swing.JMenuItem jMenuSaveAsActionPerformed;
    private javax.swing.JMenuItem jMenuTextColorActionPerformed;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

        private void getExitFile() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad1;
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

/**
 *
 * @author MaySM
 */
public class notepad extends javax.swing.JFrame {
    String file, view, fn, dir;
    String nameApp="Aplikasi";
    int format=0;
    private String line;

    /**
     * Creates new form Aplikasi
     */
    public notepad() {
        super(" Notepad");
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
            setTitle("Untitled - Notepad1");
        }else{
            int i = JOptionPane.showConfirmDialog(null,"Jangan lupa simpan dahulu ");
            if(i == 0) {
                getSaveFile();
            }else if(i == 1){
                TextArea.setText("");
                TextArea.setFont(new Font("Monospaced", 0, 14));
                setTitle("Untitled - Notepad1");
            }else if(i == 2)
                return;
        }
    }
    
    //Pengaturan Buka File
    private void getOpenFile(){
        FileDialog fd = new FileDialog(notepad.this, "Simpan File", FileDialog.LOAD);
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
       FileDialog fd = new FileDialog(notepad.this, "Save", FileDialog.SAVE);
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
        FileDialog fd = new FileDialog(notepad.this, "Save As", FileDialog.SAVE);
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
        int confirm =JOptionPane.showConfirmDialog(this,"Anda yakin ingin keluar dara aplikasi ini?","Keluar Aplikasi",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuNewActionPerformed = new javax.swing.JMenuItem();
        jMenuOpenActionPerformed = new javax.swing.JMenuItem();
        jMenuSaveActionPerformed = new javax.swing.JMenuItem();
        jMenuSaveAsActionPerformed = new javax.swing.JMenuItem();
        jMenuExutActionPerformed = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuYes = new javax.swing.JMenuItem();
        jMenuNo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuLucidaConsole = new javax.swing.JMenuItem();
        jMenuArial = new javax.swing.JMenuItem();
        jMenuTimesNewRoman = new javax.swing.JMenuItem();
        jMenuMonoSpaced = new javax.swing.JMenuItem();
        jMenuCourierNew = new javax.swing.JMenuItem();
        jMenuTohama = new javax.swing.JMenuItem();
        jMenuKartika = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuPlain = new javax.swing.JMenuItem();
        jMenuItalic = new javax.swing.JMenuItem();
        jMenuBold = new javax.swing.JMenuItem();
        jMenuBoldItalic = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenuItem();
        jMenu16 = new javax.swing.JMenuItem();
        jMenu18 = new javax.swing.JMenuItem();
        jMenu20 = new javax.swing.JMenuItem();
        jMenu22 = new javax.swing.JMenuItem();
        jMenu24 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuPembuat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane3.setViewportView(TextArea);

        jScrollPane2.setViewportView(jScrollPane3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
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

        jMenuExutActionPerformed.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuExutActionPerformed.setText("Exit");
        jMenuExutActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuExutActionPerformedActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuExutActionPerformed);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Format");

        jMenuItem6.setText("Text Color");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenu3.setText("Word Wrap");

        jMenuYes.setText("Yes");
        jMenuYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuYesActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuYes);

        jMenuNo.setText("No");
        jMenuNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNoActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuNo);

        jMenu2.add(jMenu3);

        jMenu4.setText("Font");

        jMenuLucidaConsole.setText("Lucida Console");
        jMenuLucidaConsole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLucidaConsoleActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuLucidaConsole);

        jMenuArial.setText("Arial");
        jMenuArial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArialActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuArial);

        jMenuTimesNewRoman.setText("Times New Roman");
        jMenuTimesNewRoman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTimesNewRomanActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuTimesNewRoman);

        jMenuMonoSpaced.setText("Mono Spaced");
        jMenuMonoSpaced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMonoSpacedActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuMonoSpaced);

        jMenuCourierNew.setText("Courier New");
        jMenuCourierNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCourierNewActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuCourierNew);

        jMenuTohama.setText("Tahoma");
        jMenuTohama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuTohamaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuTohama);

        jMenuKartika.setText("Kartika");
        jMenuKartika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuKartikaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuKartika);

        jMenu2.add(jMenu4);

        jMenu6.setText("Font Style");

        jMenuPlain.setText("Plain");
        jMenuPlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPlainActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuPlain);

        jMenuItalic.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jMenuItalic.setText("Italic");
        jMenuItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItalicActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItalic);

        jMenuBold.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBold.setText("Bold");
        jMenuBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBoldActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuBold);

        jMenuBoldItalic.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jMenuBoldItalic.setText("Bold Italic");
        jMenuBoldItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBoldItalicActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuBoldItalic);

        jMenu2.add(jMenu6);

        jMenu5.setText("Size");

        jMenu10.setText("10");
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu10);

        jMenu12.setText("12");
        jMenu12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu12);

        jMenu14.setText("14");
        jMenu14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu14ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu14);

        jMenu16.setText("16");
        jMenu16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu16);

        jMenu18.setText("18");
        jMenu18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu18);

        jMenu20.setText("20");
        jMenu20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu20);

        jMenu22.setText("22");
        jMenu22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu22ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu22);

        jMenu24.setText("24");
        jMenu24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu24ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenu24);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("About");

        jMenuPembuat.setText("Pembuat");
        jMenuPembuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPembuatActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuPembuat);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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

    private void jMenuExutActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuExutActionPerformedActionPerformed
        // TODO add your handling code here:
        getExitFile();
    }//GEN-LAST:event_jMenuExutActionPerformedActionPerformed

    private void jMenuPembuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPembuatActionPerformed
        // TODO add your handling code here:
        Tentang a = new Tentang();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuPembuatActionPerformed

    private void jMenuYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuYesActionPerformed
        // TODO add your handling code here:
        getWordWrap(1);
    }//GEN-LAST:event_jMenuYesActionPerformed

    private void jMenuNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNoActionPerformed
        // TODO add your handling code here:
        getWordWrap(2);
    }//GEN-LAST:event_jMenuNoActionPerformed

    private void jMenuLucidaConsoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLucidaConsoleActionPerformed
        // TODO add your handling code here:
        getFont(1);
    }//GEN-LAST:event_jMenuLucidaConsoleActionPerformed

    private void jMenuArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArialActionPerformed
        // TODO add your handling code here:
        getFont(2);
    }//GEN-LAST:event_jMenuArialActionPerformed

    private void jMenuTimesNewRomanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTimesNewRomanActionPerformed
        // TODO add your handling code here:
        getFont(3);
    }//GEN-LAST:event_jMenuTimesNewRomanActionPerformed

    private void jMenuMonoSpacedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMonoSpacedActionPerformed
        // TODO add your handling code here:
        getFont(4);
    }//GEN-LAST:event_jMenuMonoSpacedActionPerformed

    private void jMenuCourierNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCourierNewActionPerformed
        // TODO add your handling code here:
        getFont(5);
    }//GEN-LAST:event_jMenuCourierNewActionPerformed

    private void jMenuTohamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuTohamaActionPerformed
        // TODO add your handling code here:
        getFont(6);
    }//GEN-LAST:event_jMenuTohamaActionPerformed

    private void jMenuKartikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuKartikaActionPerformed
        // TODO add your handling code here:
        getFont(7);
    }//GEN-LAST:event_jMenuKartikaActionPerformed

    private void jMenuPlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPlainActionPerformed
        // TODO add your handling code here:
        getFontStyle(1);
    }//GEN-LAST:event_jMenuPlainActionPerformed

    private void jMenuItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItalicActionPerformed
        // TODO add your handling code here:
        getFontStyle(2);
    }//GEN-LAST:event_jMenuItalicActionPerformed

    private void jMenuBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBoldActionPerformed
        // TODO add your handling code here:
        getFontStyle(3);
    }//GEN-LAST:event_jMenuBoldActionPerformed

    private void jMenuBoldItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBoldItalicActionPerformed
        // TODO add your handling code here:
        getFontStyle(4);
    }//GEN-LAST:event_jMenuBoldItalicActionPerformed

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed
        // TODO add your handling code here:
         getFontSize(1);
    }//GEN-LAST:event_jMenu10ActionPerformed

    private void jMenu12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu12ActionPerformed
        // TODO add your handling code here:
         getFontSize(2);
    }//GEN-LAST:event_jMenu12ActionPerformed

    private void jMenu14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu14ActionPerformed
        // TODO add your handling code here:
         getFontSize(3);
    }//GEN-LAST:event_jMenu14ActionPerformed

    private void jMenu16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu16ActionPerformed
        // TODO add your handling code here:
         getFontSize(4);
    }//GEN-LAST:event_jMenu16ActionPerformed

    private void jMenu18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu18ActionPerformed
        // TODO add your handling code here:
         getFontSize(5);
    }//GEN-LAST:event_jMenu18ActionPerformed

    private void jMenu20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu20ActionPerformed
        // TODO add your handling code here:
         getFontSize(6);
    }//GEN-LAST:event_jMenu20ActionPerformed

    private void jMenu22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu22ActionPerformed
        // TODO add your handling code here:
         getFontSize(7);
    }//GEN-LAST:event_jMenu22ActionPerformed

    private void jMenu24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu24ActionPerformed
        // TODO add your handling code here:
         getFontSize(8);
    }//GEN-LAST:event_jMenu24ActionPerformed

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
            java.util.logging.Logger.getLogger(notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenu10;
    private javax.swing.JMenuItem jMenu12;
    private javax.swing.JMenuItem jMenu14;
    private javax.swing.JMenuItem jMenu16;
    private javax.swing.JMenuItem jMenu18;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenu20;
    private javax.swing.JMenuItem jMenu22;
    private javax.swing.JMenuItem jMenu24;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuItem jMenuArial;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBold;
    private javax.swing.JMenuItem jMenuBoldItalic;
    private javax.swing.JMenuItem jMenuCourierNew;
    private javax.swing.JMenuItem jMenuExutActionPerformed;
    private javax.swing.JMenuItem jMenuItalic;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuKartika;
    private javax.swing.JMenuItem jMenuLucidaConsole;
    private javax.swing.JMenuItem jMenuMonoSpaced;
    private javax.swing.JMenuItem jMenuNewActionPerformed;
    private javax.swing.JMenuItem jMenuNo;
    private javax.swing.JMenuItem jMenuOpenActionPerformed;
    private javax.swing.JMenuItem jMenuPembuat;
    private javax.swing.JMenuItem jMenuPlain;
    private javax.swing.JMenuItem jMenuSaveActionPerformed;
    private javax.swing.JMenuItem jMenuSaveAsActionPerformed;
    private javax.swing.JMenuItem jMenuTimesNewRoman;
    private javax.swing.JMenuItem jMenuTohama;
    private javax.swing.JMenuItem jMenuYes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void getExitFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

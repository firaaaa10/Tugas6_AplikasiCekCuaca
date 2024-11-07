/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author ssiti
 */
public class PenghitungKataFrame extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungKataFrame
     */
    public PenghitungKataFrame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaInputKata = new javax.swing.JTextArea();
        btnHitung = new javax.swing.JButton();
        jlabel3 = new javax.swing.JLabel();
        jumlahkata = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TextFieldCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jumlahkemunculankata = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jumlahkarakter = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jumlahkalimat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jumlahparagraf = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tugas 5", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 3, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Aplikasi Penghitung Kata");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Masukkan Teks :");

        jScrollPane1.setBackground(new java.awt.Color(204, 153, 255));

        textAreaInputKata.setBackground(new java.awt.Color(102, 102, 255));
        textAreaInputKata.setColumns(30);
        textAreaInputKata.setForeground(new java.awt.Color(255, 255, 255));
        textAreaInputKata.setRows(10);
        jScrollPane1.setViewportView(textAreaInputKata);

        btnHitung.setBackground(new java.awt.Color(102, 102, 255));
        btnHitung.setText("Hitung Kata");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        jlabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlabel3.setForeground(new java.awt.Color(255, 255, 255));
        jlabel3.setText("Jumlah Kata       :");

        jumlahkata.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jumlahkata.setForeground(new java.awt.Color(255, 255, 255));

        btnSimpan.setBackground(new java.awt.Color(153, 153, 255));
        btnSimpan.setText("Simpan File");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pencarian Kata :");

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jumlah Kemunculan Kata :");

        jumlahkemunculankata.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jumlahkemunculankata.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jumlah karakter :");

        jumlahkarakter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jumlahkarakter.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Jumlah Kalimat   :");

        jumlahkalimat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jumlahkalimat.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jumlah Paragraf :");

        jumlahparagraf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jumlahparagraf.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setText("Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(54, 54, 54))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSimpan)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(TextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(btnHitung)
                                            .addGap(41, 41, 41)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jlabel3)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jumlahkata))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jumlahkarakter)))
                                            .addGap(36, 36, 36)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jumlahkalimat))
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jumlahparagraf))))
                                        .addComponent(btnCari)))
                                .addGap(84, 84, 84))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(319, 319, 319))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(47, 47, 47)
                                .addComponent(jumlahkemunculankata)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHitung)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlabel3)
                            .addComponent(jumlahkata)
                            .addComponent(jLabel4)
                            .addComponent(jumlahkalimat))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jumlahkarakter)
                            .addComponent(jLabel7)
                            .addComponent(jumlahparagraf))
                        .addGap(18, 18, 18)))
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(TextFieldCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jumlahkemunculankata))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCari)
                            .addComponent(jLabel6))))
                .addGap(20, 20, 20)
                .addComponent(btnSimpan)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnHapus))
                .addContainerGap(230, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
    // Tambahkan ActionListener pada tombol "Hitung"
    btnHitung.addActionListener((ActionEvent e) -> {
        hitungText(); // Memanggil metode countText() ketika tombol ditekan
    });
    
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
    // Add ActionListener to search button
        btnCari.addActionListener((ActionEvent e) -> {
            CariKata();
        });
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    // Add ActionListener to save button
        btnSimpan.addActionListener((ActionEvent e) -> {
            SimpanFile();
        });
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
    btnHapus.addActionListener((ActionEvent e) -> {
        textAreaInputKata.setText("");  // Mengosongkan JTextArea
        // Mereset label hasil perhitungan
        jumlahkata.setText("0");
        jumlahkarakter.setText("0");
        jumlahkalimat.setText("0");
        jumlahparagraf.setText("0");
        jumlahkemunculankata.setText("0");
        TextFieldCari.setText(""); // Mengosongkan JTextField untuk pencarian kata
    });

    }//GEN-LAST:event_btnHapusActionPerformed

    // Method to count words, characters, sentences, and paragraphs
    private void hitungText() {
        String text = textAreaInputKata.getText();

        // Hitung jumlah kata
        int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;

        // Hitung jumlah karakter
        int charCount = text.length();

        // Hitung jumlah kalimat menggunakan pemisah .!? untuk mengenali akhir kalimat
        int sentenceCount = text.isEmpty() ? 0 : text.split("[.!?]").length;

        // Hitung jumlah paragraf berdasarkan garis baru ganda sebagai pemisah
        int paragraphCount = text.isEmpty() ? 0 : text.split("\\n+").length;

        // Update JLabel dengan hasil perhitungan
        jumlahkata.setText("" + wordCount);
        jumlahkarakter.setText("" + charCount);
        jumlahkalimat.setText("" + sentenceCount);
        jumlahparagraf.setText("" + paragraphCount);
        
    }
    
    // Method to search a specific word
    private void CariKata() {
        String text = textAreaInputKata.getText();
        String searchWord = TextFieldCari.getText();
        int count = 0;

        if (!searchWord.isEmpty()) {
            String[] words = text.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(searchWord)) {
                    count++;
                }
            }
        }
        
        jumlahkemunculankata.setText(" " + count);
    }

     // Method to save the text and results to a file
    private void SimpanFile() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan Hasil Penghitungan");
    int userSelection = fileChooser.showSaveDialog(this);
    
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try (FileWriter writer = new FileWriter(fileChooser.getSelectedFile())) {
       
            writer.write("Teks:\n" + textAreaInputKata.getText() + "\n\n");
            writer.write("Jumlah Kata: " + jumlahkata.getText() + "\n");
            writer.write("Jumlah Karakter: " + jumlahkarakter.getText() + "\n");
            writer.write("Jumlah Kalimat: " + jumlahkalimat.getText() + "\n");
            writer.write("Jumlah Paragraf: " + jumlahparagraf.getText() + "\n");
            writer.write("Pencarian Kata '" + TextFieldCari.getText() + "': " + jumlahkemunculankata.getText() + "\n");
            JOptionPane.showMessageDialog(this, "Hasil berhasil disimpan ke hasil_penghitungan.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan file: " + e.getMessage());
        }
        }
    }
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
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungKataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldCari;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel jumlahkalimat;
    private javax.swing.JLabel jumlahkarakter;
    private javax.swing.JLabel jumlahkata;
    private javax.swing.JLabel jumlahkemunculankata;
    private javax.swing.JLabel jumlahparagraf;
    private javax.swing.JTextArea textAreaInputKata;
    // End of variables declaration//GEN-END:variables
}
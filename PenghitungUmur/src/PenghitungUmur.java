/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
/**
 *
 * @author Zhar
 */
public class PenghitungUmur extends javax.swing.JFrame {
    private  final PenghitungUmurHelper helper;
    private volatile boolean stopFetching = false;
private Thread peristiwaThread;
    /**
     * Creates new form PenghitungUmur
     */
    public PenghitungUmur() {
        initComponents();
        helper = new PenghitungUmurHelper();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tgllahir = new com.toedter.calendar.JDateChooser();
        txtumur = new javax.swing.JTextField();
        txtulangtahun = new javax.swing.JTextField();
        btnhitung = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtsejarah = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penghitung Umur");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Swis721 Hv BT", 1, 12)); // NOI18N
        jLabel1.setText("Pilih Tanggal Lahir");

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        jLabel2.setText("Umur Anda");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel3.setText("Hari Ulang Tahun Berikutnya");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel4.setText("Aplikasi Penghitung Umur");

        tgllahir.setBackground(new java.awt.Color(204, 204, 204));
        tgllahir.setDateFormatString("dd MM yyyy");
        tgllahir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tgllahirPropertyChange(evt);
            }
        });

        btnhitung.setText("Hitung Umur");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });

        btnkeluar.setText("Keluar");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        txtsejarah.setColumns(20);
        txtsejarah.setRows(20);
        jScrollPane1.setViewportView(txtsejarah);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtulangtahun, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnhitung)
                                .addGap(18, 18, 18)
                                .addComponent(btnkeluar))
                            .addComponent(txtumur, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(315, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtumur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtulangtahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhitung)
                    .addComponent(btnkeluar))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(69, 69, 69))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
      Date tanggalLahir = tgllahir.getDate();
    if (tanggalLahir != null) {
    // Menghitung umur dan hari ulang tahun berikutnya
    LocalDate lahir = tanggalLahir.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    LocalDate sekarang = LocalDate.now();
    String umur = helper.hitungUmurDetail(lahir, sekarang);
    txtumur.setText(umur);
    // Menghitung tanggal ulang tahun berikutnya
    LocalDate ulangTahunBerikutnya = helper.hariUlangTahunBerikutnya(lahir, sekarang);
    String hariUlangTahunBerikutnya = helper.getDayOfWeekInIndonesian(ulangTahunBerikutnya);
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
String tanggalUlangTahunBerikutnya = ulangTahunBerikutnya.format(formatter);
txtulangtahun.setText(hariUlangTahunBerikutnya + " (" + tanggalUlangTahunBerikutnya + ")");

// Set stop flag untuk thread sebelumnya
stopFetching = true;
if (peristiwaThread != null && peristiwaThread.isAlive()) {
    peristiwaThread.interrupt(); // Beri sinyal ke thread untuk berhenti
}

// Reset flag untuk thread baru
stopFetching = false;

// Mendapatkan peristiwa penting secara asinkron
peristiwaThread = new Thread(() -> {
    try {
        txtsejarah.setText("Tunggu, sedang mengambil data...\n");
        helper.getPeristiwaBarisPerBaris(ulangTahunBerikutnya,
txtsejarah, () -> stopFetching);
        if (!stopFetching) {
            javax.swing.SwingUtilities.invokeLater(() ->
txtsejarah.append("Selesai mengambil data peristiwa"));
        }
    } catch (Exception e) {
        if (Thread.currentThread().isInterrupted()) {
            javax.swing.SwingUtilities.invokeLater(() ->
txtsejarah.setText("Pengambilan data dibatalkan.\n"));
        }

    }
});
peristiwaThread.start();

        }
    }//GEN-LAST:event_btnhitungActionPerformed
    
    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
     System.exit(0);
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void tgllahirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tgllahirPropertyChange
    txtumur.setText("");
    txtulangtahun.setText("");
    // Hentikan thread yang sedang berjalan saat tanggal lahir berubah
stopFetching = true;
if (peristiwaThread != null && peristiwaThread.isAlive()) {
    peristiwaThread.interrupt();
}
txtsejarah.setText("");
    }//GEN-LAST:event_tgllahirPropertyChange

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
            java.util.logging.Logger.getLogger(PenghitungUmur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungUmur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungUmur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser tgllahir;
    private javax.swing.JTextArea txtsejarah;
    private javax.swing.JTextField txtulangtahun;
    private javax.swing.JTextField txtumur;
    // End of variables declaration//GEN-END:variables
}

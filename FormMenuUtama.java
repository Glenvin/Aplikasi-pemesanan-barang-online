package aplikasipenjualan;

import java.awt.BorderLayout;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import login.loginFrame;
import method.dataForAllFrame;

import panel.dataBarang.panelBarang;
import panel.supplier.panelSupplier;
import panel.transkasiPenjualan.panelTransaksiPenjualan;

public class FormMenuUtama extends dataForAllFrame {
    public FormMenuUtama() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    private void setContent(JPanel content) {
        getContentPane().setLayout(new BorderLayout());
        getContentPane().removeAll();
        add(content);
        content.setVisible(true);
        SwingUtilities.updateComponentTreeUI(this);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        mmm = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        mn = new javax.swing.JMenu();
        menuBarang = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenuItem();
        menuSupplier = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Judul");
        setMinimumSize(new java.awt.Dimension(1370, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mmm.setText("EXIT");

        menuLogout.setText("Logout");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        mmm.add(menuLogout);

        jMenuBar1.add(mmm);

        mn.setText("Data");

        menuBarang.setText("Barang");
        menuBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarangActionPerformed(evt);
            }
        });
        mn.add(menuBarang);

        menuTransaksi.setText("Transaksi");
        menuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiActionPerformed(evt);
            }
        });
        mn.add(menuTransaksi);

        menuSupplier.setText("Supplier");
        menuSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSupplierActionPerformed(evt);
            }
        });

        mn.add(menuSupplier);

        jMenuBar1.add(mn);
        jMenuBar1.add(jMenu4);
        setJMenuBar(jMenuBar1);

        pack();
    }

    private void menuBarangActionPerformed(java.awt.event.ActionEvent evt) {
        setContent(new panelBarang());
    }

    private void menuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {
        setContent(new panelTransaksiPenjualan());
    }

    private void menuSupplierActionPerformed(java.awt.event.ActionEvent evt) {
        setContent(new panelSupplier());
    }

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new loginFrame().setVisible(true);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }

        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenuUtama().setVisible(true);
            }
        });
    }

    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem menuBarang;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuSupplier;
    private javax.swing.JMenuItem menuTransaksi;
    private javax.swing.JMenu mmm;
    private javax.swing.JMenu mn;
}

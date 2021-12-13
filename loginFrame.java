package login;

import aplikasipenjualan.FormMenuUtama;
import javax.swing.JOptionPane;
import registrasi.registrasiFrame;

public class loginFrame extends javax.swing.JFrame {
    public loginFrame() {
        initComponents();
    }

    private void initComponents() {
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        keluar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 170, -1));

        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        btnLogin.setText("Login");
        btnRegister.setText("Register");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        }
        );
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        }
        );
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));
        jPanel1.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 160, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 170, -1));

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });

        jPanel1.add(keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 110));

        jLabel6.setIcon(new javax.swing.ImageIcon("D:\\Untar\\SEMESTER 3\\OBP\\UAS\\Project UAS Aplikasi pemesanan barang online\\Picture\\-Render-_Yuna12222.png"));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }

    loginModel loginModel = new loginModel();
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {
        String uname = txtUsername.getText();
        String pass = txtPassword.getText();
        
        if(uname.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Lengkapi field yang ada");
        }

        else {
            if(loginModel.isUsernameAndPasswordEquals(uname, pass)) {
                new FormMenuUtama().setVisible(true);
                this.setVisible(false);
            }

            else {
                JOptionPane.showMessageDialog(null, "USERNAME & PASSWORD SALAH SILAKAN KOREKSI LAGI!!!!!!");
            }
        }
    }
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        new registrasiFrame().setVisible(true);
        this.setVisible(false);   
    }
    

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        dispose();
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton keluar;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
}

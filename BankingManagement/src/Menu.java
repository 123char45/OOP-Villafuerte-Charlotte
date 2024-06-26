import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    
    public static Menu Inst;
    public static double accountOne = 500.00;
    public static double accountTwo = 500.00;
    public static HashMap<String, Double> accounts = new HashMap<>();
    
    static{
        accounts.put("12345", accountOne);
        accounts.put("98765", accountTwo);
    }
    
     public Menu() {
        initComponents();
        Inst = this;
        
        WithAmount.setEditable(true);
        dAmount.setEditable(true);
    }
    
    public void setBalanceAccountOne(double Balanceone) {
        this.accountOne = Balanceone;
    }
    
    public void setBalanceAccountTwo(double Balancetwo) {
        this.accountTwo = Balancetwo;
    }

/**
     * Creates new form Menu
     */
    //private final double balance = 1000; // initial balance
        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jAccNum = new javax.swing.JLabel();
        jBalance = new javax.swing.JLabel();
        jBwd = new javax.swing.JButton();
        jBdep = new javax.swing.JButton();
        jBtrans = new javax.swing.JButton();
        bExit = new javax.swing.JButton();
        bView = new javax.swing.JButton();
        AccountNumber = new javax.swing.JLabel();
        jLbalance = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        blankPanel = new javax.swing.JPanel();
        ViewPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AccInfo = new javax.swing.JTextArea();
        WithdrawPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bEnter = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        WithAmount = new javax.swing.JTextField();
        DepositPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dAccNum = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dAmount = new javax.swing.JTextField();
        dEnter = new javax.swing.JButton();
        dClear = new javax.swing.JButton();
        TransferPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        tAccNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tAmount = new javax.swing.JTextField();
        tEnter = new javax.swing.JButton();
        tClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        jPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome!!");

        jAccNum.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jAccNum.setText("Account Number: ");

        jBalance.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jBalance.setText("Balance:");

        jBwd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBwd.setText("Withdraw");
        jBwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBwdActionPerformed(evt);
            }
        });

        jBdep.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBdep.setText("Deposit");
        jBdep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBdepActionPerformed(evt);
            }
        });

        jBtrans.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBtrans.setText("Transfer");
        jBtrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtransActionPerformed(evt);
            }
        });

        bExit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bExit.setText("Exit");
        bExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bExitActionPerformed(evt);
            }
        });

        bView.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bView.setText("View Accounts");
        bView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewActionPerformed(evt);
            }
        });

        AccountNumber.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        jLbalance.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bView)
                                            .addComponent(jBdep, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBwd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jBtrans, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(31, 31, 31))
                                    .addGroup(jPanelLayout.createSequentialGroup()
                                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jAccNum)
                                            .addComponent(jBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(bExit, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addComponent(jAccNum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLbalance, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBwd)
                    .addComponent(bView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtrans)
                    .addComponent(jBdep))
                .addGap(27, 27, 27)
                .addComponent(bExit)
                .addGap(23, 23, 23))
        );

        MainPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        MainPanel.setLayout(new java.awt.CardLayout(20, 20));

        blankPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout blankPanelLayout = new javax.swing.GroupLayout(blankPanel);
        blankPanel.setLayout(blankPanelLayout);
        blankPanelLayout.setHorizontalGroup(
            blankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );
        blankPanelLayout.setVerticalGroup(
            blankPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
        );

        MainPanel.add(blankPanel, "card4");

        ViewPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        AccInfo.setColumns(20);
        AccInfo.setRows(5);
        jScrollPane1.setViewportView(AccInfo);

        javax.swing.GroupLayout ViewPanelLayout = new javax.swing.GroupLayout(ViewPanel);
        ViewPanel.setLayout(ViewPanelLayout);
        ViewPanelLayout.setHorizontalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        ViewPanelLayout.setVerticalGroup(
            ViewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        MainPanel.add(ViewPanel, "card6");

        WithdrawPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Withdraw", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 36))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setText("Amount:");

        bEnter.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        bEnter.setText("Enter");
        bEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnterActionPerformed(evt);
            }
        });

        bClear.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });

        WithAmount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout WithdrawPanelLayout = new javax.swing.GroupLayout(WithdrawPanel);
        WithdrawPanel.setLayout(WithdrawPanelLayout);
        WithdrawPanelLayout.setHorizontalGroup(
            WithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(WithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(WithdrawPanelLayout.createSequentialGroup()
                        .addComponent(bClear)
                        .addGap(169, 169, 169)
                        .addComponent(bEnter))
                    .addComponent(WithAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        WithdrawPanelLayout.setVerticalGroup(
            WithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addComponent(WithAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(WithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bClear)
                    .addComponent(bEnter))
                .addGap(83, 83, 83))
        );

        MainPanel.add(WithdrawPanel, "card2");

        DepositPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deposit", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 24))); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setText("Account Number:");

        dAccNum.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        dAccNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dAccNumActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Amount:");

        dAmount.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        dEnter.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        dEnter.setText("Enter ");
        dEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dEnterActionPerformed(evt);
            }
        });

        dClear.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        dClear.setText("Clear");
        dClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DepositPanelLayout = new javax.swing.GroupLayout(DepositPanel);
        DepositPanel.setLayout(DepositPanelLayout);
        DepositPanelLayout.setHorizontalGroup(
            DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositPanelLayout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepositPanelLayout.createSequentialGroup()
                        .addComponent(dClear)
                        .addGap(190, 190, 190)
                        .addComponent(dEnter))
                    .addComponent(jLabel4)
                    .addComponent(dAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(25, 25, 25))
        );
        DepositPanelLayout.setVerticalGroup(
            DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(dAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(dAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dEnter)
                    .addComponent(dClear))
                .addGap(55, 55, 55))
        );

        MainPanel.add(DepositPanel, "card3");

        TransferPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transfer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 24))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel5.setText("Account Number:");

        tAccNum.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        tAccNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tAccNumActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel6.setText("Amount:");

        tAmount.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N

        tEnter.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        tEnter.setText("Enter");
        tEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tEnterActionPerformed(evt);
            }
        });

        tClear.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        tClear.setText("Clear");
        tClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TransferPanelLayout = new javax.swing.GroupLayout(TransferPanel);
        TransferPanel.setLayout(TransferPanelLayout);
        TransferPanelLayout.setHorizontalGroup(
            TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TransferPanelLayout.createSequentialGroup()
                        .addComponent(tClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(tEnter))
                    .addComponent(tAmount)
                    .addComponent(jLabel5)
                    .addComponent(tAccNum, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        TransferPanelLayout.setVerticalGroup(
            TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TransferPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tAccNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(TransferPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tClear)
                    .addComponent(tEnter))
                .addGap(51, 51, 51))
        );

        MainPanel.add(TransferPanel, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBwdActionPerformed
        // TODO add your handling code here:
        MainPanel.removeAll();
        MainPanel.add(WithdrawPanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_jBwdActionPerformed

    private void bExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bExitActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close this system?", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_bExitActionPerformed

    private void jBtransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtransActionPerformed
        // TODO add your handling code here:
        MainPanel.removeAll();
        MainPanel.add(TransferPanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_jBtransActionPerformed

    private void jBdepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBdepActionPerformed
        // TODO add your handling code here:
        MainPanel.removeAll();
        MainPanel.add(DepositPanel);
        MainPanel.repaint();
        MainPanel.revalidate();
    }//GEN-LAST:event_jBdepActionPerformed

    private void bEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnterActionPerformed
        // TODO add your handling code here:
        try {
            double withdrawAmount = Double.parseDouble(WithAmount.getText());
            
            if (withdrawAmount < 100) {
                JOptionPane.showMessageDialog(null, "Cannot withdraw an amount below 100", "", JOptionPane.ERROR_MESSAGE);
            } else {
                String accountNumber = AccountNumber.getText();
                
                if (Menu.accounts.containsKey(accountNumber)) {
                    double currentBalance = Menu.accounts.get(accountNumber);
                    
                    if (withdrawAmount > currentBalance) {
                        JOptionPane.showMessageDialog(null, "Cannot withdraw because you do not have enough balance in your account", "", JOptionPane.ERROR_MESSAGE);
                    } else {
                        double newBalance = currentBalance - withdrawAmount;
                        Menu.accounts.put(accountNumber, newBalance);
                        jLbalance.setText(Double.toString(newBalance));
                        
                        JOptionPane.showMessageDialog(null, "Withdrawal successful with the amount of $" + withdrawAmount);
                        JOptionPane.showMessageDialog(null, "New balance of your current account is $" + newBalance);
                        WithAmount.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid account number please check the account number and try again.","",JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Invalid input. Please enter a valid number.", "", JOptionPane.ERROR_MESSAGE);
            WithAmount.setText("");
        }
    }//GEN-LAST:event_bEnterActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        WithAmount.setText("");
    }//GEN-LAST:event_bClearActionPerformed

    private void dAccNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dAccNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dAccNumActionPerformed

    private void tClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tClearActionPerformed
        // TODO add your handling code here:
        tAmount.setText("");
        tAccNum.setText("");
    }//GEN-LAST:event_tClearActionPerformed

    private void tAccNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tAccNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tAccNumActionPerformed

    private void tEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tEnterActionPerformed
        // TODO add your handling code here:
        try {
            double transferAmount = Double.parseDouble(tAmount.getText());
            String sourceAccountNumber = AccountNumber.getText();
            String destinationAccountNumber = tAccNum.getText();
            
            if (destinationAccountNumber.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill out the transfer account number", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (sourceAccountNumber.equals(destinationAccountNumber)) {
                JOptionPane.showMessageDialog(null, "Cannot transfer to the same account", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (transferAmount < 100) {
                JOptionPane.showMessageDialog(null, "Cannot transfer an amount below 100", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            boolean sourceIsAccountOne = sourceAccountNumber.equals("12345");
            boolean sourceIsAccountTwo = sourceAccountNumber.equals("98765");
            boolean destinationIsAccountOne = destinationAccountNumber.equals("12345");
            boolean destinationIsAccountTwo = destinationAccountNumber.equals("98765");
            
            if (!(sourceIsAccountOne || sourceIsAccountTwo)) {
                JOptionPane.showMessageDialog(null, "Invalid source account number", "", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (!(destinationIsAccountOne || destinationIsAccountTwo)) {
                JOptionPane.showMessageDialog(null, "Invalid destination account number","", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            double sourceAccountBalance = accounts.get(sourceAccountNumber);
            double destinationAccountBalance = accounts.get(destinationAccountNumber);
            
            if (transferAmount > sourceAccountBalance) {
                JOptionPane.showMessageDialog(null, "Cannot transfer because you do not have enough balance in your account", "", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            sourceAccountBalance -= transferAmount;
            destinationAccountBalance += transferAmount;
            
            accounts.put(sourceAccountNumber, sourceAccountBalance);
            accounts.put(destinationAccountNumber, destinationAccountBalance);
            
            jLbalance.setText(Double.toString(sourceAccountBalance));
            
            JOptionPane.showMessageDialog(null, "Transfer successful with the amount of $" + transferAmount);
            JOptionPane.showMessageDialog(null, "New balance of your current account is $" + sourceAccountBalance);
            tAmount.setText("");
            tAccNum.setText("");
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input please enter a valid number.", "", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_tEnterActionPerformed

    private void dEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dEnterActionPerformed
        // TODO add your handling code here
        try {
            double depositAmount = Double.parseDouble(dAmount.getText());
            
            if (depositAmount < 100) {
                JOptionPane.showMessageDialog(null, "Cannot deposit an amount below 100", "", JOptionPane.ERROR_MESSAGE);
            } else {
                String accountNumber = AccountNumber.getText();
                
                if (Menu.accounts.containsKey(accountNumber)) {
                    double currentBalance = Menu.accounts.get(accountNumber);
                    double newBalance = currentBalance + depositAmount;
                    Menu.accounts.put(accountNumber, newBalance); 
                    
                    jLbalance.setText(Double.toString(newBalance));
                    JOptionPane.showMessageDialog(null, "Deposit successful with the amount of $" + depositAmount);
                    JOptionPane.showMessageDialog(null, "New balance of your current account is $" + newBalance);
                    dAmount.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid account number please check the account number and try again.", "", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Invalid input. Please enter a valid number.", "", JOptionPane.ERROR_MESSAGE);
            dAmount.setText("");
        }
    }//GEN-LAST:event_dEnterActionPerformed

    private void dClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dClearActionPerformed
        // TODO add your handling code here:
        dAmount.setText("");
        dAccNum.setText("");
    }//GEN-LAST:event_dClearActionPerformed

    private void bViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewActionPerformed
        // TODO add your handling code here:
        MainPanel.removeAll();
        MainPanel.add(ViewPanel);
        MainPanel.repaint();
        MainPanel.revalidate();    
        
        
        StringBuilder output = new StringBuilder("Account Details\n\n");
        for (Map.Entry<String, Double> entry : accounts.entrySet()) {
            output.append("Account Number: \n" ).append(entry.getKey()).append("\nBalance: $").append(entry.getValue()).append("\n\n");
        }
        AccInfo.setText(output.toString());
    }//GEN-LAST:event_bViewActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AccInfo;
    public static javax.swing.JLabel AccountNumber;
    private javax.swing.JPanel DepositPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel TransferPanel;
    private javax.swing.JPanel ViewPanel;
    private javax.swing.JTextField WithAmount;
    private javax.swing.JPanel WithdrawPanel;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bEnter;
    private javax.swing.JButton bExit;
    private javax.swing.JButton bView;
    private javax.swing.JPanel blankPanel;
    private javax.swing.JTextField dAccNum;
    private javax.swing.JTextField dAmount;
    private javax.swing.JButton dClear;
    private javax.swing.JButton dEnter;
    private javax.swing.JLabel jAccNum;
    private javax.swing.JLabel jBalance;
    private javax.swing.JButton jBdep;
    private javax.swing.JButton jBtrans;
    private javax.swing.JButton jBwd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLbalance;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tAccNum;
    private javax.swing.JTextField tAmount;
    private javax.swing.JButton tClear;
    private javax.swing.JButton tEnter;
    // End of variables declaration//GEN-END:variables
}

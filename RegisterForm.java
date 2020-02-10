/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.login.register;

/**
 *
 * @author mayank
 */
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
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

        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_FN = new javax.swing.JTextField();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jButton_CANCEL = new javax.swing.JButton();
        jButton_Register_ = new javax.swing.JButton();
        jLabelRegister = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField_LN = new javax.swing.JTextField();
        jTextField_SN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_UN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPasswordField_REPASS = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox_DEP = new javax.swing.JComboBox();
        jComboBox_SEM = new javax.swing.JComboBox();
        jTextField_RN = new javax.swing.JTextField();

        jLabel10.setText("DEPARTMENT");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 38, 19));

        jLabelMin.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 48)); // NOI18N
        jLabel1.setText("REGISTRATION");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addGap(34, 34, 34)
                .addComponent(jLabelClose)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelClose))
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 229, 27));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Password:");

        jTextField_FN.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jTextField_FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FNActionPerformed(evt);
            }
        });

        jPasswordField_PASS.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jPasswordField_PASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_PASSActionPerformed(evt);
            }
        });

        jButton_CANCEL.setBackground(new java.awt.Color(0, 181, 204));
        jButton_CANCEL.setText("Cancel");
        jButton_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCELActionPerformed(evt);
            }
        });

        jButton_Register_.setBackground(new java.awt.Color(0, 230, 64));
        jButton_Register_.setText("Register");
        jButton_Register_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Register_MouseClicked(evt);
            }
        });
        jButton_Register_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Register_ActionPerformed(evt);
            }
        });

        jLabelRegister.setText("Click here to login");
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Second Name:");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Username:");

        jTextField_LN.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jTextField_LN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_LNActionPerformed(evt);
            }
        });

        jTextField_SN.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jTextField_SN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SNActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Last Name:");

        jTextField_UN.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jTextField_UN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_UNActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setText("Retype Password:");

        jPasswordField_REPASS.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jPasswordField_REPASS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_REPASSActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Roll Number:");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setText("Department:");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Semester:");

        jComboBox_DEP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computer Science Engineering", "Mechanical Engineering", "Electronics & Communication Engineering", "Electrical Engineering", "Civil Engineering", "Instrumentation & Control Engineering", "Chemical Engineering" }));
        jComboBox_DEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_DEPActionPerformed(evt);
            }
        });

        jComboBox_SEM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "4", "6" }));
        jComboBox_SEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_SEMActionPerformed(evt);
            }
        });

        jTextField_RN.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jTextField_RN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_RNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jButton_Register_, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jTextField_FN)
                                .addGap(39, 39, 39))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabelRegister)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(jTextField_SN, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2))
                                    .addGap(44, 44, 44)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPasswordField_PASS)
                                        .addComponent(jTextField_UN)
                                        .addComponent(jPasswordField_REPASS, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                                        .addComponent(jTextField_RN, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel3))
                                    .addGap(80, 80, 80)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox_DEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox_SEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 39, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_SN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_REPASS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_RN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox_DEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox_SEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Register_, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelRegister)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(601, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 62, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jTextField_FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FNActionPerformed

    private void jButton_Register_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Register_ActionPerformed
        String fname=jTextField_FN.getText();
        String sname=jTextField_SN.getText();
        String lname=jTextField_LN.getText();
        String uname=jTextField_UN.getText();
        String pass=String.valueOf(jPasswordField_PASS.getPassword());
        String re_pass=String.valueOf(jPasswordField_REPASS.getPassword());
        String r_no=jTextField_RN.getText();
        String dep=jComboBox_DEP.getSelectedItem().toString();
        String sem=jComboBox_SEM.getSelectedItem().toString();
        
        if(uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add a Username");
        }
        
        else if(pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add a Password");
        }
        
        else if(!pass.equals(re_pass))
        {
            JOptionPane.showMessageDialog(null, "Retype Password Again!!");
        }
        
        else if(checkUsername(uname))
        {
            JOptionPane.showMessageDialog(null, "This Username is already registered");
        }
        
        else
        {
        PreparedStatement ps,ps1,ps2,ps3;
        ResultSet rs,rs1=null;
        String query="INSERT INTO `Registrations`(`f_name`, `s_name`, `l_name`, `username`, `password`, `Roll_no`, `Department`, `Semester`) VALUES (?,?,?,?,?,?,?,?)";
        String query1="SELECT * FROM `Registrations` WHERE `Roll_no`=?";
        String query2="INSERT INTO `Masking`(`Roll_No`, `Exam_No`) VALUES (?,?)";
        String query3="INSERT INTO `Block_Seating`(`roll_no`,`block`, `exam_hall`, `seat`) VALUES (?,?,?,?)";
        
        try {
            ps=MyConnection.getConnection().prepareStatement(query);
            ps1=MyConnection.getConnection().prepareStatement(query1);
            ps2=MyConnection.getConnection().prepareStatement(query2);
            ps3=MyConnection.getConnection().prepareStatement(query3);
            
            ps.setString(1, fname);
            ps.setString(2, sname);
            ps.setString(3, lname);
            ps.setString(4, uname);
            ps.setString(5, pass);
            ps.setString(6, r_no);
            ps.setString(7, dep);
            ps.setString(8, sem);
            if(ps.executeUpdate() > 0)
            {
                JOptionPane.showMessageDialog(null, "Thank You For Registration");
            }
//            ps.getConnection().commit();

            ps1.setString(1, r_no);
            rs=ps1.executeQuery();
            if(rs.next())
            {
		int digits=0,i=rs.getInt("s_no");
                int id=i;
		while(i!=0)
		{
			i=i/10;
			digits++;
		}
		char rn[]=r_no.toCharArray();
		StringBuffer bf=new StringBuffer();
		bf.append(sem);
		if(rn[3]=='C' && rn[4]=='E')
			bf.append('A');
		if(rn[3]=='M' && rn[4]=='E')
			bf.append('B');
		if(rn[3]=='E' && rn[4]=='C')
			bf.append('C');
		if(rn[3]=='E' && rn[4]=='E')
			bf.append('D');
		if(rn[3]=='C' && rn[4]=='L')
			bf.append('E');
		if(rn[3]=='I' && rn[4]=='C')
			bf.append('F');
                if(rn[3]=='C' && rn[4]=='H')
			bf.append('G');
		for(int j=1;j<=(3-digits);j++)
			bf.append(0);
		bf.append(id);
		String A=bf.toString();
                
                ps2.setString(1, r_no);
                ps2.setString(2, A);
                ps2.executeUpdate();
//                ps2.getConnection().commit();
                rs1=ps1.executeQuery();
                
            }
            if(rs1.next())
            {
                String S=r_no;
		String Seat=new String();
		char ch[]=S.toCharArray();
		char eh[]=new char[3];
		char block='\0';
		if(ch[3]=='C' && ch[4]=='E')
			block='A';
		else if((ch[3]=='M' && ch[4]=='E') || (ch[3]=='E' && ch[4]=='C'))
			block='B';
		else if((ch[3]=='E' && ch[4]=='E') || (ch[3]=='C' && ch[4]=='L'))
			block='C';
		else if((ch[3]=='I' && ch[4]=='C') || (ch[3]=='C' && ch[4]=='H'))
			block='D';
		if(ch[1]=='8')
			eh[0]='1';
		else if(ch[1]=='7')
			eh[0]='2';
		else if(ch[1]=='6')
			eh[0]='3';
		int a=(ch[5]-'0')*100+(ch[6]-'0')*10+(ch[7]-'0');
		eh[1]='0';
		if(ch[3]=='C' && ch[4]=='E')
		{
			int c=a/48;
			if(a%48!=0)
				c++;
			int r=a%6;
			if(a%6==0)
				r=6;
			Seat=c+"th"+" column "+r+"th"+" seat";
			int k=a%48;
			if(a%48==0)
				k=48;
			int room=k/6;
			if(k%6!=0)
				room++;
			eh[2]=(char)(room+'0');
		}
		else if(ch[3]=='M' && ch[4]=='E')
		{
			int c=a/24;
			if(a%24!=0)
				c++;
			int r=a%6;
			if(a%6==0)
				r=6;
			Seat=c+"th"+" column "+r+"th"+" seat";
			int k=a%24;
			if(a%24==0)
				k=24;
			int room=k/6;
			if(k%6!=0)
				room++;
			eh[2]=(char)(room+'0');
		}
		else if(ch[3]=='E' && ch[4]=='C')
		{
			int c=a/24;
			if(a%24!=0)
				c++;
			int r=a%6;
			if(a%6==0)
				r=6;
			Seat=c+"th"+" column "+r+"th"+" seat";
			int k=a%24;
			if(a%24==0)
				k=24;
			int room=k/6;
			if(k%6!=0)
				room++;
			eh[2]=(char)(room+4+'0');
		}
		else if(ch[3]=='E' && ch[4]=='E')
		{
			int c=a/24;
			if(a%24!=0)
				c++;
			int r=a%6;
			if(a%6==0)
				r=6;
			Seat=c+"th"+" column "+r+"th"+" seat";
			int k=a%24;
			if(a%24==0)
				k=24;
			int room=k/6;
			if(k%6!=0)
				room++;
			eh[2]=(char)(room+'0');
		}
		else if(ch[3]=='C' && ch[4]=='L')
		{
			int c=a/24;
			if(a%24!=0)
				c++;
			int r=a%6;
			if(a%6==0)
				r=6;
			Seat=c+"th"+" column "+r+"th"+" seat";
			int k=a%24;
			if(a%24==0)
				k=24;
			int room=k/6;
			if(k%6!=0)
				room++;
			eh[2]=(char)(room+4+'0');
		}
		else if(ch[3]=='I' && ch[4]=='C')
		{
			int c=a/24;
			if(a%24!=0)
				c++;
			int r=a%6;
			if(a%6==0)
				r=6;
			Seat=c+"th"+" column "+r+"th"+" seat";
			int k=a%24;
			if(a%24==0)
				k=24;
			int room=k/6;
			if(k%6!=0)
				room++;
			eh[2]=(char)(room+'0');
		}
		else if(ch[3]=='C' && ch[4]=='H')
		{
			int c=a/24;
			if(a%24!=0)
				c++;
			int r=a%6;
			if(a%6==0)
				r=6;
			Seat=c+"th"+" column "+r+"th"+" seat";
			int k=a%24;
			if(a%24==0)
				k=24;
			int room=k/6;
			if(k%6!=0)
				room++;
			eh[2]=(char)(room+4+'0');
		}
		String E=new String(eh);
                String Block=String.valueOf(block);
                ps3.setString(1, r_no);
                ps3.setString(2, Block);
                ps3.setString(3, E);
                ps3.setString(4, Seat);
                ps3.executeUpdate();
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
    }//GEN-LAST:event_jButton_Register_ActionPerformed

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        LoginForm lgf=new LoginForm();
        lgf.setVisible(true);
        lgf.pack();
        lgf.setLocationRelativeTo(null);
        lgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    private void jTextField_LNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_LNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_LNActionPerformed

    private void jTextField_SNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SNActionPerformed

    private void jTextField_UNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_UNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_UNActionPerformed

    private void jPasswordField_PASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_PASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_PASSActionPerformed

    private void jPasswordField_REPASSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_REPASSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_REPASSActionPerformed

    private void jComboBox_DEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_DEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_DEPActionPerformed

    private void jComboBox_SEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_SEMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_SEMActionPerformed

    private void jTextField_RNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_RNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_RNActionPerformed

    private void jButton_Register_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Register_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Register_MouseClicked

    public boolean checkUsername(String username)
    {
        PreparedStatement ps;
        ResultSet rs;
        boolean checkUser=false;
        
        
        String query="SELECT * FROM `Registrations` WHERE `username`=?";
        
        try {
            ps=MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, username);
            
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                checkUser=true;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkUser;
    }
    private void jButton_CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CANCELActionPerformed
                System.exit(0);
    }//GEN-LAST:event_jButton_CANCELActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_CANCEL;
    private javax.swing.JButton jButton_Register_;
    private javax.swing.JComboBox jComboBox_DEP;
    private javax.swing.JComboBox jComboBox_SEM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JPasswordField jPasswordField_REPASS;
    private javax.swing.JTextField jTextField_FN;
    private javax.swing.JTextField jTextField_LN;
    private javax.swing.JTextField jTextField_RN;
    private javax.swing.JTextField jTextField_SN;
    private javax.swing.JTextField jTextField_UN;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo5;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QLKH extends javax.swing.JFrame {

    /**
     * Creates new form QLKH
     */
    // Bước 2 : 
    List<KhachHang> list = new ArrayList<>(); //Khởi tạo List
    int index;
    DefaultTableModel model = new DefaultTableModel();
    
    public QLKH() {
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tbkhachhang.getModel();// Lấy form table
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtsdt = new javax.swing.JTextField();
        btndau = new javax.swing.JButton();
        btntruoc = new javax.swing.JButton();
        btnsau = new javax.swing.JButton();
        btncuoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbkhachhang = new javax.swing.JTable();
        lbcount = new javax.swing.JLabel();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("QLKH");

        jLabel2.setText("ID");

        jLabel3.setText("Tên");

        jLabel4.setText("Ngày Sinh");

        jLabel5.setText("SĐT");

        btndau.setText("|<");
        btndau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndauActionPerformed(evt);
            }
        });

        btntruoc.setText("<<");
        btntruoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntruocActionPerformed(evt);
            }
        });

        btnsau.setText(">>");
        btnsau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsauActionPerformed(evt);
            }
        });

        btncuoi.setText(">|");
        btncuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncuoiActionPerformed(evt);
            }
        });

        tbkhachhang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tên", "Ngày Sinh", "SĐT"
            }
        ));
        tbkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbkhachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbkhachhang);

        btnnew.setText("Làm mới");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btnsave.setText("Lưu");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btndelete.setText("Xóa");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btndau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btntruoc)
                        .addGap(35, 35, 35)
                        .addComponent(lbcount)
                        .addGap(46, 46, 46)
                        .addComponent(btnsau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncuoi))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(70, 70, 70)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnnew)
                                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 2, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnew))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndau)
                    .addComponent(btntruoc)
                    .addComponent(btnsau)
                    .addComponent(btncuoi)
                    .addComponent(lbcount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncuoiActionPerformed
        // TODO add your handling code here:
        try {
                index = list.size()-1;
                show(index);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gap loi:" + e);
            }
    }//GEN-LAST:event_btncuoiActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
        clearform();
        
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        add();          // thêm phần tử vào list
        fillToTable();  // cập nhập list lại vào bảng
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        xoa();          //xóa phần tử 
        fillToTable();  //cập nhật list lại vào bảng
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0); // thoát
    }//GEN-LAST:event_btnExitActionPerformed

    private void btndauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndauActionPerformed
        // TODO add your handling code here:
         try {
                index = 0;
                show(index);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Gap loi:" + e);
            }
    }//GEN-LAST:event_btndauActionPerformed

    private void btntruocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntruocActionPerformed
        // TODO add your handling code here:
        try {
            if (index > 0) {
                index--;
                show(index);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gap loi:" + e);
        }
    }//GEN-LAST:event_btntruocActionPerformed

    private void btnsauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsauActionPerformed
        // TODO add your handling code here:
        try {
            if (index <list.size()-1) {
                index++;
                show(index);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gap loi:" + e);
        }
    }//GEN-LAST:event_btnsauActionPerformed

    private void tbkhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbkhachhangMouseClicked
        // TODO add your handling code here:
       try {
            int row=tbkhachhang.getSelectedRow();//Lay dong dang chon cua Table
            if(row>=0){                          //nếu số hàng >0 thì mới click được
                index=row;
                show(index);
            }
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gap loi:"+e);//nếu không có hàng nào thì show lỗi
        }
    }//GEN-LAST:event_tbkhachhangMouseClicked

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
            java.util.logging.Logger.getLogger(QLKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKH().setVisible(true);
            }
        });
    }
// Bước 3 : tạo các pthuc
    public void clearform(){
        // set tất cả textfield thành trống
        txtID.setText("");
        txtTen.setText("");
        txtNgaySinh.setText("");
        txtsdt.setText("");
    }
    public void add(){
        KhachHang kh = new KhachHang(); //khởi tạo 
        try{
            if(check(txtID.getText())== true){ //dùng phương thức check để so sánh các id đã có trong list
            JOptionPane.showMessageDialog(this, "Trùng ID");
            return;
        }else
            {
                System.out.println("");
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Lỗi");
        }
            try{
               if(txtID.getText().length()==0){ //so sánh độ dài để check lỗi để trống
                   JOptionPane.showMessageDialog(this, "Không để trống ");
                   return;
               }else{
                   kh.setID(txtID.getText());  // set dữ liệu cho ID
               } 
            }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Lỗi");
        }
            try{
               if(txtTen.getText().length()==0){
                   JOptionPane.showMessageDialog(this, "Không để trống ");
                   return;
               }else{
                   kh.setName(txtTen.getText()); // set dữ liệu cho Ten
               } 
            }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Lỗi");
        }
            try{
               if(txtNgaySinh.getText().length()==0){
                   JOptionPane.showMessageDialog(this, "Không để trống ");
                   return;
               }else{
                   kh.setNgaysinh(txtNgaySinh.getText()); //set dữ liệu cho ngày sinh
               } 
            }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Lỗi");
        }
            try{
               if(txtsdt.getText().length()==0){
                   JOptionPane.showMessageDialog(this, "Không để trống ");
                   return;
               }else{
                   kh.setDienthoai(txtsdt.getText()); // set dữ liệu cho dienthoai
               } 
            }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Lỗi");
        }
         list.add(kh); // thêm các dữ liệu vào list
            
    }
    public void fillToTable(){
        model.setRowCount(0);// xoa bang
        for(KhachHang kh : list){
            Object[] row = new 
              Object[]{kh.ID,kh.name,kh.ngaysinh,kh.dienthoai};
            model.addRow(row);
        }
        if(model.getRowCount()>0){
            tbkhachhang.setRowSelectionInterval(0, 0);//Chọn hàng đầu tiên trong bảng
        }
    }
    public void show( int index){
        lbcount.setText("Record: "+ (index + 1) +" of "+ list.size());//Lỗi sai là không đóng mở ngoặc index +, vì nó sẽ hiểu là chỉ số + 1 sẽ thành index1
        txtID.setText(list.get(index).getID());
        txtTen.setText(list.get(index).getName());
        txtNgaySinh.setText(list.get(index).getNgaysinh());
        txtsdt.setText(list.get(index).getDienthoai());
        tbkhachhang.setRowSelectionInterval(index, index);
        
    
    }
    public boolean check(String a){
        boolean check = false;
        for(int i =0;i<list.size();i++){
            if(list.get(i).getID()==txtID.getText()){
                check = true;
            }
        }
        return check;
    }
    public void xoa(){
        int index = tbkhachhang.getSelectedRow(); // lấy vị trí của hàng
        list.remove(index); // xóa phần tử tại vị trí đó
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btncuoi;
    private javax.swing.JButton btndau;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsau;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btntruoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbcount;
    private javax.swing.JTable tbkhachhang;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtsdt;
    // End of variables declaration//GEN-END:variables
}

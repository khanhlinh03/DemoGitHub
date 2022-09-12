package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;
import service.SachService;

public class FormSach extends javax.swing.JFrame {

    private SachService service = new SachService();

    public FormSach() {
        initComponents();
        setLocationRelativeTo(null);
        fillTable();

    }

    public void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbSach.getModel();
        model.setRowCount(0);
        for (Sach s : service.getAll()) {
            Object[] row = new Object[]{
                s.getMa(),
                s.getTen(),
                s.getSoTrang(),
                s.getTrangThai() == 1 ? "Còn" : "Hết"
            };
            model.addRow(row);
        }
    }

    public Sach checkValidate() {
        String ma = txtma.getText();
        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ma is not null");
            return null;
        }
        String ten = txtTen.getText();
        if (ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ten is not null");
            return null;
        }
        String soTrang = txttrang.getText();
        if (soTrang.isEmpty()) {
            JOptionPane.showMessageDialog(this, "So trang is not null");
            return null;
        }
        Integer sotrang = Integer.parseInt(soTrang);
        if (sotrang < 0) {
            JOptionPane.showMessageDialog(this, "So trang is less than 0");
            return null;
        }
        Sach sachInput = new Sach(ma, ten, sotrang, cbxTrangthai.getSelectedItem().toString().equalsIgnoreCase("CÒn") ? 1 : 0);
        return sachInput;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttrang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        sua1 = new javax.swing.JButton();
        cbxTrangthai = new javax.swing.JComboBox<>();
        txtma = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÍ SÁCH");

        jLabel2.setText("Mã sách");

        jLabel3.setText("Tên sách");

        jLabel4.setText("Số trang");

        jLabel5.setText("Trạng thái");

        show.setText("Thêm");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        xoa.setText("Xóa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Số trang", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSach);

        sua1.setText("Exit");
        sua1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sua1ActionPerformed(evt);
            }
        });

        cbxTrangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sua1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txttrang, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(txtma))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(show)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(sua)
                                        .addGap(18, 18, 18)
                                        .addComponent(xoa))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sua1))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(txttrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(show)
                            .addComponent(sua)
                            .addComponent(xoa))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbxTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sua1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sua1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sua1ActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        Sach sachThem = checkValidate();
        if (sachThem == null) {
            return;
        }
        int check = service.them(sachThem);
        if (check == 1) {
            JOptionPane.showMessageDialog(this, "Mã sách đã tồn tại");
        } else if (check == 0) {
            fillTable();
            JOptionPane.showMessageDialog(this, "Thêm thành công");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại");
        }
    }//GEN-LAST:event_showActionPerformed

    private void tbSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachMouseClicked
        int s = tbSach.getSelectedRow();
        String ma = tbSach.getValueAt(s, 0).toString();
        String ten = tbSach.getValueAt(s, 1).toString();
        String soTrang = tbSach.getValueAt(s, 2).toString();
        String trangThai = tbSach.getValueAt(s, 3).toString();
        
        txtma.setText(ma);
        txtTen.setText(ten);
        txttrang.setText(soTrang);
        if(trangThai.equalsIgnoreCase("Còn")){
            cbxTrangthai.setSelectedIndex(0);
        }else{
            cbxTrangthai.setSelectedIndex(1);
        }
    }//GEN-LAST:event_tbSachMouseClicked


    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
           Sach sachUpdate = checkValidate();
           if(sachUpdate == null){
               return;
           }
           int check = service.sua(sachUpdate);
           if(check == 1){
               JOptionPane.showMessageDialog(this, "Mã chưa tồn tại");
           }
           else if(check == 0){
               fillTable();
               JOptionPane.showMessageDialog(this, "Sửa thành công");
           }else{
               JOptionPane.showMessageDialog(this, "Sửa thất bại");
           }
    }//GEN-LAST:event_suaActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        if(tbSach.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn 1 quyển sách để xóa");
            return;
        }
        if(service.xoa(txtma.getText())){
            fillTable();
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        }else{
            JOptionPane.showMessageDialog(this, "Xóa thất bại");
        }
    }//GEN-LAST:event_xoaActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxTrangthai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton show;
    private javax.swing.JButton sua;
    private javax.swing.JButton sua1;
    private javax.swing.JTable tbSach;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txttrang;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}

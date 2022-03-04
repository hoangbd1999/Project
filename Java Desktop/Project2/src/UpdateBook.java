
import dal.DBContext;
import entity.Book;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GL552VW
 */
public class UpdateBook extends javax.swing.JDialog {

    Book book;
    DBContext context = new DBContext();
    /**
     * Creates new form UpdateBook
     */
    public UpdateBook(java.awt.Frame parent, boolean modal,int book_id) {
        super(parent, modal);
        initComponents();
        
        book = context.getBook(book_id);
        txtId.setText(book.getBook_id() +"");
        txtTitle.setText(book.getBook_title());
        txtAuthor.setText(book.getBook_author());
        txtYear.setText(book.getBook_publish_year());           
        CmbCategory.setSelectedItem(book.getBook_category().toString());
        txtKeyword.setText(book.getBook_keyword());
        txtStatus.setText(book.getBook_status()); 
             
      
        
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
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtKeyword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CmbCategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("id:");

        jLabel2.setText("book_title:");

        txtTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitleActionPerformed(evt);
            }
        });

        jLabel3.setText("book_author");

        txtAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAuthorActionPerformed(evt);
            }
        });

        jLabel4.setText("book_publish_year:");

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        BtnSave.setText("Update");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        jLabel7.setText("book_keyword:");

        txtKeyword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeywordActionPerformed(evt);
            }
        });

        jLabel8.setText("book_status:");

        jLabel5.setText("book_category:");

        CmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbCategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnSave)
                .addGap(213, 213, 213))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                        .addComponent(txtAuthor, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtKeyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(BtnSave)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitleActionPerformed

    private void txtAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAuthorActionPerformed

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed

        book.setBook_title(txtTitle.getText());
        book.setBook_author(txtAuthor.getText());
        book.setBook_publish_year(txtYear.getText());
        book.setBook_category(CmbCategory.getSelectedItem().toString());
        book.setBook_keyword(txtKeyword.getText());
        book.setBook_status(txtStatus.getText());
        
        context.update(book);
        this.dispose();
        
        
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void txtKeywordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeywordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKeywordActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
         try
        {
            
            this.setLocationRelativeTo(null);
            
           
            CmbCategory.removeAllItems();
            
            
            String user = "hoang";
            String pass= "Dunglun95";
            String url = "jdbc:sqlserver://DESKTOP-F6LT6C6\\SQLEXPRESS:1433;databaseName=ManagerTypn";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
           Connection con = DriverManager.getConnection(url,user,pass);          
            ResultSet rs;
            
            //fill book category
            PreparedStatement stmt=con.prepareStatement("select * from lib_book_category order by book_category");
            rs = stmt.executeQuery();
            while (rs.next()){
                CmbCategory.addItem(rs.getString(1));
            }
            rs.close();
            
            
            //get book count
           
        }
        catch (Exception e)
        {
            System.err.println(e);
            //System.exit(1);
        }
    }//GEN-LAST:event_formWindowOpened

    private void CmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbCategoryActionPerformed
      
    }//GEN-LAST:event_CmbCategoryActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UpdateBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                UpdateBook dialog = new UpdateBook(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                   @Override
//                   public void windowClosing(java.awt.event.WindowEvent e) {
//                       System.exit(0);
//                   }                });
//               dialog.setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSave;
    private javax.swing.JComboBox<String> CmbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtKeyword;
    private javax.swing.JTextField txtStatus;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
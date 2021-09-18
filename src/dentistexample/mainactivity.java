/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dentistexample;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfCopy;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import java.awt.Canvas;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javafx.scene.control.Cell;
import javafx.scene.control.Tab;
import javafx.scene.layout.Border;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabStop;

/**
 *
 * @author TUF
 */
public class mainactivity extends javax.swing.JFrame {

    /**
     * Creates new form mainactivity
     */
    HashMap<String, String>Treatmentcode=new HashMap<>();
    HashMap<String, String>Tp=new HashMap<>();
    private Object icon;
    void generatemap()
    {
        Tp.put("D201","500,50");
Tp.put("D206","400,40");
Tp.put("D207",",");
Tp.put("D208",",");
Tp.put("D212","4500,1125");
Tp.put("D213","1800,450");
Tp.put("D214","3500,875");
Tp.put("D215","7500,750");
Tp.put("D216","7500,750");
Tp.put("D217","19500,1950");
Tp.put("D218","12500,1250");
Tp.put("D219","4500,450");
Tp.put("D220","7500,750");
Tp.put("D221","4500,450");
Tp.put("D222","2500,250");
Tp.put("D228","7500,750");
Tp.put("D229","19500,1950");
Tp.put("D230","2500,250");
Tp.put("D231","3500,350");
Tp.put("D232","4000,400");
Tp.put("D233","4000,400");
Tp.put("D238","4000,400");
Tp.put("D239","1000,100");
Tp.put("D240","8000,800");
Tp.put("D241","2000,200");
Tp.put("D242","46000,4600");
Tp.put("D243","4800,480");
Tp.put("D244","8000,800");
Tp.put("D250","1600,160");
Tp.put("D251","3000,300");
Tp.put("D252","8000,800");
Tp.put("D253","9500,950");
Tp.put("D254","3500,350");
Tp.put("D260","4500,450");
Tp.put("D261","6500,650");
Tp.put("D262","2500,250");
Tp.put("D263","3200,320");
Tp.put("D264","8000,800");
Tp.put("D270","45000,");
Tp.put("D271","55000,");
Tp.put("D272","4500,450");
Tp.put("D273","5200,520");
Tp.put("D274","15000,1500");
Tp.put("D275","9500,950");
Tp.put("D276","9500,950");
Tp.put("D282","3500,350");
Tp.put("D283","9500,950");
Tp.put("D284","3500,350");
Tp.put("D285","9500,950");
Tp.put("D290","12000,1200");
Tp.put("D291","4500,450");
Tp.put("D296","4500,450");
Tp.put("D287","4500,450");
Tp.put("D301","35000,1750");
        Treatmentcode.put("D201","Consultation & check up");
Treatmentcode.put("D206","Dental Digital Xray (IOPA) Single");
Treatmentcode.put("D207","OPG (RADIOGRAPH) X-RAY");
Treatmentcode.put("D208","Cephalometrics (RADIOGRAPH) X -RAY");
Treatmentcode.put("D212","Composite Restoration (Filling) (Tooth Coloured)");
Treatmentcode.put("D213","GIC Restoration (Filling)");
Treatmentcode.put("D214","Amalgam Restoration (Filling)");
Treatmentcode.put("D215","Stainless Steel Crown");
Treatmentcode.put("D216","Metal Ceramic Crown (Single unit)");
Treatmentcode.put("D217","Metal free Ceramic Crown – Zirkonium (Single unit)");
Treatmentcode.put("D218","Ceramic Veneers (Zirkonium)");
Treatmentcode.put("D219","Post and Core Restoration (Fiber Post)");
Treatmentcode.put("D220","Inlay or Onlay (ceramic)");
Treatmentcode.put("D221","Inlay or Onlay (metal)" );
Treatmentcode.put("D222", "Indirect Pulp capping");
Treatmentcode.put("D228","Metal Ceramic Crown (Single unit) FPD");
Treatmentcode.put("D229","Metal free Ceramic Crown – Zirkonium (Single unit)FPD");
Treatmentcode.put("D230 ","Crown Removal");
Treatmentcode.put("D231","Crown Cementation");
Treatmentcode.put("D232","Bridge Removal");
Treatmentcode.put("D233","Bridge Cementation");
Treatmentcode.put("D238", "RPD (Removal partial denture) one tooth");
Treatmentcode.put("D239","RPD (Removal partial denture) Additional tooth");
Treatmentcode.put("D240","RPD (Cast partial denture) one tooth");
Treatmentcode.put("D241","RPD (Cast partial denture)  Additional tooth");
Treatmentcode.put("D242","Complete denture");
Treatmentcode.put("D243","Complete denture Repair work");
Treatmentcode.put("D244","Removable Partial Denture (RPD/Flexible) per tooth");
Treatmentcode.put("D250","Simple Extraction");
Treatmentcode.put("D251","Surgical Extraction");
Treatmentcode.put("D252", "Impaction Surgery");
Treatmentcode.put("D253","Minor Gum Surgery");
Treatmentcode.put("D254","Operculectomy");
Treatmentcode.put("D260", "Root Canal Treatment – Anterior Teeth");
Treatmentcode.put("D261","Root Canal Treatment – Posterior Teeth");
Treatmentcode.put("D262","Pulpotomy");
Treatmentcode.put("D263","Pulpectomy");
Treatmentcode.put("D264","Re- Root Canal Treatment");
Treatmentcode.put("D270","Orthodontic Treatment (metal)");
Treatmentcode.put("D271","Orthodontic Treatment (ceramic)");
Treatmentcode.put("D272", "Removable retainer (wire)");
Treatmentcode.put("D273","Removable retainer (plastic)");
Treatmentcode.put("D274","Rapid max expansion");
Treatmentcode.put("D275","Space Maintainer");
Treatmentcode.put("D276","Orthodontic fixed Retainer (Upper and Lower)");
Treatmentcode.put("D282", "Scaling polishing (per sitting)");
Treatmentcode.put("D283","Curettage (Composing of 6 teeth)");
Treatmentcode.put("D284","Curettage (for every additional 3 teeth)");
Treatmentcode.put("D285","Fiber Splinting (composing of 6 teeth)");
Treatmentcode.put("D290" ,"Teeth Whitening" );
Treatmentcode.put("D291" ,"Tooth jewellery (per stone or per jewel)");
Treatmentcode.put("D296" , "TMJ splint (single)");
Treatmentcode.put("D287" ,"Night Guard" );
Treatmentcode.put("D301" ,"Dental implant" );
    }
    DefaultTableModel defaultTableModel;
    public mainactivity() {
        initComponents();
        // this.setResizable(false);
          this.setVisible(true);
          defaultTableModel=(DefaultTableModel) table.getModel();
          discountpanel.setVisible(false);
          setIconImage();
          Date datee = new Date();
          SimpleDateFormat DateFor = new SimpleDateFormat("dd-MM-yyyy");
           stringDate= DateFor.format(datee);
        date.setText(stringDate);
       //prefs.put("billno","1");
      // prefs.get("billno","ged");
        String str=prefs.get("billno","def");
        if(str.matches("def"))
        prefs.put("billno","0");
        Billno=Intialbill=prefs.get("billno","def");
        billno.setText("MD "+Billno);
        gstin.setText(gst);
        generatemap();
        System.err.println(""+prefs.get("billno","default"));
    }
   String Intialbill="";
   String stringDate="";
   String Advance="0";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        name = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        address = new javax.swing.JEditorPane();
        jLabel3 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        age = new javax.swing.JEditorPane();
        jScrollPane13 = new javax.swing.JScrollPane();
        AdvanceAmount = new javax.swing.JEditorPane();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        gstin = new javax.swing.JEditorPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        billno = new javax.swing.JEditorPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        date = new javax.swing.JEditorPane();
        jLabel7 = new javax.swing.JLabel();
        paymentmethod = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        refcodeedit = new javax.swing.JEditorPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        treatcode = new javax.swing.JEditorPane();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        discountpanel = new javax.swing.JPanel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        discounteditext = new javax.swing.JEditorPane();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane12.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INVOICE COPY GENERATOR");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 153));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_1.jpg"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jPanel4.setForeground(new java.awt.Color(0, 204, 204));
        jPanel4.setMaximumSize(new java.awt.Dimension(1460, 730));
        jPanel4.setPreferredSize(new java.awt.Dimension(1499, 730));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        name.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        name.setForeground(new java.awt.Color(0, 153, 153));
        name.setAlignmentX(getWidth()-10);
        name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name.setMaximumSize(new java.awt.Dimension(106, 26));
        name.setSelectionColor(new java.awt.Color(0, 153, 153));
        jScrollPane2.setViewportView(name);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Patient Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Address");

        address.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        address.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane3.setViewportView(address);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Gender");

        gender.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 153, 153));
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        gender.setPreferredSize(new java.awt.Dimension(106, 22));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Age");

        age.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        age.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane4.setViewportView(age);

        AdvanceAmount.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        AdvanceAmount.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane13.setViewportView(AdvanceAmount);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Advance Amount *");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(gender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane13))
                    .addComponent(jLabel13))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane13)
                .addGap(18, 18, 18))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("GSTIN");

        gstin.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        gstin.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane5.setViewportView(gstin);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("BILL NO");

        jScrollPane6.setForeground(new java.awt.Color(0, 153, 153));

        billno.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        billno.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane6.setViewportView(billno);

        date.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        date.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane7.setViewportView(date);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date");

        paymentmethod.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        paymentmethod.setForeground(new java.awt.Color(0, 153, 153));
        paymentmethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "UPI", "Card", "Cheque" }));
        paymentmethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentmethodActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Mode Of Payment");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Payment RefNo (Optional)");

        refcodeedit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        refcodeedit.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane11.setViewportView(refcodeedit);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane7)
                    .addComponent(paymentmethod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane11)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentmethod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        treatcode.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        treatcode.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane8.setViewportView(treatcode);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Treatment Code");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Fill in the details And add particular");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Add Particular");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(0, 100, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        table.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table.setForeground(new java.awt.Color(0, 153, 153));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No", "Code", "Nature Of Treatment", "Gross Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(0, 102, 153));
        table.setRowHeight(30);
        table.setRowMargin(9);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 153));
        jButton2.setText("Proceed");
        jButton2.setAlignmentX(getWidth()/2);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton1.setText("Discount");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton2.setText("in %");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRadioButton3.setText("in Amount");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        discounteditext.setContentType("Numeric\n"); // NOI18N
        discounteditext.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        discounteditext.setForeground(new java.awt.Color(0, 153, 153));
        jScrollPane10.setViewportView(discounteditext);

        javax.swing.GroupLayout discountpanelLayout = new javax.swing.GroupLayout(discountpanel);
        discountpanel.setLayout(discountpanelLayout);
        discountpanelLayout.setHorizontalGroup(
            discountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discountpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(discountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane10)
                    .addGroup(discountpanelLayout.createSequentialGroup()
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        discountpanelLayout.setVerticalGroup(
            discountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(discountpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(discountpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 153, 153));
        jButton4.setText("Reset Data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(40, 40, 40)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(discountpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 538, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(122, 122, 122))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(6, 6, 6))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addComponent(discountpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                .addContainerGap(262, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1382, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 Preferences prefs = Preferences.userNodeForPackage(dentistexample.mainactivity.class);
  public static String writeRequestAndResponse() {

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy_MM_dd_HH.mm.ss");

        String currentDateTime = format.format(date);

        String folderPath = "C:\\" + "Invoice_Copy_MD";

        File theDir = new File(folderPath);

        // if the directory does not exist, create it
        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getName());
            boolean result = false;

            try {

                theDir.mkdirs();
                result = true;
            } catch (SecurityException se) {
                // handle it
                System.out.println(se.getMessage());
            }
            if (result) {
                
                System.out.println("Folder created");
                 return folderPath;
            }
        } else if (theDir.exists()) {
            System.out.println("Folder exist");
            return folderPath;
            
        }
        return folderPath;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        System.err.println(""+writeRequestAndResponse());
        if(validatediscount()&&validateedit())
        {
         Patientname=name.getText().toString();
         Patientaddress=address.getText().toString();
         Sex=gender.getSelectedItem().toString();
         Age=age.getText().toString();
         gst=gstin.getText().toString();
         Billno=billno.getText().toString();
         modeofpay=paymentmethod.getSelectedItem().toString();
         paymentrefcode=refcodeedit.getText().toString();
         stringDate=date.getText().toString();
         Advance=AdvanceAmount.getText().toString();
            System.err.println(""+Advance);
         if(Advance.equals(""))
             Advance="0";
         String path="";
       // JFileChooser jFileChooser=new JFileChooser();
       // jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
       // int num=jFileChooser.showSaveDialog(this);
        totalamount="0";
        path=writeRequestAndResponse();
        
        try {
            Font fontH1 = new Font(Font.FontFamily.UNDEFINED, 14);
            fontH1.setColor(BaseColor.BLACK);
            Font fontH2 = new Font(Font.FontFamily.UNDEFINED, 14);
            fontH2.setColor(BaseColor.GRAY);
            Font fontH3 = new Font(Font.FontFamily.UNDEFINED,16,Font.BOLD);
            fontH3.setColor(BaseColor.BLACK);
            PdfDocument pdfDocument=new PdfDocument();
            Document document=new Document();
            PdfWriter.getInstance(document,new FileOutputStream(path+"/Bill no"+Billno+"("+Patientname+stringDate+").pdf"));
            document.open();
            float [] pointColumnWidthss = {500F, 400F};
            PdfPTable pTable=new PdfPTable(2);
            document.add(new Paragraph(" "));
            Paragraph preface = new Paragraph("BILL / RECEIPT",fontH3);
             preface.setAlignment(Element.ALIGN_CENTER);
            document.add(preface);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            pTable.addCell(createCell("Patient Name : "+Patientname,""));
            pTable.addCell(createCell("GSTIN : "+gst,""));
            pTable.addCell(createCell("Address : "+Patientaddress,""));
            pTable.addCell(createCell("Bill No : "+Billno,""));
             pTable.addCell(createCell("Gender : "+Sex,""));
            pTable.addCell(createCell("Bill Date: "+stringDate,""));
            pTable.addCell(createCell("Age : "+Age,""));
            pTable.addCell(createCell("",""));
            document.add(pTable);
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            float [] pointColumnWidths = {100F, 100F,350f,200f,200f};
            PdfPTable pdfTable = new PdfPTable(pointColumnWidths);
            //adding table headers
            for (int i = 0; i < table.getColumnCount(); i++) {
                PdfPCell pCell=new PdfPCell(new Phrase(table.getColumnName(i)));
                pCell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
                pdfTable.addCell(pCell);
            }
            PdfPCell pCell1=new PdfPCell(new Phrase("Taxable Amount"));
            pCell1.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
            pdfTable.addCell(pCell1);
            //extracting data from the JTable and inserting it to PdfPTable
            Double totaltax=Double.valueOf(0);
            Double totalAmount=Double.valueOf(0);
            for (int rows = 0; rows < table.getRowCount(); rows++) {
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                        if(cols==0)
                        {
                         pdfTable.addCell((rows+1)+"");
                        }
                        else
                        {
                            if(cols==3)
                            {
                              pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());
                             totalAmount+=Double.parseDouble(table.getModel().getValueAt(rows, cols).toString());
                             DecimalFormat decimalFormat=new DecimalFormat("#.00");
                             String strtax="";
                         //  System.err.println(""+Tp.get(treatcode.getText().toString().toUpperCase()));
                             Double taxable=Double.parseDouble(table.getModel().getValueAt(rows, cols).toString());
                             taxable=taxable/1.18;
                             strtax=decimalFormat.format(taxable);
                             pdfTable.addCell(strtax);
                             totaltax+=Double.parseDouble(strtax);  
                            }
                            else
                             pdfTable.addCell(table.getModel().getValueAt(rows, cols).toString());
                        }
                }
            }
            float tot=Float.parseFloat(totalamount);
            float bal=((18*tot)/100);
            System.err.println(""+bal);
            //  tot=tot-bal;
            total=tot+"";
            DecimalFormat decimalFormat=new DecimalFormat("#.00");
            document.add(pdfTable);
            //document.add(new Paragraph(" "));
            float[]point2={450f,250f};
            PdfPTable pTable1=new PdfPTable(point2);
          //  pTable1.addCell(createCell("",""));
          //  pTable1.addCell(createCell("Total : "+decimalFormat.format(tot-bal),""));
            pTable1.addCell(createCell("",""));
            pTable1.addCell(createCell("CGST"+"(9%) :"+decimalFormat.format((9*totaltax)/100)+"(+)",""));
            pTable1.addCell(createCell("",""));
            pTable1.addCell(createCell("SGST"+"(9%) :"+decimalFormat.format((9*totaltax)/100)+"(+)",""));
            pTable1.addCell(createCell("",""));
            pTable1.addCell(createCell("Total : "+totalAmount,""));
            double discountedamount=0;
            if(jRadioButton1.isSelected())
            {
                double red =Double.valueOf(0);
                if(jRadioButton2.isSelected())
                {
                    red=((totalAmount*(Double.parseDouble(discounteditext.getText().toString())))/100);
                }
                if(jRadioButton3.isSelected())
                {
                    red=Double.parseDouble(discounteditext.getText().toString());
                }
                discountedamount=red;
            }
            if(jRadioButton1.isSelected())
            {
            pTable1.addCell(createCell("",""));
            pTable1.addCell(createCell("Discount : "+decimalFormat.format(discountedamount)+"(-)",""));
            }
            if(!Advance.equals("0"))
            {
            pTable1.addCell(createCell("",""));
                System.err.println(""+Advance);
            pTable1.addCell(createCell("Advance Paid : "+decimalFormat.format(Integer.parseInt(Advance))+"(-)",""));
            }
            pTable1.addCell(createCell("",""));
            pTable1.addCell(createCell("Net Amount : "+decimalFormat.format((totalAmount-discountedamount-Double.parseDouble(Advance))),""));
            document.add(pTable1);
            document.add(new Paragraph(" "));
            float [] pointColumnWidths1 = {150F, 100F,200f,200f};
            PdfPTable pTable2=new PdfPTable(pointColumnWidths1);
            String lasttable[]={"Date","Receipt No","Mode of Payment","Paid Amount"};
            for(int i=0;i<4;i++)
            {
                PdfPCell pCell=new PdfPCell(new Phrase(lasttable[i]));
                pCell.setVerticalAlignment(PdfPCell.ALIGN_CENTER);
                pTable2.addCell(pCell);
            }
            String lasttablevalues[]={stringDate,Billno,modeofpay,decimalFormat.format((totalAmount-discountedamount-Double.parseDouble(Advance)))+""};
            for(int i=0;i<4;i++)
            {
                PdfPCell pCell=new PdfPCell(new Phrase(lasttablevalues[i]));
                pTable2.addCell(pCell);
            }
            document.add(pTable2);
            document.add(new Paragraph(" "));
            PdfPTable lasttwotext=new PdfPTable(point2);
            if(paymentrefcode.matches(""))
                paymentrefcode="-";
            lasttwotext.addCell(createCell("Payment Ref.No (If Any) : "+paymentrefcode,""));
            lasttwotext.addCell(createCell("",""));
            lasttwotext.addCell(createCell(" ",""));
            lasttwotext.addCell(createCell(" ",""));
            lasttwotext.addCell(createCell("",""));
            lasttwotext.addCell(createCell("    Authorised Signature",""));
            document.add(lasttwotext);
            
            if(Intialbill.equals(Billno.substring(3,Billno.length())))
            {
             Billno=(Integer.parseInt(Billno.substring(3,Billno.length()))+1)+"";
             prefs.put("billno",(Integer.parseInt(Billno))+"");
            }
            else
               prefs.put("billno",Intialbill);
            
             System.err.println("bill no"+Billno);
             System.err.println("bill no"+prefs.get("billno","ged"));
            document.close();
            JOptionPane.showMessageDialog(this,"Invoice "+billno.getText().toString()+" Successfully Saved in "+path+"");
            reset();
        } catch (Exception ex) {
            //JOptionPane.showMessageDialog(this,ex+"  "+ex.getLocalizedMessage()+" ");
            if (ex.getLocalizedMessage().contains("The process cannot access the file")) {
                 JOptionPane.showMessageDialog(this,"Oops : It seems Already an PDFfile running with this information..");
            }
            if(ex.toString().contains("NumberFormatException"))
            {
                JOptionPane.showMessageDialog(this,"Oops : Invalid Entry ! !Please Give valid numerical Inputs..");
            }
            else
            {
                 JOptionPane.showMessageDialog(this,"Error "+ex.getMessage());
            }
            Logger.getLogger(mainactivity.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void paymentmethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentmethodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentmethodActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(table.getSelectedRow()>=0)
        defaultTableModel.removeRow(table.getSelectedRow());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
        table.clearSelection();
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected())
        {
            jRadioButton3.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
          if(jRadioButton3.isSelected())
        {
            jRadioButton2.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed
    public boolean validateedit()
    {
        
        if(table.getRowCount()<=0)
        {
            JOptionPane.showMessageDialog(this,"Add Atleast One Particular...");
           return false;
        }
       if(name.getText().toString().matches("")||address.getText().toString().matches("")||age.getText().toString().matches("")||gstin.getText().toString().matches("")||billno.getText().toString().matches("")||date.getText().toString().matches(""))
       {
           JOptionPane.showMessageDialog(this,"Fill in the missing fields...");
           return false;
       }
            
        return true;
    }
    public boolean validatediscount()
    {
         for (int rows = 0; rows < table.getRowCount(); rows++) {
                for (int cols = 0; cols < table.getColumnCount(); cols++) {
                   
                        if(table.getModel().getValueAt(rows, cols).toString().equals(""))
                        {
                            JOptionPane.showMessageDialog(this,"You can't Leave a Value Empty in the Table..");
                            return false;
                        }
                }
            }
        if(jRadioButton1.isSelected()&&((!jRadioButton2.isSelected()&&!jRadioButton3.isSelected())||discounteditext.getText().toString().matches("")))
        {
             JOptionPane.showMessageDialog(this,"Fill in the missing fields...");
            return false;
        }
        return true;
    }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected())
        {
            discountpanel.setVisible(true);
        }
        else
        {
             discountpanel.setVisible(false);
             
        }
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(treatcode.getText().toString().matches(""))
        {
            JOptionPane.showMessageDialog(this,"Fill in the missing fields...");
        }
        else
        {
            
            if(Treatmentcode.containsKey(treatcode.getText().toString().toUpperCase()))
            {
            defaultTableModel.insertRow(table.getRowCount(),new Object[]{table.getRowCount()+1,treatcode.getText(),Treatmentcode.get(treatcode.getText().toString().toUpperCase()),Tp.get(treatcode.getText().toString().toUpperCase()).substring(0,Tp.get(treatcode.getText().toString().toUpperCase()).indexOf(","))});
            }
            else
            JOptionPane.showMessageDialog(this,"INVALID TREATEMENT CODE..");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "Do you really want to reset entire data?", "Reset Information",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if(input==0)
        {
            reset();
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    public PdfPCell createCell(String text,String text1)
    {
        Font fontH1 = new Font(Font.FontFamily.UNDEFINED, 12);
        fontH1.setColor(BaseColor.BLACK);
         Font fontH2 = new Font(Font.FontFamily.UNDEFINED, 12);
        fontH2.setColor(BaseColor.GRAY);
        PdfPCell pCell=new PdfPCell();
        pCell.addElement(new Phrase(text,fontH1));
        pCell.addElement(new Phrase(text1,fontH2));
        pCell.setBorder(Rectangle.NO_BORDER);
        return pCell;
    }
   String gst="33AEUPC4789AIZG",Billno="",total="0",cgst="9%",sgst="9%",totalamount="0",modeofpay="",paymentrefcode="";
   String Patientname="",Patientaddress="",Age="",Sex="";
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainactivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainactivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainactivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainactivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainactivity().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane AdvanceAmount;
    private javax.swing.JEditorPane address;
    private javax.swing.JEditorPane age;
    private javax.swing.JEditorPane billno;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JEditorPane date;
    private javax.swing.JEditorPane discounteditext;
    private javax.swing.JPanel discountpanel;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JEditorPane gstin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JEditorPane name;
    private javax.swing.JComboBox<String> paymentmethod;
    private javax.swing.JEditorPane refcodeedit;
    private javax.swing.JTable table;
    private javax.swing.JEditorPane treatcode;
    // End of variables declaration//GEN-END:variables
    private void reset ()
    {
       
        AdvanceAmount.setText("");
        name.setText("");
        address.setText("");
        age.setText("");
        refcodeedit.setText("");
        treatcode.setText("");
        
        defaultTableModel.setRowCount(0);
        billno.setText("MD "+prefs.get("billno","0"));
        Intialbill=prefs.get("billno","0");
         Date datee = new Date();
         SimpleDateFormat DateFor = new SimpleDateFormat("dd-MM-yyyy");
          stringDate= DateFor.format(datee);
        date.setText(stringDate);
        gstin.setText(gst);
        discounteditext.setText("");
        jRadioButton1.setSelected(false);
        discountpanel.setVisible(false);
        Advance="0";
    }
    private void setIconImage() {
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.jpg")));
    }
}

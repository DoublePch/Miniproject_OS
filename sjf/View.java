/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sjf;


import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Optional;
import java.util.TimerTask;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.util.Timer;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.api.tree.BreakTree;




/**
 *
 * @author DoubleP
 */
public class View extends javax.swing.JFrame {

       //ประกาศตัวแปร เพื่อที่จะนำไปใช้ต่อ
       Timer mytime = new Timer();
       private int count = 0;
       static int i  = 0;
        
     //ประกาศ Object controller ที่มาจากคลาส Controller
        Controller controller = new Controller();
     //ประกาศ Object model ที่มาจากคController controller = new Controller();ลาส Model
        Model model;
        
public View() {
        initComponents();
        //เรียกใช้ Method clockTime ที่เอาใส่ไว้ใน Constructor เพราะว่าเวลาเปิดโปรแกรมมาจะได้เรียกใช้เลย
        clockTime(model);
       
       
    }
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               new View().setVisible(true);
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clock = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        avgWT = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        turnTime = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobQueue = new javax.swing.JTable();
        addProcess = new javax.swing.JButton();
        terminate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        cpuID = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        addPrinter = new javax.swing.JButton();
        endPrinter = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        printer = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        disk = new javax.swing.JTable();
        addDisk = new javax.swing.JButton();
        endDisk = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        pQ = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        dQ = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SJF-Nonpreemptive");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SWTxt", 0, 18)); // NOI18N
        jLabel1.setText("Clock :");

        clock.setFont(new java.awt.Font("SWTxt", 0, 18)); // NOI18N
        clock.setText("-----");

        jLabel3.setFont(new java.awt.Font("SWTxt", 0, 18)); // NOI18N
        jLabel3.setText("AVG WatingTime :");

        avgWT.setFont(new java.awt.Font("SWTxt", 0, 18)); // NOI18N
        avgWT.setText("----");

        jLabel5.setFont(new java.awt.Font("SWTxt", 0, 18)); // NOI18N
        jLabel5.setText("TunrAroundTime :");

        turnTime.setFont(new java.awt.Font("SWTxt", 0, 18)); // NOI18N
        turnTime.setText("----");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clock)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avgWT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(turnTime)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(avgWT)
                    .addComponent(jLabel5)
                    .addComponent(turnTime)
                    .addComponent(clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jobQueue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Process State", "Arrival Time", "Burst Time", "Waiting Time"
            }
        ));
        jScrollPane1.setViewportView(jobQueue);

        addProcess.setBackground(new java.awt.Color(0, 204, 51));
        addProcess.setText("AddProcess");
        addProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProcessActionPerformed(evt);
            }
        });

        terminate.setBackground(new java.awt.Color(255, 0, 0));
        terminate.setText("Terminate");
        terminate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(terminate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(terminate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)))
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Process State"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Process State"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("SWTxt", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("JobQueue");

        jLabel9.setFont(new java.awt.Font("SWTxt", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ready Queue");

        jLabel10.setFont(new java.awt.Font("SWTxt", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Terminate Queue");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        cpuID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Process State"
            }
        ));
        jScrollPane7.setViewportView(cpuID);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("SWTxt", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CPU");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        addPrinter.setBackground(new java.awt.Color(0, 204, 51));
        addPrinter.setText("Add");
        addPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPrinterActionPerformed(evt);
            }
        });

        endPrinter.setBackground(new java.awt.Color(255, 0, 0));
        endPrinter.setText("End");
        endPrinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endPrinterActionPerformed(evt);
            }
        });

        printer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Process State", "I/O Time"
            }
        ));
        jScrollPane5.setViewportView(printer);

        jLabel4.setFont(new java.awt.Font("SWTxt", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Printer");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(endPrinter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addPrinter, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(addPrinter, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(endPrinter, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        disk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Process State", "I/O Time"
            }
        ));
        jScrollPane6.setViewportView(disk);
        if (disk.getColumnModel().getColumnCount() > 0) {
            disk.getColumnModel().getColumn(2).setHeaderValue("I/O Time");
        }

        addDisk.setBackground(new java.awt.Color(0, 204, 51));
        addDisk.setText("Add");
        addDisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDiskActionPerformed(evt);
            }
        });

        endDisk.setBackground(new java.awt.Color(255, 0, 0));
        endDisk.setText("End");
        endDisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDiskActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SWTxt", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Disk");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(45, 45, 45)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(endDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(addDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(endDisk, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        pQ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Process State", "IO Waiting Time"
            }
        ));
        jScrollPane3.setViewportView(pQ);

        dQ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Process ID", "Process State", "IO Waiting Time"
            }
        ));
        jScrollPane8.setViewportView(dQ);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("SWTxt", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Disk Queue");

        jLabel13.setFont(new java.awt.Font("SWTxt", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Printer Queue");

        jLabel14.setFont(new java.awt.Font("SWTxt", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Device");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(473, 473, 473)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(134, 134, 134))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel9)
                        .addGap(189, 189, 189)
                        .addComponent(jLabel11)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel13)
                        .addGap(139, 139, 139)
                        .addComponent(jLabel12)
                        .addGap(148, 148, 148)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(311, 311, 311))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProcessActionPerformed
       //เรียกใช้  Method ต่างๆ จากคลาส Controller ผ่าน Object ที่ชื่อว่า controller
        controller.addProcess(count);
        controller.sortBurst();
        showJob(controller.showJobQueue());      
        
    }//GEN-LAST:event_addProcessActionPerformed

    private void terminateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminateActionPerformed
        //เรียกใช้  Method ต่างๆ จากคลาส Controller ผ่าน Object ที่ชื่อว่า controller
        controller.removeQueue(count); 
    }//GEN-LAST:event_terminateActionPerformed

    private void addPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPrinterActionPerformed
        //เรียกใช้  Method AddPrinter
        controller.addPrinter(); 
    }//GEN-LAST:event_addPrinterActionPerformed

    private void endPrinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endPrinterActionPerformed
       //เรียกใช้ Method EndPrinter แล้วจะทำการ SortBurstTime ใหม่
        controller.endPrinter(); 
        controller.sortBurst();
    }//GEN-LAST:event_endPrinterActionPerformed

    private void addDiskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDiskActionPerformed
        controller.addDisk(); 
    }//GEN-LAST:event_addDiskActionPerformed

    private void endDiskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDiskActionPerformed
        controller.endDisk();       
        controller.sortBurst();
    }//GEN-LAST:event_endDiskActionPerformed

    /*Mothod showClock เพื่อทีจะอัพเดทค่าไปที่ Label ชื่อว่า clock เนื่องจาก Label นำค่า Integer มาแสดงไม่ได้ 
      จึงทำการเปลี่ยนเป็น String โดยเรียกใช้ Integer.toString แล้ว getClock มาใช้
    */
   void showClock(){
        clock.setText(Integer.toString(model.getClock()));
    }
    //Method ที่เพิ่มข้อมูลเข้า jTable Methodนี้จะถูกเรียกใช้หลายที่ อย่างเช่น ClockTime เพื่ออัพเดทค่าตลอดเวลา
    public void showJob(String text){
        /*ถ้าไม่มี try catch จะบัคหลายที่ อย่างเช่นค่า burst ที่จะลบตาม clockTime
          จึงใส่ try catch ไว้
        */
        try{
            DefaultTableModel model1 = (DefaultTableModel) jobQueue.getModel();
            //ในส่วนนี้จะทำการนับแถว เพื่อที่จะลบแถวออก เพราะว่า แถวมันจะเพิ่มตามจำนวน clockTime ไปเรื่อยๆ
            // จนกว่าจะหมดเวลา burstTime
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
             /*
                ทำการ Split ค่าข้อมูล หรือ แยกค่าข้อมูลออกจากกัน แล้วนำมาลูปเช็คขนาดขอ textTable2 
                พอเสร็จแล้วจึงเพิ่มค่าเข้าไปในตารางแล้วนำมาแสดง 
                */
         
            /*
            แยก , (Comma) ออกจากตัวแปร text โดย ใช้ text.split
            fot loop เช็คขนาดของ textTable2
            นำ textTable2ตำแหน่งที่[index] มาแยกค่า " "(ค่าว่าง) แล้วนำมาเก็บในตัวแปร textTable1  
            */
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
            String[] textTable1 = textTable2[index].split(" ");
            /*
            เรียกใช้ object ชื่อ model1 เพื่อเพิ่มแถวเข้ามา โดยอ้างอิงจาก textTable1 ตำแหน่งที่ n
            */
            model1.addRow(new Object[]{textTable1[0],textTable1[1],textTable1[2],textTable1[3],textTable1[4]});
        }  
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
              
    }
    
    //เหมือนกันกับ ShowJob
    public void showReady(String text){
        try{
            DefaultTableModel model1 = (DefaultTableModel) jTable2.getModel();
            
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 1; index < textTable2.length ; index++) {
            String[] textTable1 = textTable2[index].split(" ");
            model1.addRow(new Object[]{textTable1[0],textTable1[1]});
        }  
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }
     //เหมือนกันกับ ShowJob
    public void  showPrinter(String text){
        try{
            DefaultTableModel model1 = (DefaultTableModel) printer.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
            String[] textTable1 = textTable2[index].split(" ");
            model1.addRow(new Object[]{textTable1[0],textTable1[1],textTable1[2]});
            model1.removeRow(1);
        }  
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }
    
    //เงื่อนไขเหมือนกัน  ShowJob
    public void  showDisk(String text){
        try{
            DefaultTableModel model1 = (DefaultTableModel) disk.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
                String[] textTable1 = textTable2[0].split(" ");
                model1.addRow(new Object[]{textTable1[0],textTable1[1],textTable1[2]});
                model1.removeRow(1);
            }  
          
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }
    
        public void  showPrinteQueuer(String text){
        try{
            DefaultTableModel model1 = (DefaultTableModel) pQ.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
            String[] textTable1 = textTable2[index].split(" ");
            model1.addRow(new Object[]{textTable1[0],textTable1[1],textTable1[2]});
        }  
            model1.removeRow(0);
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }
    
    //เงื่อนไขเหมือนกัน  ShowJob
    public void  showDiskQueue(String text){
        try{
            DefaultTableModel model1 = (DefaultTableModel) dQ.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
                String[] textTable1 = textTable2[index].split(" ");
                model1.addRow(new Object[]{textTable1[0],textTable1[1],textTable1[2]});
                
            }  
            model1.removeRow(0);
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }
    //เงื่อนไขเหมือนกับ  ShowJob
    public void  showCPU(String text){
        try{
            DefaultTableModel model1 = (DefaultTableModel) cpuID.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
                String[] textTable1 = textTable2[0].split(" ");
                model1.addRow(new Object[]{textTable1[0],textTable1[1]});
                break;
            }  
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }
    //เงื่อนไขเหมือนกันกับ ShowJob
    public  void  showTerminate(String text){
      try{
            DefaultTableModel model1 = (DefaultTableModel) jTable4.getModel();
            int rowCount =  model1.getRowCount();
                for (int i = rowCount - 1; i >= 0; i--) {
                model1.removeRow(i);
             }
            String[] textTable2 = text.split(",");
            for (int index = 0; index < textTable2.length ; index++) {
            String[] textTable1 = textTable2[index].split(" ");
            model1.addRow(new Object[]{textTable1[0],textTable1[1]});
        }  
        }catch(ArrayIndexOutOfBoundsException e){
            
        }
    }
    
 
  
    
    // ทำให้ปุ่มกดไม่ได้ ถ้าไม่มีข้อมูล
    void setEnableButton(){
      /* ในส่วนของฟังก์ชั่น if นี้ จะทำการ เช็คค่าของแถว jTable1 ซึ่งเป็น JobQueue หรือเป็นทุกอย่างของโปรแกรมนี้
          จะเช็คว่า ถ้าแถวของ jTable1 เท่ากับ 0 ผู้ใช้จะไม่สามารถกดปุ่ม Terminate AddIO และ EndIO ได้
           ในส่วนของ Method นี้ จะถูกเรียกใช้ตลอดเวลา เพื่อที่จะทำการเช็คว่า User ได้เพิ่ม Process เข้ามาแล้วหรือยัง
        */ 
if(jobQueue.getRowCount() == 0){
            terminate.setEnabled(false);
            addPrinter.setEnabled(false);
            endPrinter.setEnabled(false);
            addDisk.setEnabled(false);
            endDisk.setEnabled(false);
//            if(disk.getRowCount() == 1){
//                 addDisk.setEnabled(false);
//            }
//            if(printer.getRowCount() == 1){
//                addPrinter.setEnabled(false);
//            }
//            if(disk.getRowCount() == 0){
//                 endDisk.setEnabled(false);
//            }
//            if(printer.getRowCount() == 0){
//                endPrinter.setEnabled(false);
//            }   
 }else{
      terminate.setEnabled(true);
      addPrinter.setEnabled(true);
      endPrinter.setEnabled(true);
      addDisk.setEnabled(true);
      endDisk.setEnabled(true);
//      if(disk.getRowCount() == 1){
//            addDisk.setEnabled(false);
//      }
//      if(printer.getRowCount() == 1){
//            addPrinter.setEnabled(false);
//      }
//      if(disk.getRowCount() == 0){
//            endDisk.setEnabled(false);
//      }
//      if(printer.getRowCount() == 0){
//            endPrinter.setEnabled(false);
//      }


        if(cpuID.getRowCount() == 0 ){
            addPrinter.setEnabled(false);
            addDisk.setEnabled(false);
            if(cpuID.getRowCount() == 0 && disk.getRowCount() == 0){
                endDisk.setEnabled(false);
                
            }
            if(cpuID.getRowCount() == 0 && printer.getRowCount() == 0){
                endPrinter.setEnabled(false);
                
            }
        }

      if(jobQueue.getRowCount() <3 && printer.getRowCount() == 1  && disk.getRowCount() == 1){
            addDisk.setEnabled(false);
      }
      if(jobQueue.getRowCount() == 1 && printer.getRowCount() == 1  && disk.getRowCount() == 0){
            addDisk.setEnabled(false);
      }
      if(jobQueue.getRowCount() == 1 && printer.getRowCount() == 0  && disk.getRowCount() == 1){
            addPrinter.setEnabled(false);
      }
      if(jobQueue.getRowCount() <3  && printer.getRowCount() == 1  && disk.getRowCount() == 1){
            addPrinter.setEnabled(false);
      }
      if(jobQueue.getRowCount() > 2 && printer.getRowCount() == 1 || disk.getRowCount() == 1){
            terminate.setEnabled(true);
      }           
}   
      if(cpuID.getRowCount() == 0){
            terminate.setEnabled(false);
       }
}
    //จะทำการ กำหนด Label เพื่อแสดงค่า Average ของ WaitingTime
    void showWatime(){
        avgWT.setText(controller.showWatime());
    }
    //จะทำการ กำหนด Label เพื่อแสดงค่า Average ของ TurnAroundTime
    void showTurntime(){
        turnTime.setText(controller.turnAround());
    }
                                        
   /*
    Method clockTime คือส่วนหัวใจสำคัญของ Algorithm Shortest Job First เนื่องจากหลายกระบวนการที่เราทำ
    จะอ้างอิงมาจาก Method นี้เกือบทั้งหมด และหลายๆ Method จะถูกเรียกใช้ผ่าน Method นี้
    */
    public void clockTime(Model model){
    
     TimerTask task =new TimerTask(){
        public  void run(){
            //ตัวแปร count ในส่วนนี้ คือส่วนที่จะไปแสดง บนหน้า View ที่เราเห็นกันคือ นับเวลา Clock หรือ CPU Time
            count++;
            clock.setText(Integer.toString(count));
            setEnableButton();
            controller.nextProcess();
            controller.usingCPU(count);
            controller.usingPrinter();
            controller.usingDisk();
            controller.waitting(count);
            controller.ioPrinter(count);
            controller.ioDisk(count);
            controller.ioWaitingPrinter();
            controller.ioWaitingDisk();
            //ในส่วนนี้คือการอัพเดทค่าของ jTable ทุกวินาที เพื่อที่ User จะได้ทราบข้อมูลที่ใหม่ตลอดเวลาจากการอัพเดทค่า
            showJob(controller.showJobQueue()); 
            showReady(controller.showReadyQueue());
            showCPU(controller.showcpuQueue());
            showDiskQueue(controller.showDisk());
            showPrinteQueuer(controller.showPrinter());
            showTerminate(controller.showTerminateQueue());
            showDisk(controller.showDiskQueue());
            showPrinter(controller.showPrinterQueue());
            showWatime();
            showTurntime();
        }
    };
    mytime.scheduleAtFixedRate(task, 1000, 1000);
   }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDisk;
    private javax.swing.JButton addPrinter;
    private javax.swing.JButton addProcess;
    private javax.swing.JLabel avgWT;
    private javax.swing.JLabel clock;
    private javax.swing.JTable cpuID;
    private javax.swing.JTable dQ;
    private javax.swing.JTable disk;
    private javax.swing.JButton endDisk;
    private javax.swing.JButton endPrinter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jobQueue;
    private javax.swing.JTable pQ;
    private javax.swing.JTable printer;
    private javax.swing.JButton terminate;
    private javax.swing.JLabel turnTime;
    // End of variables declaration//GEN-END:variables

   
}

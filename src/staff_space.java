
import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;

//sql connect
import java.io.FileNotFoundException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//FILE CHOOSER
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.TableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class staff_space extends javax.swing.JFrame {
    byte[] selected_mp= null;
    
    int adult_t;
    int child_t;
    int senior_t;
    
    byte[] d_mp= null;
    byte[] d_mp3= null;
    byte[] d_mp2= null;
  
    long milliseconds;
    long startTime = System.currentTimeMillis();
    
    public staff_space() {
        initComponents();
        showTime();
        showDate();
    }
    void showTime(){
        Date set_date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        h_date.setText(sdf.format(set_date));
        
    }
    
    void showDate(){
        new Timer (0,new ActionListener() {
            
            @Override
            public void actionPerformed (ActionEvent e){
            Date set_date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("a hh:mm:ss");
            SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
            h_time.setText(sdf.format(set_date));
            }
            }).start();
        
    }

    public ArrayList<Movies> movieList(){
        ArrayList<Movies> movieList = new ArrayList<>();
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            String query_selectm="SELECT * FROM schedule_movies";
            java.sql.Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query_selectm);
            Movies movie;
            while (rs.next()){
                movie= new Movies(rs.getString("movie_title"), rs.getString("movie_date"), rs.getString("airing_time"), rs.getString("movie_screen"), rs.getString("seats_available"));
                movieList.add(movie);
            }
        }
       catch (Exception e){
           JOptionPane.showMessageDialog(null,e);
       } 
        return movieList;
    }
    public void show_scheduled_movie(){
         ArrayList<Movies> mlist = movieList();
         DefaultTableModel model_a = (DefaultTableModel) ms_screen_table_all.getModel();
         Object [] col= new Object[5];
        
        for(int i=0; i< mlist.size();i++){
            col[0]= mlist.get(i).gettitle();
            col[1]= mlist.get(i).getdate();
            col[2]= mlist.get(i).gettime();
            col[3]= mlist.get(i).getscreen();
            col[4]= mlist.get(i).getseat();
            model_a.addRow(col);
    }
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        sidebg = new javax.swing.JPanel();
        btnhome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnadd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnmoviescreen = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnlogout = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        top = new javax.swing.JPanel();
        top_home = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        top_add = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        top_ms = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        main_pane = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        h_date = new javax.swing.JLabel();
        h_time = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ticketssold_display = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        today_sales_display = new javax.swing.JLabel();
        main_panel = new javax.swing.JPanel();
        home_p = new javax.swing.JPanel();
        h_btnscreen1 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        h_btnscreen2 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        h_btnscreen3 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        h_screen1 = new javax.swing.JPanel();
        screen1_stat1 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        h_screen1_movietitle = new javax.swing.JLabel();
        duration_stat_screen1 = new javax.swing.JLabel();
        stat1 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        screen1MP = new javax.swing.JLabel();
        h_issueticket1 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        h_moreinfo1 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        duration_screen1 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        rating_display_s1 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        h_seats_screen1 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        h_timestarted_screen1 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        h_screen2 = new javax.swing.JPanel();
        screen2_stat1 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        h_screen2_movietitle = new javax.swing.JLabel();
        duration_stat_screen2 = new javax.swing.JLabel();
        stat2 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        screen2MP = new javax.swing.JLabel();
        h_issueticket2 = new javax.swing.JPanel();
        jLabel151 = new javax.swing.JLabel();
        h_moreinfo4 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        duration_screen2 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        rating_display_s2 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        h_seats_screen2 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        jLabel136 = new javax.swing.JLabel();
        h_timestarted_screen2 = new javax.swing.JLabel();
        m_id2 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        h_screen3 = new javax.swing.JPanel();
        screen3_stat5 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        h_screen3_movietitle = new javax.swing.JLabel();
        duration_stat_screen3 = new javax.swing.JLabel();
        stat3 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        screen3MP = new javax.swing.JLabel();
        h_issueticket3 = new javax.swing.JPanel();
        jLabel152 = new javax.swing.JLabel();
        h_moreinfo9 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        duration_screen3 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        jLabel146 = new javax.swing.JLabel();
        rating_display_s3 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        h_seats_screen3 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel148 = new javax.swing.JLabel();
        h_timestarted_screen3 = new javax.swing.JLabel();
        m_id3 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        add_p = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        adult_price_display = new javax.swing.JLabel();
        child_price_display = new javax.swing.JLabel();
        senior_price_display = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        subtotal_display = new javax.swing.JLabel();
        a_reset = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        a_checkout = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        child_spinner = new javax.swing.JSpinner();
        adult_spinner = new javax.swing.JSpinner();
        senior_spinner = new javax.swing.JSpinner();
        jPanel24 = new javax.swing.JPanel();
        st_movieposter = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        selectmovies_cb = new javax.swing.JComboBox<>();
        it_screen = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        m_sched_id = new javax.swing.JLabel();
        a_date = new javax.swing.JLabel();
        a_vs = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        it_time_cb = new javax.swing.JComboBox<>();
        it_date_field = new com.toedter.calendar.JDateChooser();
        it_seats = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        midlabel = new javax.swing.JLabel();
        ms_p = new javax.swing.JPanel();
        home_p1 = new javax.swing.JPanel();
        ms_btnscreen1 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        ms_btnscreen2 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        ms_btnscreen3 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        ms_btnscreen4 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        ms_all_screens = new javax.swing.JPanel();
        screen3_stat4 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        jLabel160 = new javax.swing.JLabel();
        am13 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        all_screens_searchbar = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        am14 = new javax.swing.JPanel();
        jLabel127 = new javax.swing.JLabel();
        allscreen_date_search = new com.toedter.calendar.JDateChooser();
        jLabel132 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        ms_screen_table_all = new javax.swing.JTable();
        h_moreinfo8 = new javax.swing.JPanel();
        ms_screen1 = new javax.swing.JPanel();
        screen3_stat2 = new javax.swing.JPanel();
        jPanel44 = new javax.swing.JPanel();
        jLabel159 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ms_screen1_table = new javax.swing.JTable();
        am7 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        searchbar_t_1 = new javax.swing.JTextField();
        searchtitle_screen1 = new javax.swing.JLabel();
        am8 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        date_field_screen1 = new com.toedter.calendar.JDateChooser();
        searchdate_screen1 = new javax.swing.JLabel();
        h_moreinfo7 = new javax.swing.JPanel();
        ms_screen2 = new javax.swing.JPanel();
        screen3_stat3 = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        jLabel168 = new javax.swing.JLabel();
        am11 = new javax.swing.JPanel();
        jLabel121 = new javax.swing.JLabel();
        searchbar_t_2 = new javax.swing.JTextField();
        searchtitle_screen2 = new javax.swing.JLabel();
        am12 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        date_field_screen2 = new com.toedter.calendar.JDateChooser();
        searchdate_screen2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ms_screen2_table = new javax.swing.JTable();
        h_moreinfo6 = new javax.swing.JPanel();
        ms_screen3 = new javax.swing.JPanel();
        screen3_stat1 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        am9 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        searchbar_t_3 = new javax.swing.JTextField();
        searchtitle_screen3 = new javax.swing.JLabel();
        am10 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        date_field_screen3 = new com.toedter.calendar.JDateChooser();
        searchdate_screen3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ms_screen3_table = new javax.swing.JTable();
        h_moreinfo5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1020, 580));
        setMinimumSize(new java.awt.Dimension(1020, 580));
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 68, 33)));
        background.setMaximumSize(new java.awt.Dimension(1020, 580));
        background.setMinimumSize(new java.awt.Dimension(1020, 580));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backgroundMouseEntered(evt);
            }
        });
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebg.setBackground(new java.awt.Color(228, 68, 33));
        sidebg.setMaximumSize(new java.awt.Dimension(230, 551));
        sidebg.setMinimumSize(new java.awt.Dimension(230, 551));
        sidebg.setPreferredSize(new java.awt.Dimension(230, 551));
        sidebg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhome.setBackground(new java.awt.Color(228, 68, 33));
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_btn_clicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_buttons_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_buttons_exit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnhomeMousePressed(evt);
            }
        });
        btnhome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                side_btn_release(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_home_20px_1.png"))); // NOI18N

        javax.swing.GroupLayout btnhomeLayout = new javax.swing.GroupLayout(btnhome);
        btnhome.setLayout(btnhomeLayout);
        btnhomeLayout.setHorizontalGroup(
            btnhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnhomeLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        btnhomeLayout.setVerticalGroup(
            btnhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnhomeLayout.createSequentialGroup()
                .addGroup(btnhomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidebg.add(btnhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 250, 40));

        add.setBackground(new java.awt.Color(228, 68, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Logged in as Staff");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_male_user_25px.png"))); // NOI18N

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidebg.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 230, 40));

        btnadd.setBackground(new java.awt.Color(228, 68, 33));
        btnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_btn_clicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_buttons_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_buttons_exit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnaddMousePressed(evt);
            }
        });
        btnadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                side_btn_release(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Purchase Ticket");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_plus_20px.png"))); // NOI18N

        javax.swing.GroupLayout btnaddLayout = new javax.swing.GroupLayout(btnadd);
        btnadd.setLayout(btnaddLayout);
        btnaddLayout.setHorizontalGroup(
            btnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnaddLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        btnaddLayout.setVerticalGroup(
            btnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnaddLayout.createSequentialGroup()
                .addGroup(btnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidebg.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 250, 40));

        btnmoviescreen.setBackground(new java.awt.Color(228, 68, 33));
        btnmoviescreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_btn_clicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_buttons_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_buttons_exit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnmoviescreenMousePressed(evt);
            }
        });
        btnmoviescreen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                side_btn_release(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Movie Screens");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_20px_1.png"))); // NOI18N

        javax.swing.GroupLayout btnmoviescreenLayout = new javax.swing.GroupLayout(btnmoviescreen);
        btnmoviescreen.setLayout(btnmoviescreenLayout);
        btnmoviescreenLayout.setHorizontalGroup(
            btnmoviescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnmoviescreenLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        btnmoviescreenLayout.setVerticalGroup(
            btnmoviescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnmoviescreenLayout.createSequentialGroup()
                .addGroup(btnmoviescreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidebg.add(btnmoviescreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 250, 40));

        btnlogout.setBackground(new java.awt.Color(228, 68, 33));
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_buttons_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_buttons_exit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnlogoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnlogoutMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Log Out");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_logout_rounded_left_20px.png"))); // NOI18N

        javax.swing.GroupLayout btnlogoutLayout = new javax.swing.GroupLayout(btnlogout);
        btnlogout.setLayout(btnlogoutLayout);
        btnlogoutLayout.setHorizontalGroup(
            btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnlogoutLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        btnlogoutLayout.setVerticalGroup(
            btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnlogoutLayout.createSequentialGroup()
                .addGroup(btnlogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidebg.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 250, 40));

        jPanel7.setBackground(new java.awt.Color(228, 68, 33));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_movie_70px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Staff Space");

        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Movie Ticketing System");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel20)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sidebg.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 80));

        jSeparator5.setOpaque(true);
        sidebg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 215, -1));

        background.add(sidebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 580));

        top.setBackground(new java.awt.Color(228, 68, 33));
        top.setLayout(new java.awt.CardLayout());

        top_home.setBackground(new java.awt.Color(228, 68, 33));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_home_15px.png"))); // NOI18N
        jLabel21.setText("Home");

        javax.swing.GroupLayout top_homeLayout = new javax.swing.GroupLayout(top_home);
        top_home.setLayout(top_homeLayout);
        top_homeLayout.setHorizontalGroup(
            top_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top_homeLayout.createSequentialGroup()
                .addContainerGap(361, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(354, 354, 354))
        );
        top_homeLayout.setVerticalGroup(
            top_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        top.add(top_home, "card3");

        top_add.setBackground(new java.awt.Color(228, 68, 33));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_plus_15px.png"))); // NOI18N
        jLabel22.setText("Issue Ticket");

        javax.swing.GroupLayout top_addLayout = new javax.swing.GroupLayout(top_add);
        top_add.setLayout(top_addLayout);
        top_addLayout.setHorizontalGroup(
            top_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top_addLayout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(340, 340, 340))
        );
        top_addLayout.setVerticalGroup(
            top_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        top.add(top_add, "card4");

        top_ms.setBackground(new java.awt.Color(228, 68, 33));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel23.setText("Movie Screens");

        javax.swing.GroupLayout top_msLayout = new javax.swing.GroupLayout(top_ms);
        top_ms.setLayout(top_msLayout);
        top_msLayout.setHorizontalGroup(
            top_msLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_msLayout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jLabel23)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        top_msLayout.setVerticalGroup(
            top_msLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        top.add(top_ms, "card5");

        background.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 770, 30));

        main_pane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(228, 68, 33)));
        main_pane.setOpaque(true);
        main_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 153, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_calendar_60px.png"))); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        h_date.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        h_date.setForeground(new java.awt.Color(255, 255, 255));
        h_date.setText("12-09-2020");
        jPanel1.add(h_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        h_time.setFont(new java.awt.Font("Segoe UI Semibold", 0, 23)); // NOI18N
        h_time.setForeground(new java.awt.Color(255, 255, 255));
        h_time.setText("PM 12:35:34");
        jPanel1.add(h_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        main_pane.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 230, 80));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_ticket_60px.png"))); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tickets Sold Today");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        ticketssold_display.setFont(new java.awt.Font("Segoe UI Semibold", 0, 27)); // NOI18N
        ticketssold_display.setForeground(new java.awt.Color(255, 255, 255));
        ticketssold_display.setText("0");
        jPanel3.add(ticketssold_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        main_pane.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 80));

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 51, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_peso_symbol_60px.png"))); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 80));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Total Sales Today");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        today_sales_display.setFont(new java.awt.Font("Segoe UI Semibold", 0, 27)); // NOI18N
        today_sales_display.setForeground(new java.awt.Color(255, 255, 255));
        today_sales_display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media2/icons8_peso_symbol_29px_1.png"))); // NOI18N
        today_sales_display.setText("00.0");
        jPanel5.add(today_sales_display, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        main_pane.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 220, 80));

        main_panel.setBackground(new java.awt.Color(255, 255, 255));
        main_panel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(228, 68, 33)));
        main_panel.setLayout(new java.awt.CardLayout());

        home_p.setBackground(new java.awt.Color(255, 255, 255));

        h_btnscreen1.setBackground(new java.awt.Color(204, 0, 102));
        h_btnscreen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_btnscreen1h_btnscreens_clicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_btnscreen1h_btnscreens_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_btnscreen1h_btnscreens_exit(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel87.setText("Screen 1");

        javax.swing.GroupLayout h_btnscreen1Layout = new javax.swing.GroupLayout(h_btnscreen1);
        h_btnscreen1.setLayout(h_btnscreen1Layout);
        h_btnscreen1Layout.setHorizontalGroup(
            h_btnscreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_btnscreen1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel87)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        h_btnscreen1Layout.setVerticalGroup(
            h_btnscreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        h_btnscreen2.setBackground(new java.awt.Color(204, 0, 102));
        h_btnscreen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_btnscreen1h_btnscreens_clicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_btnscreen2h_btnscreens_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_btnscreen2h_btnscreens_exit(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel88.setText("Screen 2");

        javax.swing.GroupLayout h_btnscreen2Layout = new javax.swing.GroupLayout(h_btnscreen2);
        h_btnscreen2.setLayout(h_btnscreen2Layout);
        h_btnscreen2Layout.setHorizontalGroup(
            h_btnscreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_btnscreen2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel88)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        h_btnscreen2Layout.setVerticalGroup(
            h_btnscreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        h_btnscreen3.setBackground(new java.awt.Color(204, 0, 102));
        h_btnscreen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_btnscreen1h_btnscreens_clicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_btnscreen3h_btnscreens_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_btnscreen3h_btnscreens_exit(evt);
            }
        });

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel89.setText("Screen 3");

        javax.swing.GroupLayout h_btnscreen3Layout = new javax.swing.GroupLayout(h_btnscreen3);
        h_btnscreen3.setLayout(h_btnscreen3Layout);
        h_btnscreen3Layout.setHorizontalGroup(
            h_btnscreen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_btnscreen3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel89)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        h_btnscreen3Layout.setVerticalGroup(
            h_btnscreen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jLayeredPane3.setLayout(new java.awt.CardLayout());

        h_screen1.setBackground(new java.awt.Color(255, 255, 255));

        screen1_stat1.setBackground(new java.awt.Color(255, 255, 255));
        screen1_stat1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 135, 225), 2));

        jPanel25.setBackground(new java.awt.Color(204, 135, 225));

        jLabel91.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_15px_1.png"))); // NOI18N
        jLabel91.setText("Screen 1 Status");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel95.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(51, 51, 51));
        jLabel95.setText("Current Movie");

        jLabel96.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(51, 51, 51));
        jLabel96.setText("Movie Duration");

        jLabel102.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(51, 51, 51));
        jLabel102.setText("Status");

        jLabel103.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(51, 51, 51));
        jLabel103.setText("Next Movie");

        h_screen1_movietitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        h_screen1_movietitle.setForeground(new java.awt.Color(51, 51, 51));
        h_screen1_movietitle.setText("n/A");

        duration_stat_screen1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        duration_stat_screen1.setForeground(new java.awt.Color(51, 51, 51));
        duration_stat_screen1.setText("--:--:--");

        stat1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        stat1.setForeground(new java.awt.Color(51, 51, 51));
        stat1.setText("--");

        jLabel104.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(51, 51, 51));
        jLabel104.setText("n/A");

        javax.swing.GroupLayout screen1_stat1Layout = new javax.swing.GroupLayout(screen1_stat1);
        screen1_stat1.setLayout(screen1_stat1Layout);
        screen1_stat1Layout.setHorizontalGroup(
            screen1_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(screen1_stat1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(screen1_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103)
                    .addComponent(jLabel95))
                .addGap(145, 145, 145)
                .addGroup(screen1_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration_stat_screen1)
                    .addComponent(h_screen1_movietitle)
                    .addComponent(stat1)
                    .addComponent(jLabel104))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        screen1_stat1Layout.setVerticalGroup(
            screen1_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screen1_stat1Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen1_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(h_screen1_movietitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen1_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(screen1_stat1Layout.createSequentialGroup()
                        .addComponent(duration_stat_screen1)
                        .addGap(11, 11, 11)
                        .addComponent(stat1))
                    .addGroup(screen1_stat1Layout.createSequentialGroup()
                        .addComponent(jLabel96)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(screen1_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103)
                            .addComponent(jLabel104))))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        screen1MP.setBackground(new java.awt.Color(255, 204, 102));
        screen1MP.setForeground(new java.awt.Color(255, 102, 0));
        screen1MP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screen1MP.setText("Movie Poster");
        screen1MP.setOpaque(true);

        h_issueticket1.setBackground(new java.awt.Color(255, 204, 0));
        h_issueticket1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_issueticket1h_IssueTicketbtn_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_issueticket1h_IssueTicketbtn_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_issueticket1h_IssueTicketbtn_exit(evt);
            }
        });

        jLabel105.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_buy_24px.png"))); // NOI18N
        jLabel105.setText("Issue Ticket ");

        javax.swing.GroupLayout h_issueticket1Layout = new javax.swing.GroupLayout(h_issueticket1);
        h_issueticket1.setLayout(h_issueticket1Layout);
        h_issueticket1Layout.setHorizontalGroup(
            h_issueticket1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(h_issueticket1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel105)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        h_issueticket1Layout.setVerticalGroup(
            h_issueticket1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(h_issueticket1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel105)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        h_moreinfo1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel26.setBackground(new java.awt.Color(0, 204, 204));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("Time Elapsed");

        duration_screen1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        duration_screen1.setForeground(new java.awt.Color(255, 255, 255));
        duration_screen1.setText("--:--:--");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel106)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(duration_screen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(duration_screen1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel27.setBackground(new java.awt.Color(204, 204, 0));

        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("IMDb Rating");

        rating_display_s1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rating_display_s1.setForeground(new java.awt.Color(255, 255, 255));
        rating_display_s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_star_24px_1.png"))); // NOI18N
        rating_display_s1.setText("0");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rating_display_s1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel107))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rating_display_s1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28.setBackground(new java.awt.Color(204, 0, 204));

        jLabel108.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("Available Seats");

        h_seats_screen1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_seats_screen1.setForeground(new java.awt.Color(255, 255, 255));
        h_seats_screen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_armchair_24px_1.png"))); // NOI18N
        h_seats_screen1.setText("0");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_seats_screen1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_seats_screen1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel29.setBackground(new java.awt.Color(247, 104, 66));

        jLabel109.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText("Time Started");

        h_timestarted_screen1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_timestarted_screen1.setForeground(new java.awt.Color(255, 255, 255));
        h_timestarted_screen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_time_24px.png"))); // NOI18N
        h_timestarted_screen1.setText("--:-- --");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel109)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(h_timestarted_screen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_timestarted_screen1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout h_moreinfo1Layout = new javax.swing.GroupLayout(h_moreinfo1);
        h_moreinfo1.setLayout(h_moreinfo1Layout);
        h_moreinfo1Layout.setHorizontalGroup(
            h_moreinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h_moreinfo1Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(h_moreinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(h_moreinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        h_moreinfo1Layout.setVerticalGroup(
            h_moreinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_moreinfo1Layout.createSequentialGroup()
                .addGroup(h_moreinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(h_moreinfo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel110.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(102, 102, 102));
        jLabel110.setText("Movie ID ");

        id1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        id1.setForeground(new java.awt.Color(102, 102, 102));
        id1.setText("-------");

        javax.swing.GroupLayout h_screen1Layout = new javax.swing.GroupLayout(h_screen1);
        h_screen1.setLayout(h_screen1Layout);
        h_screen1Layout.setHorizontalGroup(
            h_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_screen1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(h_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(screen1_stat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h_moreinfo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(h_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen1Layout.createSequentialGroup()
                        .addComponent(jLabel110)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(h_screen1Layout.createSequentialGroup()
                        .addGroup(h_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h_issueticket1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(screen1MP, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addGap(69, 69, 69))))
        );
        h_screen1Layout.setVerticalGroup(
            h_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_screen1Layout.createSequentialGroup()
                .addGroup(h_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(id1))
                .addGap(5, 5, 5)
                .addGroup(h_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen1Layout.createSequentialGroup()
                        .addComponent(screen1MP, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(h_issueticket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(h_screen1Layout.createSequentialGroup()
                        .addComponent(screen1_stat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(h_moreinfo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.add(h_screen1, "card2");

        h_screen2.setBackground(new java.awt.Color(255, 255, 255));

        screen2_stat1.setBackground(new java.awt.Color(255, 255, 255));
        screen2_stat1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 135, 225), 2));

        jPanel30.setBackground(new java.awt.Color(204, 135, 225));

        jLabel111.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_15px_1.png"))); // NOI18N
        jLabel111.setText("Screen 2 Status");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel114.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(51, 51, 51));
        jLabel114.setText("Current Movie");

        jLabel128.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(51, 51, 51));
        jLabel128.setText("Movie Duration");

        jLabel129.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(51, 51, 51));
        jLabel129.setText("Status");

        jLabel130.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(51, 51, 51));
        jLabel130.setText("Next Movie");

        h_screen2_movietitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        h_screen2_movietitle.setForeground(new java.awt.Color(51, 51, 51));
        h_screen2_movietitle.setText("n/A");

        duration_stat_screen2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        duration_stat_screen2.setForeground(new java.awt.Color(51, 51, 51));
        duration_stat_screen2.setText("--:--:--");

        stat2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        stat2.setForeground(new java.awt.Color(51, 51, 51));
        stat2.setText("--");

        jLabel131.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(51, 51, 51));
        jLabel131.setText("n/A");

        javax.swing.GroupLayout screen2_stat1Layout = new javax.swing.GroupLayout(screen2_stat1);
        screen2_stat1.setLayout(screen2_stat1Layout);
        screen2_stat1Layout.setHorizontalGroup(
            screen2_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(screen2_stat1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(screen2_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel128)
                    .addComponent(jLabel129)
                    .addComponent(jLabel130)
                    .addComponent(jLabel114))
                .addGap(145, 145, 145)
                .addGroup(screen2_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration_stat_screen2)
                    .addComponent(h_screen2_movietitle)
                    .addComponent(stat2)
                    .addComponent(jLabel131))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        screen2_stat1Layout.setVerticalGroup(
            screen2_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screen2_stat1Layout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen2_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(h_screen2_movietitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen2_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(screen2_stat1Layout.createSequentialGroup()
                        .addComponent(duration_stat_screen2)
                        .addGap(11, 11, 11)
                        .addComponent(stat2))
                    .addGroup(screen2_stat1Layout.createSequentialGroup()
                        .addComponent(jLabel128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel129)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(screen2_stat1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel130)
                            .addComponent(jLabel131))))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        screen2MP.setBackground(new java.awt.Color(130, 201, 148));
        screen2MP.setForeground(new java.awt.Color(0, 102, 51));
        screen2MP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screen2MP.setText("Movie Poster");
        screen2MP.setOpaque(true);

        h_issueticket2.setBackground(new java.awt.Color(255, 204, 0));
        h_issueticket2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_issueticket1h_IssueTicketbtn_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_issueticket2h_IssueTicketbtn_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_issueticket2h_IssueTicketbtn_exit(evt);
            }
        });

        jLabel151.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(255, 255, 255));
        jLabel151.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_buy_24px.png"))); // NOI18N
        jLabel151.setText("Issue Ticket ");

        javax.swing.GroupLayout h_issueticket2Layout = new javax.swing.GroupLayout(h_issueticket2);
        h_issueticket2.setLayout(h_issueticket2Layout);
        h_issueticket2Layout.setHorizontalGroup(
            h_issueticket2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
            .addGroup(h_issueticket2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel151)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        h_issueticket2Layout.setVerticalGroup(
            h_issueticket2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(h_issueticket2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel151)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        h_moreinfo4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel31.setBackground(new java.awt.Color(0, 204, 204));

        jLabel133.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setText("Time Elapsed");

        duration_screen2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        duration_screen2.setForeground(new java.awt.Color(255, 255, 255));
        duration_screen2.setText("--:--:--");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration_screen2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(duration_screen2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel32.setBackground(new java.awt.Color(204, 204, 0));

        jLabel134.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("IMDb Rating");

        rating_display_s2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rating_display_s2.setForeground(new java.awt.Color(255, 255, 255));
        rating_display_s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_star_24px_1.png"))); // NOI18N
        rating_display_s2.setText("0");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rating_display_s2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel134, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rating_display_s2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel33.setBackground(new java.awt.Color(204, 0, 204));

        jLabel135.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("Available Seats");

        h_seats_screen2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_seats_screen2.setForeground(new java.awt.Color(255, 255, 255));
        h_seats_screen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_armchair_24px_1.png"))); // NOI18N
        h_seats_screen2.setText("0");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_seats_screen2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel135))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_seats_screen2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(247, 104, 66));

        jLabel136.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("Time Started");

        h_timestarted_screen2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_timestarted_screen2.setForeground(new java.awt.Color(255, 255, 255));
        h_timestarted_screen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_time_24px.png"))); // NOI18N
        h_timestarted_screen2.setText("--:-- --");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel136)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(h_timestarted_screen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_timestarted_screen2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout h_moreinfo4Layout = new javax.swing.GroupLayout(h_moreinfo4);
        h_moreinfo4.setLayout(h_moreinfo4Layout);
        h_moreinfo4Layout.setHorizontalGroup(
            h_moreinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h_moreinfo4Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(h_moreinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(h_moreinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        h_moreinfo4Layout.setVerticalGroup(
            h_moreinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_moreinfo4Layout.createSequentialGroup()
                .addGroup(h_moreinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(h_moreinfo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        m_id2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        m_id2.setForeground(new java.awt.Color(102, 102, 102));
        m_id2.setText("-------");

        jLabel137.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(102, 102, 102));
        jLabel137.setText("Movie ID ");

        javax.swing.GroupLayout h_screen2Layout = new javax.swing.GroupLayout(h_screen2);
        h_screen2.setLayout(h_screen2Layout);
        h_screen2Layout.setHorizontalGroup(
            h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_screen2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(screen2_stat1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h_moreinfo4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen2Layout.createSequentialGroup()
                        .addComponent(jLabel137)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m_id2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(h_screen2Layout.createSequentialGroup()
                        .addGroup(h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h_issueticket2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(screen2MP, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addGap(69, 69, 69))))
        );
        h_screen2Layout.setVerticalGroup(
            h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_screen2Layout.createSequentialGroup()
                .addGroup(h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel137)
                    .addComponent(m_id2))
                .addGap(5, 5, 5)
                .addGroup(h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen2Layout.createSequentialGroup()
                        .addComponent(screen2MP, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(h_issueticket2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(h_screen2Layout.createSequentialGroup()
                        .addComponent(screen2_stat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(h_moreinfo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.add(h_screen2, "card3");

        h_screen3.setBackground(new java.awt.Color(255, 255, 255));

        screen3_stat5.setBackground(new java.awt.Color(255, 255, 255));
        screen3_stat5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 135, 225), 2));

        jPanel35.setBackground(new java.awt.Color(204, 135, 225));

        jLabel138.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_15px_1.png"))); // NOI18N
        jLabel138.setText("Screen 3 Status");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel139.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(51, 51, 51));
        jLabel139.setText("Current Movie");

        jLabel140.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(51, 51, 51));
        jLabel140.setText("Movie Duration");

        jLabel141.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(51, 51, 51));
        jLabel141.setText("Status");

        jLabel142.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(51, 51, 51));
        jLabel142.setText("Next Movie");

        h_screen3_movietitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        h_screen3_movietitle.setForeground(new java.awt.Color(51, 51, 51));
        h_screen3_movietitle.setText("n/A");

        duration_stat_screen3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        duration_stat_screen3.setForeground(new java.awt.Color(51, 51, 51));
        duration_stat_screen3.setText("--:--:--");

        stat3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        stat3.setForeground(new java.awt.Color(51, 51, 51));
        stat3.setText("--");

        jLabel143.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(51, 51, 51));
        jLabel143.setText("n/A");

        javax.swing.GroupLayout screen3_stat5Layout = new javax.swing.GroupLayout(screen3_stat5);
        screen3_stat5.setLayout(screen3_stat5Layout);
        screen3_stat5Layout.setHorizontalGroup(
            screen3_stat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(screen3_stat5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(screen3_stat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140)
                    .addComponent(jLabel141)
                    .addComponent(jLabel142)
                    .addComponent(jLabel139))
                .addGap(145, 145, 145)
                .addGroup(screen3_stat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration_stat_screen3)
                    .addComponent(h_screen3_movietitle)
                    .addComponent(stat3)
                    .addComponent(jLabel143))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        screen3_stat5Layout.setVerticalGroup(
            screen3_stat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screen3_stat5Layout.createSequentialGroup()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen3_stat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel139)
                    .addComponent(h_screen3_movietitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen3_stat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(screen3_stat5Layout.createSequentialGroup()
                        .addComponent(duration_stat_screen3)
                        .addGap(11, 11, 11)
                        .addComponent(stat3))
                    .addGroup(screen3_stat5Layout.createSequentialGroup()
                        .addComponent(jLabel140)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel141)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(screen3_stat5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel142)
                            .addComponent(jLabel143))))
                .addGap(0, 14, Short.MAX_VALUE))
        );

        screen3MP.setBackground(new java.awt.Color(153, 204, 255));
        screen3MP.setForeground(new java.awt.Color(0, 107, 178));
        screen3MP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screen3MP.setText("Movie Poster");
        screen3MP.setOpaque(true);

        h_issueticket3.setBackground(new java.awt.Color(255, 204, 0));
        h_issueticket3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_issueticket1h_IssueTicketbtn_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_issueticket3h_IssueTicketbtn_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_issueticket3h_IssueTicketbtn_exit(evt);
            }
        });

        jLabel152.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_buy_24px.png"))); // NOI18N
        jLabel152.setText("Issue Ticket ");

        javax.swing.GroupLayout h_issueticket3Layout = new javax.swing.GroupLayout(h_issueticket3);
        h_issueticket3.setLayout(h_issueticket3Layout);
        h_issueticket3Layout.setHorizontalGroup(
            h_issueticket3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 152, Short.MAX_VALUE)
            .addGroup(h_issueticket3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel152)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        h_issueticket3Layout.setVerticalGroup(
            h_issueticket3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(h_issueticket3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel152)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        h_moreinfo9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel36.setBackground(new java.awt.Color(0, 204, 204));

        jLabel145.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setText("Time Elapsed");

        duration_screen3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        duration_screen3.setForeground(new java.awt.Color(255, 255, 255));
        duration_screen3.setText("--:--:--");

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration_screen3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel145))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(duration_screen3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel37.setBackground(new java.awt.Color(204, 204, 0));

        jLabel146.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setText("IMDb Rating");

        rating_display_s3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rating_display_s3.setForeground(new java.awt.Color(255, 255, 255));
        rating_display_s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_star_24px_1.png"))); // NOI18N
        rating_display_s3.setText("0");

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rating_display_s3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel146))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel146, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rating_display_s3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel38.setBackground(new java.awt.Color(204, 0, 204));

        jLabel147.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setText("Available Seats");

        h_seats_screen3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_seats_screen3.setForeground(new java.awt.Color(255, 255, 255));
        h_seats_screen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_armchair_24px_1.png"))); // NOI18N
        h_seats_screen3.setText("0");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_seats_screen3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel147))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_seats_screen3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel40.setBackground(new java.awt.Color(247, 104, 66));

        jLabel148.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setText("Time Started");

        h_timestarted_screen3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_timestarted_screen3.setForeground(new java.awt.Color(255, 255, 255));
        h_timestarted_screen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_time_24px.png"))); // NOI18N
        h_timestarted_screen3.setText("--:-- --");

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel148)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(h_timestarted_screen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_timestarted_screen3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout h_moreinfo9Layout = new javax.swing.GroupLayout(h_moreinfo9);
        h_moreinfo9.setLayout(h_moreinfo9Layout);
        h_moreinfo9Layout.setHorizontalGroup(
            h_moreinfo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h_moreinfo9Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(h_moreinfo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(h_moreinfo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        h_moreinfo9Layout.setVerticalGroup(
            h_moreinfo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_moreinfo9Layout.createSequentialGroup()
                .addGroup(h_moreinfo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(h_moreinfo9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        m_id3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        m_id3.setForeground(new java.awt.Color(102, 102, 102));
        m_id3.setText("-------");

        jLabel149.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(102, 102, 102));
        jLabel149.setText("Movie ID ");

        javax.swing.GroupLayout h_screen3Layout = new javax.swing.GroupLayout(h_screen3);
        h_screen3.setLayout(h_screen3Layout);
        h_screen3Layout.setHorizontalGroup(
            h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_screen3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(screen3_stat5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h_moreinfo9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen3Layout.createSequentialGroup()
                        .addComponent(jLabel149)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(m_id3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(h_screen3Layout.createSequentialGroup()
                        .addGroup(h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(h_issueticket3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(screen3MP, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                        .addGap(69, 69, 69))))
        );
        h_screen3Layout.setVerticalGroup(
            h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_screen3Layout.createSequentialGroup()
                .addGroup(h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel149)
                    .addComponent(m_id3))
                .addGap(5, 5, 5)
                .addGroup(h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen3Layout.createSequentialGroup()
                        .addComponent(screen3MP, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(h_issueticket3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(h_screen3Layout.createSequentialGroup()
                        .addComponent(screen3_stat5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(h_moreinfo9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane3.add(h_screen3, "card4");

        javax.swing.GroupLayout home_pLayout = new javax.swing.GroupLayout(home_p);
        home_p.setLayout(home_pLayout);
        home_pLayout.setHorizontalGroup(
            home_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_pLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(h_btnscreen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(h_btnscreen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(h_btnscreen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLayeredPane3)
        );
        home_pLayout.setVerticalGroup(
            home_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_pLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(home_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_btnscreen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h_btnscreen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h_btnscreen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane3))
        );

        main_panel.add(home_p, "card2");

        add_p.setBackground(new java.awt.Color(255, 255, 255));
        add_p.setMaximumSize(new java.awt.Dimension(769, 439));
        add_p.setMinimumSize(new java.awt.Dimension(769, 439));
        add_p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(0, 0, 102));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Select Ticket");

        jLabel82.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(0, 51, 153));
        jLabel82.setText("Adult");

        jLabel83.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 51, 153));
        jLabel83.setText("Child");

        jLabel84.setFont(new java.awt.Font("Microsoft PhagsPa", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 51, 153));
        jLabel84.setText("Senior");

        jLabel85.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 0, 102));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Quantity");

        jLabel86.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 0, 102));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Price");

        adult_price_display.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        adult_price_display.setForeground(new java.awt.Color(0, 0, 102));
        adult_price_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adult_price_display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media2/icons8_peso_symbol_18px.png"))); // NOI18N
        adult_price_display.setText("0.00");

        child_price_display.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        child_price_display.setForeground(new java.awt.Color(0, 0, 102));
        child_price_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        child_price_display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media2/icons8_peso_symbol_18px.png"))); // NOI18N
        child_price_display.setText("0.00");

        senior_price_display.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senior_price_display.setForeground(new java.awt.Color(0, 0, 102));
        senior_price_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        senior_price_display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media2/icons8_peso_symbol_18px.png"))); // NOI18N
        senior_price_display.setText("0.00");

        jLabel90.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(165, 165, 0));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Total: ");

        subtotal_display.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        subtotal_display.setForeground(new java.awt.Color(102, 153, 0));
        subtotal_display.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtotal_display.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media2/icons8_peso_symbol_30px.png"))); // NOI18N
        subtotal_display.setText("0.0");

        a_reset.setBackground(new java.awt.Color(255, 153, 102));
        a_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_selectticket_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a_selectticketbtn_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a_selectticketbtn_exit(evt);
            }
        });

        jLabel92.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("Reset");

        javax.swing.GroupLayout a_resetLayout = new javax.swing.GroupLayout(a_reset);
        a_reset.setLayout(a_resetLayout);
        a_resetLayout.setHorizontalGroup(
            a_resetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a_resetLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel92)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        a_resetLayout.setVerticalGroup(
            a_resetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        a_checkout.setBackground(new java.awt.Color(204, 204, 0));
        a_checkout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_selectticket_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a_selectticketbtn_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a_selectticketbtn_exit(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("Checkout");

        javax.swing.GroupLayout a_checkoutLayout = new javax.swing.GroupLayout(a_checkout);
        a_checkout.setLayout(a_checkoutLayout);
        a_checkoutLayout.setHorizontalGroup(
            a_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a_checkoutLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel93)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        a_checkoutLayout.setVerticalGroup(
            a_checkoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        child_spinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        adult_spinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        senior_spinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(a_reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(a_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel82)
                                    .addComponent(jLabel84)
                                    .addComponent(jLabel83))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(child_spinner)
                                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(adult_spinner)
                                    .addComponent(senior_spinner))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel86))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(child_price_display)
                                            .addComponent(adult_price_display)
                                            .addComponent(senior_price_display)))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel90)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(subtotal_display)))
                        .addContainerGap(85, Short.MAX_VALUE))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel81)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81)
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jLabel86))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adult_price_display)
                    .addComponent(jLabel82)
                    .addComponent(adult_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(child_price_display)
                    .addComponent(jLabel83)
                    .addComponent(child_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senior_price_display)
                    .addComponent(jLabel84)
                    .addComponent(senior_spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(subtotal_display))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(a_checkout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_reset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        add_p.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 430, 430));

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel24MouseEntered(evt);
            }
        });
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        st_movieposter.setBackground(new java.awt.Color(102, 102, 102));
        st_movieposter.setForeground(new java.awt.Color(51, 51, 51));
        st_movieposter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        st_movieposter.setText("Movie Poster");
        st_movieposter.setOpaque(true);
        jPanel24.add(st_movieposter, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 150));

        jLabel94.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("Select Movie");
        jPanel24.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, -1, -1));

        selectmovies_cb.setBackground(new java.awt.Color(102, 102, 102));
        selectmovies_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Movie" }));
        selectmovies_cb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectmovies_cbMouseClicked(evt);
            }
        });
        jPanel24.add(selectmovies_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 290, 25));

        it_screen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        it_screen.setForeground(new java.awt.Color(255, 255, 255));
        it_screen.setText("Screen #");
        it_screen.setToolTipText("");
        jPanel24.add(it_screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel97.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("Time");
        jPanel24.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jSeparator3.setOpaque(true);
        jPanel24.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, -1));

        jSeparator4.setOpaque(true);
        jPanel24.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 270, -1));

        m_sched_id.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        m_sched_id.setForeground(new java.awt.Color(255, 255, 255));
        m_sched_id.setText(" ------------------");
        jPanel24.add(m_sched_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 140, -1));

        a_date.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        a_date.setForeground(new java.awt.Color(255, 255, 255));
        a_date.setText("--- --,----");
        jPanel24.add(a_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 140, 30));

        a_vs.setBackground(new java.awt.Color(255, 204, 0));
        a_vs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a_selectticket_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                a_selectticketbtn_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                a_selectticketbtn_exit(evt);
            }
        });

        jLabel100.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_20px_1.png"))); // NOI18N
        jLabel100.setText("View Schedule");

        javax.swing.GroupLayout a_vsLayout = new javax.swing.GroupLayout(a_vs);
        a_vs.setLayout(a_vsLayout);
        a_vsLayout.setHorizontalGroup(
            a_vsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(a_vsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        a_vsLayout.setVerticalGroup(
            a_vsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel24.add(a_vs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 170, 30));

        jLabel99.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Select Date");
        jPanel24.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 35, -1, -1));

        it_time_cb.setBackground(new java.awt.Color(102, 102, 102));
        it_time_cb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Time" }));
        it_time_cb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                it_time_cbMouseClicked(evt);
            }
        });
        jPanel24.add(it_time_cb, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 120, 22));

        it_date_field.setForeground(new java.awt.Color(0, 0, 102));
        it_date_field.setToolTipText("Choose Date");
        it_date_field.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        it_date_field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media2/icons8_schedule_15px.png")));
        it_date_field.setRequestFocusEnabled(false);
        it_date_field.setVerifyInputWhenFocusTarget(false);
        jPanel24.add(it_date_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 60, 150, -1));

        it_seats.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        it_seats.setForeground(new java.awt.Color(255, 255, 255));
        it_seats.setText("Available Seats: #");
        jPanel24.add(it_seats, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jLabel101.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("Date");
        jPanel24.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        midlabel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        midlabel.setForeground(new java.awt.Color(255, 255, 255));
        midlabel.setText("Movie ID:");
        jPanel24.add(midlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 50, -1));

        add_p.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 320, 430));

        main_panel.add(add_p, "card3");

        ms_p.setBackground(new java.awt.Color(255, 255, 255));

        home_p1.setBackground(new java.awt.Color(255, 255, 255));

        ms_btnscreen1.setBackground(new java.awt.Color(247, 104, 66));
        ms_btnscreen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ms_btnscreen1ms_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ms_btnscreen1ms_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ms_btnscreen1ms_btns_exit(evt);
            }
        });

        jLabel98.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel98.setText("Screen 1");

        javax.swing.GroupLayout ms_btnscreen1Layout = new javax.swing.GroupLayout(ms_btnscreen1);
        ms_btnscreen1.setLayout(ms_btnscreen1Layout);
        ms_btnscreen1Layout.setHorizontalGroup(
            ms_btnscreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_btnscreen1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel98)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ms_btnscreen1Layout.setVerticalGroup(
            ms_btnscreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        ms_btnscreen2.setBackground(new java.awt.Color(0, 204, 204));
        ms_btnscreen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ms_btnscreen2ms_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ms_btnscreen2ms_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ms_btnscreen2ms_btns_exit(evt);
            }
        });

        jLabel112.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel112.setText("Screen 2");

        javax.swing.GroupLayout ms_btnscreen2Layout = new javax.swing.GroupLayout(ms_btnscreen2);
        ms_btnscreen2.setLayout(ms_btnscreen2Layout);
        ms_btnscreen2Layout.setHorizontalGroup(
            ms_btnscreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_btnscreen2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel112)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ms_btnscreen2Layout.setVerticalGroup(
            ms_btnscreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        ms_btnscreen3.setBackground(new java.awt.Color(204, 0, 204));
        ms_btnscreen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ms_btnscreen3ms_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ms_btnscreen3ms_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ms_btnscreen3ms_btns_exit(evt);
            }
        });

        jLabel113.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel113.setText("Screen 3");

        javax.swing.GroupLayout ms_btnscreen3Layout = new javax.swing.GroupLayout(ms_btnscreen3);
        ms_btnscreen3.setLayout(ms_btnscreen3Layout);
        ms_btnscreen3Layout.setHorizontalGroup(
            ms_btnscreen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_btnscreen3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel113)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ms_btnscreen3Layout.setVerticalGroup(
            ms_btnscreen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        ms_btnscreen4.setBackground(new java.awt.Color(108, 153, 74));
        ms_btnscreen4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ms_btnscreen4ms_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ms_btnscreen4ms_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ms_btnscreen4ms_btns_exit(evt);
            }
        });

        jLabel124.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel124.setText("All Screens");

        javax.swing.GroupLayout ms_btnscreen4Layout = new javax.swing.GroupLayout(ms_btnscreen4);
        ms_btnscreen4.setLayout(ms_btnscreen4Layout);
        ms_btnscreen4Layout.setHorizontalGroup(
            ms_btnscreen4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_btnscreen4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel124)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        ms_btnscreen4Layout.setVerticalGroup(
            ms_btnscreen4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jLayeredPane2.setLayout(new java.awt.CardLayout());

        ms_all_screens.setBackground(new java.awt.Color(255, 255, 255));

        screen3_stat4.setBackground(new java.awt.Color(255, 255, 255));
        screen3_stat4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(108, 153, 74), 2));
        screen3_stat4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel46.setBackground(new java.awt.Color(108, 153, 74));

        jLabel160.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel160.setForeground(new java.awt.Color(255, 255, 255));
        jLabel160.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_15px_1.png"))); // NOI18N
        jLabel160.setText("All Screens Schedule");

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 552, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel160, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        screen3_stat4.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        am13.setBackground(new java.awt.Color(108, 153, 74));
        am13.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel125.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("Search by Title");

        all_screens_searchbar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        all_screens_searchbar.setForeground(new java.awt.Color(10, 10, 0));

        jLabel126.setBackground(new java.awt.Color(71, 102, 49));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_search_14px.png"))); // NOI18N
        jLabel126.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel126.setOpaque(true);
        jLabel126.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel132search_btns_viewssched(evt);
            }
        });

        javax.swing.GroupLayout am13Layout = new javax.swing.GroupLayout(am13);
        am13.setLayout(am13Layout);
        am13Layout.setHorizontalGroup(
            am13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel125)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(all_screens_searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        am13Layout.setVerticalGroup(
            am13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am13Layout.createSequentialGroup()
                .addGroup(am13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(all_screens_searchbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        screen3_stat4.add(am13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 35, 284, 30));

        am14.setBackground(new java.awt.Color(108, 153, 74));
        am14.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel127.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("Search by Date");

        allscreen_date_search.setForeground(new java.awt.Color(0, 0, 102));
        allscreen_date_search.setToolTipText("Choose Date");
        allscreen_date_search.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        allscreen_date_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media2/icons8_calendar_15px_allscreen.png")));
        allscreen_date_search.setRequestFocusEnabled(false);
        allscreen_date_search.setVerifyInputWhenFocusTarget(false);

        jLabel132.setBackground(new java.awt.Color(71, 102, 49));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_search_14px.png"))); // NOI18N
        jLabel132.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel132.setOpaque(true);
        jLabel132.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel132search_btns_viewssched(evt);
            }
        });

        javax.swing.GroupLayout am14Layout = new javax.swing.GroupLayout(am14);
        am14.setLayout(am14Layout);
        am14Layout.setHorizontalGroup(
            am14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel127)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allscreen_date_search, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        am14Layout.setVerticalGroup(
            am14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am14Layout.createSequentialGroup()
                .addGroup(am14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(allscreen_date_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        screen3_stat4.add(am14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 265, 30));

        ms_screen_table_all.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie Title", "Date Scheduled", "Time Scheduled", "Movie Screen", "Available Seats"
            }
        ));
        jScrollPane7.setViewportView(ms_screen_table_all);

        screen3_stat4.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 670, 260));

        h_moreinfo8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout h_moreinfo8Layout = new javax.swing.GroupLayout(h_moreinfo8);
        h_moreinfo8.setLayout(h_moreinfo8Layout);
        h_moreinfo8Layout.setHorizontalGroup(
            h_moreinfo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        h_moreinfo8Layout.setVerticalGroup(
            h_moreinfo8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ms_all_screensLayout = new javax.swing.GroupLayout(ms_all_screens);
        ms_all_screens.setLayout(ms_all_screensLayout);
        ms_all_screensLayout.setHorizontalGroup(
            ms_all_screensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_all_screensLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(ms_all_screensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_moreinfo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(screen3_stat4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        ms_all_screensLayout.setVerticalGroup(
            ms_all_screensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_all_screensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screen3_stat4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_moreinfo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        jLayeredPane2.add(ms_all_screens, "card4");

        ms_screen1.setBackground(new java.awt.Color(255, 255, 255));

        screen3_stat2.setBackground(new java.awt.Color(255, 255, 255));
        screen3_stat2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(247, 104, 66), 2));
        screen3_stat2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel44.setBackground(new java.awt.Color(247, 104, 66));

        jLabel159.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel159.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_15px_1.png"))); // NOI18N
        jLabel159.setText("Screen 1 Schedule");

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 571, Short.MAX_VALUE))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel159, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        screen3_stat2.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        ms_screen1_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie Title", "Date Scheduled", "Time Scheduled"
            }
        ));
        ms_screen1_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(ms_screen1_table);

        screen3_stat2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 675, 260));

        am7.setBackground(new java.awt.Color(247, 104, 66));
        am7.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel115.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("Search by Title");

        searchbar_t_1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        searchbar_t_1.setForeground(new java.awt.Color(10, 10, 0));

        searchtitle_screen1.setBackground(new java.awt.Color(173, 72, 45));
        searchtitle_screen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchtitle_screen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_search_14px.png"))); // NOI18N
        searchtitle_screen1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchtitle_screen1.setOpaque(true);
        searchtitle_screen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchdate_screen1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout am7Layout = new javax.swing.GroupLayout(am7);
        am7.setLayout(am7Layout);
        am7Layout.setHorizontalGroup(
            am7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchbar_t_1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchtitle_screen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        am7Layout.setVerticalGroup(
            am7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am7Layout.createSequentialGroup()
                .addGroup(am7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(searchtitle_screen1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbar_t_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        screen3_stat2.add(am7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 35, 284, 30));

        am8.setBackground(new java.awt.Color(247, 104, 66));
        am8.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel116.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("Search by Date");

        date_field_screen1.setForeground(new java.awt.Color(0, 0, 102));
        date_field_screen1.setToolTipText("Choose Date");
        date_field_screen1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        date_field_screen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media2/icons8_calendar_15px_screen1.png")));
        date_field_screen1.setRequestFocusEnabled(false);
        date_field_screen1.setVerifyInputWhenFocusTarget(false);

        searchdate_screen1.setBackground(new java.awt.Color(173, 72, 45));
        searchdate_screen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchdate_screen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_search_14px.png"))); // NOI18N
        searchdate_screen1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchdate_screen1.setOpaque(true);
        searchdate_screen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchdate_screen1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout am8Layout = new javax.swing.GroupLayout(am8);
        am8.setLayout(am8Layout);
        am8Layout.setHorizontalGroup(
            am8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_field_screen1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchdate_screen1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        am8Layout.setVerticalGroup(
            am8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am8Layout.createSequentialGroup()
                .addGroup(am8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(date_field_screen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchdate_screen1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        screen3_stat2.add(am8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 265, 30));

        h_moreinfo7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout h_moreinfo7Layout = new javax.swing.GroupLayout(h_moreinfo7);
        h_moreinfo7.setLayout(h_moreinfo7Layout);
        h_moreinfo7Layout.setHorizontalGroup(
            h_moreinfo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        h_moreinfo7Layout.setVerticalGroup(
            h_moreinfo7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ms_screen1Layout = new javax.swing.GroupLayout(ms_screen1);
        ms_screen1.setLayout(ms_screen1Layout);
        ms_screen1Layout.setHorizontalGroup(
            ms_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_screen1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(ms_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_moreinfo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(screen3_stat2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        ms_screen1Layout.setVerticalGroup(
            ms_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_screen1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screen3_stat2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_moreinfo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        jLayeredPane2.add(ms_screen1, "card4");

        ms_screen2.setBackground(new java.awt.Color(255, 255, 255));

        screen3_stat3.setBackground(new java.awt.Color(255, 255, 255));
        screen3_stat3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        screen3_stat3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel45.setBackground(new java.awt.Color(0, 204, 204));

        jLabel168.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_15px_1.png"))); // NOI18N
        jLabel168.setText("Screen 2 Schedule");

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 571, Short.MAX_VALUE))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel168, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        screen3_stat3.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        am11.setBackground(new java.awt.Color(0, 204, 204));
        am11.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel121.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("Search by Title");

        searchbar_t_2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        searchbar_t_2.setForeground(new java.awt.Color(10, 10, 0));

        searchtitle_screen2.setBackground(new java.awt.Color(0, 127, 127));
        searchtitle_screen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchtitle_screen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_search_14px.png"))); // NOI18N
        searchtitle_screen2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchtitle_screen2.setOpaque(true);
        searchtitle_screen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchdate_screen1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout am11Layout = new javax.swing.GroupLayout(am11);
        am11.setLayout(am11Layout);
        am11Layout.setHorizontalGroup(
            am11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchbar_t_2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchtitle_screen2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        am11Layout.setVerticalGroup(
            am11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am11Layout.createSequentialGroup()
                .addGroup(am11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(searchtitle_screen2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbar_t_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        screen3_stat3.add(am11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 35, 284, 30));

        am12.setBackground(new java.awt.Color(0, 204, 204));
        am12.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel123.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setText("Search by Date");

        date_field_screen2.setForeground(new java.awt.Color(0, 0, 102));
        date_field_screen2.setToolTipText("Choose Date");
        date_field_screen2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        date_field_screen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media2/icons8_calendar_15px_screen2.png")));
        date_field_screen2.setRequestFocusEnabled(false);
        date_field_screen2.setVerifyInputWhenFocusTarget(false);

        searchdate_screen2.setBackground(new java.awt.Color(0, 127, 127));
        searchdate_screen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchdate_screen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_search_14px.png"))); // NOI18N
        searchdate_screen2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchdate_screen2.setOpaque(true);
        searchdate_screen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchdate_screen1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout am12Layout = new javax.swing.GroupLayout(am12);
        am12.setLayout(am12Layout);
        am12Layout.setHorizontalGroup(
            am12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel123)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_field_screen2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchdate_screen2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        am12Layout.setVerticalGroup(
            am12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am12Layout.createSequentialGroup()
                .addGroup(am12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(date_field_screen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchdate_screen2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        screen3_stat3.add(am12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 265, 30));

        ms_screen2_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie Title", "Date Scheduled", "Time Scheduled"
            }
        ));
        ms_screen2_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(ms_screen2_table);

        screen3_stat3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 675, 260));

        h_moreinfo6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout h_moreinfo6Layout = new javax.swing.GroupLayout(h_moreinfo6);
        h_moreinfo6.setLayout(h_moreinfo6Layout);
        h_moreinfo6Layout.setHorizontalGroup(
            h_moreinfo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        h_moreinfo6Layout.setVerticalGroup(
            h_moreinfo6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ms_screen2Layout = new javax.swing.GroupLayout(ms_screen2);
        ms_screen2.setLayout(ms_screen2Layout);
        ms_screen2Layout.setHorizontalGroup(
            ms_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_screen2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(ms_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_moreinfo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(screen3_stat3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        ms_screen2Layout.setVerticalGroup(
            ms_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_screen2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screen3_stat3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_moreinfo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        jLayeredPane2.add(ms_screen2, "card4");

        ms_screen3.setBackground(new java.awt.Color(255, 255, 255));

        screen3_stat1.setBackground(new java.awt.Color(255, 255, 255));
        screen3_stat1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204), 2));
        screen3_stat1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel39.setBackground(new java.awt.Color(204, 0, 204));

        jLabel150.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel150.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_15px_1.png"))); // NOI18N
        jLabel150.setText("Screen 3 Schedule");

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 571, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel150, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        screen3_stat1.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        am9.setBackground(new java.awt.Color(204, 0, 204));
        am9.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel118.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("Search by Title");

        searchbar_t_3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        searchbar_t_3.setForeground(new java.awt.Color(10, 10, 0));

        searchtitle_screen3.setBackground(new java.awt.Color(127, 0, 127));
        searchtitle_screen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchtitle_screen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_search_14px.png"))); // NOI18N
        searchtitle_screen3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchtitle_screen3.setOpaque(true);
        searchtitle_screen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchdate_screen1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout am9Layout = new javax.swing.GroupLayout(am9);
        am9.setLayout(am9Layout);
        am9Layout.setHorizontalGroup(
            am9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchbar_t_3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchtitle_screen3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2))
        );
        am9Layout.setVerticalGroup(
            am9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am9Layout.createSequentialGroup()
                .addGroup(am9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(searchtitle_screen3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchbar_t_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        screen3_stat1.add(am9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 35, 284, 30));

        am10.setBackground(new java.awt.Color(204, 0, 204));
        am10.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel120.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("Search by Date");

        date_field_screen3.setForeground(new java.awt.Color(0, 0, 102));
        date_field_screen3.setToolTipText("Choose Date");
        date_field_screen3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        date_field_screen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_calendar_15px_violet.png")));
        date_field_screen3.setRequestFocusEnabled(false);
        date_field_screen3.setVerifyInputWhenFocusTarget(false);

        searchdate_screen3.setBackground(new java.awt.Color(127, 0, 127));
        searchdate_screen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchdate_screen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_search_14px.png"))); // NOI18N
        searchdate_screen3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchdate_screen3.setOpaque(true);
        searchdate_screen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchdate_screen1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout am10Layout = new javax.swing.GroupLayout(am10);
        am10.setLayout(am10Layout);
        am10Layout.setHorizontalGroup(
            am10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date_field_screen3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchdate_screen3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        am10Layout.setVerticalGroup(
            am10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am10Layout.createSequentialGroup()
                .addGroup(am10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(date_field_screen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchdate_screen3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        screen3_stat1.add(am10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 35, 265, 30));

        ms_screen3_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Movie Title", "Date Scheduled", "Time Scheduled"
            }
        ));
        ms_screen3_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(ms_screen3_table);

        screen3_stat1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 675, 260));

        h_moreinfo5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout h_moreinfo5Layout = new javax.swing.GroupLayout(h_moreinfo5);
        h_moreinfo5.setLayout(h_moreinfo5Layout);
        h_moreinfo5Layout.setHorizontalGroup(
            h_moreinfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 486, Short.MAX_VALUE)
        );
        h_moreinfo5Layout.setVerticalGroup(
            h_moreinfo5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 185, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ms_screen3Layout = new javax.swing.GroupLayout(ms_screen3);
        ms_screen3.setLayout(ms_screen3Layout);
        ms_screen3Layout.setHorizontalGroup(
            ms_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_screen3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(ms_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_moreinfo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(screen3_stat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        ms_screen3Layout.setVerticalGroup(
            ms_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ms_screen3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screen3_stat1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_moreinfo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );

        jLayeredPane2.add(ms_screen3, "card4");

        javax.swing.GroupLayout home_p1Layout = new javax.swing.GroupLayout(home_p1);
        home_p1.setLayout(home_p1Layout);
        home_p1Layout.setHorizontalGroup(
            home_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, home_p1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ms_btnscreen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ms_btnscreen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ms_btnscreen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ms_btnscreen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        home_p1Layout.setVerticalGroup(
            home_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(home_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ms_btnscreen3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ms_btnscreen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ms_btnscreen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ms_btnscreen4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2))
        );

        javax.swing.GroupLayout ms_pLayout = new javax.swing.GroupLayout(ms_p);
        ms_p.setLayout(ms_pLayout);
        ms_pLayout.setHorizontalGroup(
            ms_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
            .addGroup(ms_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ms_pLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(home_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        ms_pLayout.setVerticalGroup(
            ms_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 925, Short.MAX_VALUE)
            .addGroup(ms_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ms_pLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(home_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        main_panel.add(ms_p, "card4");

        main_pane.add(main_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 770, 440));

        background.add(main_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 770, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnhomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMousePressed
        // home on pressed
        setSPColor(btnhome);
        resetSPColor(btnadd);
        resetSPColor(btnmoviescreen);
        resetSPColor(btnlogout);
    }//GEN-LAST:event_btnhomeMousePressed

    private void btnmoviescreenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmoviescreenMousePressed
        // on press ms
        setSPColor(btnmoviescreen);
        resetSPColor(btnhome);
        resetSPColor(btnadd);
        resetSPColor(btnlogout);
    }//GEN-LAST:event_btnmoviescreenMousePressed

    private void btnlogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMousePressed
        // on pressed lg
        setSPColor(btnlogout);
        resetSPColor(btnhome);
        resetSPColor(btnadd);
        resetSPColor(btnmoviescreen);
    }//GEN-LAST:event_btnlogoutMousePressed

    private void btnlogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseReleased
        // log out -back to log in form
        dispose();
        login_staff out = new login_staff();
        out.show(true);
    }//GEN-LAST:event_btnlogoutMouseReleased

    private void side_buttons_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_buttons_enter
        // hover in [229,203,194]
        if (evt.getSource()== btnhome)
            btnhome.setBackground(new java.awt.Color(204,51,0));
        if (evt.getSource()== btnadd)
            btnadd.setBackground(new java.awt.Color(204,51,0));
        if (evt.getSource()== btnmoviescreen)
            btnmoviescreen.setBackground(new java.awt.Color(204,51,0));
        if (evt.getSource()== btnlogout)
            btnlogout.setBackground(new java.awt.Color(204,51,0));
        
    }//GEN-LAST:event_side_buttons_enter

    private void side_buttons_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_buttons_exit
        // hover out
        if (evt.getSource()== btnhome)
            btnhome.setBackground(new java.awt.Color(228,68,33));
        if (evt.getSource()== btnadd)
            btnadd.setBackground(new java.awt.Color(228,68,33));
        if (evt.getSource()== btnmoviescreen)
            btnmoviescreen.setBackground(new java.awt.Color(228,68,33));
        if (evt.getSource()== btnlogout)
            btnlogout.setBackground(new java.awt.Color(228,68,33));
        
    }//GEN-LAST:event_side_buttons_exit

    private void side_btn_release(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_side_btn_release

    }//GEN-LAST:event_side_btn_release

    private void side_btn_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_btn_clicked
        // side btn action
        if (evt.getSource()==btnhome){
            home_p.setVisible(true);
            add_p.setVisible(false);
            ms_p.setVisible(false);
            top_home.setVisible(true);
            top_add.setVisible(false);
            top_ms.setVisible(false);
        }
        if (evt.getSource()==btnadd){
            home_p.setVisible(false);
            add_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
        if (evt.getSource()==btnmoviescreen){
            home_p.setVisible(false);
            add_p.setVisible(false);
            ms_p.setVisible(true);
            top_home.setVisible(false);
            top_add.setVisible(false);
            top_ms.setVisible(true);
        }
    }//GEN-LAST:event_side_btn_clicked

    private void a_selectticketbtn_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_selectticketbtn_enter
    // hover in select ticket add panel/ purchase ticket panel g= 204,204,0 red= 255,153,102
     if (evt.getSource()==a_checkout)
         a_checkout.setBackground(new java.awt.Color(153,153,0));
     if (evt.getSource()==a_reset)
         a_reset.setBackground(new java.awt.Color(255,102,51));  
     if (evt.getSource()==a_vs)
         a_vs.setBackground(new java.awt.Color(204,153,0));  
     
    }//GEN-LAST:event_a_selectticketbtn_enter

    private void a_selectticketbtn_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_selectticketbtn_exit
     // hover out select ticket add panel/ purchase ticket panel g= 204,204,0 red= 255,153,102
     if (evt.getSource()==a_checkout)
         a_checkout.setBackground(new java.awt.Color(204,204,0));
     if (evt.getSource()==a_reset)
         a_reset.setBackground(new java.awt.Color(255,153,102));
     if (evt.getSource()==a_vs)
         a_vs.setBackground(new java.awt.Color(255,204,0)); 
    }//GEN-LAST:event_a_selectticketbtn_exit

    private void btnaddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMousePressed
        //pressed add/purchase ticket
        resetSPColor(btnlogout);
        resetSPColor(btnhome);
        setSPColor(btnadd);
        resetSPColor(btnmoviescreen);
        
    }//GEN-LAST:event_btnaddMousePressed

    private void selectmovies_cbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectmovies_cbMouseClicked
        //combo boc selecting movies to purchase
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
        SimpleDateFormat sdf2= new SimpleDateFormat("MMM dd,y");
        String date2 = sdf2.format(it_date_field.getDate());
        
        
        String sql= "Select * from movies where movie_date='"+date2+"'";
        PreparedStatement pst=con.prepareStatement(sql);
        //pst.setString(1,date2);
        ResultSet rs = pst.executeQuery();
        //resetting combo box
        selectmovies_cb.removeAllItems();
        selectmovies_cb.addItem("Select Movie");
        
            while(rs.next()){
            String ms_movies=rs.getString("movie_title");
            selectmovies_cb.addItem(ms_movies);
            
           
            }
            
        
        }catch(Exception e){
        
        }
        
    }//GEN-LAST:event_selectmovies_cbMouseClicked

    private void jPanel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseEntered
        //displaying image of selected movie -used this event para mas paspas ang response
        
        
        
        
        String SelectedMovie = selectmovies_cb.getSelectedItem().toString();
        String SelectedTime = it_time_cb.getSelectedItem().toString();
        
            if (SelectedMovie.trim().equals("Select Movie")){
            st_movieposter.setText("Movie Poster");
            st_movieposter.setIcon(null);
            it_time_cb.removeAllItems();    
            it_time_cb.addItem("Select Time");
            adult_price_display.setText("0.00");
            senior_price_display.setText("0.00");
            child_price_display.setText("0.00");
            it_screen.setText("Screen #");
            it_seats.setText("Available Seats: #");
            m_sched_id.setText("------------------");
            }else{
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
                    String sql2= "Select * from movies where movie_title='"+SelectedMovie+"'";
                    PreparedStatement pst2=con.prepareStatement(sql2);
                    //pst.setString(1,date2);
                    ResultSet rs2 = pst2.executeQuery();
                    
        
                     while(rs2.next()){
                     selected_mp = rs2.getBytes("movie_poster");
                     
                     
                     }
                     //displaying image from sql -trial
                    ImageIcon imageicon = new ImageIcon(new ImageIcon (selected_mp).getImage().getScaledInstance(st_movieposter.getWidth(),st_movieposter.getHeight(),Image.SCALE_SMOOTH));
                    
                    st_movieposter.setIcon(imageicon);
                    st_movieposter.setText("");
                    
                    
                    SimpleDateFormat sdf3= new SimpleDateFormat("MMM dd,y");
                    String date3 = sdf3.format(it_date_field.getDate());
                    a_date.setText(date3);
                    
                    if (SelectedTime.trim().equals("Select Time")){
                    it_screen.setText("Screen #");
                    it_seats.setText("Available Seats: #");
                    m_sched_id.setText("------------------");
                    adult_price_display.setText("0.00");
                    senior_price_display.setText("0.00");
                    child_price_display.setText("0.00");
                    
                    }else{
                      
                        
                        //screen # & available seats
                    String sql4= "Select * from schedule_movies where movie_title='"+SelectedMovie+"' AND movie_date='"+date3+"' AND airing_time='"+SelectedTime+"'";
                    String sql_price = "Select * from movies where movie_title='"+SelectedMovie+"' AND movie_date='"+date3+"'";
                    PreparedStatement pst4=con.prepareStatement(sql4);
                    ResultSet rs4 = pst4.executeQuery();
                    //price sql
                    PreparedStatement pst5=con.prepareStatement(sql_price);
                    ResultSet rs5 = pst5.executeQuery();
                    
                     while(rs4.next()){
                     String s_screen = rs4.getString("movie_screen");
                     String s_seat = rs4.getString("seats_available");
                     
                     //purchasing
                     rs5.next();
                     String m_id = rs4.getString("schedule_movie_id");
                     Float m_price = rs5.getFloat("movie_price");
                     
                     it_screen.setText(s_screen);
                     it_seats.setText("Available Seats: "+s_seat);
                     m_sched_id.setText(m_id);
                     //pricing
                     String m_price_string= Float.toString(m_price);
                     adult_price_display.setText(m_price_string);
                     //discounting senior by 20%
                     float discount = m_price * 0.20f;
                     float senior_price = m_price-discount;
                     String senior_price_string = Float.toString(senior_price);
                     senior_price_display.setText(senior_price_string);
                     //discounting chilren by 30%
                     float discount1 = m_price * 0.30f;
                     float child_price = m_price-discount1;
                     String child_price_string = Float.toString(child_price);
                     child_price_display.setText(child_price_string);
                     
                     adult_spinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, s_seat, 1));
                     }
                    }
                        
                }catch(Exception e){
                    
                }
            }
    }//GEN-LAST:event_jPanel24MouseEntered

    private void it_time_cbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_it_time_cbMouseClicked
        String SelectedMovie = selectmovies_cb.getSelectedItem().toString();
        SimpleDateFormat sdf3= new SimpleDateFormat("MMM dd,y");
        String date3 = sdf3.format(it_date_field.getDate());
        
        try{ 
            if (SelectedMovie.trim().equals("Select Movie")){
            it_time_cb.removeAllItems();    
            it_time_cb.addItem("Select Time");
                    
            //time selection
            }else{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            
            String sql3= "Select * from schedule_movies where movie_title='"+SelectedMovie+"'AND movie_date='"+date3+"' ";
            PreparedStatement pst3=con.prepareStatement(sql3);
            ResultSet rs3 = pst3.executeQuery();
            it_time_cb.removeAllItems();
            it_time_cb.addItem("Select Time");
        
            while(rs3.next()){
            String s_time = rs3.getString("airing_time");
            it_time_cb.addItem(s_time);
            }
            }
        }catch(Exception e){
                    
                }
    }//GEN-LAST:event_it_time_cbMouseClicked

    private void a_selectticket_btns_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a_selectticket_btns_click
        // checkout
        if (evt.getSource()==a_checkout)
         try{
             Class.forName("com.mysql.jdbc.Driver");
             PreparedStatement ps;
             String purchase_sql="INSERT INTO `purchase_log`(`movie_title`,`movie_sched_id`,`movie_price`,`adult_qty`,`child_qty`,`senior_qty`,`subtotal`,`time_purchased`) VALUES (?,?,?,?,?,?,?,?)";
            
             ps = (PreparedStatement) MTS_SQL_Connect.getConnection().prepareStatement(purchase_sql);
             String SelectedMovie = selectmovies_cb.getSelectedItem().toString();
             ps.setString(1,SelectedMovie);
             ps.setString(2,m_sched_id.getText());
             ps.setString(3,adult_price_display.getText());
             
             
             int adult_q = (Integer) adult_spinner.getValue();
             int child_q = (Integer) child_spinner.getValue();
             int senior_q = (Integer) senior_spinner.getValue();
             
             ps.setInt(4,adult_q);
             ps.setInt(5,child_q);
             ps.setInt(6,senior_q);
             ps.setString(7,subtotal_display.getText());
             
             Date set_date = new Date();
             SimpleDateFormat sdf = new SimpleDateFormat("MMM d,y hh:mm:ss a");
             String c_time=(sdf.format(set_date));
             
             ps.setString(8,c_time);
             
              if (ps.executeUpdate() > 0) {
                  
                    JOptionPane.showMessageDialog(null, "Transaction Successful");
                    
                    String m_id= m_sched_id.getText();
                    
                        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
                        //String sql2= "Select * from schedule_movies where movie_title='"+SelectedMovie+"' AND movie_date='"+date3+"' AND airing_time='"+SelectedTime+"'";
                        String sql2= "Select * from schedule_movies where schedule_movie_id='"+m_id+"'";
                        System.out.println("YOU");
                        PreparedStatement seat_pst=con.prepareStatement(sql2);
                        System.out.println("EY");
                        ResultSet seat_rs = seat_pst.executeQuery();
                        System.out.println(m_id);
                        
                        while(seat_rs.next()){
                        String s_seat2 = seat_rs.getString("seats_available");
                        System.out.println(s_seat2);
                         
                        int seats_f = Integer. parseInt(s_seat2);
                        int total_qty=adult_q + child_q + senior_q;
                        int minus_s = seats_f - total_qty;
                        
                        System.out.println("SHIT");
                        PreparedStatement ps2;
                        String update_sql="UPDATE schedule_movies set seats_available=? WHERE schedule_movie_id='"+m_id+"'";
                        ps2 = (PreparedStatement) MTS_SQL_Connect.getConnection().prepareStatement(update_sql);
                        System.out.println("PIS");
                        ps2.setInt(1,minus_s);
                    
                        if(minus_s < 0){
                            JOptionPane.showMessageDialog(null, "Seats not enough");
                        }else{
                            ps2.executeUpdate();
                           
                        }
                        }
                    st_movieposter.setText("Movie Poster");
                    st_movieposter.setIcon(null);
                    it_time_cb.removeAllItems();    
                    it_time_cb.addItem("Select Time");
                    adult_price_display.setText("0.00");
                    senior_price_display.setText("0.00");
                    child_price_display.setText("0.00");
                    it_screen.setText("Screen #");
                    it_seats.setText("Available Seats: #");
                    m_sched_id.setText("------------------");
                    adult_spinner.setValue(0);
                    child_spinner.setValue(0);
                    senior_spinner.setValue(0);
                    
                }
                else {
                JOptionPane.showMessageDialog(null, "Transaction Failed");
                }
             
             
         }catch(Exception e){
            
         }
        
        
        // reset
        if (evt.getSource()==a_reset)
         a_reset.setBackground(new java.awt.Color(255,153,102));
        // view schedule
        if (evt.getSource()==a_vs)
            home_p.setVisible(false);
            add_p.setVisible(false);
            ms_p.setVisible(true);
            top_home.setVisible(false);
            top_add.setVisible(false);
            top_ms.setVisible(true);
    }//GEN-LAST:event_a_selectticket_btns_click

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        // display subtotal PRICE
        
        int adult_q = (Integer) adult_spinner.getValue();
        int child_q = (Integer) child_spinner.getValue();
        int senior_q = (Integer) senior_spinner.getValue();
        
        //adult price tally
        String adult_qs= adult_price_display.getText();
        float adult_ps = Float.parseFloat(adult_qs);
        float total_price_adult= adult_q*adult_ps;
        
        //child price tally
        String child_qs= child_price_display.getText();
        float child_ps = Float.parseFloat(child_qs);
        float total_price_child= child_q*child_ps;
       
        //senior price tally
        String senior_qs= senior_price_display.getText();
        float senior_ps = Float.parseFloat(senior_qs);
        float total_price_senior= senior_q*senior_ps;
     
        //adding all
        float subtotal_f=total_price_adult+total_price_child+total_price_senior;
        String subtotal_s = Float.toString(subtotal_f);
        subtotal_display.setText(subtotal_s);
    }//GEN-LAST:event_jPanel8MouseEntered

    private void backgroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseEntered
        // get total sales for today      
            Date set_date = new Date();
             SimpleDateFormat sdf = new SimpleDateFormat("MMM d,y");
             String c_time=(sdf.format(set_date));
             
            try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            String sql2= "SELECT SUM(subtotal) AS TotalSalesToday FROM purchase_log WHERE time_purchased LIKE '%"+c_time+"%'";
             String sql_ad= "SELECT SUM(adult_qty) AS Tickets_ad FROM purchase_log WHERE time_purchased LIKE '%"+c_time+"%'";
             String sql_ch= "SELECT SUM(child_qty) AS Tickets_ch FROM purchase_log WHERE time_purchased LIKE '%"+c_time+"%'";
             String sql_se= "SELECT SUM(senior_qty) AS Tickets_se FROM purchase_log WHERE time_purchased LIKE '%"+c_time+"%'";
            //total profit for current day
            PreparedStatement seat_pst=con.prepareStatement(sql2);
            ResultSet t_sales_rs = seat_pst.executeQuery();
            //adult tickets sold for current day
            PreparedStatement ad_pst=con.prepareStatement(sql_ad);
            ResultSet ad_rs = ad_pst.executeQuery();
            //child tickets sold for current day
            PreparedStatement ch_pst=con.prepareStatement(sql_ch);
            ResultSet ch_rs = ch_pst.executeQuery();
            //senior tickets sold for current day
            PreparedStatement se_pst=con.prepareStatement(sql_se);
            ResultSet se_rs = se_pst.executeQuery();
            
            
            while(t_sales_rs.next()){
            float s_seat2 = t_sales_rs.getFloat("TotalSalesToday");
            String t_sales= Float.toString(s_seat2);
            today_sales_display.setText(t_sales);
            
           //getting total tickets sold for the current day
            if(ad_rs.next()){
                 adult_t=ad_rs.getInt("Tickets_ad");
            }
            if(ch_rs.next()){
                 child_t=ch_rs.getInt("Tickets_ch");
            }
            if(se_rs.next()){
                 senior_t=se_rs.getInt("Tickets_se");
            }
            
            int totalticketssold_i= adult_t+child_t+senior_t;
            String totalticketssold = Integer.toString(totalticketssold_i);
            ticketssold_display.setText(totalticketssold);
            }
            
             }catch(Exception e){
             }
            
    }//GEN-LAST:event_backgroundMouseEntered
 //DISPLAYING DATA IN TABLE WITH VARYING SCREENS
    
    //screen 1
    public ArrayList<Movies1> movieList1(){
        ArrayList<Movies1> movieList1 = new ArrayList<>();
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            String query_selectm="SELECT * FROM schedule_movies WHERE movie_screen='Screen 1'";
            java.sql.Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query_selectm);
            Movies1 movie1;
            while (rs.next()){
                movie1= new Movies1(rs.getString("movie_title"), rs.getString("movie_date"), rs.getString("airing_time"));
                movieList1.add(movie1);
            }
        }
       catch (Exception e){
           JOptionPane.showMessageDialog(null,e);
       } 
        return movieList1;
    }
    public void show_movie_screen1(){
         ArrayList<Movies1> mlist = movieList1();
         DefaultTableModel model_1 = (DefaultTableModel) ms_screen1_table.getModel();
         Object [] col= new Object[3];
        
        for(int i=0; i< mlist.size();i++){
            col[0]= mlist.get(i).gettitle();
            col[1]= mlist.get(i).getdate();
            col[2]= mlist.get(i).gettime();
            model_1.addRow(col);
    }
         
    }
    //screen 2
    public ArrayList<Movies1> movieList2(){
        ArrayList<Movies1> movieList2 = new ArrayList<>();
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            String query_selectm="SELECT * FROM schedule_movies WHERE movie_screen='Screen 2'";
            java.sql.Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query_selectm);
            Movies1 movie1;
            while (rs.next()){
                movie1= new Movies1(rs.getString("movie_title"), rs.getString("movie_date"), rs.getString("airing_time"));
                movieList2.add(movie1);
            }
        }
       catch (Exception e){
           JOptionPane.showMessageDialog(null,e);
       } 
        return movieList2;
    }
    public void show_movie_screen2(){
         ArrayList<Movies1> mlist = movieList2();
         DefaultTableModel model_1 = (DefaultTableModel) ms_screen2_table.getModel();
         Object [] col= new Object[3];
        
        for(int i=0; i< mlist.size();i++){
            col[0]= mlist.get(i).gettitle();
            col[1]= mlist.get(i).getdate();
            col[2]= mlist.get(i).gettime();
            model_1.addRow(col);
    }
         
    }
    //screen 3
    public ArrayList<Movies1> movieList3(){
        ArrayList<Movies1> movieList3 = new ArrayList<>();
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            String query_selectm="SELECT * FROM schedule_movies WHERE movie_screen='Screen 3'";
            java.sql.Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query_selectm);
            Movies1 movie1;
            while (rs.next()){
                movie1= new Movies1(rs.getString("movie_title"), rs.getString("movie_date"), rs.getString("airing_time"));
                movieList3.add(movie1);
            }
        }
       catch (Exception e){
           JOptionPane.showMessageDialog(null,e);
       } 
        return movieList3;
    }
    public void show_movie_screen3(){
         ArrayList<Movies1> mlist = movieList3();
         DefaultTableModel model_1 = (DefaultTableModel) ms_screen3_table.getModel();
         Object [] col= new Object[3];
        
        for(int i=0; i< mlist.size();i++){
            col[0]= mlist.get(i).gettitle();
            col[1]= mlist.get(i).getdate();
            col[2]= mlist.get(i).gettime();
            model_1.addRow(col);
    }
         
    }public String getTimeElapsed() {
   
long elapsedTime = System.currentTimeMillis() - startTime;
elapsedTime = elapsedTime / 1000;

String seconds = Integer.toString((int)(elapsedTime % 60));
String minutes = Integer.toString((int)((elapsedTime % 3600) / 60));
String hours = Integer.toString((int)(elapsedTime / 3600));

if (seconds.length() < 2)
seconds = "0" + seconds;

if (minutes.length() < 2)
minutes = "0" + minutes;

if (hours.length() < 2)
hours = "0" + hours;

return hours+":"+minutes+":"+seconds;
    
}
    private void h_btnscreen1h_btnscreens_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_btnscreen1h_btnscreens_clicked
        Date set_date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d,y");
        String c_time=(sdf.format(set_date));

        SimpleDateFormat sdf2 = new SimpleDateFormat("HH");
        SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm");
        String c_time_h=(sdf2.format(set_date));
        String c_time_m=(sdf3.format(set_date));

        //home button screens clicked
        if (evt.getSource() == h_btnscreen1) {
            h_screen1.setVisible(true);
            h_screen2.setVisible(false);
            h_screen3.setVisible(false);
            System.out.println("try screen 1");
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
                System.out.println("screen 1 connection successful");

                String screen1_sql= "SELECT * FROM schedule_movies WHERE movie_screen='Screen 1' AND movie_date= '"+c_time+"' AND airing_time LIKE '%"+c_time_h+"%' OR airing_time LIKE '%"+c_time_m+"%' ORDER BY airing_time DESC";

                PreparedStatement screen1_pst=con.prepareStatement(screen1_sql);
                ResultSet screen1_rs = screen1_pst.executeQuery();
                System.out.println("screen 1 execution successful");
                while (screen1_rs.next()){
                    System.out.println("screen 1 while executing successful");
                    String s1_title = screen1_rs.getString("movie_title");
                    String s1_time = screen1_rs.getString("airing_time");
                    String s1_seat = screen1_rs.getString("seats_available");
                    String s1_id = screen1_rs.getString("schedule_movie_id");

                    System.out.println("screen 1 fetching data successful");
                    h_screen1_movietitle.setText(s1_title);
                    h_timestarted_screen1.setText(s1_time);
                    h_seats_screen1.setText(s1_seat);
                    id1.setText(s1_id);
                    System.out.println("screen 1 while displaying(1/3) successful");
                    String screen1_d_sql= "SELECT * FROM movies WHERE movie_date= '"+c_time+"' AND movie_title='"+h_screen1_movietitle.getText()+"'";
                    PreparedStatement screen1_pstd=con.prepareStatement(screen1_d_sql);
                    ResultSet screen1_rsd = screen1_pstd.executeQuery();
                    while (screen1_rsd.next()){

                        String m1_rating=screen1_rsd.getString("movie_rating");
                        String m1_duration=screen1_rsd.getString("movie_duration");
                        d_mp=screen1_rsd.getBytes("movie_poster");

                        rating_display_s1.setText(m1_rating);
                        duration_stat_screen1.setText(m1_duration);
                        ImageIcon imageicon = new ImageIcon(new ImageIcon (d_mp).getImage().getScaledInstance(screen1MP.getWidth(),screen1MP.getHeight(),Image.SCALE_SMOOTH));
                        screen1MP.setIcon(imageicon);
                        screen1MP.setText("");
                        System.out.println("screen 1 while displaying(2/3) successful");
                        String ts2=h_screen1_movietitle.getText();
                        if(ts2.trim().equals("n/A")){
                            stat1.setText("--");
                        }else{
                            stat1.setText("Playing");

                        }
                        System.out.println("screen 1 while displaying(3/3) successful");

                        new Timer(0, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String movie_id1= id1.getText();

                                if(movie_id1.trim().equals("-------")){
                                    duration_screen1.setText("--:--:--");

                                }else{
                                    duration_screen1.setText(getTimeElapsed());

                                }

                            }
                        }).start();
                        System.out.println("screen 1 displaying time elapsed successful");
                    }

                }
            }catch(Exception e){

            }
        }

        if (evt.getSource() == h_btnscreen2) {
            h_screen1.setVisible(false);
            h_screen2.setVisible(true);
            h_screen3.setVisible(false);

            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
                String screen2_sql= "SELECT * FROM schedule_movies WHERE movie_screen='Screen 2' AND movie_date= '"+c_time+"' AND airing_time LIKE '%"+c_time_h+"%' OR airing_time LIKE '%"+c_time_m+"%' ORDER BY airing_time DESC";

                PreparedStatement screen2_pst=con.prepareStatement(screen2_sql);
                ResultSet screen2_rs = screen2_pst.executeQuery();

                while (screen2_rs.next()){

                    String s2_title = screen2_rs.getString("movie_title");
                    String s2_time = screen2_rs.getString("airing_time");
                    String s2_seat = screen2_rs.getString("seats_available");
                    String s2_id = screen2_rs.getString("schedule_movie_id");

                    h_screen2_movietitle.setText(s2_title);
                    h_timestarted_screen2.setText(s2_time);
                    h_seats_screen2.setText(s2_seat);
                    m_id2.setText(s2_id);

                    String screen2_d_sql= "SELECT * FROM movies WHERE movie_date= '"+c_time+"' AND movie_title='"+h_screen2_movietitle.getText()+"'";
                    PreparedStatement screen2_pstd=con.prepareStatement(screen2_d_sql);
                    ResultSet screen2_rsd = screen2_pstd.executeQuery();
                    while (screen2_rsd.next()){

                        String m2_rating=screen2_rsd.getString("movie_rating");
                        String m2_duration=screen2_rsd.getString("movie_duration");
                        d_mp2=screen2_rsd.getBytes("movie_poster");

                        rating_display_s2.setText(m2_rating);

                        duration_stat_screen2.setText(m2_duration);
                        ImageIcon imageicon = new ImageIcon(new ImageIcon (d_mp2).getImage().getScaledInstance(screen2MP.getWidth(),screen2MP.getHeight(),Image.SCALE_SMOOTH));
                        screen2MP.setIcon(imageicon);
                        screen2MP.setText("");

                        String ts2=h_screen2_movietitle.getText();
                        if(ts2.trim().equals("n/A")){
                            stat2.setText("--");
                        }else{
                            stat2.setText("Playing");
                        }
                        new Timer(0, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String movie_id1= m_id2.getText();

                                if(movie_id1.trim().equals("-------")){
                                    duration_screen2.setText("--:--:--");

                                }else{
                                    duration_screen2.setText(getTimeElapsed());

                                }

                            }
                        }).start();
                        System.out.println("screen 1 displaying time elapsed successful");

                    }

                }
            }catch(Exception e){

            }

        }
        if (evt.getSource() == h_btnscreen3) {
            h_screen1.setVisible(false);
            h_screen2.setVisible(false);
            h_screen3.setVisible(true);

            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
                String screen3_sql= "SELECT * FROM schedule_movies WHERE movie_screen='Screen 3' AND movie_date= '"+c_time+"' AND airing_time LIKE '%"+c_time_h+"%' OR airing_time LIKE '%"+c_time_m+"%' ORDER BY airing_time DESC";

                PreparedStatement screen3_pst=con.prepareStatement(screen3_sql);
                ResultSet screen3_rs = screen3_pst.executeQuery();

                while (screen3_rs.next()){

                    String s3_title = screen3_rs.getString("movie_title");
                    String s3_time = screen3_rs.getString("airing_time");
                    String s3_seat = screen3_rs.getString("seats_available");
                    String s3_id = screen3_rs.getString("schedule_movie_id");

                    h_screen3_movietitle.setText(s3_title);
                    h_timestarted_screen3.setText(s3_time);
                    h_seats_screen3.setText(s3_seat);
                    m_id3.setText(s3_id);

                    String screen3_d_sql= "SELECT * FROM movies WHERE movie_date= '"+c_time+"' AND movie_title='"+h_screen3_movietitle.getText()+"'";
                    PreparedStatement screen3_pstd=con.prepareStatement(screen3_d_sql);
                    ResultSet screen3_rsd = screen3_pstd.executeQuery();
                    while (screen3_rsd.next()){

                        String m3_rating=screen3_rsd.getString("movie_rating");
                        String m3_duration=screen3_rsd.getString("movie_duration");
                        d_mp3=screen3_rsd.getBytes("movie_poster");

                        rating_display_s3.setText(m3_rating);

                        duration_stat_screen3.setText(m3_duration);
                        ImageIcon imageicon = new ImageIcon(new ImageIcon (d_mp3).getImage().getScaledInstance(screen3MP.getWidth(),screen3MP.getHeight(),Image.SCALE_SMOOTH));
                        screen3MP.setIcon(imageicon);
                        screen3MP.setText("");

                        String ts2=h_screen3_movietitle.getText();
                        if(ts2.trim().equals("n/A")){
                            stat3.setText("--");
                        }else{
                            stat3.setText("Playing");
                        }

                        new Timer(0, new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String movie_id1= m_id3.getText();

                                if(movie_id1.trim().equals("-------")){
                                    duration_screen3.setText("--:--:--");

                                }else{
                                    duration_screen3.setText(getTimeElapsed());

                                }

                            }
                        }).start();
                        System.out.println("screen 1 displaying time elapsed successful");
                    }

                }
            }catch(Exception e){

            }

        }
    }//GEN-LAST:event_h_btnscreen1h_btnscreens_clicked

    private void h_btnscreen1h_btnscreens_entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_btnscreen1h_btnscreens_entered
        // btn home (tabs) screens hover in 153,0,51
        if (evt.getSource() == h_btnscreen1) {
            h_btnscreen1.setBackground(new java.awt.Color(153, 0, 51));
        }
        if (evt.getSource() == h_btnscreen2) {
            h_btnscreen2.setBackground(new java.awt.Color(153, 0, 51));
        }
        if (evt.getSource() == h_btnscreen3) {
            h_btnscreen3.setBackground(new java.awt.Color(153, 0, 51));
        }
    }//GEN-LAST:event_h_btnscreen1h_btnscreens_entered

    private void h_btnscreen1h_btnscreens_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_btnscreen1h_btnscreens_exit
        // btn home (tabs) screens hover out 204,0,102
        if (evt.getSource() == h_btnscreen1) {
            h_btnscreen1.setBackground(new java.awt.Color(204, 0, 102));
        }
        if (evt.getSource() == h_btnscreen2) {
            h_btnscreen2.setBackground(new java.awt.Color(204, 0, 102));
        }
        if (evt.getSource() == h_btnscreen3)
        h_btnscreen3.setBackground(new java.awt.Color(204, 0, 102));
    }//GEN-LAST:event_h_btnscreen1h_btnscreens_exit

    private void h_btnscreen2h_btnscreens_entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_btnscreen2h_btnscreens_entered
        // btn home (tabs) screens hover in 153,0,51
        if (evt.getSource() == h_btnscreen1) {
            h_btnscreen1.setBackground(new java.awt.Color(153, 0, 51));
        }
        if (evt.getSource() == h_btnscreen2) {
            h_btnscreen2.setBackground(new java.awt.Color(153, 0, 51));
        }
        if (evt.getSource() == h_btnscreen3) {
            h_btnscreen3.setBackground(new java.awt.Color(153, 0, 51));
        }
    }//GEN-LAST:event_h_btnscreen2h_btnscreens_entered

    private void h_btnscreen2h_btnscreens_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_btnscreen2h_btnscreens_exit
        // btn home (tabs) screens hover out 204,0,102
        if (evt.getSource() == h_btnscreen1) {
            h_btnscreen1.setBackground(new java.awt.Color(204, 0, 102));
        }
        if (evt.getSource() == h_btnscreen2) {
            h_btnscreen2.setBackground(new java.awt.Color(204, 0, 102));
        }
        if (evt.getSource() == h_btnscreen3)
        h_btnscreen3.setBackground(new java.awt.Color(204, 0, 102));
    }//GEN-LAST:event_h_btnscreen2h_btnscreens_exit

    private void h_btnscreen3h_btnscreens_entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_btnscreen3h_btnscreens_entered
        // btn home (tabs) screens hover in 153,0,51
        if (evt.getSource() == h_btnscreen1) {
            h_btnscreen1.setBackground(new java.awt.Color(153, 0, 51));
        }
        if (evt.getSource() == h_btnscreen2) {
            h_btnscreen2.setBackground(new java.awt.Color(153, 0, 51));
        }
        if (evt.getSource() == h_btnscreen3) {
            h_btnscreen3.setBackground(new java.awt.Color(153, 0, 51));
        }
    }//GEN-LAST:event_h_btnscreen3h_btnscreens_entered

    private void h_btnscreen3h_btnscreens_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_btnscreen3h_btnscreens_exit
        // btn home (tabs) screens hover out 204,0,102
        if (evt.getSource() == h_btnscreen1) {
            h_btnscreen1.setBackground(new java.awt.Color(204, 0, 102));
        }
        if (evt.getSource() == h_btnscreen2) {
            h_btnscreen2.setBackground(new java.awt.Color(204, 0, 102));
        }
        if (evt.getSource() == h_btnscreen3)
        h_btnscreen3.setBackground(new java.awt.Color(204, 0, 102));
    }//GEN-LAST:event_h_btnscreen3h_btnscreens_exit

    private void h_issueticket1h_IssueTicketbtn_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_issueticket1h_IssueTicketbtn_click
        // home issueticket on click
        if (evt.getSource() == h_issueticket1) {
            home_p.setVisible(false);
            add_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
        if (evt.getSource() == h_issueticket2) {
            home_p.setVisible(false);
            add_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
        if (evt.getSource() == h_issueticket3) {
            home_p.setVisible(false);
            add_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
    }//GEN-LAST:event_h_issueticket1h_IssueTicketbtn_click

    private void h_issueticket1h_IssueTicketbtn_entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_issueticket1h_IssueTicketbtn_entered
        //home issueticket hover in
        if (evt.getSource() == h_issueticket1) {
            h_issueticket1.setBackground(new java.awt.Color(255, 153, 0));
        }
        if (evt.getSource() == h_issueticket2) {
            h_issueticket2.setBackground(new java.awt.Color(255, 153, 0));
        }
        if (evt.getSource() == h_issueticket3)
        h_issueticket3.setBackground(new java.awt.Color(255, 153, 0));
    }//GEN-LAST:event_h_issueticket1h_IssueTicketbtn_entered

    private void h_issueticket1h_IssueTicketbtn_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_issueticket1h_IssueTicketbtn_exit
        // home issueticket hover out 255,204,0
        if (evt.getSource() == h_issueticket1) {
            h_issueticket1.setBackground(new java.awt.Color(255, 204, 0));
        }
        if (evt.getSource() == h_issueticket2) {
            h_issueticket2.setBackground(new java.awt.Color(255, 204, 0));
        }
        if (evt.getSource() == h_issueticket3) {
            h_issueticket3.setBackground(new java.awt.Color(255, 204, 0));
        }
    }//GEN-LAST:event_h_issueticket1h_IssueTicketbtn_exit

    private void h_issueticket2h_IssueTicketbtn_entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_issueticket2h_IssueTicketbtn_entered
        //home issueticket hover in
        if (evt.getSource() == h_issueticket1) {
            h_issueticket1.setBackground(new java.awt.Color(255, 153, 0));
        }
        if (evt.getSource() == h_issueticket2) {
            h_issueticket2.setBackground(new java.awt.Color(255, 153, 0));
        }
        if (evt.getSource() == h_issueticket3)
        h_issueticket3.setBackground(new java.awt.Color(255, 153, 0));
    }//GEN-LAST:event_h_issueticket2h_IssueTicketbtn_entered

    private void h_issueticket2h_IssueTicketbtn_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_issueticket2h_IssueTicketbtn_exit
        // home issueticket hover out 255,204,0
        if (evt.getSource() == h_issueticket1) {
            h_issueticket1.setBackground(new java.awt.Color(255, 204, 0));
        }
        if (evt.getSource() == h_issueticket2) {
            h_issueticket2.setBackground(new java.awt.Color(255, 204, 0));
        }
        if (evt.getSource() == h_issueticket3) {
            h_issueticket3.setBackground(new java.awt.Color(255, 204, 0));
        }
    }//GEN-LAST:event_h_issueticket2h_IssueTicketbtn_exit

    private void h_issueticket3h_IssueTicketbtn_entered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_issueticket3h_IssueTicketbtn_entered
        //home issueticket hover in
        if (evt.getSource() == h_issueticket1) {
            h_issueticket1.setBackground(new java.awt.Color(255, 153, 0));
        }
        if (evt.getSource() == h_issueticket2) {
            h_issueticket2.setBackground(new java.awt.Color(255, 153, 0));
        }
        if (evt.getSource() == h_issueticket3)
        h_issueticket3.setBackground(new java.awt.Color(255, 153, 0));
    }//GEN-LAST:event_h_issueticket3h_IssueTicketbtn_entered

    private void h_issueticket3h_IssueTicketbtn_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_issueticket3h_IssueTicketbtn_exit
        // home issueticket hover out 255,204,0
        if (evt.getSource() == h_issueticket1) {
            h_issueticket1.setBackground(new java.awt.Color(255, 204, 0));
        }
        if (evt.getSource() == h_issueticket2) {
            h_issueticket2.setBackground(new java.awt.Color(255, 204, 0));
        }
        if (evt.getSource() == h_issueticket3) {
            h_issueticket3.setBackground(new java.awt.Color(255, 204, 0));
        }
    }//GEN-LAST:event_h_issueticket3h_IssueTicketbtn_exit

    private void ms_btnscreen1ms_btns_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen1ms_btns_click
        // btn movie screens (tabs) screens action on click
        if (evt.getSource()==ms_btnscreen4){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(true);

            DefaultTableModel model_a = (DefaultTableModel) ms_screen_table_all.getModel();
            int rowCount = model_a.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            show_scheduled_movie();

        }

        if (evt.getSource()==ms_btnscreen3){
            ms_screen3.setVisible(true);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(false);

            DefaultTableModel model_1 = (DefaultTableModel) ms_screen3_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}
            show_movie_screen3();
        }

        if (evt.getSource()==ms_btnscreen2){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(true);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(false);

            DefaultTableModel model_1 = (DefaultTableModel) ms_screen2_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}

            show_movie_screen2();

        }
        if (evt.getSource()==ms_btnscreen1){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(true);
            ms_all_screens.setVisible(false);
            DefaultTableModel model_1 = (DefaultTableModel) ms_screen1_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}

            show_movie_screen1();

        }

    }//GEN-LAST:event_ms_btnscreen1ms_btns_click

    private void ms_btnscreen1ms_btns_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen1ms_btns_enter
        // btn movie screens (tabs) screens hover in
        if (evt.getSource()==ms_btnscreen1)
        ms_btnscreen1.setBackground(new java.awt.Color(219,92,58));
        if (evt.getSource()==ms_btnscreen2)
        ms_btnscreen2.setBackground(new java.awt.Color(0,153,153));
        if (evt.getSource()==ms_btnscreen3)
        ms_btnscreen3.setBackground(new java.awt.Color(153,0,153));
        if (evt.getSource()==ms_btnscreen4)
        ms_btnscreen4.setBackground(new java.awt.Color(71,102,49));
    }//GEN-LAST:event_ms_btnscreen1ms_btns_enter

    private void ms_btnscreen1ms_btns_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen1ms_btns_exit
        // btn movie screens (tabs) screens hover out
        if (evt.getSource()==ms_btnscreen1)
        ms_btnscreen1.setBackground(new java.awt.Color(247,104,66));
        if (evt.getSource()==ms_btnscreen2)
        ms_btnscreen2.setBackground(new java.awt.Color(0,204,204));
        if (evt.getSource()==ms_btnscreen3)
        ms_btnscreen3.setBackground(new java.awt.Color(204,0,204));
        if (evt.getSource()==ms_btnscreen4)
        ms_btnscreen4.setBackground(new java.awt.Color(108,153,74));
    }//GEN-LAST:event_ms_btnscreen1ms_btns_exit

    private void ms_btnscreen2ms_btns_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen2ms_btns_click
        // btn movie screens (tabs) screens action on click
        if (evt.getSource()==ms_btnscreen4){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(true);

            DefaultTableModel model_a = (DefaultTableModel) ms_screen_table_all.getModel();
            int rowCount = model_a.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            show_scheduled_movie();

        }

        if (evt.getSource()==ms_btnscreen3){
            ms_screen3.setVisible(true);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(false);

            DefaultTableModel model_1 = (DefaultTableModel) ms_screen3_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}
            show_movie_screen3();
        }

        if (evt.getSource()==ms_btnscreen2){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(true);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(false);

            DefaultTableModel model_1 = (DefaultTableModel) ms_screen2_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}

            show_movie_screen2();

        }
        if (evt.getSource()==ms_btnscreen1){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(true);
            ms_all_screens.setVisible(false);
            DefaultTableModel model_1 = (DefaultTableModel) ms_screen1_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}

            show_movie_screen1();

        }

    }//GEN-LAST:event_ms_btnscreen2ms_btns_click

    private void ms_btnscreen2ms_btns_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen2ms_btns_enter
        // btn movie screens (tabs) screens hover in
        if (evt.getSource()==ms_btnscreen1)
        ms_btnscreen1.setBackground(new java.awt.Color(219,92,58));
        if (evt.getSource()==ms_btnscreen2)
        ms_btnscreen2.setBackground(new java.awt.Color(0,153,153));
        if (evt.getSource()==ms_btnscreen3)
        ms_btnscreen3.setBackground(new java.awt.Color(153,0,153));
        if (evt.getSource()==ms_btnscreen4)
        ms_btnscreen4.setBackground(new java.awt.Color(71,102,49));
    }//GEN-LAST:event_ms_btnscreen2ms_btns_enter

    private void ms_btnscreen2ms_btns_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen2ms_btns_exit
        // btn movie screens (tabs) screens hover out
        if (evt.getSource()==ms_btnscreen1)
        ms_btnscreen1.setBackground(new java.awt.Color(247,104,66));
        if (evt.getSource()==ms_btnscreen2)
        ms_btnscreen2.setBackground(new java.awt.Color(0,204,204));
        if (evt.getSource()==ms_btnscreen3)
        ms_btnscreen3.setBackground(new java.awt.Color(204,0,204));
        if (evt.getSource()==ms_btnscreen4)
        ms_btnscreen4.setBackground(new java.awt.Color(108,153,74));
    }//GEN-LAST:event_ms_btnscreen2ms_btns_exit

    private void ms_btnscreen3ms_btns_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen3ms_btns_click
        // btn movie screens (tabs) screens action on click
        if (evt.getSource()==ms_btnscreen4){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(true);

            DefaultTableModel model_a = (DefaultTableModel) ms_screen_table_all.getModel();
            int rowCount = model_a.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            show_scheduled_movie();

        }

        if (evt.getSource()==ms_btnscreen3){
            ms_screen3.setVisible(true);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(false);

            DefaultTableModel model_1 = (DefaultTableModel) ms_screen3_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}
            show_movie_screen3();
        }

        if (evt.getSource()==ms_btnscreen2){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(true);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(false);

            DefaultTableModel model_1 = (DefaultTableModel) ms_screen2_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}

            show_movie_screen2();

        }
        if (evt.getSource()==ms_btnscreen1){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(true);
            ms_all_screens.setVisible(false);
            DefaultTableModel model_1 = (DefaultTableModel) ms_screen1_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}

            show_movie_screen1();

        }

    }//GEN-LAST:event_ms_btnscreen3ms_btns_click

    private void ms_btnscreen3ms_btns_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen3ms_btns_enter
        // btn movie screens (tabs) screens hover in
        if (evt.getSource()==ms_btnscreen1)
        ms_btnscreen1.setBackground(new java.awt.Color(219,92,58));
        if (evt.getSource()==ms_btnscreen2)
        ms_btnscreen2.setBackground(new java.awt.Color(0,153,153));
        if (evt.getSource()==ms_btnscreen3)
        ms_btnscreen3.setBackground(new java.awt.Color(153,0,153));
        if (evt.getSource()==ms_btnscreen4)
        ms_btnscreen4.setBackground(new java.awt.Color(71,102,49));
    }//GEN-LAST:event_ms_btnscreen3ms_btns_enter

    private void ms_btnscreen3ms_btns_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen3ms_btns_exit
        // btn movie screens (tabs) screens hover out
        if (evt.getSource()==ms_btnscreen1)
        ms_btnscreen1.setBackground(new java.awt.Color(247,104,66));
        if (evt.getSource()==ms_btnscreen2)
        ms_btnscreen2.setBackground(new java.awt.Color(0,204,204));
        if (evt.getSource()==ms_btnscreen3)
        ms_btnscreen3.setBackground(new java.awt.Color(204,0,204));
        if (evt.getSource()==ms_btnscreen4)
        ms_btnscreen4.setBackground(new java.awt.Color(108,153,74));
    }//GEN-LAST:event_ms_btnscreen3ms_btns_exit

    private void ms_btnscreen4ms_btns_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen4ms_btns_click
        // btn movie screens (tabs) screens action on click
        if (evt.getSource()==ms_btnscreen4){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(true);

            DefaultTableModel model_a = (DefaultTableModel) ms_screen_table_all.getModel();
            int rowCount = model_a.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            show_scheduled_movie();

        }

        if (evt.getSource()==ms_btnscreen3){
            ms_screen3.setVisible(true);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(false);

            DefaultTableModel model_1 = (DefaultTableModel) ms_screen3_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}
            show_movie_screen3();
        }

        if (evt.getSource()==ms_btnscreen2){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(true);
            ms_screen1.setVisible(false);
            ms_all_screens.setVisible(false);

            DefaultTableModel model_1 = (DefaultTableModel) ms_screen2_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}

            show_movie_screen2();

        }
        if (evt.getSource()==ms_btnscreen1){
            ms_screen3.setVisible(false);
            ms_screen2.setVisible(false);
            ms_screen1.setVisible(true);
            ms_all_screens.setVisible(false);
            DefaultTableModel model_1 = (DefaultTableModel) ms_screen1_table.getModel();
            int rowCount = model_1.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_1.removeRow(i);}

            show_movie_screen1();

        }

    }//GEN-LAST:event_ms_btnscreen4ms_btns_click

    private void ms_btnscreen4ms_btns_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen4ms_btns_enter
        // btn movie screens (tabs) screens hover in
        if (evt.getSource()==ms_btnscreen1)
        ms_btnscreen1.setBackground(new java.awt.Color(219,92,58));
        if (evt.getSource()==ms_btnscreen2)
        ms_btnscreen2.setBackground(new java.awt.Color(0,153,153));
        if (evt.getSource()==ms_btnscreen3)
        ms_btnscreen3.setBackground(new java.awt.Color(153,0,153));
        if (evt.getSource()==ms_btnscreen4)
        ms_btnscreen4.setBackground(new java.awt.Color(71,102,49));
    }//GEN-LAST:event_ms_btnscreen4ms_btns_enter

    private void ms_btnscreen4ms_btns_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btnscreen4ms_btns_exit
        // btn movie screens (tabs) screens hover out
        if (evt.getSource()==ms_btnscreen1)
        ms_btnscreen1.setBackground(new java.awt.Color(247,104,66));
        if (evt.getSource()==ms_btnscreen2)
        ms_btnscreen2.setBackground(new java.awt.Color(0,204,204));
        if (evt.getSource()==ms_btnscreen3)
        ms_btnscreen3.setBackground(new java.awt.Color(204,0,204));
        if (evt.getSource()==ms_btnscreen4)
        ms_btnscreen4.setBackground(new java.awt.Color(108,153,74));
    }//GEN-LAST:event_ms_btnscreen4ms_btns_exit

    //SEARCHING MOVIE TITLE IN ALL SCREENS
public ArrayList<Movies> Movies(String ValToSearch)
    {
        ArrayList<Movies> movieList = new ArrayList<Movies>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            java.sql.Statement stm= con.createStatement();
            String searchQuery = "SELECT * FROM `schedule_movies` WHERE movie_title LIKE '%"+ValToSearch+"%'";
            rs = stm.executeQuery(searchQuery);
            
            Movies user;
            
            while(rs.next())
            {
                user = new Movies(
                                 rs.getString("movie_title"),
                                 rs.getString("movie_date"),
                                 rs.getString("airing_time"),
                                 rs.getString("movie_screen"),
                                 rs.getString("seats_available")
                        
                                );
                movieList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return movieList;
    }
    
    // function to display data in jtable
    public void findMovies()
    {
        ArrayList<Movies> mlist = Movies(all_screens_searchbar.getText());
        DefaultTableModel model_a = (DefaultTableModel) ms_screen_table_all.getModel();
        Object[] row = new Object[5];
        
        for(int i = 0; i < mlist.size(); i++)
        {
            row[0]= mlist.get(i).gettitle();
            row[1]= mlist.get(i).getdate();
            row[2]= mlist.get(i).gettime();
            row[3]= mlist.get(i).getscreen();
            row[4]= mlist.get(i).getseat();
            model_a.addRow(row);
        }
       ms_screen_table_all.setModel(model_a);
       
    }
    
    //SEARCHING MOVIE DATE IN ALL SCREENS
public ArrayList<Movies> Moviesdate(String ValToSearch)
    {
        ArrayList<Movies> movieList = new ArrayList<Movies>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            java.sql.Statement stm= con.createStatement();
            String searchQuery = "SELECT * FROM `schedule_movies` WHERE movie_date LIKE '%"+ValToSearch+"%'";
            rs = stm.executeQuery(searchQuery);
            
            Movies user;
            
            while(rs.next())
            {
                user = new Movies(
                                 rs.getString("movie_title"),
                                 rs.getString("movie_date"),
                                 rs.getString("airing_time"),
                                 rs.getString("movie_screen"),
                                 rs.getString("seats_available")
                        
                                );
                movieList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return movieList;
    }
    
    // function to display data in jtable
    public void findMoviesdate()
    {   SimpleDateFormat sdf2= new SimpleDateFormat("MMM dd,y");
        String date2 = sdf2.format(allscreen_date_search.getDate());
        
        ArrayList<Movies> mlist = Moviesdate(date2);
        DefaultTableModel model_a = (DefaultTableModel) ms_screen_table_all.getModel();
        Object[] row = new Object[5];
        
        for(int i = 0; i < mlist.size(); i++)
        {
            row[0]= mlist.get(i).gettitle();
            row[1]= mlist.get(i).getdate();
            row[2]= mlist.get(i).gettime();
            row[3]= mlist.get(i).getscreen();
            row[4]= mlist.get(i).getseat();
            model_a.addRow(row);
        }
       ms_screen_table_all.setModel(model_a);
       
    }
    
    //SEARCH BUTTON SCREEN 1
    public ArrayList<Movies1> Screen1_movies(String ValToSearch)
    {
        ArrayList<Movies1> movieList = new ArrayList<Movies1>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            java.sql.Statement stm= con.createStatement();
            String searchQuery = "SELECT * FROM `schedule_movies` WHERE movie_title LIKE '%"+ValToSearch+"%' AND movie_screen='Screen 1'";
            rs = stm.executeQuery(searchQuery);
            
            Movies1 user;
            
            while(rs.next())
            {
                user = new Movies1(
                                 rs.getString("movie_title"),
                                 rs.getString("movie_date"),
                                 rs.getString("airing_time")
                                );
                movieList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return movieList;
    }
    
    // function to display data in jtable
    public void findtitle_Screen1()
    {
        ArrayList<Movies1> mlist = Screen1_movies(searchbar_t_1.getText());
        DefaultTableModel model_a = (DefaultTableModel) ms_screen1_table.getModel();
        Object[] row = new Object[3];
        
        for(int i = 0; i < mlist.size(); i++)
        {
            row[0]= mlist.get(i).gettitle();
            row[1]= mlist.get(i).getdate();
            row[2]= mlist.get(i).gettime();
            model_a.addRow(row);
        }
       ms_screen1_table.setModel(model_a);
       
    }
    
    //SEARCHING MOVIE DATE IN ALL SCREENS
public ArrayList<Movies1> Screen1_date(String ValToSearch)
    {
        ArrayList<Movies1> movieList = new ArrayList<Movies1>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            java.sql.Statement stm= con.createStatement();
            String searchQuery = "SELECT * FROM `schedule_movies` WHERE movie_date LIKE '%"+ValToSearch+"%' AND movie_screen='Screen 1'";
            rs = stm.executeQuery(searchQuery);
            
            Movies1 user;
            
            while(rs.next())
            {
                user = new Movies1(
                                 rs.getString("movie_title"),
                                 rs.getString("movie_date"),
                                 rs.getString("airing_time")
                        
                                );
                movieList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return movieList;
    }
    
    // function to display data in jtable
    public void finddate_Screen1()
    {   SimpleDateFormat sdf2= new SimpleDateFormat("MMM dd,y");
        String date2 = sdf2.format(date_field_screen1.getDate());
        
        ArrayList<Movies1> mlist = Screen1_date(date2);
        DefaultTableModel model_a = (DefaultTableModel) ms_screen1_table.getModel();
        Object[] row = new Object[3];
        
        for(int i = 0; i < mlist.size(); i++)
        {
            row[0]= mlist.get(i).gettitle();
            row[1]= mlist.get(i).getdate();
            row[2]= mlist.get(i).gettime();
            model_a.addRow(row);
        }
       ms_screen1_table.setModel(model_a);
       
    }
    
    
    
    
    //SEARCH BUTTON SCREEN 2
    public ArrayList<Movies1> Screen2_movies(String ValToSearch)
    {
        ArrayList<Movies1> movieList = new ArrayList<Movies1>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            java.sql.Statement stm= con.createStatement();
            String searchQuery = "SELECT * FROM `schedule_movies` WHERE movie_title LIKE '%"+ValToSearch+"%' AND movie_screen='Screen 2'";
            rs = stm.executeQuery(searchQuery);
            
            Movies1 user;
            
            while(rs.next())
            {
                user = new Movies1(
                                 rs.getString("movie_title"),
                                 rs.getString("movie_date"),
                                 rs.getString("airing_time")
                                );
                movieList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return movieList;
    }
    
    // function to display data in jtable
    public void findtitle_Screen2()
    {
        ArrayList<Movies1> mlist = Screen2_movies(searchbar_t_2.getText());
        DefaultTableModel model_a = (DefaultTableModel) ms_screen2_table.getModel();
        Object[] row = new Object[3];
        
        for(int i = 0; i < mlist.size(); i++)
        {
            row[0]= mlist.get(i).gettitle();
            row[1]= mlist.get(i).getdate();
            row[2]= mlist.get(i).gettime();
            model_a.addRow(row);
        }
       ms_screen2_table.setModel(model_a);
       
    }
    
    //SEARCHING MOVIE DATE IN SCREEN 2
public ArrayList<Movies1> Screen2_date(String ValToSearch)
    {
        ArrayList<Movies1> movieList = new ArrayList<Movies1>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            java.sql.Statement stm= con.createStatement();
            String searchQuery = "SELECT * FROM `schedule_movies` WHERE movie_date LIKE '%"+ValToSearch+"%' AND movie_screen='Screen 2'";
            rs = stm.executeQuery(searchQuery);
            
            Movies1 user;
            
            while(rs.next())
            {
                user = new Movies1(
                                 rs.getString("movie_title"),
                                 rs.getString("movie_date"),
                                 rs.getString("airing_time")
                        
                                );
                movieList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return movieList;
    }
    
    // function to display data in jtable
    public void finddate_Screen2()
    {   SimpleDateFormat sdf2= new SimpleDateFormat("MMM dd,y");
        String date2 = sdf2.format(date_field_screen2.getDate());
        
        ArrayList<Movies1> mlist = Screen1_date(date2);
        DefaultTableModel model_a = (DefaultTableModel) ms_screen2_table.getModel();
        Object[] row = new Object[3];
        
        for(int i = 0; i < mlist.size(); i++)
        {
            row[0]= mlist.get(i).gettitle();
            row[1]= mlist.get(i).getdate();
            row[2]= mlist.get(i).gettime();
            model_a.addRow(row);
        }
       ms_screen2_table.setModel(model_a);
       
    }
    
    
    
    //SEARCH BUTTON SCREEN 3
    public ArrayList<Movies1> Screen3_movies(String ValToSearch)
    {
        ArrayList<Movies1> movieList = new ArrayList<Movies1>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            java.sql.Statement stm= con.createStatement();
            String searchQuery = "SELECT * FROM `schedule_movies` WHERE movie_title LIKE '%"+ValToSearch+"%' AND movie_screen='Screen 3'";
            rs = stm.executeQuery(searchQuery);
            
            Movies1 user;
            
            while(rs.next())
            {
                user = new Movies1(
                                 rs.getString("movie_title"),
                                 rs.getString("movie_date"),
                                 rs.getString("airing_time")
                                );
                movieList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return movieList;
    }
    
    // function to display data in jtable
    public void findtitle_Screen3()
    {
        ArrayList<Movies1> mlist = Screen3_movies(searchbar_t_3.getText());
        DefaultTableModel model_a = (DefaultTableModel) ms_screen3_table.getModel();
        Object[] row = new Object[3];
        
        for(int i = 0; i < mlist.size(); i++)
        {
            row[0]= mlist.get(i).gettitle();
            row[1]= mlist.get(i).getdate();
            row[2]= mlist.get(i).gettime();
            model_a.addRow(row);
        }
       ms_screen3_table.setModel(model_a);
       
    }
    
    //SEARCHING MOVIE DATE IN SCREEN 3
public ArrayList<Movies1> Screen3_date(String ValToSearch)
    {
        ArrayList<Movies1> movieList = new ArrayList<Movies1>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            java.sql.Statement stm= con.createStatement();
            String searchQuery = "SELECT * FROM `schedule_movies` WHERE movie_date LIKE '%"+ValToSearch+"%' AND movie_screen='Screen 3'";
            rs = stm.executeQuery(searchQuery);
            
            Movies1 user;
            
            while(rs.next())
            {
                user = new Movies1(
                                 rs.getString("movie_title"),
                                 rs.getString("movie_date"),
                                 rs.getString("airing_time")
                        
                                );
                movieList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return movieList;
    }
    
    // function to display data in jtable
    public void finddate_Screen3()
    {   SimpleDateFormat sdf2= new SimpleDateFormat("MMM dd,y");
        String date2 = sdf2.format(date_field_screen3.getDate());
        
        ArrayList<Movies1> mlist = Screen1_date(date2);
        DefaultTableModel model_a = (DefaultTableModel) ms_screen3_table.getModel();
        Object[] row = new Object[3];
        
        for(int i = 0; i < mlist.size(); i++)
        {
            row[0]= mlist.get(i).gettitle();
            row[1]= mlist.get(i).getdate();
            row[2]= mlist.get(i).gettime();
            model_a.addRow(row);
        }
       ms_screen3_table.setModel(model_a);
       
    }
    
    
    private void jLabel132search_btns_viewssched(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel132search_btns_viewssched

        if (evt.getSource() == jLabel126) {
            //SEARCH BAR ALL SCREENS
            DefaultTableModel model_a = (DefaultTableModel) ms_screen_table_all.getModel();
            int rowCount = model_a.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            findMovies();
        }
        // SEARCH BY DATE -ALL SCREENS
        if (evt.getSource() == jLabel132) {
            DefaultTableModel model_o = (DefaultTableModel) ms_screen_table_all.getModel();
            int rowCount1 = model_o.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount1 - 1; i >= 0; i--) {
                model_o.removeRow(i);}
            findMoviesdate();
        }
    }//GEN-LAST:event_jLabel132search_btns_viewssched

    private void searchdate_screen1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchdate_screen1MouseClicked
        // SEARCH BUTTONS IN MOVIE SCREENS
        //search button by title SCREEN1-3
        if (evt.getSource() == searchtitle_screen1) {
            DefaultTableModel model_a = (DefaultTableModel) ms_screen1_table.getModel();
            int rowCount = model_a.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            findtitle_Screen1();
        }

        if (evt.getSource() == searchtitle_screen2) {
            DefaultTableModel model_a = (DefaultTableModel) ms_screen2_table.getModel();
            int rowCount = model_a.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            findtitle_Screen2();
        }

        if (evt.getSource() == searchtitle_screen3) {
            DefaultTableModel model_a = (DefaultTableModel) ms_screen3_table.getModel();
            int rowCount = model_a.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            findtitle_Screen3();
        }
        //search button by date SCREEN 1-3
        if (evt.getSource() == searchdate_screen1) {
            DefaultTableModel model_a = (DefaultTableModel) ms_screen1_table.getModel();
            int rowCount = model_a.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            finddate_Screen1();
        }

        if (evt.getSource() == searchdate_screen2) {
            DefaultTableModel model_a = (DefaultTableModel) ms_screen2_table.getModel();
            int rowCount = model_a.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            finddate_Screen2();

        }

        if (evt.getSource() == searchdate_screen3) {
            DefaultTableModel model_a = (DefaultTableModel) ms_screen3_table.getModel();
            int rowCount = model_a.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                model_a.removeRow(i);}
            finddate_Screen3();

        }

    }//GEN-LAST:event_searchdate_screen1MouseClicked
 
    void setSPColor(javax.swing.JPanel panel){
        panel.setBackground(new java.awt.Color(163,40,0));
    }
    void resetSPColor(javax.swing.JPanel panel){
        panel.setBackground(new java.awt.Color(228,68,33));
    }
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
            java.util.logging.Logger.getLogger(staff_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(staff_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(staff_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(staff_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new staff_space().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel a_checkout;
    private javax.swing.JLabel a_date;
    private javax.swing.JPanel a_reset;
    private javax.swing.JPanel a_vs;
    private javax.swing.JPanel add;
    private javax.swing.JPanel add_p;
    private javax.swing.JLabel adult_price_display;
    private javax.swing.JSpinner adult_spinner;
    private javax.swing.JTextField all_screens_searchbar;
    private com.toedter.calendar.JDateChooser allscreen_date_search;
    private javax.swing.JPanel am10;
    private javax.swing.JPanel am11;
    private javax.swing.JPanel am12;
    private javax.swing.JPanel am13;
    private javax.swing.JPanel am14;
    private javax.swing.JPanel am7;
    private javax.swing.JPanel am8;
    private javax.swing.JPanel am9;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnadd;
    private javax.swing.JPanel btnhome;
    private javax.swing.JPanel btnlogout;
    private javax.swing.JPanel btnmoviescreen;
    private javax.swing.JLabel child_price_display;
    private javax.swing.JSpinner child_spinner;
    private com.toedter.calendar.JDateChooser date_field_screen1;
    private com.toedter.calendar.JDateChooser date_field_screen2;
    private com.toedter.calendar.JDateChooser date_field_screen3;
    private javax.swing.JLabel duration_screen1;
    private javax.swing.JLabel duration_screen2;
    private javax.swing.JLabel duration_screen3;
    private javax.swing.JLabel duration_stat_screen1;
    private javax.swing.JLabel duration_stat_screen2;
    private javax.swing.JLabel duration_stat_screen3;
    private javax.swing.JPanel h_btnscreen1;
    private javax.swing.JPanel h_btnscreen2;
    private javax.swing.JPanel h_btnscreen3;
    private javax.swing.JLabel h_date;
    private javax.swing.JPanel h_issueticket1;
    private javax.swing.JPanel h_issueticket2;
    private javax.swing.JPanel h_issueticket3;
    private javax.swing.JPanel h_moreinfo1;
    private javax.swing.JPanel h_moreinfo4;
    private javax.swing.JPanel h_moreinfo5;
    private javax.swing.JPanel h_moreinfo6;
    private javax.swing.JPanel h_moreinfo7;
    private javax.swing.JPanel h_moreinfo8;
    private javax.swing.JPanel h_moreinfo9;
    private javax.swing.JPanel h_screen1;
    private javax.swing.JLabel h_screen1_movietitle;
    private javax.swing.JPanel h_screen2;
    private javax.swing.JLabel h_screen2_movietitle;
    private javax.swing.JPanel h_screen3;
    private javax.swing.JLabel h_screen3_movietitle;
    private javax.swing.JLabel h_seats_screen1;
    private javax.swing.JLabel h_seats_screen2;
    private javax.swing.JLabel h_seats_screen3;
    private javax.swing.JLabel h_time;
    private javax.swing.JLabel h_timestarted_screen1;
    private javax.swing.JLabel h_timestarted_screen2;
    private javax.swing.JLabel h_timestarted_screen3;
    private javax.swing.JPanel home_p;
    private javax.swing.JPanel home_p1;
    private javax.swing.JLabel id1;
    private com.toedter.calendar.JDateChooser it_date_field;
    private javax.swing.JLabel it_screen;
    private javax.swing.JLabel it_seats;
    private javax.swing.JComboBox<String> it_time_cb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel m_id2;
    private javax.swing.JLabel m_id3;
    private javax.swing.JLabel m_sched_id;
    private javax.swing.JLayeredPane main_pane;
    private javax.swing.JPanel main_panel;
    private javax.swing.JLabel midlabel;
    private javax.swing.JPanel ms_all_screens;
    private javax.swing.JPanel ms_btnscreen1;
    private javax.swing.JPanel ms_btnscreen2;
    private javax.swing.JPanel ms_btnscreen3;
    private javax.swing.JPanel ms_btnscreen4;
    private javax.swing.JPanel ms_p;
    private javax.swing.JPanel ms_screen1;
    private javax.swing.JTable ms_screen1_table;
    private javax.swing.JPanel ms_screen2;
    private javax.swing.JTable ms_screen2_table;
    private javax.swing.JPanel ms_screen3;
    private javax.swing.JTable ms_screen3_table;
    private javax.swing.JTable ms_screen_table_all;
    private javax.swing.JLabel rating_display_s1;
    private javax.swing.JLabel rating_display_s2;
    private javax.swing.JLabel rating_display_s3;
    private javax.swing.JLabel screen1MP;
    private javax.swing.JPanel screen1_stat1;
    private javax.swing.JLabel screen2MP;
    private javax.swing.JPanel screen2_stat1;
    private javax.swing.JLabel screen3MP;
    private javax.swing.JPanel screen3_stat1;
    private javax.swing.JPanel screen3_stat2;
    private javax.swing.JPanel screen3_stat3;
    private javax.swing.JPanel screen3_stat4;
    private javax.swing.JPanel screen3_stat5;
    private javax.swing.JTextField searchbar_t_1;
    private javax.swing.JTextField searchbar_t_2;
    private javax.swing.JTextField searchbar_t_3;
    private javax.swing.JLabel searchdate_screen1;
    private javax.swing.JLabel searchdate_screen2;
    private javax.swing.JLabel searchdate_screen3;
    private javax.swing.JLabel searchtitle_screen1;
    private javax.swing.JLabel searchtitle_screen2;
    private javax.swing.JLabel searchtitle_screen3;
    private javax.swing.JComboBox<String> selectmovies_cb;
    private javax.swing.JLabel senior_price_display;
    private javax.swing.JSpinner senior_spinner;
    private javax.swing.JPanel sidebg;
    private javax.swing.JLabel st_movieposter;
    private javax.swing.JLabel stat1;
    private javax.swing.JLabel stat2;
    private javax.swing.JLabel stat3;
    private javax.swing.JLabel subtotal_display;
    private javax.swing.JLabel ticketssold_display;
    private javax.swing.JLabel today_sales_display;
    private javax.swing.JPanel top;
    private javax.swing.JPanel top_add;
    private javax.swing.JPanel top_home;
    private javax.swing.JPanel top_ms;
    // End of variables declaration//GEN-END:variables

    
}

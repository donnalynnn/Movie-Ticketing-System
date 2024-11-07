/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.TableModel;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//timer

import java.util.TimerTask;

/**
 *
 * @author User
 */
public class admin_space extends javax.swing.JFrame {


    String filename = null;
    byte[] selected_mp= null;
    byte[] mp = null;
    String s = null;
    String screen;
    
    int adult_t;
    int child_t;
    int senior_t;
    
    
    byte[] d_mp= null;
    byte[] d_mp3= null;
    byte[] d_mp2= null;

    long milliseconds;
    long startTime = System.currentTimeMillis();
    
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
    
       
    public admin_space() {
        initComponents();
        showTime();
        showDate();
        //Fillcombo_ms_movie();
    }

    void showTime() {
        Date set_date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        h_date.setText(sdf.format(set_date));

    }

    void showDate() {
        new Timer(0, new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                    Date set_date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("a HH:mm:ss");
                    //SimpleDateFormat sdf2 = new SimpleDateFormat("hh:mm:ss a");
                    h_time.setText(sdf.format(set_date));
                    
                    
                    
            }
        }).start();

    }
                
    
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        background = new javax.swing.JPanel();
        sidebg = new javax.swing.JPanel();
        btnhome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        logged_in_as = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnadd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnmoviescreen = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnmanagestaff = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
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
        minimize1 = new javax.swing.JLabel();
        top_add = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        top_ms = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        top_manage = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
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
        jLabel24 = new javax.swing.JLabel();
        h_btnscreen2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        h_btnscreen3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        h_screen1 = new javax.swing.JPanel();
        screen1_stat = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        h_screen1_movietitle = new javax.swing.JLabel();
        duration_stat_screen1 = new javax.swing.JLabel();
        stat1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        screen1MP = new javax.swing.JLabel();
        h_issueticket1 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        h_moreinfo = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        duration_screen1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        rating_display_s1 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        h_seats_screen1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        h_timestarted_screen1 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        h_screen2 = new javax.swing.JPanel();
        screen2_stat = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        h_screen2_movietitle = new javax.swing.JLabel();
        duration_stat_screen2 = new javax.swing.JLabel();
        stat2 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        screen2MP = new javax.swing.JLabel();
        h_issueticket2 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        h_moreinfo2 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        duration_screen2 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        rating_display_s2 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        h_seats_screen2 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        h_timestarted_screen2 = new javax.swing.JLabel();
        m_id2 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        h_screen3 = new javax.swing.JPanel();
        screen3_stat = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        h_screen3_movietitle = new javax.swing.JLabel();
        duration_stat_screen3 = new javax.swing.JLabel();
        stat3 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        screen3MP = new javax.swing.JLabel();
        h_issueticket3 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        h_moreinfo3 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        duration_screen3 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        rating_display_s3 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        h_seats_screen3 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel131 = new javax.swing.JLabel();
        h_timestarted_screen3 = new javax.swing.JLabel();
        m_id3 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        sm_p = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        sm_add_btn = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        am1 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        movietitle_field = new javax.swing.JTextField();
        am3 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        date_field = new com.toedter.calendar.JDateChooser();
        am4 = new javax.swing.JPanel();
        price_field = new javax.swing.JTextField();
        jLabel106 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        am5 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        rating_field = new javax.swing.JTextField();
        am2 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        sm_small_mp = new javax.swing.JLabel();
        sm_sp = new javax.swing.JPanel();
        s_poster_txt = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        sm_remove_mp = new javax.swing.JPanel();
        s_poster_txt1 = new javax.swing.JLabel();
        am6 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        am_movie_duration = new javax.swing.JSpinner();
        sched_sidepanel = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        ms_combo_movies = new javax.swing.JComboBox<>();
        sm_sched_btn = new javax.swing.JPanel();
        sched_btn_text = new javax.swing.JLabel();
        sm_selectedmovie_poster = new javax.swing.JLabel();
        date_field1 = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();
        screen3_radio_btn = new javax.swing.JRadioButton();
        screen2_radio_btn = new javax.swing.JRadioButton();
        screen1_radio_btn = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        sm_slected_movietime = new javax.swing.JSpinner();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        manage_p = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        m_s_register_btn = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        sb_staff = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        sphoto_field = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel104 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        f = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        fullname_staff = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        staff_info_table = new javax.swing.JTable();
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
        jLabel128 = new javax.swing.JLabel();
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
        setUndecorated(true);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 0)));
        background.setMaximumSize(new java.awt.Dimension(1020, 580));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backgroundMouseEntered(evt);
            }
        });
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebg.setBackground(new java.awt.Color(153, 153, 0));
        sidebg.setMaximumSize(new java.awt.Dimension(230, 551));
        sidebg.setMinimumSize(new java.awt.Dimension(230, 551));
        sidebg.setPreferredSize(new java.awt.Dimension(230, 551));
        sidebg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnhome.setBackground(new java.awt.Color(153, 153, 0));
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebtns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sidebtns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sidebtns_exit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnhomeMousePressed(evt);
            }
        });
        btnhome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnhomeside_btn_release(evt);
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

        add.setBackground(new java.awt.Color(153, 153, 0));

        logged_in_as.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        logged_in_as.setForeground(new java.awt.Color(255, 255, 255));
        logged_in_as.setText("Logged in as Administrator");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_male_user_25px.png"))); // NOI18N

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logged_in_as, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(logged_in_as, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidebg.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 230, 40));

        btnadd.setBackground(new java.awt.Color(153, 153, 0));
        btnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebtns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sidebtns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sidebtns_exit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnaddMousePressed(evt);
            }
        });
        btnadd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnaddside_btn_release(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Schedule Movie");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_schedule_20px.png"))); // NOI18N

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

        btnmoviescreen.setBackground(new java.awt.Color(153, 153, 0));
        btnmoviescreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebtns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sidebtns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sidebtns_exit(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnmoviescreenMousePressed(evt);
            }
        });
        btnmoviescreen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnmoviescreenside_btn_release(evt);
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

        btnmanagestaff.setBackground(new java.awt.Color(153, 153, 0));
        btnmanagestaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebtns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sidebtns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sidebtns_exit(evt);
            }
        });

        jLabel99.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Manage Staff ");

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_management_20px_2.png"))); // NOI18N

        javax.swing.GroupLayout btnmanagestaffLayout = new javax.swing.GroupLayout(btnmanagestaff);
        btnmanagestaff.setLayout(btnmanagestaffLayout);
        btnmanagestaffLayout.setHorizontalGroup(
            btnmanagestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnmanagestaffLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel101)
                .addGap(18, 18, 18)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        btnmanagestaffLayout.setVerticalGroup(
            btnmanagestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnmanagestaffLayout.createSequentialGroup()
                .addGroup(btnmanagestaffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel101)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        sidebg.add(btnmanagestaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 250, 40));

        btnlogout.setBackground(new java.awt.Color(153, 153, 0));
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sidebtns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sidebtns_exit(evt);
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

        sidebg.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 250, 40));

        jPanel7.setBackground(new java.awt.Color(153, 153, 0));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_movie_70px.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Admin Space");

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

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator5.setOpaque(true);
        sidebg.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 215, -1));

        background.add(sidebg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 580));

        top.setBackground(new java.awt.Color(228, 68, 33));
        top.setLayout(new java.awt.CardLayout());

        top_home.setBackground(new java.awt.Color(153, 153, 0));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_home_15px.png"))); // NOI18N
        jLabel21.setText("Home");

        minimize1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_compress_15px.png"))); // NOI18N
        minimize1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout top_homeLayout = new javax.swing.GroupLayout(top_home);
        top_home.setLayout(top_homeLayout);
        top_homeLayout.setHorizontalGroup(
            top_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top_homeLayout.createSequentialGroup()
                .addContainerGap(386, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(300, 300, 300)
                .addComponent(minimize1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        top_homeLayout.setVerticalGroup(
            top_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimize1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        top.add(top_home, "card3");

        top_add.setBackground(new java.awt.Color(153, 153, 0));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_schedule_15px.png"))); // NOI18N
        jLabel22.setText("Schedule Movie");

        javax.swing.GroupLayout top_addLayout = new javax.swing.GroupLayout(top_add);
        top_add.setLayout(top_addLayout);
        top_addLayout.setHorizontalGroup(
            top_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, top_addLayout.createSequentialGroup()
                .addContainerGap(325, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(332, 332, 332))
        );
        top_addLayout.setVerticalGroup(
            top_addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        top.add(top_add, "card4");

        top_ms.setBackground(new java.awt.Color(153, 153, 0));

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

        top_manage.setBackground(new java.awt.Color(153, 153, 0));

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_management_16px.png"))); // NOI18N
        jLabel102.setText("Manage Staff");

        javax.swing.GroupLayout top_manageLayout = new javax.swing.GroupLayout(top_manage);
        top_manage.setLayout(top_manageLayout);
        top_manageLayout.setHorizontalGroup(
            top_manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(top_manageLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel102)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        top_manageLayout.setVerticalGroup(
            top_manageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel102, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        top.add(top_manage, "card5");

        background.add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 770, 30));

        main_pane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 153, 0)));
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
        main_panel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(153, 153, 0)));
        main_panel.setLayout(new java.awt.CardLayout());

        home_p.setBackground(new java.awt.Color(255, 255, 255));

        h_btnscreen1.setBackground(new java.awt.Color(204, 0, 102));
        h_btnscreen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_btnscreens_clicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_btnscreen1h_btnscreens_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_btnscreen1h_btnscreens_exit(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel24.setText("Screen 1");

        javax.swing.GroupLayout h_btnscreen1Layout = new javax.swing.GroupLayout(h_btnscreen1);
        h_btnscreen1.setLayout(h_btnscreen1Layout);
        h_btnscreen1Layout.setHorizontalGroup(
            h_btnscreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_btnscreen1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel24)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        h_btnscreen1Layout.setVerticalGroup(
            h_btnscreen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        h_btnscreen2.setBackground(new java.awt.Color(204, 0, 102));
        h_btnscreen2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_btnscreens_clicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_btnscreen2h_btnscreens_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_btnscreen2h_btnscreens_exit(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel25.setText("Screen 2");

        javax.swing.GroupLayout h_btnscreen2Layout = new javax.swing.GroupLayout(h_btnscreen2);
        h_btnscreen2.setLayout(h_btnscreen2Layout);
        h_btnscreen2Layout.setHorizontalGroup(
            h_btnscreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_btnscreen2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        h_btnscreen2Layout.setVerticalGroup(
            h_btnscreen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        h_btnscreen3.setBackground(new java.awt.Color(204, 0, 102));
        h_btnscreen3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                h_btnscreens_clicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_btnscreen3h_btnscreens_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_btnscreen3h_btnscreens_exit(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_15px.png"))); // NOI18N
        jLabel26.setText("Screen 3");

        javax.swing.GroupLayout h_btnscreen3Layout = new javax.swing.GroupLayout(h_btnscreen3);
        h_btnscreen3.setLayout(h_btnscreen3Layout);
        h_btnscreen3Layout.setHorizontalGroup(
            h_btnscreen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_btnscreen3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        h_btnscreen3Layout.setVerticalGroup(
            h_btnscreen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        h_screen1.setBackground(new java.awt.Color(255, 255, 255));

        screen1_stat.setBackground(new java.awt.Color(255, 255, 255));
        screen1_stat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 135, 225), 2));

        jPanel10.setBackground(new java.awt.Color(204, 135, 225));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_15px_1.png"))); // NOI18N
        jLabel27.setText("Screen 1 Status");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Current Movie");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Movie Duration");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setText("Status");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 51, 51));
        jLabel31.setText("Next Movie");

        h_screen1_movietitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        h_screen1_movietitle.setForeground(new java.awt.Color(51, 51, 51));
        h_screen1_movietitle.setText("n/A");

        duration_stat_screen1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        duration_stat_screen1.setForeground(new java.awt.Color(51, 51, 51));
        duration_stat_screen1.setText("--:--:--");

        stat1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        stat1.setForeground(new java.awt.Color(51, 51, 51));
        stat1.setText("--");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(51, 51, 51));
        jLabel35.setText("n/A");

        javax.swing.GroupLayout screen1_statLayout = new javax.swing.GroupLayout(screen1_stat);
        screen1_stat.setLayout(screen1_statLayout);
        screen1_statLayout.setHorizontalGroup(
            screen1_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(screen1_statLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(screen1_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel28))
                .addGap(145, 145, 145)
                .addGroup(screen1_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration_stat_screen1)
                    .addComponent(h_screen1_movietitle)
                    .addComponent(stat1)
                    .addComponent(jLabel35))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        screen1_statLayout.setVerticalGroup(
            screen1_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screen1_statLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen1_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(h_screen1_movietitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen1_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(screen1_statLayout.createSequentialGroup()
                        .addComponent(duration_stat_screen1)
                        .addGap(11, 11, 11)
                        .addComponent(stat1))
                    .addGroup(screen1_statLayout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(screen1_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel35))))
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

        jLabel54.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_20px_1.png"))); // NOI18N
        jLabel54.setText("Schedule ");

        javax.swing.GroupLayout h_issueticket1Layout = new javax.swing.GroupLayout(h_issueticket1);
        h_issueticket1.setLayout(h_issueticket1Layout);
        h_issueticket1Layout.setHorizontalGroup(
            h_issueticket1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(h_issueticket1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel54)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        h_issueticket1Layout.setVerticalGroup(
            h_issueticket1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(h_issueticket1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel54)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        h_moreinfo.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(0, 204, 204));

        jLabel38.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Time Elapsed");

        duration_screen1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        duration_screen1.setForeground(new java.awt.Color(255, 255, 255));
        duration_screen1.setText("--:--:--");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(duration_screen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(duration_screen1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(204, 204, 0));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("IMDb Rating");

        rating_display_s1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rating_display_s1.setForeground(new java.awt.Color(255, 255, 255));
        rating_display_s1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_star_24px_1.png"))); // NOI18N
        rating_display_s1.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rating_display_s1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rating_display_s1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(204, 0, 204));

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Available Seats");

        h_seats_screen1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_seats_screen1.setForeground(new java.awt.Color(255, 255, 255));
        h_seats_screen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_armchair_24px_1.png"))); // NOI18N
        h_seats_screen1.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_seats_screen1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_seats_screen1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(247, 104, 66));

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Time Started");

        h_timestarted_screen1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_timestarted_screen1.setForeground(new java.awt.Color(255, 255, 255));
        h_timestarted_screen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_time_24px.png"))); // NOI18N
        h_timestarted_screen1.setText("--:-- --");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(h_timestarted_screen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_timestarted_screen1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout h_moreinfoLayout = new javax.swing.GroupLayout(h_moreinfo);
        h_moreinfo.setLayout(h_moreinfoLayout);
        h_moreinfoLayout.setHorizontalGroup(
            h_moreinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h_moreinfoLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(h_moreinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(70, 70, 70)
                .addGroup(h_moreinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        h_moreinfoLayout.setVerticalGroup(
            h_moreinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_moreinfoLayout.createSequentialGroup()
                .addGroup(h_moreinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17)
                .addGroup(h_moreinfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel32.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(102, 102, 102));
        jLabel32.setText("Movie ID ");

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
                    .addComponent(screen1_stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h_moreinfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(h_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen1Layout.createSequentialGroup()
                        .addComponent(jLabel32)
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
                    .addComponent(jLabel32)
                    .addComponent(id1))
                .addGap(5, 5, 5)
                .addGroup(h_screen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen1Layout.createSequentialGroup()
                        .addComponent(screen1MP, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(h_issueticket1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(h_screen1Layout.createSequentialGroup()
                        .addComponent(screen1_stat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(h_moreinfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(h_screen1, "card2");

        h_screen2.setBackground(new java.awt.Color(255, 255, 255));

        screen2_stat.setBackground(new java.awt.Color(255, 255, 255));
        screen2_stat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 135, 225), 2));

        jPanel11.setBackground(new java.awt.Color(204, 135, 225));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_15px_1.png"))); // NOI18N
        jLabel36.setText("Screen 2 Status");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(51, 51, 51));
        jLabel46.setText("Current Movie");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(51, 51, 51));
        jLabel47.setText("Movie Duration");

        jLabel48.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(51, 51, 51));
        jLabel48.setText("Status");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(51, 51, 51));
        jLabel49.setText("Next Movie");

        h_screen2_movietitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        h_screen2_movietitle.setForeground(new java.awt.Color(51, 51, 51));
        h_screen2_movietitle.setText("n/A");

        duration_stat_screen2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        duration_stat_screen2.setForeground(new java.awt.Color(51, 51, 51));
        duration_stat_screen2.setText("--:--:--");

        stat2.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        stat2.setForeground(new java.awt.Color(51, 51, 51));
        stat2.setText("--");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(51, 51, 51));
        jLabel53.setText("n/A");

        javax.swing.GroupLayout screen2_statLayout = new javax.swing.GroupLayout(screen2_stat);
        screen2_stat.setLayout(screen2_statLayout);
        screen2_statLayout.setHorizontalGroup(
            screen2_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(screen2_statLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(screen2_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel46))
                .addGap(145, 145, 145)
                .addGroup(screen2_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration_stat_screen2)
                    .addComponent(h_screen2_movietitle)
                    .addComponent(stat2)
                    .addComponent(jLabel53))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        screen2_statLayout.setVerticalGroup(
            screen2_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screen2_statLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen2_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(h_screen2_movietitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen2_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(screen2_statLayout.createSequentialGroup()
                        .addComponent(duration_stat_screen2)
                        .addGap(11, 11, 11)
                        .addComponent(stat2))
                    .addGroup(screen2_statLayout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(screen2_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jLabel53))))
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
                h_issueticket2h_IssueTicketbtn_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_issueticket2h_IssueTicketbtn_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_issueticket2h_IssueTicketbtn_exit(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_20px_1.png"))); // NOI18N
        jLabel50.setText("Schedule");

        javax.swing.GroupLayout h_issueticket2Layout = new javax.swing.GroupLayout(h_issueticket2);
        h_issueticket2.setLayout(h_issueticket2Layout);
        h_issueticket2Layout.setHorizontalGroup(
            h_issueticket2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(h_issueticket2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel50)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        h_issueticket2Layout.setVerticalGroup(
            h_issueticket2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(h_issueticket2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel50)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        h_moreinfo2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(0, 204, 204));

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Time Elapsed");

        duration_screen2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        duration_screen2.setForeground(new java.awt.Color(255, 255, 255));
        duration_screen2.setText("--:--:--");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration_screen2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(duration_screen2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(204, 204, 0));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("IMDb Rating");

        rating_display_s2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rating_display_s2.setForeground(new java.awt.Color(255, 255, 255));
        rating_display_s2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_star_24px_1.png"))); // NOI18N
        rating_display_s2.setText("0");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rating_display_s2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rating_display_s2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(204, 0, 204));

        jLabel59.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Available Seats");

        h_seats_screen2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_seats_screen2.setForeground(new java.awt.Color(255, 255, 255));
        h_seats_screen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_armchair_24px_1.png"))); // NOI18N
        h_seats_screen2.setText("0");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_seats_screen2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_seats_screen2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(247, 104, 66));

        jLabel129.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("Time Started");

        h_timestarted_screen2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_timestarted_screen2.setForeground(new java.awt.Color(255, 255, 255));
        h_timestarted_screen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_time_24px.png"))); // NOI18N
        h_timestarted_screen2.setText("--:-- --");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel129)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(h_timestarted_screen2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_timestarted_screen2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout h_moreinfo2Layout = new javax.swing.GroupLayout(h_moreinfo2);
        h_moreinfo2.setLayout(h_moreinfo2Layout);
        h_moreinfo2Layout.setHorizontalGroup(
            h_moreinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h_moreinfo2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(h_moreinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(h_moreinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        h_moreinfo2Layout.setVerticalGroup(
            h_moreinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_moreinfo2Layout.createSequentialGroup()
                .addGroup(h_moreinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(h_moreinfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        m_id2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        m_id2.setForeground(new java.awt.Color(102, 102, 102));
        m_id2.setText("-------");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Movie ID ");

        javax.swing.GroupLayout h_screen2Layout = new javax.swing.GroupLayout(h_screen2);
        h_screen2.setLayout(h_screen2Layout);
        h_screen2Layout.setHorizontalGroup(
            h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_screen2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(screen2_stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h_moreinfo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen2Layout.createSequentialGroup()
                        .addComponent(jLabel33)
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
                    .addComponent(jLabel33)
                    .addComponent(m_id2))
                .addGap(5, 5, 5)
                .addGroup(h_screen2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen2Layout.createSequentialGroup()
                        .addComponent(screen2MP, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(h_issueticket2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(h_screen2Layout.createSequentialGroup()
                        .addComponent(screen2_stat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(h_moreinfo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(h_screen2, "card3");

        h_screen3.setBackground(new java.awt.Color(255, 255, 255));

        screen3_stat.setBackground(new java.awt.Color(255, 255, 255));
        screen3_stat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 135, 225), 2));

        jPanel19.setBackground(new java.awt.Color(204, 135, 225));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_15px_1.png"))); // NOI18N
        jLabel63.setText("Screen 3 Status");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        jLabel64.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(51, 51, 51));
        jLabel64.setText("Current Movie");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(51, 51, 51));
        jLabel65.setText("Movie Duration");

        jLabel66.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(51, 51, 51));
        jLabel66.setText("Status");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(51, 51, 51));
        jLabel67.setText("Next Movie");

        h_screen3_movietitle.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        h_screen3_movietitle.setForeground(new java.awt.Color(51, 51, 51));
        h_screen3_movietitle.setText("n/A");

        duration_stat_screen3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        duration_stat_screen3.setForeground(new java.awt.Color(51, 51, 51));
        duration_stat_screen3.setText("--:--:--");

        stat3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        stat3.setForeground(new java.awt.Color(51, 51, 51));
        stat3.setText("--");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 51, 51));
        jLabel71.setText("n/A");

        javax.swing.GroupLayout screen3_statLayout = new javax.swing.GroupLayout(screen3_stat);
        screen3_stat.setLayout(screen3_statLayout);
        screen3_statLayout.setHorizontalGroup(
            screen3_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(screen3_statLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(screen3_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel65)
                    .addComponent(jLabel66)
                    .addComponent(jLabel67)
                    .addComponent(jLabel64))
                .addGap(145, 145, 145)
                .addGroup(screen3_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration_stat_screen3)
                    .addComponent(h_screen3_movietitle)
                    .addComponent(stat3)
                    .addComponent(jLabel71))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        screen3_statLayout.setVerticalGroup(
            screen3_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(screen3_statLayout.createSequentialGroup()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen3_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(h_screen3_movietitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(screen3_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(screen3_statLayout.createSequentialGroup()
                        .addComponent(duration_stat_screen3)
                        .addGap(11, 11, 11)
                        .addComponent(stat3))
                    .addGroup(screen3_statLayout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel66)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(screen3_statLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel67)
                            .addComponent(jLabel71))))
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
                h_issueticket3h_IssueTicketbtn_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                h_issueticket3h_IssueTicketbtn_entered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                h_issueticket3h_IssueTicketbtn_exit(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_clapperboard_20px_1.png"))); // NOI18N
        jLabel68.setText("Schedule");

        javax.swing.GroupLayout h_issueticket3Layout = new javax.swing.GroupLayout(h_issueticket3);
        h_issueticket3.setLayout(h_issueticket3Layout);
        h_issueticket3Layout.setHorizontalGroup(
            h_issueticket3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(h_issueticket3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel68)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        h_issueticket3Layout.setVerticalGroup(
            h_issueticket3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
            .addGroup(h_issueticket3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(h_issueticket3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel68)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        h_moreinfo3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel20.setBackground(new java.awt.Color(0, 204, 204));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Time Elapsed");

        duration_screen3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        duration_screen3.setForeground(new java.awt.Color(255, 255, 255));
        duration_screen3.setText("--:--:--");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(duration_screen3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(duration_screen3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(204, 204, 0));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("IMDb Rating");

        rating_display_s3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rating_display_s3.setForeground(new java.awt.Color(255, 255, 255));
        rating_display_s3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_star_24px_1.png"))); // NOI18N
        rating_display_s3.setText("0");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rating_display_s3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rating_display_s3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(204, 0, 204));

        jLabel77.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Available Seats");

        h_seats_screen3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_seats_screen3.setForeground(new java.awt.Color(255, 255, 255));
        h_seats_screen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_armchair_24px_1.png"))); // NOI18N
        h_seats_screen3.setText("0");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h_seats_screen3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_seats_screen3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(247, 104, 66));

        jLabel131.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("Time Started");

        h_timestarted_screen3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        h_timestarted_screen3.setForeground(new java.awt.Color(255, 255, 255));
        h_timestarted_screen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_time_24px.png"))); // NOI18N
        h_timestarted_screen3.setText("--:-- --");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel131)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(h_timestarted_screen3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(h_timestarted_screen3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout h_moreinfo3Layout = new javax.swing.GroupLayout(h_moreinfo3);
        h_moreinfo3.setLayout(h_moreinfo3Layout);
        h_moreinfo3Layout.setHorizontalGroup(
            h_moreinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h_moreinfo3Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(h_moreinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(h_moreinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        h_moreinfo3Layout.setVerticalGroup(
            h_moreinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_moreinfo3Layout.createSequentialGroup()
                .addGroup(h_moreinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(h_moreinfo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        m_id3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        m_id3.setForeground(new java.awt.Color(102, 102, 102));
        m_id3.setText("-------");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(102, 102, 102));
        jLabel37.setText("Movie ID ");

        javax.swing.GroupLayout h_screen3Layout = new javax.swing.GroupLayout(h_screen3);
        h_screen3.setLayout(h_screen3Layout);
        h_screen3Layout.setHorizontalGroup(
            h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h_screen3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(screen3_stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h_moreinfo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen3Layout.createSequentialGroup()
                        .addComponent(jLabel37)
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
                    .addComponent(jLabel37)
                    .addComponent(m_id3))
                .addGap(5, 5, 5)
                .addGroup(h_screen3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h_screen3Layout.createSequentialGroup()
                        .addComponent(screen3MP, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(h_issueticket3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(h_screen3Layout.createSequentialGroup()
                        .addComponent(screen3_stat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(h_moreinfo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(h_screen3, "card4");

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
            .addComponent(jLayeredPane1)
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
                .addComponent(jLayeredPane1))
        );

        main_panel.add(home_p, "card2");

        sm_p.setBackground(new java.awt.Color(255, 255, 255));
        sm_p.setMaximumSize(new java.awt.Dimension(769, 439));
        sm_p.setMinimumSize(new java.awt.Dimension(769, 439));
        sm_p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(244, 239, 239)));

        jLabel82.setFont(new java.awt.Font("Nirmala UI", 1, 20)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(153, 153, 0));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cinema_22px.png"))); // NOI18N
        jLabel82.setText("Add Movie");

        sm_add_btn.setBackground(new java.awt.Color(204, 204, 0));
        sm_add_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sm_add_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sm_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sm_btns_exit(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_plus_20px.png"))); // NOI18N
        jLabel95.setText("Add Movie");

        javax.swing.GroupLayout sm_add_btnLayout = new javax.swing.GroupLayout(sm_add_btn);
        sm_add_btn.setLayout(sm_add_btnLayout);
        sm_add_btnLayout.setHorizontalGroup(
            sm_add_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sm_add_btnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sm_add_btnLayout.setVerticalGroup(
            sm_add_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        am1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel88.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("Movie Title");

        movietitle_field.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        movietitle_field.setForeground(new java.awt.Color(0, 0, 102));
        movietitle_field.setToolTipText("enter movie title");

        javax.swing.GroupLayout am1Layout = new javax.swing.GroupLayout(am1);
        am1.setLayout(am1Layout);
        am1Layout.setHorizontalGroup(
            am1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(am1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, am1Layout.createSequentialGroup()
                    .addContainerGap(101, Short.MAX_VALUE)
                    .addComponent(movietitle_field, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        am1Layout.setVerticalGroup(
            am1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addGroup(am1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(am1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(movietitle_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        am3.setBackground(new java.awt.Color(153, 0, 153));
        am3.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel108.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Date");

        date_field.setForeground(new java.awt.Color(0, 0, 102));
        date_field.setToolTipText("Choose Date");
        date_field.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        date_field.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_calendar_15px_violet.png")));
        date_field.setRequestFocusEnabled(false);
        date_field.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout am3Layout = new javax.swing.GroupLayout(am3);
        am3.setLayout(am3Layout);
        am3Layout.setHorizontalGroup(
            am3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108)
                .addGap(31, 31, 31)
                .addComponent(date_field, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addContainerGap())
        );
        am3Layout.setVerticalGroup(
            am3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am3Layout.createSequentialGroup()
                .addGroup(am3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(date_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        am4.setBackground(new java.awt.Color(255, 102, 0));
        am4.setPreferredSize(new java.awt.Dimension(217, 50));

        price_field.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        price_field.setForeground(new java.awt.Color(0, 0, 102));

        jLabel106.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("₱ ");

        jLabel89.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("Movie Price");
        jLabel89.setPreferredSize(new java.awt.Dimension(37, 45));

        javax.swing.GroupLayout am4Layout = new javax.swing.GroupLayout(am4);
        am4.setLayout(am4Layout);
        am4Layout.setHorizontalGroup(
            am4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(price_field, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        am4Layout.setVerticalGroup(
            am4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am4Layout.createSequentialGroup()
                .addGroup(am4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(price_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        am5.setBackground(new java.awt.Color(255, 0, 102));
        am5.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel90.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("IDMb Rating");

        jLabel107.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_star_24px_1.png"))); // NOI18N

        rating_field.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rating_field.setForeground(new java.awt.Color(0, 0, 102));
        rating_field.setActionCommand("<Not Set>");

        javax.swing.GroupLayout am5Layout = new javax.swing.GroupLayout(am5);
        am5.setLayout(am5Layout);
        am5Layout.setHorizontalGroup(
            am5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rating_field, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );
        am5Layout.setVerticalGroup(
            am5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rating_field, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        am2.setBackground(new java.awt.Color(0, 153, 255));
        am2.setPreferredSize(new java.awt.Dimension(429, 90));

        jLabel91.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Movie Poster");

        sm_small_mp.setBackground(new java.awt.Color(153, 204, 255));
        sm_small_mp.setForeground(new java.awt.Color(0, 102, 153));
        sm_small_mp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sm_small_mp.setText("Movie Poster");
        sm_small_mp.setOpaque(true);
        sm_small_mp.setPreferredSize(new java.awt.Dimension(100, 147));

        sm_sp.setBackground(new java.awt.Color(0, 64, 107));
        sm_sp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sm_spMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sm_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sm_btns_exit(evt);
            }
        });

        s_poster_txt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s_poster_txt.setForeground(new java.awt.Color(255, 255, 255));
        s_poster_txt.setText("Movie Poster");

        javax.swing.GroupLayout sm_spLayout = new javax.swing.GroupLayout(sm_sp);
        sm_sp.setLayout(sm_spLayout);
        sm_spLayout.setHorizontalGroup(
            sm_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sm_spLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(s_poster_txt)
                .addGap(39, 39, 39))
        );
        sm_spLayout.setVerticalGroup(
            sm_spLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(s_poster_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jLabel83.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 64, 107));
        jLabel83.setText("Browse image:");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("(182x268 px)");

        sm_remove_mp.setBackground(new java.awt.Color(0, 102, 204));
        sm_remove_mp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sm_remove_mpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sm_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sm_btns_exit(evt);
            }
        });

        s_poster_txt1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        s_poster_txt1.setForeground(new java.awt.Color(255, 255, 255));
        s_poster_txt1.setText("Remove");

        javax.swing.GroupLayout sm_remove_mpLayout = new javax.swing.GroupLayout(sm_remove_mp);
        sm_remove_mp.setLayout(sm_remove_mpLayout);
        sm_remove_mpLayout.setHorizontalGroup(
            sm_remove_mpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sm_remove_mpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(s_poster_txt1)
                .addContainerGap())
        );
        sm_remove_mpLayout.setVerticalGroup(
            sm_remove_mpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(s_poster_txt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout am2Layout = new javax.swing.GroupLayout(am2);
        am2.setLayout(am2Layout);
        am2Layout.setHorizontalGroup(
            am2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sm_small_mp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(am2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sm_sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(am2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(sm_remove_mp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(am2Layout.createSequentialGroup()
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        am2Layout.setVerticalGroup(
            am2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am2Layout.createSequentialGroup()
                .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(am2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sm_small_mp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(am2Layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addGap(21, 21, 21)
                        .addComponent(sm_sp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel81)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sm_remove_mp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        am6.setBackground(new java.awt.Color(0, 153, 153));
        am6.setPreferredSize(new java.awt.Dimension(217, 50));

        jLabel114.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("Duration");

        Date date2 = new Date();
        SpinnerDateModel sm2 =
        new SpinnerDateModel(date2, null, null, Calendar.HOUR_OF_DAY);

        am_movie_duration = new javax.swing.JSpinner(sm2);
        //am_movie_duration.setModel(sm2);
        JSpinner.DateEditor de2 = new JSpinner.DateEditor(am_movie_duration, "HH:mm:ss");
        am_movie_duration.setEditor(de2);

        javax.swing.GroupLayout am6Layout = new javax.swing.GroupLayout(am6);
        am6.setLayout(am6Layout);
        am6Layout.setHorizontalGroup(
            am6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(am_movie_duration, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );
        am6Layout.setVerticalGroup(
            am6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am6Layout.createSequentialGroup()
                .addGroup(am6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(am_movie_duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(am2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(am5, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(am4, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addComponent(am3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(am6, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(sm_add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 9, Short.MAX_VALUE))
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addComponent(am1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(am1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(am2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(am5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(am4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(am3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(am6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(48, 48, 48)
                .addComponent(sm_add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        sm_p.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 430, 410));

        sched_sidepanel.setBackground(new java.awt.Color(153, 153, 0));
        sched_sidepanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sched_sidepanelMouseEntered(evt);
            }
        });
        sched_sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_alarm_clock_20px.png"))); // NOI18N
        jLabel97.setText("Schedule Movie");
        sched_sidepanel.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        ms_combo_movies.setBackground(new java.awt.Color(102, 102, 0));
        ms_combo_movies.setForeground(new java.awt.Color(102, 102, 0));
        ms_combo_movies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Movie" }));
        ms_combo_movies.setToolTipText("Select Movie");
        ms_combo_movies.setPreferredSize(new java.awt.Dimension(182, 20));
        ms_combo_movies.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ms_combo_moviesMouseClicked(evt);
            }
        });
        sched_sidepanel.add(ms_combo_movies, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 300, 25));

        sm_sched_btn.setBackground(new java.awt.Color(255, 255, 255));
        sm_sched_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sm_sched_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sm_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sm_btns_exit(evt);
            }
        });

        sched_btn_text.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        sched_btn_text.setForeground(new java.awt.Color(153, 153, 0));
        sched_btn_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sched_btn_text.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_calendar_plus_20px.png"))); // NOI18N
        sched_btn_text.setText("Schedule");

        javax.swing.GroupLayout sm_sched_btnLayout = new javax.swing.GroupLayout(sm_sched_btn);
        sm_sched_btn.setLayout(sm_sched_btnLayout);
        sm_sched_btnLayout.setHorizontalGroup(
            sm_sched_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sm_sched_btnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sched_btn_text, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        sm_sched_btnLayout.setVerticalGroup(
            sm_sched_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sched_btn_text, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        sched_sidepanel.add(sm_sched_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 368, 120, 30));

        sm_selectedmovie_poster.setBackground(new java.awt.Color(178, 178, 62));
        sm_selectedmovie_poster.setForeground(new java.awt.Color(102, 102, 0));
        sm_selectedmovie_poster.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sm_selectedmovie_poster.setText("Movie Poster");
        sm_selectedmovie_poster.setOpaque(true);
        sched_sidepanel.add(sm_selectedmovie_poster, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 90, 182, 268));

        date_field1.setForeground(new java.awt.Color(0, 0, 102));
        date_field1.setToolTipText("Choose Date");
        date_field1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        date_field1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_calendar_15px.png")));
        date_field1.setRequestFocusEnabled(false);
        date_field1.setVerifyInputWhenFocusTarget(false);
        sched_sidepanel.add(date_field1, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 10, 120, -1));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setOpaque(true);
        sched_sidepanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 50, 270, -1));

        screen3_radio_btn.setBackground(new java.awt.Color(204, 204, 0));
        buttonGroup1.add(screen3_radio_btn);
        screen3_radio_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        screen3_radio_btn.setForeground(new java.awt.Color(255, 255, 255));
        screen3_radio_btn.setText("Screen 3");
        screen3_radio_btn.setOpaque(false);
        sched_sidepanel.add(screen3_radio_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 290, -1, -1));

        screen2_radio_btn.setBackground(new java.awt.Color(204, 204, 0));
        buttonGroup1.add(screen2_radio_btn);
        screen2_radio_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        screen2_radio_btn.setForeground(new java.awt.Color(255, 255, 255));
        screen2_radio_btn.setText("Screen 2");
        screen2_radio_btn.setOpaque(false);
        sched_sidepanel.add(screen2_radio_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 260, -1, -1));

        screen1_radio_btn.setBackground(new java.awt.Color(204, 204, 0));
        buttonGroup1.add(screen1_radio_btn);
        screen1_radio_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        screen1_radio_btn.setForeground(new java.awt.Color(255, 255, 255));
        screen1_radio_btn.setText("Screen 1");
        screen1_radio_btn.setOpaque(false);
        sched_sidepanel.add(screen1_radio_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 230, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setOpaque(true);
        sched_sidepanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 220, 100, -1));

        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);

        sm_slected_movietime.setModel(sm);
        //sm_slected_movietime = new javax.swing.JSpinner(sm);
        JSpinner.DateEditor de = new JSpinner.DateEditor(sm_slected_movietime, "HH:mm a");
        sm_slected_movietime.setEditor(de);
        sm_slected_movietime.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        sched_sidepanel.add(sm_slected_movietime, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, 30));

        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setText("Select the screen");
        sched_sidepanel.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 189, 130, 20));

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("you wish to air the movie");
        sched_sidepanel.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 130, 20));

        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Select the exact time ");
        sched_sidepanel.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 99, 130, 20));

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("you wish to air the movie");
        sched_sidepanel.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 130, 20));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator6.setOpaque(true);
        sched_sidepanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 129, 100, -1));

        sm_p.add(sched_sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 320, 410));

        main_panel.add(sm_p, "card3");

        manage_p.setBackground(new java.awt.Color(255, 255, 255));
        manage_p.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 68, 33), 2));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        m_s_register_btn.setBackground(new java.awt.Color(255, 255, 255));
        m_s_register_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m_s_register_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                m_s_register_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                manage_s_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                manage_s_btns_exit(evt);
            }
        });

        jLabel94.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(204, 0, 0));
        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_add_user_male_20px_1.png"))); // NOI18N
        jLabel94.setText("Register Staff");

        javax.swing.GroupLayout m_s_register_btnLayout = new javax.swing.GroupLayout(m_s_register_btn);
        m_s_register_btn.setLayout(m_s_register_btnLayout);
        m_s_register_btnLayout.setHorizontalGroup(
            m_s_register_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(m_s_register_btnLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel94)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        m_s_register_btnLayout.setVerticalGroup(
            m_s_register_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel94, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jPanel24.add(m_s_register_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 375, 160, -1));

        jPanel26.setBackground(new java.awt.Color(228, 68, 33));

        sb_staff.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        sb_staff.setForeground(new java.awt.Color(10, 10, 0));
        sb_staff.setText("Search");

        jLabel92.setBackground(new java.awt.Color(153, 0, 0));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_search_14px.png"))); // NOI18N
        jLabel92.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel92.setOpaque(true);
        jLabel92.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sb_screen123_click(evt);
            }
        });

        jLabel93.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_management_20px_2.png"))); // NOI18N
        jLabel93.setText("Staff Information");
        jLabel93.setPreferredSize(new java.awt.Dimension(166, 40));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(sb_staff, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sb_staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel24.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        sphoto_field.setBackground(new java.awt.Color(204, 204, 204));
        sphoto_field.setForeground(new java.awt.Color(255, 255, 255));
        sphoto_field.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sphoto_field.setText("Photo Here");
        sphoto_field.setOpaque(true);
        jPanel24.add(sphoto_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, 100, 100));

        jPanel8.setBackground(new java.awt.Color(228, 68, 33));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel96.setText("Full Name");
        jPanel8.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 110, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(3);
        jTextArea1.setTabSize(7);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel8.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, 60));

        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_home_address_12px.png"))); // NOI18N
        jLabel104.setText("Home Address:");
        jPanel8.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));

        jPanel24.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 230, 100));

        jPanel27.setBackground(new java.awt.Color(153, 0, 0));
        jPanel27.setMinimumSize(new java.awt.Dimension(230, 400));
        jPanel27.setPreferredSize(new java.awt.Dimension(230, 400));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel100.setText("Full Name");
        jPanel27.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 110, -1));

        f.setForeground(new java.awt.Color(255, 255, 255));
        f.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_facebook_messenger_12px.png"))); // NOI18N
        f.setText("Facebook Messenger Username");
        jPanel27.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 210, -1));

        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_telephone_12px.png"))); // NOI18N
        t.setText("Telephone Number");
        jPanel27.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, -1));

        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_cell_phone_12px.png"))); // NOI18N
        c.setText("Cellphone Number");
        jPanel27.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));

        jPanel24.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 230, 75));

        jPanel28.setBackground(new java.awt.Color(255, 153, 51));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel105.setText("Full Name");
        jPanel28.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 110, -1));

        fullname_staff.setForeground(new java.awt.Color(255, 255, 255));
        fullname_staff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_name_12px.png"))); // NOI18N
        fullname_staff.setText("Full Name");
        jPanel28.add(fullname_staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 30));

        jPanel24.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 230, 30));

        staff_info_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Staff ID", "Staff Name", "Account Password"
            }
        ));
        staff_info_table.setGridColor(new java.awt.Color(153, 0, 0));
        staff_info_table.setSelectionBackground(new java.awt.Color(153, 0, 0));
        staff_info_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staff_info_tableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(staff_info_table);

        jPanel24.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 490, 310));

        manage_p.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 750, 430));

        main_panel.add(manage_p, "card5");

        ms_p.setBackground(new java.awt.Color(255, 255, 255));

        home_p1.setBackground(new java.awt.Color(255, 255, 255));

        ms_btnscreen1.setBackground(new java.awt.Color(247, 104, 66));
        ms_btnscreen1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ms_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ms_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ms_btns_exit(evt);
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
                ms_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ms_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ms_btns_exit(evt);
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
                ms_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ms_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ms_btns_exit(evt);
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
                ms_btns_click(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ms_btns_enter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ms_btns_exit(evt);
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
                search_btns_viewssched(evt);
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

        jLabel128.setBackground(new java.awt.Color(71, 102, 49));
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Other_media/icons8_search_14px.png"))); // NOI18N
        jLabel128.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel128.setOpaque(true);
        jLabel128.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_btns_viewssched(evt);
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
                .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        am14Layout.setVerticalGroup(
            am14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(am14Layout.createSequentialGroup()
                .addGroup(am14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(allscreen_date_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (ms_screen_table_all.getColumnModel().getColumnCount() > 0) {
            ms_screen_table_all.getColumnModel().getColumn(3).setPreferredWidth(8);
            ms_screen_table_all.getColumnModel().getColumn(4).setResizable(false);
            ms_screen_table_all.getColumnModel().getColumn(4).setPreferredWidth(8);
        }

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
                sb_screen123_click(evt);
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
                sb_screen123_click(evt);
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
                sb_screen123_click(evt);
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
                sb_screen123_click(evt);
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
                sb_screen123_click(evt);
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
                sb_screen123_click(evt);
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
 
    private void btnhomeside_btn_release(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnhomeside_btn_release

    }//GEN-LAST:event_btnhomeside_btn_release

    private void btnaddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaddMousePressed
        //pressed add/purchase ticket
        resetSPColor(btnlogout);
        resetSPColor(btnhome);
        setSPColor(btnadd);
        resetSPColor(btnmoviescreen);

    }//GEN-LAST:event_btnaddMousePressed

    private void btnaddside_btn_release(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnaddside_btn_release

    }//GEN-LAST:event_btnaddside_btn_release

    private void btnmoviescreenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmoviescreenMousePressed
        // on press ms
        setSPColor(btnmoviescreen);
        resetSPColor(btnhome);
        resetSPColor(btnadd);
        resetSPColor(btnlogout);
    }//GEN-LAST:event_btnmoviescreenMousePressed

    private void btnmoviescreenside_btn_release(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnmoviescreenside_btn_release

    }//GEN-LAST:event_btnmoviescreenside_btn_release

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
        login_admin out = new login_admin();
        out.show(true);
    }//GEN-LAST:event_btnlogoutMouseReleased

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
            sm_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
        if (evt.getSource() == h_issueticket2) {
            home_p.setVisible(false);
            sm_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
        if (evt.getSource() == h_issueticket3) {
            home_p.setVisible(false);
            sm_p.setVisible(true);
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

    private void h_issueticket2h_IssueTicketbtn_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_issueticket2h_IssueTicketbtn_click
        // home issueticket on click
        if (evt.getSource() == h_issueticket1) {
            home_p.setVisible(false);
            sm_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
        if (evt.getSource() == h_issueticket2) {
            home_p.setVisible(false);
            sm_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
        if (evt.getSource() == h_issueticket3) {
            home_p.setVisible(false);
            sm_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
    }//GEN-LAST:event_h_issueticket2h_IssueTicketbtn_click

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

    private void h_issueticket3h_IssueTicketbtn_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_issueticket3h_IssueTicketbtn_click
        // home issueticket on click
        if (evt.getSource() == h_issueticket1) {
            home_p.setVisible(false);
            sm_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
        if (evt.getSource() == h_issueticket2) {
            home_p.setVisible(false);
            sm_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
        if (evt.getSource() == h_issueticket3) {
            home_p.setVisible(false);
            sm_p.setVisible(true);
            ms_p.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
    }//GEN-LAST:event_h_issueticket3h_IssueTicketbtn_click

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

    private void sidebtns_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebtns_enter
        // hover in side buttons
        if (evt.getSource() == btnhome) {
            btnhome.setBackground(new java.awt.Color(102, 102, 0));
        }
        if (evt.getSource() == btnadd) {
            btnadd.setBackground(new java.awt.Color(102, 102, 0));
        }
        if (evt.getSource() == btnmoviescreen) {
            btnmoviescreen.setBackground(new java.awt.Color(102, 102, 0));
        }
        if (evt.getSource() == btnmanagestaff) {
            btnmanagestaff.setBackground(new java.awt.Color(102, 102, 0));
        }
        if (evt.getSource() == btnlogout) {
            btnlogout.setBackground(new java.awt.Color(102, 102, 0));
        }

    }//GEN-LAST:event_sidebtns_enter

    private void sidebtns_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebtns_exit
        // hover out side buttons
        if (evt.getSource() == btnhome) {
            btnhome.setBackground(new java.awt.Color(153, 153, 0));
        }
        if (evt.getSource() == btnadd) {
            btnadd.setBackground(new java.awt.Color(153, 153, 0));
        }
        if (evt.getSource() == btnmoviescreen) {
            btnmoviescreen.setBackground(new java.awt.Color(153, 153, 0));
        }
        if (evt.getSource() == btnlogout) {
            btnlogout.setBackground(new java.awt.Color(153, 153, 0));
        }
        if (evt.getSource() == btnmanagestaff)
            btnmanagestaff.setBackground(new java.awt.Color(153, 153, 0));
    }//GEN-LAST:event_sidebtns_exit

    private void sidebtns_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebtns_click
        // side btn action
        if (evt.getSource() == btnhome) {
            home_p.setVisible(true);
            sm_p.setVisible(false);
            ms_p.setVisible(false);
            manage_p.setVisible(false);
            top_manage.setVisible(false);
            top_home.setVisible(true);
            top_add.setVisible(false);
            top_ms.setVisible(false);
            
            h_screen1.setVisible(true);
            h_screen2.setVisible(false);
            h_screen3.setVisible(false);
            
            
            Date set_date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("MMM d,y");
            String c_time=(sdf.format(set_date));
            
            SimpleDateFormat sdf2 = new SimpleDateFormat("HH");
            SimpleDateFormat sdf3 = new SimpleDateFormat("HH:mm");
            String c_time_h=(sdf2.format(set_date));
            String c_time_m=(sdf3.format(set_date));

                    
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
        if (evt.getSource() == btnadd) {
            home_p.setVisible(false);
            sm_p.setVisible(true);
            ms_p.setVisible(false);
            manage_p.setVisible(false);
            top_manage.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(true);
            top_ms.setVisible(false);
        }
        if (evt.getSource() == btnmoviescreen) {
            home_p.setVisible(false);
            sm_p.setVisible(false);
            ms_p.setVisible(true);
            manage_p.setVisible(false);
            top_manage.setVisible(false);
            top_home.setVisible(false);
            top_add.setVisible(false);
            top_ms.setVisible(true);
            
            DefaultTableModel model_a = (DefaultTableModel) ms_screen_table_all.getModel();
            int rowCount = model_a.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
            model_a.removeRow(i);}
            show_scheduled_movie();
        }
        if (evt.getSource() == btnmanagestaff) {
            home_p.setVisible(false);
            sm_p.setVisible(false);
            ms_p.setVisible(false);
            manage_p.setVisible(true);
            top_manage.setVisible(true);
            top_home.setVisible(false);
            top_add.setVisible(false);
            top_ms.setVisible(false);
            
            DefaultTableModel staff_model = (DefaultTableModel) staff_info_table.getModel();
            int rowCount = staff_model.getRowCount();
            //Remove rows one by one from the end of the table
            for (int i = rowCount - 1; i >= 0; i--) {
            staff_model.removeRow(i);}
            show_staff();

        }
    }//GEN-LAST:event_sidebtns_click
//DISPLAYING STAFF INFO TABLE
    public ArrayList<Staff> stafflist(){
        ArrayList<Staff> stafflist = new ArrayList<>();
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            String query_selectm="SELECT * FROM staff_accounts";
            java.sql.Statement st= con.createStatement();
            ResultSet rs= st.executeQuery(query_selectm);
            Staff movie1;
            while (rs.next()){
                movie1= new Staff(rs.getString("staff_id"), rs.getString("name"), rs.getString("password"));
                stafflist.add(movie1);
            }
        }
       catch (Exception e){
           JOptionPane.showMessageDialog(null,e);
       } 
        return stafflist;
    }
    public void show_staff(){
         ArrayList<Staff> mlist = stafflist();
         DefaultTableModel model_1 = (DefaultTableModel) staff_info_table.getModel();
         Object [] col= new Object[3];
        
        for(int i=0; i< mlist.size();i++){
            col[0]= mlist.get(i).getid();
            col[1]= mlist.get(i).getname();
            col[2]= mlist.get(i).getpassword();
            model_1.addRow(col);
    }
         
    }
    private void sm_btns_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sm_btns_enter
        //hover in schedule movie buttons
        if (evt.getSource() == sm_add_btn) {
            sm_add_btn.setBackground(new java.awt.Color(153, 153, 0));
        }
        if (evt.getSource() == sm_sched_btn) {
            sm_sched_btn.setBackground(new java.awt.Color(204, 204, 204));
        }
        //browse image buttons
        if (evt.getSource() == sm_sp) {
            sm_sp.setBackground(new java.awt.Color(25, 110, 170));
        }
        //remove image
        if (evt.getSource() == sm_remove_mp){
            sm_remove_mp.setBackground(new java.awt.Color(0,51,102));
        }

    }//GEN-LAST:event_sm_btns_enter

    private void sm_btns_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sm_btns_exit
        //hover out schedule movie buttons
        if (evt.getSource() == sm_add_btn) {
            sm_add_btn.setBackground(new java.awt.Color(204, 204, 0));
        }
        if (evt.getSource() == sm_sched_btn) {
            sm_sched_btn.setBackground(new java.awt.Color(255, 255, 255));
        }
        //browse image buttons

        if (evt.getSource() == sm_sp){
            sm_sp.setBackground(new java.awt.Color(0, 64, 107));
        }
        //remove image
        if (evt.getSource() == sm_remove_mp){
            sm_remove_mp.setBackground(new java.awt.Color(0,102,204));
        }
        
    }//GEN-LAST:event_sm_btns_exit


    private void sm_spMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sm_spMouseClicked
        //browse image for small poster
        //D:\Donna-sama\VT\programming_class\2ND\Movie Ticketing System\movie poster\small_mp

/*        JFileChooser fileChooser = new JFileChooser();
        //fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);

        /* //Dimension size = sm_small_mp.getPreferredSize();
            BufferedImage im = new BufferedImage((int) size.getWidth(),
                    (int) size.getHeight(),
                    BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = im.createGraphics();
            sm_small_mp.paint(g);// */
 /*       if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            sm_small_mp.setIcon(ResizeImage(path));
            JOptionPane.showMessageDialog(null, "Movie Poster Added");
            s = path;
        } else if (result == JFileChooser.CANCEL_OPTION) {
            System.out.println("No Data");
        }
*/
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon (filename).getImage().getScaledInstance(sm_small_mp.getWidth(),sm_small_mp.getHeight(),Image.SCALE_SMOOTH));
        sm_small_mp.setIcon(imageicon);
        sm_small_mp.setText("");
        try{
            File image = new File(filename);
            FileInputStream fis= new FileInputStream(image);
            ByteArrayOutputStream bos= new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
                
            }
            mp=bos.toByteArray();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
       

    }//GEN-LAST:event_sm_spMouseClicked

    private void sm_add_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sm_add_btnMouseClicked
        //add movie to sql
        //Date date = date_field.getDate();
        //String date = String.valueOf(date_field.getCalendar());
        //String price = String.valueOf(price_field.getText());
        //String rating = String.valueOf(rating_field.getText()); am_movie_duration

        if (verifyfield()) {

            PreparedStatement ps;
            String MovieAddQuery = "INSERT INTO `movies`(`movie_title`,`movie_poster`,`movie_date`,`movie_price`,`movie_rating`,`movie_duration`) VALUES (?,?,?,?,?,?)";
            try {
                ps = (PreparedStatement) MTS_SQL_Connect.getConnection().prepareStatement(MovieAddQuery);
                //InputStream is = new FileInputStream(new File(s));

                ps.setString(1, movietitle_field.getText());
                ps.setBytes(2, mp);
                SimpleDateFormat sdf= new SimpleDateFormat("MMM dd,y");
                String date = sdf.format(date_field.getDate()); 
                ps.setString(3, date);
                ps.setString(4, price_field.getText());
                ps.setString(5, rating_field.getText());
                
                
                SimpleDateFormat sdf2= new SimpleDateFormat("HH:mm:ss");
                String Movie_duration = sdf2.format(am_movie_duration.getValue());
                ps.setString(6,Movie_duration);
                
                if (ps.executeUpdate() > 0) {
                    
                    JOptionPane.showMessageDialog(null, "Movie Added Successfully");
                    movietitle_field.setText("");
                    sm_small_mp.setIcon(null);
                    sm_small_mp.setText("Movie Poster");
                    date_field.setDate(null);
                    price_field.setText("");
                    rating_field.setText("");
            
                }
                else {
                JOptionPane.showMessageDialog(null, "Failed to Add Movie");
                }

            } catch (Exception e) {}
            
        } else {
            JOptionPane.showMessageDialog(null, "Failed to Add Movie");

        }
    }//GEN-LAST:event_sm_add_btnMouseClicked

    private void sm_remove_mpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sm_remove_mpMouseClicked
        // remove image(movie poster)
        sm_small_mp.setIcon(null);
        sm_small_mp.setText("Movie Poster");
    }//GEN-LAST:event_sm_remove_mpMouseClicked

    private void m_s_register_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_m_s_register_btnMouseClicked
        // register staff
        new staff_register().setVisible(true);
        
    }//GEN-LAST:event_m_s_register_btnMouseClicked

    private void manage_s_btns_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_s_btns_enter
        // manage staff panel button hover in
        if (evt.getSource() == m_s_register_btn){
            m_s_register_btn.setBackground(new java.awt.Color(237,237,237));
        }
    }//GEN-LAST:event_manage_s_btns_enter

    private void manage_s_btns_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manage_s_btns_exit
        // manage staff panel button hover out
        if (evt.getSource() == m_s_register_btn){
            m_s_register_btn.setBackground(new java.awt.Color(255,255,255));
        }
    }//GEN-LAST:event_manage_s_btns_exit

    private void ms_btns_enter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btns_enter
         // btn movie screens (tabs) screens hover in 
        if (evt.getSource()==ms_btnscreen1)
            ms_btnscreen1.setBackground(new java.awt.Color(219,92,58));
        if (evt.getSource()==ms_btnscreen2)
            ms_btnscreen2.setBackground(new java.awt.Color(0,153,153));
        if (evt.getSource()==ms_btnscreen3)
            ms_btnscreen3.setBackground(new java.awt.Color(153,0,153));
        if (evt.getSource()==ms_btnscreen4)
            ms_btnscreen4.setBackground(new java.awt.Color(71,102,49));
    }//GEN-LAST:event_ms_btns_enter

    private void ms_btns_exit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btns_exit
        // btn movie screens (tabs) screens hover out
        if (evt.getSource()==ms_btnscreen1)
            ms_btnscreen1.setBackground(new java.awt.Color(247,104,66));
        if (evt.getSource()==ms_btnscreen2)
            ms_btnscreen2.setBackground(new java.awt.Color(0,204,204));
        if (evt.getSource()==ms_btnscreen3)
            ms_btnscreen3.setBackground(new java.awt.Color(204,0,204));
        if (evt.getSource()==ms_btnscreen4)
            ms_btnscreen4.setBackground(new java.awt.Color(108,153,74));
    }//GEN-LAST:event_ms_btns_exit

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
         
    }
    
    private void ms_btns_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_btns_click
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
            
    }//GEN-LAST:event_ms_btns_click

    private void sched_sidepanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sched_sidepanelMouseEntered
        
        //displaying image of selected movie -used this event para mas paspas ang response
   
        String SelectedMovie = ms_combo_movies.getSelectedItem().toString();
            if (SelectedMovie.trim().equals("Select Movie")){
            sm_selectedmovie_poster.setText("Movie Poster");
            sm_selectedmovie_poster.setIcon(null);
                
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
                     //sm_selectedmovie_poster.setIcon((Icon) ms_movies_poster);
                     }
                     
                     //displaying image from sql -trial
                    ImageIcon imageicon = new ImageIcon(new ImageIcon (selected_mp).getImage().getScaledInstance(sm_selectedmovie_poster.getWidth(),sm_selectedmovie_poster.getHeight(),Image.SCALE_SMOOTH));
                    sm_selectedmovie_poster.setIcon(imageicon);
                    sm_selectedmovie_poster.setText("");
                   
                    
                }catch(Exception e){
                    
                }
            }
    }//GEN-LAST:event_sched_sidepanelMouseEntered

    private void ms_combo_moviesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ms_combo_moviesMouseClicked
        //adding item in combo box/selection of mocvies
        
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
        SimpleDateFormat sdf2= new SimpleDateFormat("MMM dd,y");
        String date2 = sdf2.format(date_field1.getDate());
        
        
        String sql= "Select * from movies where movie_date='"+date2+"'";
        PreparedStatement pst=con.prepareStatement(sql);
        //pst.setString(1,date2);
        ResultSet rs = pst.executeQuery();
        //resetting combo box
        ms_combo_movies.removeAllItems();
        ms_combo_movies.addItem("Select Movie");
        
            while(rs.next()){
            String ms_movies=rs.getString("movie_title");
            ms_combo_movies.addItem(ms_movies);
            }
            
        }catch(Exception e){
        
        }
    }//GEN-LAST:event_ms_combo_moviesMouseClicked

    private void sm_sched_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sm_sched_btnMouseClicked
        // scheduling movie
        String SelectedMovie = ms_combo_movies.getSelectedItem().toString();
        SimpleDateFormat sdf2= new SimpleDateFormat("HH:mm a");
        String SelectedMovie_time = sdf2.format(sm_slected_movietime.getValue()); 
                
                
        if (verify_field_schedmovie()) {

            PreparedStatement ps;
            String MovieAddQuery = "INSERT INTO `schedule_movies`(`movie_title`,`movie_date`,`airing_time`,`movie_screen`) VALUES (?,?,?,?)";
            //String sql2= "Select * from movies where movie_title='"+SelectedMovie+"'";
            try {
                
                ps = (PreparedStatement) MTS_SQL_Connect.getConnection().prepareStatement(MovieAddQuery);
                //PreparedStatement pst2=MTS_SQL_Connect.getConnection().prepareStatement(sql2);
                //ResultSet rs2 = pst2.executeQuery();
                //selected_mp = rs2.getBytes("movie_poster");
                
                ps.setString(1,SelectedMovie);
                //ps.setBytes(2, selected_mp);
                
                SimpleDateFormat sdf= new SimpleDateFormat("MMM dd,y");
                String date = sdf.format(date_field1.getDate()); 
                ps.setString(2, date);
                
                //String SelectedMovie_time = String.valueOf(sm_slected_movietime.getValue());
                
                ps.setString(3, SelectedMovie_time);
                //jLabel97.setText(screen+SelectedMovie_time);
                //radio buttons for selecting screen
                if(screen1_radio_btn.isSelected()){
                    screen = "Screen 1";
                }
                if(screen2_radio_btn.isSelected()){
                    screen = "Screen 2";
                }
                if(screen3_radio_btn.isSelected()){
                    screen = "Screen 3";
                }
                ps.setString(4,screen);
                
                
                if (ps.executeUpdate() > 0) {
                    
                    JOptionPane.showMessageDialog(null, "Movie Added Successfully");
                    ms_combo_movies.removeAllItems();
                    ms_combo_movies.addItem("Select Movie");
                    sm_selectedmovie_poster.setIcon(null);
                    sm_selectedmovie_poster.setText("Movie Poster");
                    date_field1.setDate(null);
                    ps.close();
                    //price_field.setText("");
                }
                else {
                JOptionPane.showMessageDialog(null, "Failed to Schedule Movie");
                }

            } catch (Exception e) {}
            
        } else {
            JOptionPane.showMessageDialog(null, "Failed to Schedule Movie");

        }
    }//GEN-LAST:event_sm_sched_btnMouseClicked

    private void h_btnscreens_clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_h_btnscreens_clicked
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
    }//GEN-LAST:event_h_btnscreens_clicked
     /*try {
      Date set_date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("MMM d,y");
      String c_time=(sdf.format(set_date));
      
      SimpleDateFormat formatter1=new SimpleDateFormat("HH:mm a");
      SimpleDateFormat sdf2= new SimpleDateFormat(" HH:mm:ss");
      Date date1 = formatter1.parse(t1);
      
      milliseconds = date1.getTime();
      
      } catch (ParseException ex) {
      java.util.logging.Logger.getLogger(admin_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }*/
    public String getTimeElapsed() {
   
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
    private void search_btns_viewssched(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_btns_viewssched
        
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
        if (evt.getSource() == jLabel128) {
        DefaultTableModel model_o = (DefaultTableModel) ms_screen_table_all.getModel();
        int rowCount1 = model_o.getRowCount();
            //Remove rows one by one from the end of the table
        for (int i = rowCount1 - 1; i >= 0; i--) {
       model_o.removeRow(i);}
        findMoviesdate();
        }
    }//GEN-LAST:event_search_btns_viewssched

    private void staff_info_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staff_info_tableMouseClicked
        // GETTING SELECTED ROW
        
        
        DefaultTableModel model = (DefaultTableModel)staff_info_table.getModel();
        
try{
    // get the selected row index
   int selectedRowIndex = staff_info_table.getSelectedRow();

    // set the selected row data into jtextfields
   String staffid = (model.getValueAt(selectedRowIndex, 0).toString());
   fullname_staff.setText(model.getValueAt(selectedRowIndex, 1).toString());
   
   
   
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
    String sql2= "Select * from staff_accounts WHERE staff_id = '"+staffid+"' ";
    PreparedStatement pst2=con.prepareStatement(sql2);
    ResultSet rs2 = pst2.executeQuery();
    while(rs2.next()){
    
        String address=rs2.getString("address");
        String tele=rs2.getString("telephone_number");
        String cell=rs2.getString("cellphone_number");
        String fb=rs2.getString("fb_messenger");
        selected_mp = rs2.getBytes("picture");
    
        jTextArea1.setText(address);
        t.setText(tele);
        c.setText(cell);
        f.setText(fb);
     
    ImageIcon imageicon = new ImageIcon(new ImageIcon (selected_mp).getImage().getScaledInstance(sphoto_field.getWidth(),sphoto_field.getHeight(),Image.SCALE_SMOOTH));
    sphoto_field.setIcon(imageicon);
    sphoto_field.setText("");
    
    
    }
}catch(Exception e){
    
}
    
    }//GEN-LAST:event_staff_info_tableMouseClicked

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
    
    
    //SEARCH BUTTON STAFFFF
    public ArrayList<Staff> Staff_name(String ValToSearch)
    {
        ArrayList<Staff> movieList = new ArrayList<Staff>();
        
        Statement st;
        ResultSet rs;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/movie_ticketing_sys","root","");
            java.sql.Statement stm= con.createStatement();
            String searchQuery = "SELECT * FROM `staff_accounts` WHERE name LIKE '%"+ValToSearch+"%' OR staff_id LIKE '%"+ValToSearch+"%'";
            
            rs = stm.executeQuery(searchQuery);
            
            Staff user;
            
            while(rs.next())
            {
                user = new Staff(rs.getString("staff_id"), rs.getString("name"), rs.getString("password"));
                movieList.add(user);
            }
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return movieList;
    }
    
    // function to display data in jtable
    public void find_staff_name()
    {
        ArrayList<Staff> mlist = Staff_name(sb_staff.getText());
        DefaultTableModel model_a = (DefaultTableModel) staff_info_table.getModel();
        Object[] row = new Object[3];
        
        for(int i = 0; i < mlist.size(); i++)
        {
            row[0]= mlist.get(i).getid();
            row[1]= mlist.get(i).getname();
            row[2]= mlist.get(i).getpassword();
            model_a.addRow(row);
        }
       staff_info_table.setModel(model_a);
       
    }
    private void sb_screen123_click(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sb_screen123_click
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
        
        //STAFF INFO
        if (evt.getSource() == jLabel92) {
        DefaultTableModel model_a = (DefaultTableModel) staff_info_table.getModel();
        int rowCount = model_a.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
        model_a.removeRow(i);}
            
        find_staff_name();
        }
        
    }//GEN-LAST:event_sb_screen123_click
    /*sm_sp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sm_spMouseClicked(evt);
            }*/
//verify add movie fields
    public boolean verifyfield() {
        String movie_title = movietitle_field.getText();
        //String movie_poster = String.valueOf(passwordf.getPassword());
        //String date = date_field.getText()
        String price = String.valueOf(price_field.getText());
        String rating = String.valueOf(rating_field.getText());

        //check if all fields are filled
        if (movie_title.trim().equals("") || price.trim().equals("") || rating.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Some fields are left empty");
            return false;
        }/* else if (s != null) {
            JOptionPane.showMessageDialog(null, "Movie Poster path was not found");
            return false;

        }*/ 
        else {
            return true;
        }
    }
//verify schedule movie fields
    public boolean verify_field_schedmovie() {
        String SelectedMovie = ms_combo_movies.getSelectedItem().toString();
        String SelectedMovie_time = String.valueOf(sm_slected_movietime.getValue());

        //check if all fields are filled
        if (SelectedMovie.trim().equals("Select Movie") || buttonGroup1.getSelection()==null|| SelectedMovie_time.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Some fields are left empty");
            return false;
        
        
            
        }else {
            return true;
        }
    }

//Methode To Resize The ImageIcon
    public ImageIcon ResizeImage(String imgPath) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(sm_small_mp.getWidth(), sm_small_mp.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    } 

    void setSPColor(javax.swing.JPanel panel) {
        panel.setBackground(new java.awt.Color(102, 102, 0));
    }

    void resetSPColor(javax.swing.JPanel panel) {
        panel.setBackground(new java.awt.Color(153, 153, 0));
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
            java.util.logging.Logger.getLogger(admin_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_space.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_space().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JTextField all_screens_searchbar;
    private com.toedter.calendar.JDateChooser allscreen_date_search;
    private javax.swing.JPanel am1;
    private javax.swing.JPanel am10;
    private javax.swing.JPanel am11;
    private javax.swing.JPanel am12;
    private javax.swing.JPanel am13;
    private javax.swing.JPanel am14;
    private javax.swing.JPanel am2;
    private javax.swing.JPanel am3;
    private javax.swing.JPanel am4;
    private javax.swing.JPanel am5;
    private javax.swing.JPanel am6;
    private javax.swing.JPanel am7;
    private javax.swing.JPanel am8;
    private javax.swing.JPanel am9;
    private javax.swing.JSpinner am_movie_duration;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btnadd;
    private javax.swing.JPanel btnhome;
    private javax.swing.JPanel btnlogout;
    private javax.swing.JPanel btnmanagestaff;
    private javax.swing.JPanel btnmoviescreen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel c;
    private com.toedter.calendar.JDateChooser date_field;
    private com.toedter.calendar.JDateChooser date_field1;
    private com.toedter.calendar.JDateChooser date_field_screen1;
    private com.toedter.calendar.JDateChooser date_field_screen2;
    private com.toedter.calendar.JDateChooser date_field_screen3;
    private javax.swing.JLabel duration_screen1;
    private javax.swing.JLabel duration_screen2;
    private javax.swing.JLabel duration_screen3;
    private javax.swing.JLabel duration_stat_screen1;
    private javax.swing.JLabel duration_stat_screen2;
    private javax.swing.JLabel duration_stat_screen3;
    private javax.swing.JLabel f;
    private javax.swing.JLabel fullname_staff;
    private javax.swing.JPanel h_btnscreen1;
    private javax.swing.JPanel h_btnscreen2;
    private javax.swing.JPanel h_btnscreen3;
    private javax.swing.JLabel h_date;
    private javax.swing.JPanel h_issueticket1;
    private javax.swing.JPanel h_issueticket2;
    private javax.swing.JPanel h_issueticket3;
    private javax.swing.JPanel h_moreinfo;
    private javax.swing.JPanel h_moreinfo2;
    private javax.swing.JPanel h_moreinfo3;
    private javax.swing.JPanel h_moreinfo5;
    private javax.swing.JPanel h_moreinfo6;
    private javax.swing.JPanel h_moreinfo7;
    private javax.swing.JPanel h_moreinfo8;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel77;
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
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
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel logged_in_as;
    private javax.swing.JLabel m_id2;
    private javax.swing.JLabel m_id3;
    private javax.swing.JPanel m_s_register_btn;
    private javax.swing.JLayeredPane main_pane;
    private javax.swing.JPanel main_panel;
    private javax.swing.JPanel manage_p;
    private javax.swing.JLabel minimize1;
    private javax.swing.JTextField movietitle_field;
    private javax.swing.JPanel ms_all_screens;
    private javax.swing.JPanel ms_btnscreen1;
    private javax.swing.JPanel ms_btnscreen2;
    private javax.swing.JPanel ms_btnscreen3;
    private javax.swing.JPanel ms_btnscreen4;
    private javax.swing.JComboBox<String> ms_combo_movies;
    private javax.swing.JPanel ms_p;
    private javax.swing.JPanel ms_screen1;
    private javax.swing.JTable ms_screen1_table;
    private javax.swing.JPanel ms_screen2;
    private javax.swing.JTable ms_screen2_table;
    private javax.swing.JPanel ms_screen3;
    private javax.swing.JTable ms_screen3_table;
    private javax.swing.JTable ms_screen_table_all;
    private javax.swing.JTextField price_field;
    private javax.swing.JLabel rating_display_s1;
    private javax.swing.JLabel rating_display_s2;
    private javax.swing.JLabel rating_display_s3;
    private javax.swing.JTextField rating_field;
    private javax.swing.JLabel s_poster_txt;
    private javax.swing.JLabel s_poster_txt1;
    private javax.swing.JTextField sb_staff;
    private javax.swing.JLabel sched_btn_text;
    private javax.swing.JPanel sched_sidepanel;
    private javax.swing.JLabel screen1MP;
    private javax.swing.JRadioButton screen1_radio_btn;
    private javax.swing.JPanel screen1_stat;
    private javax.swing.JLabel screen2MP;
    private javax.swing.JRadioButton screen2_radio_btn;
    private javax.swing.JPanel screen2_stat;
    private javax.swing.JLabel screen3MP;
    private javax.swing.JRadioButton screen3_radio_btn;
    private javax.swing.JPanel screen3_stat;
    private javax.swing.JPanel screen3_stat1;
    private javax.swing.JPanel screen3_stat2;
    private javax.swing.JPanel screen3_stat3;
    private javax.swing.JPanel screen3_stat4;
    private javax.swing.JTextField searchbar_t_1;
    private javax.swing.JTextField searchbar_t_2;
    private javax.swing.JTextField searchbar_t_3;
    private javax.swing.JLabel searchdate_screen1;
    private javax.swing.JLabel searchdate_screen2;
    private javax.swing.JLabel searchdate_screen3;
    private javax.swing.JLabel searchtitle_screen1;
    private javax.swing.JLabel searchtitle_screen2;
    private javax.swing.JLabel searchtitle_screen3;
    private javax.swing.JPanel sidebg;
    private javax.swing.JPanel sm_add_btn;
    private javax.swing.JPanel sm_p;
    public static javax.swing.JPanel sm_remove_mp;
    private javax.swing.JPanel sm_sched_btn;
    private javax.swing.JLabel sm_selectedmovie_poster;
    private javax.swing.JSpinner sm_slected_movietime;
    private javax.swing.JLabel sm_small_mp;
    public static javax.swing.JPanel sm_sp;
    private javax.swing.JLabel sphoto_field;
    private javax.swing.JTable staff_info_table;
    private javax.swing.JLabel stat1;
    private javax.swing.JLabel stat2;
    private javax.swing.JLabel stat3;
    private javax.swing.JLabel t;
    private javax.swing.JLabel ticketssold_display;
    private javax.swing.JLabel today_sales_display;
    private javax.swing.JPanel top;
    private javax.swing.JPanel top_add;
    private javax.swing.JPanel top_home;
    private javax.swing.JPanel top_manage;
    private javax.swing.JPanel top_ms;
    // End of variables declaration//GEN-END:variables

    
}

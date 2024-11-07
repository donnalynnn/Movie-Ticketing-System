/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

class Movies {
    //private byte[] picture;
    private String title,date,time,screen,seat;
    
    public Movies (String title, String date, String time,String screen, String seat)
    {
        this.title=title;
        this.date=date;
        this.time=time;
        this.screen=screen;
        this.seat=seat;
    }
    public String gettitle(){
        return title;
    }
    public String getdate(){
        return date;
    }
    public String gettime(){
        return time;
    }
    public String getscreen(){
        return screen;
    }
    public String getseat(){
        return seat;
    }
    
    /*
    public Movies(byte[]image)
    {
        this.picture=image;
    }
    public byte[] getImage(){
        return picture;
    }
    */

}

class Movies1 {
    //private byte[] picture;
    private String title,date,time;
    
    public Movies1 (String title, String date, String time)
    {
        this.title=title;
        this.date=date;
        this.time=time;
        
    }
    public String gettitle(){
        return title;
    }
    public String getdate(){
        return date;
    }
    public String gettime(){
        return time;
    }
    

}

class Staff {
    //private byte[] picture;
    private String id,name,password;
    
    public Staff (String id, String name, String password)
    {
        this.id=id;
        this.name=name;
        this.password=password;
        
    }
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public String getpassword(){
        return password;
    }
    

}
import java.time.*;
import java.io.*;
import java.util.*;
public class ServerMessage implements Comparable <ServerMessage>{
    LocalDateTime date;
    String msg;
    Time t=new Time();
    public  ServerMessage( String msg,LocalDateTime date) {
       
        this.msg = msg;
        this.date = date;
    }
    
   public String formattedTime(){
    return t.returnTime(date);
    
   }
   
   
   @Override
   public int compareTo(ServerMessage o) {
       return this.date.compareTo(o.date);
       
   }
    
    
    @Override
    public String toString() {
       
        return " msg=" + msg +" time=" + formattedTime() ;
     
    }

  

    
    

}


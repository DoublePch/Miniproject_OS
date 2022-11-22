/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sjf;
//import ส่วนต่างๆที่จำเป็นมาใช้
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import javax.swing.JTable;
import java.util.Timer;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.ListIterator;



/**
 *
 * @author DoubleP
 */
public class Controller  {
   //สร้าง Object จาก Class Model ใช้ชื่อว่า model 
   Model model;
   //ส่วนนี้คือการสร้างตัวแปร Array แบบ Object โดยใช้ Array List ในที่นี้เราจะประกาศไว้ 6 ตัวแปร
   ArrayList<Model> jobQueue  = new ArrayList<Model>();
   ArrayList<Model> readyQueue = new ArrayList<Model>();
   ArrayList<Model>ioQueue = new ArrayList<Model>();
   ArrayList<Model>printerQueue = new ArrayList<Model>();
   ArrayList<Model>diskQueue = new ArrayList<Model>();
   ArrayList<Model>terminQueue = new ArrayList<Model>();
   
   
  
   //ส่วนนี้คือการประกาศตัวแปรต่างๆ ที่จะใช้ใน Class Controller 
    int clock = 0;
    int c;
    int ioT = 0;
    int i;
    int pid = 1;
    int waiting = 0;
    int avgWa = 0;
    int avgT=0;
   // int ioP = 0;
    int ioD = 0;
    //int ioWP = 0;
    int ioWD = 0;
    Controller() {
      
      
       
    }
    //Mothod ปุ่ม Add Process จะถูกเรียกใช้ฝั่ง View โดยที่จะทำการกำหนดค่าต่างๆลงไปด้วย หรือเราเรียกว่า ค่าเริ่มต้น
    //ที่จะใช้ในการประมวลผล 
    void addProcess(int arrivalTime){
        model = new Model(pid,0,arrivalTime,(int) (Math.random()*(21)+10));
        pid++;
        // จะadd object ที่ชื่อ model เข้าไปที่ jobQueue
        jobQueue.add(model);
        readyQueue.add(model); 
        ioQueue.add(model);
    }
   //Method ShowJobQueue จะทำการเอาค่าตัวแปรมาเก็บไว้ในตัวแปรที่ชื่อว่า Text แล้วจะนำไปเรียกใช้ที่ฝั่ง View อีกทีนึง
  //Method ที่ชื่อว่า Show โดยทั้งหมดแล้วจะถูกเรียกใช้ที่ฝั่ง View ทุก ๆ Show Method จะเหมือนกัน
    String showJobQueue(){
        String text = "";
        for(int index = 0;index < jobQueue.size() ; index++){
            //มอง jobQueue ให้เป็นกล่อง
            // index = 0 จะไปถามหา jobQueue กล่องที่ 0 พอถามหาเสร็จ จะ getค่าออกมา
            text = text + jobQueue.get(index).getpID() + " ";
            text = text + jobQueue.get(index).getpState() + " ";
            text = text + jobQueue.get(index).getArrivalTime() + " ";
            text = text + jobQueue.get(index).getBurstTime() + " ";
            text = text + jobQueue.get(index).getWatingTime() + " ";
            text = text + ",";
            
            /*
            ผลลัพธ์การทำงานแต่ละบรรทัด
            text = text + getPid+" "+getPstate+" "+getAr+" "+getBur+" "+getWat   ,
            ชุดข้อมูลที่ 1 , ชุดข้อมููลที่ 2, ชุดข้อมูลที่ n
            */
        }
        return text;
    }
    String showReadyQueue(){
        
        String text = "";
        for(int index = 0;index < readyQueue.size() ; index++){
            text = text + readyQueue.get(index).getpID() + " ";
            text = text + readyQueue.get(index).getpState() + " ";
            text = text + ",";
        }
        return text;  
    }
    String showcpuQueue(){
          String text = "";
          for(int index = 0;index < readyQueue.size() ; index++){
                text = text + readyQueue.get(index).getpID() + " ";
                text = text + readyQueue.get(index).getpState() + " ";
                text = text + ",";
          }
          return text;  
    }
      String showTerminateQueue(){
          String text = "";
          for(int index = 0;index < terminQueue.size() ; index++){
                text = text + terminQueue.get(index).getpID() + " ";
                text = text + terminQueue.get(index).getpState() + " ";
                text = text + ",";
          }
          return text;  
    }    
      String showPrinter(){
          String text = "";
          for(int index = 0;index < printerQueue.size() ; index++){
                text = text + printerQueue.get(index).getpID() + " ";
                text = text + printerQueue.get(index).getpState() + " ";
                text = text + printerQueue.get(index).getIoWiTimePrinter() + " ";
                text = text + ",";
          }
          return text;  
      }    
        String showDisk(){
          String text = "";
          for(int index = 0;index < diskQueue.size() ; index++){
                text = text + diskQueue.get(index).getpID() + " ";
                text = text + diskQueue.get(index).getpState() + " ";
                text = text + diskQueue.get(index).getIoWiTimeDiks() + " ";
                text= text + ",";
          }
          return text;  
      }
      String showPrinterQueue(){
          String text = "";
          for(int index = 0;index < printerQueue.size() ; index++){
                text = text + printerQueue.get(index).getpID() + " ";
                text = text + printerQueue.get(index).getpState() + " ";
                text = text + printerQueue.get(index).getIoPrinter() + " ";
                text = text + ",";
          }
          return text;  
      }    
        String showDiskQueue(){
          String text = "";
          for(int index = 0;index < diskQueue.size() ; index++){
                text = text + diskQueue.get(index).getpID() + " ";
                text = text + diskQueue.get(index).getpState() + " ";
                text = text + diskQueue.get(index).getIoDisk()+ " ";
                text= text + ",";
          }
          return text;  
      }  
        
//Method นี้จะเป็นการเช็คว่า Process ไหนที่จะรับ Waiting Time บ้าง      
    void waitting(int count){
        for(int i = 0 ; i < jobQueue.size(); i++){
            /*
                ใน Loop if แรกจะเช็คว่า ถ้าไม่ใช่สถานะ Running Waiting Terminate จึงจะเข้าไปทำ Loop ต่อไป
            */
            if(jobQueue.get(i).getpState() == "Ready"){
                //ใน Loop นี้จะเช็คว่า ถ้า BurstTime มีค่ามากกว่าหรือเท่ากับ 1 จะทำการกำหนดค่า Waiting Time 
                // โดยจะนำ เวลาปัจจุบัน มาลบกับ เวลาที่เข้าใช้งาน Process
                if(jobQueue.get(i).getBurstTime() >= 1){
                    waiting = jobQueue.get(i).getWatingTime();
                    waiting = waiting +1;
                 jobQueue.get(i).setWatingTime(waiting);
               }
            }
        }   
    }  
    
    void ioWaitingPrinter(){
        /*
            IO Waiting Time = เวลาที่รอเข้าใช้ IO ของ Printer ถ้าไม่ได้เข้าไปใช้ IO ของ Printer จะนับเวลาไปเรือยๆ
        */
        try{
        for(int i = 0 ; i < jobQueue.size(); i++){
            if(printerQueue.get(i) != printerQueue.get(0)){
               int ioWP = printerQueue.get(i).getIoWiTimePrinter();
                ioWP = ioWP + 1;
                printerQueue.get(i).setIoWiTimePrinter(ioWP);
            }
        }
        }catch(IndexOutOfBoundsException e){
    
        }
    }
    
     void ioWaitingDisk(){
         try{
        for(int i = 0 ; i < jobQueue.size(); i++){
            if(diskQueue.get(i) != diskQueue.get(0)){
               int ioWD = diskQueue.get(i).getIoWiTimeDiks();
                ioWD = ioWD + 1;
                diskQueue.get(i).setIoWiTimeDiks(ioWD);
            }
        }
        }catch(IndexOutOfBoundsException e){
    
        }   
    }
    
   
    //ส่วนของ Method ที่ใช้งาน IO ต่างๆ เช่น IOPrinter IODisk
    void ioPrinter(int count){
      try{
            // จะเช็คว่า สถานะที่  0 เป็น Waiting จึงจะนับเวลา การเข้าใช้ IO
            if(printerQueue.get(0).getpState() == "Waiting"){
              int ioP = printerQueue.get(0).getIoPrinter();
               ioP = ioP+1;
               printerQueue.get(0).setIoPrinter(ioP);
            }
      }catch(IndexOutOfBoundsException e){
          
      }
    }   
     void ioDisk(int count){
       try{
            // จะเช็คว่า สถานะที่  0 เป็น Waiting จึงจะนับเวลา การเข้าใช้ IO
            if(diskQueue.get(0).getpState() == "Waiting"){
              int ioD = diskQueue.get(0).getIoDisk();
               ioD = ioD+1;
               diskQueue.get(0).setIoDisk(ioD);
            }
      }catch(IndexOutOfBoundsException e){
          
      } 
 }  
    // Method usingCPU จะทำการ กำหนดสถานะต่างๆ และกำหนดค่าต่างๆ ในกรณีที่เข้าไปใช้งาน CPU
    void usingCPU(int count){
        try{
           for(int i = 0; i<jobQueue.size();i++){
               if(readyQueue.get(0) == jobQueue.get(i)){
                   jobQueue.get(i).setpState(2);
                   c = jobQueue.get(i).getBurstTime();
                   c = c-1;
                   jobQueue.get(i).setBurstTime(c);
                   if(c == 0){
                       jobQueue.get(i).setpState(4);
                   }
                   else if(c<0){
                       removeQueue(i,count);
                   }
               }
           }
        }catch(IndexOutOfBoundsException e){
            
        }
    }    
    
 void usingPrinter(){
       try{
        for(int i = 0; i<jobQueue.size();i++){
              if(printerQueue.get(i).getpState() == "Ready"){
                  printerQueue.get(i).setpState(3);
              }
        }
       }catch(IndexOutOfBoundsException e){
           
       }
    }

//     //Method จะทำงานคล้ายๆ กับ UsingCPU โดยจะเช็คเฉพาะในส่วนของ Disk Queue เท่านั้น
    void usingDisk(){
        try{
        for(int i = 0; i<jobQueue.size();i++){
              if(diskQueue.get(i).getpState() == "Ready"){
                  diskQueue.get(i).setpState(3);
              }
        }
       }catch(IndexOutOfBoundsException e){
           
       }
    }
    //Method นี้จะเป็นการเช็คค่าของ Process ต่างๆ และกำหนดว่า Process ใดจะเข้าใช้งาน CPU เป็นตัวต่อไป
    void nextProcess(){
        for( i = 0 ; i < jobQueue.size(); i++){
             if(jobQueue.get(i).getpID() == 1){
               
             }
            else { 
                //เมื่อ process ID == 0 ให้ Set Process State มีค่าเป็น Terminate
                 if(jobQueue.get(i).getBurstTime() == 0)
                {
                   jobQueue.get(i).setpState(4);   
                }
                else
                {      //กำหนดให้มีค่า process state เป็น Ready
                        jobQueue.get(i).setpState(1); 
                }
            }
        }  
    }
    /*
    RemoveQueue จะเป็นการเขียน Method ที่มีชื่อเดียวกัน แต่ใช้ตัวแปรต่างกัน(Parameter)
    ในส่วนของ Method นี้จะถูกเรียกใช้ที่ปุ่ม Terminate เพื่อที่เราจะกำหนด
    ค่า Terminate ให้กับ Process ที่กำลัง Running อยู่
    */
     void removeQueue(int count){
        for(int i = 0 ; i < jobQueue.size(); i++){
            if(readyQueue.get(0) == jobQueue.get(i)){
                //ในส่วนนี้ก่อนที่จะ Add เข้าไปใน jTable4(Terminate Table) เราจะกำหนดค่า
                //ให้ Process State นี้เป็น Terminate ก่อน แล้วจึง Add ค่าเข้าไปใน Terminate Table
                jobQueue.get(i).setpState(4);
                terminQueue.add(jobQueue.get(i));
                avgWatime(jobQueue.get(i).getWatingTime());
                avgTurntime(count - jobQueue.get(i).getArrivalTime());
                //ทำการ Remove ออกจาก JobQueue และ ReadyQueue
                jobQueue.remove(i);
                readyQueue.remove(0);
                break;
            }
        }
     
    }
    //ถูกเรียกใช้ใน UsingCPU เพื่อที่เมื่อเวลา  BursTime หมดจะได้เพิ่มเข้าไปใน Table Terminate อัตโนมัติ
    void removeQueue(int i,int count){
                jobQueue.get(i).setpState(4);
                terminQueue.add(jobQueue.get(i));
                avgWatime(jobQueue.get(i).getWatingTime());
                avgTurntime(count - jobQueue.get(i).getArrivalTime());
                jobQueue.remove(i);
                readyQueue.remove(0);
    }
    
    //Method นี้เป็นส่วนสำคัญ ของ Ready Queue เพื่อที่จะจัดเรียง BursTime ที่จะเข้าไปเป็น Running ตามลำดับของ BurtTime น้อยไปมาก
    void sortBurst(){
        
        
      // readyQueue.sort(readyQueue<Model>);
        /*
        int a, b;
        int temp;
        int sortTheNumbers = len - 1;

        for (a = 0; a < sortTheNumbers; ++a) {
        for (b = 0; b < sortTheNumbers; ++b) {
            if (array[b] < array[b + 1]) {
                temp = array[b];
                array[b] = array[b + 1];
                array[b + 1] = temp;
            }
        }
        }
        */
        
       // Arrays.sort();
        
        int a,b;
        Model temp = new Model();
        for ( a = 1; a < readyQueue.size() ; ++a) {
            for (b = 1; b < readyQueue.size()-1 ; ++b) {
                if(readyQueue.get(b).getBurstTime() > readyQueue.get(b+1).getBurstTime() ){
                    temp = readyQueue.get(b);
                    readyQueue.set(b,readyQueue.get(b+1));
                    readyQueue.set(b+1,temp);
                }
            }
        }
    }    
    //Method ที่จะหาค่าเฉลี่ยของ Waiting Time
    void avgWatime(int avgWat){
        avgWa = avgWa + avgWat;
    }
    //Method ที่จะหาค่าเฉลี่ยของ TurnAroundTime
    void avgTurntime(int count){
          avgT = avgT + count;
    }
   //Method ShowWaiting Time ที่จะถูกเรียกใช้ฝั่ง View โดยที่จะนำมาหารกับค่าของ TerminQueue Size  
    String showWatime(){
       try{ 
            int avg;
            avg = avgWa / terminQueue.size();
            return avg+" ";
       }catch(ArithmeticException e){
           
       }
       return null;
    }
    
    //ทำงานเช่นเดียวกันกับMethod ShowWaitingTime
    String turnAround(){
      
       try{
            int turn;
            turn = avgT/terminQueue.size();
            
        return turn+" ";
        
       }catch(ArithmeticException e){
           
       }
       return  null;
    }
    
    //Method ที่ใช้แอด Process เข้าไปทำงานใน IO Ptinter
    void addPrinter(){
        try{
            for(int i = 0 ; i < jobQueue.size(); i++){
                if(jobQueue.get(i).getpState() == "Running"){
                        jobQueue.get(i).setpState(3);
                        printerQueue.add(jobQueue.get(i));
                        readyQueue.remove(0);
                        break;
                 }
             }
        }catch(IndexOutOfBoundsException e){
            
        }
}
    // ใช้เพื่อออกจาก Printer 
    void endPrinter(){
     try{
        for(int i = 0 ; i < jobQueue.size(); i++){
             jobQueue.get(i).setpState(1);
             printerQueue.get(i).setpState(1);
             readyQueue.add(printerQueue.get(i));
             printerQueue.remove(0);
             break;
         }
     }catch(IndexOutOfBoundsException e){
         
     }
    }
    
    //ทำเช่นเดียวกันกับ Printer
     void addDisk(){
            try{
            for(int i = 0 ; i < jobQueue.size(); i++){
                if(jobQueue.get(i).getpState() == "Running"){
                        jobQueue.get(i).setpState(3);
                        diskQueue.add(jobQueue.get(i));
                        readyQueue.remove(0);
                        break;
                 }
             }
        }catch(IndexOutOfBoundsException e){
            
        }
            }
    //ทำเช่นเดียวกันกับ Printer
    void endDisk(){
          for(int i = 0 ; i < jobQueue.size(); i++){
             jobQueue.get(i).setpState(1);
             diskQueue.get(i).setpState(1);
             readyQueue.add(diskQueue.get(i));
             diskQueue.remove(0);
             break;
         }
    }
 
}
    
    
   

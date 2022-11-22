/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rrr;


public class Model {
    
    //เป็นการประกาศตัวแปรต่างๆ เพื่อที่จะนำไปใช้ร่วมกับ  Controller และ View
    
    private int index_state;    //เลขตําแหน่งที่ใช้ในการดึงตําแหน่งของ Array String State
    private int ProcessID; 
    private String State[] = {"New","Ready","Running","Waiting","Terminated"};
    private int execue_time;//เวลาที่ process ใช้ทำงาน โดยอ้างอิงจาก TimeQuantum ที่กําหนดมาตั้งแต่ CPU เริ่มทํางาน 
    private int arrival_time;  
    private int wating_time;    //เวลาที่นับขึ้นในขณะที่ Process นั้นยังไม่ได้เข้าใช้งาน CPU
    private int QuantumTime;    //เวลาที่ขอใช้งาน CPU
    private int io_cd;  //การเข้าใช้งานอุปกรณ์ Disk เป็นอุปกรณ์ที่ Cpu ที่กําลังทํางานสามารถเข้าไปใช้งาน IO ได้
    private int io_usb;
    private int io_Waitcd ;  //เวลาที่รอเข้าใช้ IO ของ Disk
    private  int io_WaitUsb ;   //เวลาที่รอเข้าใช้ IO ของ Printer
    

    //defult Construcer
    public Model(){

    }
    //Construcer
    public Model(int ProcessID,int index_state,int arrival_time,int execue_time,int wating_time,int QuantumTime){
        this.ProcessID=ProcessID;
        this.index_state=index_state;
        this.arrival_time=arrival_time;
        this.execue_time=execue_time;
        this.wating_time=wating_time;
        this.QuantumTime = QuantumTime;
 }

    
    public int getIndex_state() {
        return index_state;
    }

    public void setIndex_state(int index_state) {
        this.index_state = index_state;
    }

    public int getProcessID() {
        return ProcessID;
    }

    public void setProcessID(int ProcessID) {
        this.ProcessID = ProcessID;
    }

    public String getState() {
        return State[index_state];// 
    }

    public void setState(int index_state) {
        this.index_state = index_state;
    }

    public int getExecue_time() {
        return execue_time;
    }

    public void setExecue_time(int execue_time) {
        this.execue_time = execue_time;
    }

    public int getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(int arrival_time) {
        this.arrival_time = arrival_time;
    }

    public int getWating_time() {
        return wating_time;
    }

    public void setWating_time(int wating_time) {
        this.wating_time = wating_time;
    }

    public int getQuantumTime() {
        return QuantumTime;
    }

    public void setQuantumTime(int QuantumTime) {
        this.QuantumTime = QuantumTime;
    }

    public int getIo_cd() {
        return io_cd;
    }

    public void setIo_cd(int io_cd) {
        this.io_cd = io_cd;
    }

    public int getIo_usb() {
        return io_usb;
    }

    public void setIo_usb(int io_usb) {
        this.io_usb = io_usb;
    }

    public int getIo_Waitcd() {
        return io_Waitcd;
    }

    public void setIo_Waitcd(int io_Waitcd) {
        this.io_Waitcd = io_Waitcd;
    }

    public int getIo_WaitUsb() {
        return io_WaitUsb;
    }

    public void setIo_WaitUsb(int io_WaitUsb) {
        this.io_WaitUsb = io_WaitUsb;
    }
}

   
    

    
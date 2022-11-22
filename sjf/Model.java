/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sjf;

/**
 *
 * @author DoubleP
 */


public class Model {

/*
    เป็นการประกาศตัวแปรต่างๆ เพื่อที่จะนำไปใช้ในส่วนของ Controller และ View
    */  
private int indexPS = 0;
private String pState[] = {"New", "Ready", "Running", "Waiting", "Terminated"};   
private int pID, avgwaTime, arrivalTime,burstTime,turnAroundtime,watingTime,clock,ioWiTimePrinter,ioWiTimeDiks,ioPrinter,ioDisk;

    public Model(){
        
    }
    //ใน Method Model นี้ เราจะรับค่า Parameter มาเพื่อที่จะมาเก็บไว้ในตัวแปรต่างๆที่เราสร้างขึ้น
    public  Model(int pID,int indexPS , int arrivalTime, int burstTime) { 
        this.pID = pID; 
        this.indexPS = indexPS;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
        this.watingTime = watingTime;
     
    }

   

    public int getpID() {
        return pID;
    }

    public void setpID(int pID) {
        this.pID = pID;
    }

    public int getClock() {
        return clock;
    }

    public void setClock(int clock) {
        this.clock = clock;
    }

    public String getpState() {
        return pState[indexPS];
    }

    public void setpState(int indexPS) {
        this.indexPS = indexPS;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getBurstTime() {
        return burstTime;
    }

    public void setBurstTime(int burstTime) {
        this.burstTime = burstTime;
    }

    public int getWatingTime() {
        return watingTime;
    }

    public void setWatingTime(int watingTime) {
        this.watingTime = watingTime;
    }

    public int getAvgwaTime() {
        return avgwaTime;
    }

    public void setAvgwaTime(int avgwaTime) {
        this.avgwaTime = avgwaTime;
    }

    public int getIoPrinter() {
        return ioPrinter;
    }

    public void setIoPrinter(int ioPrinter) {
        this.ioPrinter = ioPrinter;
    }

    public int getIoDisk() {
        return ioDisk;
    }

    public void setIoDisk(int ioDisk) {
        this.ioDisk = ioDisk;
    }

    public int getIoWiTimePrinter() {
        return ioWiTimePrinter;
    }

    public void setIoWiTimePrinter(int ioWiTimePrinter) {
        this.ioWiTimePrinter = ioWiTimePrinter;
    }

    public int getIoWiTimeDiks() {
        return ioWiTimeDiks;
    }

    public void setIoWiTimeDiks(int ioWiTimeDiks) {
        this.ioWiTimeDiks = ioWiTimeDiks;
    }


    
    
    
   

    
    
    
    
    
    
    
    
    
}

    

   

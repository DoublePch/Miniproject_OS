/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rrr;

//import library ต่างๆเข้ามาใช้งาน
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Controller {

    //สร้าง Object จาก Class Model ใช้ชื่อว่า model
    Model model = new Model();
    //ส่วนนี้คือการสร้างตัวแปร array แบบ Object โดยใช้ arrayList
    //Array list คือ Collection ที่ใช้เก็บข้อมูลเหมือนอาเรย์ปกติ แต่สิ่งที่แตกต่างกันคือ Array list สามารถย่อและขยายของมันได้อัตโนมัติตามข้อมูลที่มีอยู่ภายใน นั่นเองทำให้มันยืดหยุ่นในการทำงานเพราะไม่ต้องกำหนดขนาดสูงสุดล่วงหน้าเหมือนกับอาเรย์ปกติ 
    List<Model> jobQueue = new ArrayList<Model>();
    List<Model> readyQueue = new ArrayList<Model>();
    List<Model> cdQueue = new ArrayList<Model>();
    List<Model> usbQueue = new ArrayList<Model>();
    List<Model> terminatedQueue = new ArrayList<Model>();

    int processID = 1; //ProcessID กําหนดให้เริ่มต้นที่ ProcessID = 1
    int quatumtime; //ตัวแปลไว้เก็บค่า TimeQuatum จากฝั่ง View
    int timeexecu = 0; //ค่า Timeexeucu
    int timeQueam = 0; //ตัวแปลที่ใช่ดึงค่า TimeQueam เพื่อโยนค่าให้กับตัว Process แต่ละตัวให้ทํางานตาม TimeQueam
    int waittime = 0; // ใช้เก็บค่า Watingtime
    int avgWait = 0;
    int cpuid; 
    
    //Defult Constucter
    public Controller() {

    }

    public void setTimeQ(int qt) {
        quatumtime = qt;
        model.setQuantumTime(qt);
    }

  
    public void tot(int qt) {
        int k;
        for (k = 0; k < qt; k++) {
        }
        timeQueam = k;
    }

    //method ปุ่ม addProcess คือมี paramiter อยู่ 2 ตัว รับมาจากฝั่ง View คือตัวแปล count qt Method นี้จะถูกนําไปเรียกใช้ในฝั่ง View 
    public void addProcess(int count, int qt) {
        //เรียกชื่อออปเจค Model มาใช้โดยการดึงค่า Paramiter จากฝั่ง Model มาใช้งาน
        model = new Model(processID, 0, count, 0, 0, qt);
        processID++;
        jobQueue.add(model);
        readyQueue.add(model);
    }

    //Method showInTable1  จะทำการเอาค่าตัวแปรมาเก็บไว้ในตัวแปรที่ชื่อว่า text แล้วจะนำไปเรียกใช้ที่ฝั่ง View
    //Method ที่ชื่อว่า Show โดยทั้งหมดแล้วจะถูกเรียกใช้ที่ฝั่ง View เหมือนกัน
    
    /*
    1 new 5 0 0 , 2 new 5 0 0
     */
    String showInTable1() {
        String text = "";
        for (int index = 0; index < jobQueue.size(); index++) {
            text = text + jobQueue.get(index).getProcessID() + " ";
            text = text + jobQueue.get(index).getState() + " ";
            text = text + jobQueue.get(index).getArrival_time() + " ";
            text = text + jobQueue.get(index).getExecue_time() + " ";
            text = text + jobQueue.get(index).getWating_time() + " ";
            text = text + ",";
        }
        return text;
    }

    String showInTable2() {
        String textTable2 = "";
        for (int index = 0; index < readyQueue.size(); index++) {
            textTable2 = textTable2 + readyQueue.get(index).getProcessID() + " ";
            textTable2 = textTable2 + readyQueue.get(index).getState() + " ";
            textTable2 = textTable2 + ",";
        }
        return textTable2;
    }

    String showInTable4() {
        String textTable4 = "";
        for (int index = 0; index < terminatedQueue.size(); index++) {
            textTable4 = textTable4 + terminatedQueue.get(index).getState() + " ";
            textTable4 = textTable4 + terminatedQueue.get(index).getProcessID() + " ";
            textTable4 = textTable4 + ",";
        }
        return textTable4;
    }

    String showCD() {
        String textTable4 = "";
        for (int index = 0; index < cdQueue.size(); index++) {
            textTable4 = textTable4 + cdQueue.get(index).getProcessID() + " ";
            textTable4 = textTable4 + cdQueue.get(index).getState() + " ";
            textTable4 = textTable4 + cdQueue.get(index).getIo_cd() + " ";
            textTable4 = textTable4 + ",";
        }
        return textTable4;
    }

    String showCDQueue() {
        String textTable4 = "";
        for (int index = 0; index < cdQueue.size(); index++) {
            textTable4 = textTable4 + cdQueue.get(index).getProcessID() + " ";
            textTable4 = textTable4 + cdQueue.get(index).getState() + " ";
            textTable4 = textTable4 + cdQueue.get(index).getIo_Waitcd() + " ";
            textTable4 = textTable4 + ",";
        }
        return textTable4;
    }

    String showUSB() {
        String textTable4 = "";
        for (int index = 0; index < usbQueue.size(); index++) {
            textTable4 = textTable4 + usbQueue.get(index).getProcessID() + " ";
            textTable4 = textTable4 + usbQueue.get(index).getState() + " ";
            textTable4 = textTable4 + usbQueue.get(index).getIo_usb() + " ";
            textTable4 = textTable4 + ",";
        }
        return textTable4;
    }

    String showUSBQueue() {
        String textTable4 = "";
        for (int index = 0; index < usbQueue.size(); index++) {
            textTable4 = textTable4 + usbQueue.get(index).getProcessID() + " ";
            textTable4 = textTable4 + usbQueue.get(index).getState() + " ";
            textTable4 = textTable4 + usbQueue.get(index).getIo_WaitUsb() + " ";
            textTable4 = textTable4 + ",";
        }
        return textTable4;
    }
    
    // Method runCpu จะทำการกำหนดค่าต่างๆ การทํางานต่างๆ ในกรณีที่เข้าไปใช้งาน CPU
    public void runCpu(int count) {
        try {
            for (int i = 0; i < jobQueue.size(); i++) { //Loop ถ้า i = 0 เช็คว่า i < jobq.size ก็จะเพื่มค่า i ครั้งละ 1
                if (readyQueue.get(0) == jobQueue.get(i)) { // ถ้า readyQueue ตําแหน่งที่ 0 เท่ากับ jobQueue ตําแหน่งที่ i 
                    jobQueue.get(i).setState(2); // ก็จะเซ็ตค่าเป็น Running
                    quatumtime = jobQueue.get(i).getQuantumTime(); //โดย get ค่า TimeQuantum มาใช้งาน
                    quatumtime--; //โดยให้ค่า  quatumtime ลดค่าลงครั้งละ 1 จนถึง 0 จึงจะสามารถเข้าไปใช้งาน if ถัดไป
                    jobQueue.get(i).setQuantumTime(quatumtime); //โดยนําค่า quatumtime มาเซ็ตค่าให้กับ setQuantumTime ของ Process นั้น
                    System.out.println("TQT  Running = " + quatumtime);
                    timeexecu = jobQueue.get(i).getExecue_time(); //โดย get ค่า Execue time Process นั้นมา ให้มีค่าเท่ากับ timeexecu
                    timeexecu++; //และเพิ่มค่า timeexecu ขึ้นที่ละ 1
                    jobQueue.get(i).setExecue_time(timeexecu);//โดยนําค่า timeexecu มาเก็บยัง setExecue_time ของ Process นั้น
                    System.out.println("TQT  Running01 = " + timeexecu);
                    if (jobQueue.get(i).getQuantumTime() == 0) { // นําค่า getQuantumTime() ของ Process นั้น มาเทียบค่าว่า มีค่า เท่ากับ 0 หรือไม่ ถ้าเท่ากันก็จะเข้าเงื่อนไขเป็นจริง
                        jobQueue.get(i).setState(1); //โดยถ้าเป็น 0 ก็จะเซ็ตให้ Process นั้น มีค่าสถานะเป็น Ready
                        readyQueue.add(jobQueue.get(i)); //และทําการ Add Process นั้นเข้าไปรอใน ReadyQueue เพื่อรอเข้าใช้งาน Cpu ต่อไป
                        readyQueue.remove(0);//และ Remove ReadyQueue ตําแหน่งที่ 0 ออกมาเพื่อเอา Process นั้นไปใช้งาน Cpu ต่อโดยจะไปเช็คเงื่อนไข if ด้านบนสุด
                        jobQueue.get(i).setQuantumTime(timeQueam);//และนําค่า timeQueam ที่เรานํามาจากฝั่ง View เช็ตค่าให้กับ QuantumTime นั้นไปใช้งาน
                        System.out.println("TQT Ready = " + jobQueue.get(i).getQuantumTime());
                    }
                } else if (jobQueue.get(i).getState() != "Waiting") {
                    jobQueue.get(i).setState(1);
                }
            }
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    //method addCD คือใช้ในการ AddProcess นั้นเข้ามาใช้งาน I/O
    public void addCD() {
        try {
            for (int i = 0; i < jobQueue.size(); i++) { // Loop หาค่า
                if (jobQueue.get(i).getState() == "Running") { // Loop Process ตําหน่งที่ i ว่า  Process ไหนที่มี ค่า State เป็น Running 
                    jobQueue.get(i).setState(3);//ให้ set ค่าของ Process นั้น เป็น Wating ในตาราง jobQueue
                    cdQueue.add(jobQueue.get(i));//และทําการ Add Process ตําแหน่งนั่น เข้าไปในตารางตําแหน่ง ที่ 0 ของ addCD
                    readyQueue.remove(0); //และลบค่าตําแหน่ง ReadyQueue ตําแหน่งที่ 0 ออก
                    break;
                }
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    //method endCD ใช้เพื่อออกจากการใช้งาน I/O
    public void endCD() {
        try {
            for (int i = 0; i < jobQueue.size(); i++) { // loop 
                cdQueue.get(i).setState(1);//นําตําแหน่งที่คืนค่าออกไปโดยเซ็ต ค่าให้เป็น Ready
                readyQueue.add(cdQueue.get(0));//และ Add เข้าไปใน ReadyQueue เพิ่อรอเข้าไปใช้งาน cpu ต่อไป
                cdQueue.remove(0);
                break;
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    //method ทํางานคล้ายกับตัว addCD
    public void addUsb() {
        try {
            for (int i = 0; i < jobQueue.size(); i++) {
                if (jobQueue.get(i).getState() == "Running") {
                    jobQueue.get(i).setState(3);
                    usbQueue.add(jobQueue.get(i));
                    readyQueue.remove(0);
                    break;
                }
            }
        } catch (IndexOutOfBoundsException e) {

        }

    }

    // method นี้ใช้งานคล้ายกับ endCD
    public void endUsb() {
        try {
            for (int i = 0; i < jobQueue.size(); i++) {
                usbQueue.get(i).setState(1);
                readyQueue.add(usbQueue.get(0));
                usbQueue.remove(0);
                break;
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    public void removeQueue() {
        for (int i = 0; i < jobQueue.size(); i++) {
            if (readyQueue.get(0) == jobQueue.get(i)) {
                jobQueue.get(i).setState(4);
                avgWatime(jobQueue.get(i).getWating_time());
                terminatedQueue.add(jobQueue.get(i));
                jobQueue.remove(i);
                readyQueue.remove(0);
                break;
            }
        }
    }

    //method นี้ จะเช็คว่า Process ไหนบ้างที่จะได้ค่า waitting บ้าง
    public void waitting(int count) {
        for (int i = 0; i < jobQueue.size(); i++) {
            if (jobQueue.get(i).getState() == "Ready") {
                waittime = jobQueue.get(i).getWating_time();
                waittime = waittime + 1;
                jobQueue.get(i).setWating_time(waittime);
            }
        }
    }

    //method นี้คือการคํานวณค่าเฉลี่ยของ Waitingtime
    public void avgWatime(int avgWat) {
        avgWait = avgWait + avgWat;
    }

//Method ShowWatime ที่จะนําไปใช้ในฝั่ง View โดยที่จะนำมาหารกับค่าของ TerminQueue Size  หรือ ขนาดของ Process ที่่ถูกเพิ่มเข้ามาใน  terminatedQueue
    String showWatime() {
        try {
            int avg;
            avg = avgWait / terminatedQueue.size();
            return avg + " ";
        } catch (ArithmeticException e) {
        }
        return null;
    }

    //method showCPURunning จะโชว์ ProcessID ว่า Process ไหนกําลังใช้งาน CPU อยู่
    public int showCPURunning() {
        for (int i = 0; i < jobQueue.size(); i++) {
            if (jobQueue.get(i).getState() == "Running") {
                cpuid = jobQueue.get(i).getProcessID();
            }
        }
        return cpuid;
    }

    //Method ioCD ใช้ในการนับเวลา Io time ขณะที่ Process นั้นกําลังใช้งาน CPU อยู่
    public void ioCD(int count) {
        try {
            // จะเช็คว่า ตําแหน่งที่ 0 นั้นเป็น Waiting จึงจะนับเวลา IO  ไปเรื่อยๆ
            if (cdQueue.get(0).getState() == "Waiting") {
                int ioC = cdQueue.get(0).getIo_cd();
                ioC = ioC + 1;
                cdQueue.get(0).setIo_cd(ioC);
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    public void ioUSB(int count) {
        try {

            if (usbQueue.get(0).getState() == "Waiting") {
                int ioU = usbQueue.get(0).getIo_usb();
                ioU = ioU + 1;
                usbQueue.get(0).setIo_usb(ioU);
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    //  IO WaitingCD คือ method ที่จะเช็คว่า Process ไหนที่เข้ามารอคิวใช้งาน I/O อยู่นั้นก็จะทําการ + ค่า Waiting เพิ่มขี้น 
    public void ioWaitingCD() {

        try {
            for (int i = 0; i < jobQueue.size(); i++) {
                if (cdQueue.get(i) != cdQueue.get(0)) {
                    int ioWC = cdQueue.get(i).getIo_Waitcd();
                    ioWC = ioWC + 1;
                    cdQueue.get(i).setIo_Waitcd(ioWC);
                }
            }
        } catch (IndexOutOfBoundsException e) {

        }
    }

    public void ioWaitingUSB() {
        try {
            for (int i = 0; i < jobQueue.size(); i++) {
                if (usbQueue.get(i) != usbQueue.get(0)) {
                    int ioWD = usbQueue.get(i).getIo_WaitUsb();
                    ioWD = ioWD + 1;
                    usbQueue.get(i).setIo_WaitUsb(ioWD);
                }
            }
        } catch (IndexOutOfBoundsException e) {
        }
    }
}

package designpattern.facade08;

/**
 * Created by JohnSun on 2016/2/22.
 */
public class Computer {

    private CPU cpu;
    private  Memory memory;
    private Disk disk;

    public Computer() {

        cpu=new CPU();
        memory=new Memory();
        disk=new Disk();
    }
    public void startup(){
        System.out.println("´ò¿ªµçÄÔ");
        cpu.startup();
        memory.startUp();
        disk.startup();

    }


    public void shutdown(){
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();

    }




}

public class Qn3 
{   
    public static void main(String [] args)   
    {   
        long totalMS = System.currentTimeMillis();
        long totalS = totalMS / 1000;
        long currS = totalS % 60;
        long totalM = totalS / 60;
        long currM = totalM % 60;
        long totalH = totalM / 60;
        long currH = totalH % 24;
        System.out.printf("Current time is %d:%d:%d GMT", currH, currM, currS);
    }   
}  
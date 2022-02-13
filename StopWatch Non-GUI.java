import java.lang.Thread;
import java.util.Scanner;

class StopWatch {

    static void execute() {
        Scanner input = new Scanner(System.in);
        
        int s = 0;
        int m = 0;
        int h = 0;

        System.out.print("\nPress any key to start!");
        String dummy = input.nextLine();
        input.close();
        
        System.out.println("\n00 : 00 : 00");
        
        while (true) {
                        
            try {
                Thread.sleep(1000);
            } catch (Exception e) {            
            }
    
        s++;

        if(s == 60){
            s = 0;
            m++;
        }
        if(m == 60){
            m = 0;
            h++;
        }
        
        String s_str = Integer.toString(s);
        String m_str = Integer.toString(m);
        String h_str = Integer.toString(h);
    
        if(s_str.length() == 1){
            s_str = '0' + s_str;
        }
        if(m_str.length() == 1){
            m_str = '0' + m_str;
        }
        if(h_str.length() == 1){
            h_str = '0' + h_str;
        }
        
        System.out.println(h_str + " : " + m_str + " : " + s_str);
        
        }
    }

    public static void main(String[] args) {
        execute();
    }
}
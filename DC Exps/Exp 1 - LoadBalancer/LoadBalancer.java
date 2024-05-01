import java.util.Scanner;
import java.awt.*;
class LoadBalancer{
        static void PrintLoad(int processes, int servers){
            int each = processes / servers;
            int extras = processes % servers;
            int total = 0;
            for(int i = 1; i <= servers; i++){
                if(extras --> 0)
                    total = each + 1;
                else
                    total = each;
                System.out.println("Servers " + i + " has " + total + " processes");
            }

        }

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of processes and servers:");
            int processes = sc.nextInt();
            int servers = sc.nextInt();

            while(true){
                PrintLoad(processes, servers);
                System.out.println("1. Add Servers\n2. Remove Servers\n3. Add Processes\n 4. Remove Processes\n5. Exit");
                switch(sc.nextInt()){
                    case 1: 
                    System.out.println("How many more servers do you want to add?"); 
                    servers += sc.nextInt(); 
                    break;
                    case 2:
                    System.out.println("How many servers do you want to remove?");
                    servers -= sc.nextInt();
                    break;
                    case 3:
                    System.out.println("How many more processes do you want to add?");
                    processes += sc.nextInt();
                    break;
                    case 4:
                    System.out.println("How many processes do you want to remove?");
                    processes -= sc.nextInt();
                    break;
                    case 5:
                    return;

                }
            }
        }
}
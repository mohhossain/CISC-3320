import java.util.Scanner;

public class PidTest
{
    public static void main(String[] args) throws Exception{
        PidManager.allocate_Map();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your options: \n1. Allocate\n2. Release \n0. Exit");
        int option = sc.nextInt();

        while (true){
            if(option == 0){
                System.out.println("Exited Successfully");
                break;
            }
            if (option > 2){
                System.out.println("Invalid option");
                break;
            }
            if (option == 1){
                System.out.println("How many memories you want to allocate?: ");
                int num = sc.nextInt();

                for (int i = 0; i<num; i++){
                    PidManager.allocate_PID();
                }
            } else if(option == 2){
                System.out.println("Which memory you want to release (300 - 5000): ");
                int mem = sc.nextInt();
                PidManager.release_PID(mem);
            }
            System.out.println("Enter your options: \n1. Allocate\n2. Release \n0. Exit");
            option = sc.nextInt();
        }
    }
}

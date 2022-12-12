import java.util.Scanner;
import java.lang.Math;  

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Du kan vælge mellem sten, saks og papir");
        Scanner sc = new Scanner(System.in);
        String Sc = sc.nextLine().toLowerCase();
        
        int playerchoice = 0;
        String cpuCString = "";

        if (Sc.equals("sten")){
            playerchoice = 1;
        } else if (Sc.equals ("saks")){
            playerchoice = 2;
        } else if (Sc.equals ("papir")){
            playerchoice = 3;
        } else {
            System.out.println("Ugyldig input");
        }

        int CPUChoice = (int)(Math.random() * (3 - 1 + 1) + 1);
        if (CPUChoice == 1){
            cpuCString = "sten";
        } else if (CPUChoice == 2){
            cpuCString = "saks";
        } else if (CPUChoice == 3){
            cpuCString = "papir";
        } else {
            System.out.println("Ugyldig input");
        }

        System.out.println("CPU'en valgte " + cpuCString);

        if (playerchoice == 1 && CPUChoice == 2){
            System.out.println("Du vandt");
        } else if (playerchoice == 2 && CPUChoice == 3){
            System.out.println("Du vandt");
        } else if (playerchoice == 3 && CPUChoice == 1){
            System.out.println("Du vandt");
        } else if (playerchoice == CPUChoice){
            System.out.println("Uafgjort");
        } else {
            System.out.println("Du tabte");
        }

        System.out.println("Tak for spillet Vil du spille igen? y/n");
        
        Scanner sc2 = new Scanner(System.in);
        String Sc2 = sc2.nextLine().toLowerCase();
        
        
        if (Sc2.equals("y")){
            main(null);
        } else if (Sc2.equals("n")){
            System.out.println("Tak for spillet");
            System.exit(1);
        } else {
            System.out.println("Ugyldig input");
        }
        sc.close();
        sc2.close();
    }
}

import java.util.Scanner;
public class FromScratch{
    public static void main(String args[]){
            int champCount=0;
            int diveCount=0;
            Scanner input=new Scanner(System.in);
            System.out.println("Does your team have double AP solo lanes?(y/n)");
            String apSolos=input.nextLine();
            if(apSolos.equals("y")||apSolos.equals("Y")){
                System.out.println("Please play AD (or tanko if you have 0 tanks)");
                return;
            }
            while(champCount!=5){
                System.out.println("Enter a champion on the enemy team:");
                input.nextLine();
                System.out.println("Is this champion a dive champion? (y/n)");
                String response=input.nextLine();
                if(response.equals("y")||response.equals("Y")){
                    diveCount++;
                }
                champCount++;
            }
            if(diveCount>2){
                System.out.println("Play AP please :)");
            }else{
                System.out.println("Probably AD");
            }
    }

}
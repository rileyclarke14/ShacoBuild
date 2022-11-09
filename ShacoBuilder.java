import java.io.File;
import java.util.Scanner;

public class ShacoBuilder {
    /* 
     * Program will start by asking users to input their team comp and the enemy team comp
     * Somehow gather the data for whether every champ is dive, their damageType, and whether they are tanky or not.
     * Use arrays to store the team comps
     * If your team has 3 or more AP heavy champs already, 99% of the time go AD/tank/bruiser
     * if your team is all AD, go ap.
     * Otherwise, this program will decide based on the enemy comp what to build on shaco.
     * May possibly update to include specific builds such as going morello or serpents.
     */
    public static void main(String args[]) throws Exception
    {
        Champion[] userTeam=new Champion[5];
        int userTeamLength=0;
        File champFile=new File("C:\\Users\\riley\\OneDrive\\Documents\\ShacoProject\\ChampRoster.txt");
        Scanner fileScanner=new Scanner(champFile);
        Scanner input=new Scanner(System.in);
        while(userTeamLength!=5){
            System.out.println("Enter a champion on your team:");
            String champName=input.nextLine();
            while(fileScanner.hasNextLine()){
                if(fileScanner.nextLine().equals(champName)){
                    Champion currentChampion=new Champion(champName);
                    if(fileScanner.nextLine().equals("dive")){
                        currentChampion.setDive(true);
                    }else{
                        currentChampion.setDive(false);
                    }
                    currentChampion.setDT(fileScanner.nextLine());
                    if(fileScanner.nextLine().equals("nt")){
                        currentChampion.setTank(false);
                    }else{
                        currentChampion.setTank(true);
                    }
                    userTeam[userTeamLength]=currentChampion;
                    userTeamLength++;
                }
            }
            for(int i=0; i<5; i++){
                System.out.println(userTeam[i].getName());
                System.out.println(userTeam[i].getDT());
            }
        }
        System.out.println(friendlyDamageTypeDecider(userTeam));
        fileScanner.close();
        input.close();
    }

    public static String friendlyDamageTypeDecider(Champion[] team){
        int apCount=0;
        int adCount=0;
        for(int i=0; i<5; i++){
            if(team[i].getDT().equals("AD")){
                adCount++;
            }else if(team[i].getDT().equals("AP")){
                apCount++;
            }
        }
        if(apCount>2){
            return "AD";
        }else if(adCount>2){
            return "AP";
        }
        return "Enemy team comps decides";
    }
}



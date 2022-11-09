public class Champion{
    private boolean dive;
    private String damageType;
    private boolean tank;
    private String name;
    public Champion(boolean d, String DT, boolean t, String name){
        this.dive=d;
        this.damageType=DT;
        this.tank=t;
    }
    public Champion(String name){
        dive=false;
        damageType="AD";
        tank=false;
    }
    public boolean isDive(){
        return dive;
    }
    public void setDive(boolean paramDive){
        dive=paramDive;
    }
    public String getDT(){
        return damageType;
    }
    public void setDT(String DT){
        damageType=DT;
    }
    public boolean isTank(){
        return tank;
    }
    public void setTank(boolean tanky){
        tank=tanky;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}

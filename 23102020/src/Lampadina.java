public class Lampadina {
    private int clickAllowed =4;
    private functionState actualState = functionState.SPENTA;
    public static boolean electricityPresence  = false;

    public boolean click(){
        if(this.clickAllowed>0){
            switch(this.actualState){
                case SPENTA:
                    if(electricityPresence){
                        this.actualState =functionState.ACCESA;
                        this.clickAllowed--;
                        System.out.println("light ON");
                        return true;
                    }
                case ACCESA:
                    this.actualState= functionState.SPENTA;
                    this.clickAllowed--;
                    System.out.println("light OFF");
                    return false;
                default: this.actualState = functionState.SPENTA;
            }
        }else{
            this.actualState=functionState.ROTTA;
            System.out.println("Broken Bulb");
        }
        return false;
    }
}

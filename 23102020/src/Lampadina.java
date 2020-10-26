public class Lampadina {
    private int clickAllowed =4;
    private functionState actualState = functionState.SPENTA;

    public void click(){
        if(this.clickAllowed>0){
            switch(this.actualState){
                case SPENTA:
                    this.actualState =functionState.ACCESA;
                    this.clickAllowed--;
                    System.out.println("light ON");
                    break;
                case ACCESA:
                    this.actualState= functionState.SPENTA;
                    this.clickAllowed--;
                    System.out.println("light OFF");
                    break;
            }
        }else{
            this.actualState=functionState.ROTTA;
            System.out.println("Broken Bulb");
        }
    }
}

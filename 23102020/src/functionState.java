public enum functionState {
    SPENTA(0), ACCESA(1), ROTTA(-1);

    private int state;
    functionState(int state){
        this.state = state;
    }
    public int toInt(){
        return state;
    }

}


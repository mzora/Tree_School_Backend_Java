public class NumeroRomano {
    private String numDaConvertire;
    private int result=0;

    public NumeroRomano(String n){
        this.numDaConvertire = n;
    }

    public int getValore(){
        int charsCount = numDaConvertire.length();
        char[] splittedString = numDaConvertire.toCharArray();

        for(int i=0;i<charsCount;i++){
            int valoreSimbolo = conversioneLettera(splittedString[i]);
            if(i+1 < splittedString.length){
                int valoreSimboloSuccessivo = conversioneLettera(splittedString[i+1]);
                if (valoreSimbolo >= valoreSimboloSuccessivo) {
                    result = result+valoreSimbolo;
                }
                else {
                    result = result+valoreSimboloSuccessivo-valoreSimbolo;
                    i++;
                }
            }else{
                result = result+valoreSimbolo;
                i++;
            }
        }
        return this.result;
    }

    private int conversioneLettera(char r){
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}

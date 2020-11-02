public class MiaStringa implements Iterabile, Lista {
    private String miaStringa;
    private int count=0;

    public MiaStringa(){
        miaStringa="";
    }
    public MiaStringa(String s){
        miaStringa=s;
    }
    @Override
    public Object next() {
        return miaStringa.charAt(count++);
    }
    @Override
    public boolean hasNext() {
        return count + 1 < miaStringa.length();
    }
    @Override
    public void reset() {
        count=0;
    }

    //new methods lista
    @Override
    public Object get(int i) {
        return miaStringa.charAt(i);
    }

    @Override
    public boolean contains(Object o) {
        if (o instanceof Character)
        {
            for(int i=0; i<miaStringa.length(); i++)
            {
                if( ((Character) o).equals(miaStringa.charAt(i)) )
                {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int size() {
        return miaStringa.length();
    }

    @Override
    public void add(Object o) {
        miaStringa+=o;
    }

    @Override
    public boolean remove(int i) {
        if(miaStringa!=null && i < miaStringa.length()){
            miaStringa = miaStringa.replace(miaStringa.charAt(i),' ');
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        miaStringa="";
    }
}

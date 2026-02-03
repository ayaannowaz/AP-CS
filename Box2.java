public class Box2 {
    private boolean isBlack;
    private int num;

    public Box2(boolean isb, int n){
        isBlack = isb;
        num = n;
    }
    public String toString(){
        String s;
        if(isBlack)s=" black";
        else if(num>0)s="  "+num+"wh";
        else s=" white";
        return s;
    }
}
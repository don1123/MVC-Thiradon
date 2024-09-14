package Model;
public abstract class Cow
{
    enum State{
        READY,CLEANING,MILKING
    }
    State CowState = State.READY;
    TumNum[] T = new TumNum[4];
    class TumNum{   

    }   
    public int TumNumLength(){
        return T.length;
    }

}
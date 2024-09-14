package Model;

public class KrungLeed {
    private TulNumChecker[] Head = new TulNumChecker[4];
    private Cow c;
    public int Number;
    class TulNumChecker{
        boolean attract = false;
        enum State{
            READY,CLEANING,MILKING
        }
    }
    public void MilkingCow(){
        // Check if Cow on Krung or not
        if (c != null) {

            for (int i = 0; i < c.TumNumLength(); i++) {
                
            }
            // Check each head 
            for (int i = 0; i < 4; i++) {
                if (Head[i] == null) {
                    return;
                }
            }
            
        }

    }
}

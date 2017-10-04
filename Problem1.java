
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int beeperrow=0;
    public int[] beepercount = new int[8];
    public int[] finalbeepercount = new int[8];
    public void sortBeepers() {
        pickUpBeepers();
    }
    public void pickUpBeepers() {
        for(int i = 0; i < 8; i++ ) {
            int moves;
            moves = 0;
            while(nextToABeeper()){
                moves++;
                pickBeeper();
                move();
        }
        turnLeft();
        turnLeft();
        for (int j = 0; j < moves; j++) {
            move();
        }
        turnLeft();
        move();
        turnLeft();
        beepercount[beeperrow] = moves;
        beeperrow++;
       }
    }
    public void figureOutRows(){
       for (int beeperarraynumber = 0; beeperarraynumber < 8; beeperarraynumber++) {
        for (int index = 0; index < beepercount.length; index++) {
            if (beepercount[beeperarraynumber] > beepercount[index]) {
                
                
            }else{ 
             finalbeepercount[beeperarraynumber] = beepercount[beeperarraynumber];
                beepercount[beeperarraynumber] = 100;
                beeperarraynumber++;
            }
       }
       
    }
   }
}
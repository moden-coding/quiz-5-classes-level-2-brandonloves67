public class ArcadeGameCredit {
   private String gameName;
   private int credits;
   private int costPerPlay;
   private int playsCompleted;

   public ArcadeGameCredit(String givenGameName, int initialCredits, int initialCostPerPlay){
    this.gameName = givenGameName ;
    this.credits = initialCredits;
    this.costPerPlay = initialCostPerPlay;
    this.playsCompleted=0;
    if (initialCredits<0) {
      credits=0;
    }
    if (initialCostPerPlay<=0) {
      costPerPlay=1;
    }

 }


@Override
 public String toString() {
        return "Game: " + gameName + " Credits: " + credits + " Cost per play: " + costPerPlay + " Play completed: " + playsCompleted;
    }

    public void playOnce(){
      if (credits>=costPerPlay) {
        credits-=costPerPlay;
        playsCompleted++;
      }
      else{
        credits=credits;
      }

    }
     public int getTotalCreditsUsed(){
      return playsCompleted * costPerPlay;
     }



}

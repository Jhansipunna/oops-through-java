import MyPack.Balance;
class AccountBalance {
public static void main(String args[]) {
      Balance current[]=new Balance[3];
      current[0]=new Balance("K.JOHN ",210.72);
      current[1]=new Balance("SAMMY ",-10.54);
      current[2]=new Balance("PJ ",2394.72);

      for(int i=0;i<3;i++)
          current[i].show();
}
}
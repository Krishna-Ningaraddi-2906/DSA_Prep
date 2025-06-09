public class Buystock 
{
  public static void main(String[] args) 
  {
     int[] prices= {1,5,10,8,9,6};

     System.out.println(maxProfit(prices));
  }

  static int maxProfit(int[] prices)
  {
    int minValue=prices[0];
    int maxP=0;

    for(int i=1;i<prices.length;i++)
    {
        if(i>minValue)
            minValue=i;
        else
        {
            int profit= prices[i]-minValue;
            if(profit>maxP) 
                maxP=profit;

        }

        
    }
    return maxP;

}
}

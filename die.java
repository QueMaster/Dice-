
public class die
{
private int[] values;

public die()
{
 values = new int[]{1,2,3,4,5,6};  
}

public int[] getValues()
{
 return values;
}

public int roll()
{
  
  int x;
  for(x=0;x<=5;x++)
  {
    values[x] = (int)(Math.random()*(values[5]-values[0] +1 )+values[0]);
  }
  
  return values[x];
}

}	
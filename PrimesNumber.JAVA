Class primesNumder
{
   public static void main(String args[])
   {
      for (int i = 0; i < 101; i++)
      {
        boolean prime = true;
        for(int j = 2; j < i-1; j++)
        {
          int k = i % j;
          if(K == 0)
          {
            prime = false;
            break;
           }
        }
      if(prime)
      {
        system.out.println(i);
      }
   }
}
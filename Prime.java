class Prime
{
   public static void main(String[] args)
      {
           boolean flag=false;
           int n=15;
           for(int i=2;i<=n/2;i++)
           {
              if(n%i==0)
              {
                  boolean=true;
                  break;
               }
            }
            if(flag)
            {
                System.out.println("not a prime");
             }
             else
             {
                System.out.println("prime");
              }
          }
  }        

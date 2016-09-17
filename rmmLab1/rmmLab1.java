class lab1
{
   public static void main (String args[])
   {
      if (args.length > 0)
      {
         for (String numtext : args)
         {
            try
            {
               long num;
               num = Long.parseLong(numtext);
               System.out.printf("Numbers which have integer root in range [1,%d]\n",num);
               for (long i=1; i <= num; i++)
               {
                  if (Math.sqrt(i) % 1 == 0) 
                  {
                     System.out.format("Sqrt of num %d: %.0f\n", i, Math.sqrt(i));
                  }
               }
            }
            catch(NumberFormatException e)
            {
               System.out.println ("Invalid number's format");
            }
         }
      }
      else
      {
              System.out.println ("Arguments are absent");
      }
   }
}

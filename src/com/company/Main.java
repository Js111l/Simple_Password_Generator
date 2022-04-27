package com.company;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)

    {


        System.out.println("Ilość znaków: ");

        Scanner scanner=new Scanner(System.in);

        int m = scanner.nextInt();

        if(m<8)
        {
            System.out.println("Hasło powinno się składać z co najmniej 8 znaków!");
        }



        Random  random=new Random();

        Object [] pass = new Object[m+1];


        System.out.println("Twoje hasło: ");


        for(int i = 0;i<=m;i++)
        {

            pass[i]=RandMethod.Metoda(random.nextInt(4));

        }
      StringBuilder password = new StringBuilder();


        for (var i:pass
             ) {
            password.append(i);
        }

        System.out.println(password);


    }

}

 class Lower{

  private static String lowercase="abcdefghijklmnopqrstuvwxyz";
  private static Random random=new Random();
   static char metoda(){
        return lowercase.charAt(random.nextInt(27));
    }
}
class Upper{

 private   static String uppercase="abcdefghijklmnopqrstuvwxyz".toUpperCase();
  private static Random random=new Random();
   static char metoda(){
        return uppercase.charAt(random.nextInt(26));
    }
}
class Chars{

    private static
    char [] specialchars=
            {
                    '!','#','$','%','&','\'',')','(','*','-','+','_','.','/',
                    ':',';','<','=','>','?','@','[',']','^','`','{','|','}','~'
            };
  static private  Random random = new Random();

  static char metoda(){
        return specialchars[random.nextInt(30)];
    }

}


class Numbers{

   private static String numbers="0123456789";

  private static Random random = new Random();

   static int metoda(){
        return numbers.charAt(random.nextInt(10));
    }

}


class RandMethod
{

    static char Metoda(int n)
    {
        if(n==0)
        {

            return Lower.metoda();
        }
        if(n==1)
    {
        return Upper.metoda();
    }
        if(n==2)
        {
            return Chars.metoda();
        }
        if(n==3)
        {
            return (char)Numbers.metoda();
        }

        return 0;

    }


}
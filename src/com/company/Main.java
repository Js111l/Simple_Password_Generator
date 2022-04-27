package com.company;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)

    {


        System.out.println("Długość hasła: ");

        Scanner scanner=new Scanner(System.in);

        int m = scanner.nextInt();

        if(m<8)
        {
            System.out.println("Hasło powinno się składać z conajmniej 8 znaków!");
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

 class lower{

  private static String lowercase="abcdefghijklmnopqrstuvwxyz";
  private static Random random=new Random();
   static char metoda(){
        return lowercase.charAt(random.nextInt(25));
    }
}
class upper{

 private   static String uppercase="abcdefghijklmnopqrstuvwxyz".toUpperCase();
  private static Random random=new Random();
   static char metoda(){
        return uppercase.charAt(random.nextInt(25));
    }
}
class chars{

    private static
    char [] specialchars=
            {
                    '!','#','$','%','&','\'',')','(','*','-','+','_','.','/',
                    ':',';','<','=','>','?','@','[',']','^','`','{','|','}','~'
            };
  static private  Random random = new Random();

  static char metoda(){
        return specialchars[random.nextInt(28)];
    }

}


class numbers{

   private static String numbers="0123456789";

  private static Random random = new Random();

   static int metoda(){
        return numbers.charAt(random.nextInt(9));
    }

}


class RandMethod
{

    static char Metoda(int n)
    {
        if(n==0)
        {

            return lower.metoda();
        }
        if(n==1)
    {
        return upper.metoda();
    }
        if(n==2)
        {
            return chars.metoda();
        }
        if(n==3)
        {
            return (char)numbers.metoda();
        }

        return 0;

    }


}
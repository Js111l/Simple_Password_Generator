package com.company;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args)

    {








        System.out.println("8-15 - Słabe");
        System.out.println("16-128 - Silne");
        System.out.println("129-2008 - Super Silne! ");
        System.out.println("Ilość znaków: ");
        Scanner scanner=new Scanner(System.in);

        int m = scanner.nextInt();


        if(m<8)
        {
            System.out.println("Bezpiczene hasło powinno się składać z co najmniej 8 znaków!");


        }








    System.out.println("Czy chcesz uwzględnić duże litery ? (\"ABCD\") Y/N ");
    Scanner scanBL = new Scanner(System.in);
    String BL = String.valueOf(scanBL.nextLine());
    System.out.println("Czy chcesz uwzględnić znaki specjalne ? (np. \"!#$%^:\") Y/N ");
    Scanner scanSPC = new Scanner(System.in);
    String SPC = String.valueOf(scanSPC.nextLine());
    System.out.println("Czy chcesz żeby znaki mogły się powtórzyć? (np. \"Uu\",\"00\",\"AbAB\") ? Y/N ");
    Scanner scanSC = new Scanner(System.in);
    String SC = String.valueOf(scanSC.nextLine());



        Random  random=new Random();
        System.out.println("Twoje hasło: ");
        Object [] pass = new Object[m+1];
        if(BL.equals("Y") && SPC.equals("Y") && SC.equals("Y"))
        {
            for (int i = 0; i <= m; i++) {


                pass[i] = RandMethod.Metoda(random.nextInt(4));

            }
            StringBuilder password = new StringBuilder();


            for (var i:pass
            )
            {
                password.append(i);
            }

            System.out.println(password);
        }



        if(BL.equals("Y") && SPC.equals("Y") && SC.equals("N"))
        {




            Object[] array = new Object[m + 1];

            for (int i = 0; i <= m; i++) {
                array[i] = RandMethod.Metoda(random.nextInt(4));
            }

            HashSet<Object> pass1 = new HashSet<>();

            for (var i : array
            ) {
                pass1.add(i);
            }


            StringBuilder sb = new StringBuilder();

            for (var i : pass1
            ) {
                sb.append(i);
            };

            System.out.println(sb);

        }


        if(BL.equals("Y") && SPC.equals("N") && SC.equals("Y"))
        {

            for (int i = 0; i <= m; i++) {

                pass[i] = RandMethod.Metoda(randomExcludenumber.YNY());
            }

            StringBuilder password = new StringBuilder();


            for (var i:pass
            )
            {
                password.append(i);
            }

            System.out.println(password);
        }



        if(BL.equals("N") && SPC.equals("Y") && SC.equals("Y"))
        {
            for (int i = 0; i <= m; i++) {


            pass[i] = RandMethod.Metoda(randomExcludenumber.NYY());

        }
            StringBuilder password = new StringBuilder();


            for (var i:pass
            )
            {
                password.append(i);
            }

            System.out.println(password);
        }



        if(BL.equals("N") && SPC.equals("N") && SC.equals("Y")) {


            for (int i = 0; i <= m; i++) {


                pass[i] = RandMethod.Metoda(randomExcludenumber.NNY());

            }
            StringBuilder password = new StringBuilder();


            for (var i:pass
            )
            {
                password.append(i);
            }

            System.out.println(password);


        }

        if(BL.equals("Y") && SPC.equals("N") && SC.equals("N")) {
            randomExcludenumber.YNN(m);

        }


        if(BL.equals("N") && SPC.equals("N") && SC.equals("N"))
        {
            randomExcludenumber.NNN(m);
        }



        if(BL.equals("N") && SPC.equals("Y") && SC.equals("N"))
        {

            randomExcludenumber.NYN(m);


        }






    }

}

 class lower{

  private static String lowercase="abcdefghijklmnopqrstuvwxyz";
  private static Random random=new Random();
   public static char metoda(){
        return lowercase.charAt(random.nextInt(25));
    }
}
class upper{

 private   static String uppercase="abcdefghijklmnopqrstuvwxyz".toUpperCase();
  private static Random random=new Random();
   public static char metoda(){
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

  public static char metoda(){
        return specialchars[random.nextInt(28)];
    }

}


class numbers{

   private static String numbers="0123456789";

  private static Random random = new Random();

  public static int metoda(){
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


class randomExcludenumber {
    static Random random = new Random();

/*
    static void YYN(int m) {



    }
*/

    static int YNY ()
    {

        int YNY = random.nextInt(4);

        while (YNY==2)
        {
            YNY=random.nextInt(4);
        }
return YNY;
    }

   



    static int NYY ()
    {
        int NYY = random.nextInt(4);
        while (NYY == 1)
        {
            NYY = random.nextInt(4);
        }
        return NYY;
    }



    static int NNY ()
    {
        int NNY = random.nextInt(4);
        while (NNY == 1 || NNY==2)
        {
            NNY = random.nextInt(4);
        }
        return NNY;

    }





    static void NNN (int m)
    {
        int NNN = random.nextInt(4);
        while (NNN == 2 ||  NNN==1)
        {
            NNN = random.nextInt(4);
        }

        Object [] array = new Object[m+1];

        for (int i = 0;i<=m;i++){
            array[i]=RandMethod.Metoda(NNN);
        }

        HashSet<Object> pass = new HashSet<>();

        for (var i:array
             ) {
            pass.add(i);
        }



        StringBuilder sb = new StringBuilder();

        for (var i:pass
        ) {
            sb.append(i);
        };

        System.out.println(sb);
    }



    static void NYN (int m)
    {
        int NYN = random.nextInt(4);

        while (NYN==1)
        {
            NYN = random.nextInt(4);
        }

        Object [] array = new Object[m+1];
        for (int i = 0;i<=m;i++){
            array[i]=RandMethod.Metoda(NYN);
        }

        HashSet<Object> pass = new HashSet<>();

        for (var i:array
             ) {
            pass.add(i);
        }


        StringBuilder sb = new StringBuilder();

        for (var i:pass
        ) {
            sb.append(i);
        };

        System.out.println(sb);
    }



    static void YNN (int m)
    {
        int YNN = random.nextInt(4);

        while (YNN==2)
        {
            YNN = random.nextInt(4);
        }



        Object [] array = new Object[m+1];

        for(int i =0;i<=m;i++)
        {
            array[i]=RandMethod.Metoda(YNN);
        }



        HashSet<Object> pass = new HashSet<>();

        for (var i :array
             ) {
            pass.add(i);
        }




        StringBuilder sb = new StringBuilder();

        for (var i:pass
        ) {
            sb.append(i);
        };
        System.out.println(sb);
    }




}



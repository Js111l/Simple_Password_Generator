package com.company;

import javax.print.DocFlavor;
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


Object[] pass=new Object[m];

        if(m<8)
        {
            System.out.println("Bezpieczne hasło powinno się składać z co najmniej 8 znaków!");
        }

        System.out.println("Czy chcesz uwzględnić małe litery?: Y/N");
        Scanner scannerMałeLitery=new Scanner(System.in);
        String małeLitery = scannerMałeLitery.nextLine();
        System.out.println("Czy chcesz uwzględnić duże litery?: Y/N");
        Scanner scannerDużeLitery=new Scanner(System.in);
        String duzeLitery = scannerDużeLitery.nextLine();
        System.out.println("Czy chcesz uwzględnić cyfry?: Y/N");
        Scanner scannerCyfry=new Scanner(System.in);
        String cyfry = scannerCyfry.nextLine();
        System.out.println("Czy chcesz uwzględnić symbole?: Y/N");
        Scanner scannerSymbole=new Scanner(System.in);
        String Symbole = scannerSymbole.nextLine();




        System.out.println("Twoje hasło: ");



        for (int i = 0; i < m; i++)
        {

            pass[i] = RandMethod.Metoda(Metoda.createPassword(duzeLitery,małeLitery, cyfry,Symbole));
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (var i : pass
        ) {
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);




    }
}

class Metoda
{
static int duze(String duze)
{
   if (duze.equals("N")) {
       return 2;
   }
   return 0;
}
static int male(String małe){
    if(małe.equals("N")) {
        return 1;
    }
    return 0;
}
static int cyfry(String cyfry){
    if(cyfry.equals("N")) {
        return 4;
    }
    return 0;
}
static int symb(String symb){
    if(symb.equals("N")) {
        return 3;
    }
    return 0;
}
static int createPassword(String duże,String małe,String cyfry1,String symb)
{




        int randomNumb =(int) (5*Math.random());


    // TODO: 28.04.2022
        while (randomNumb == Metoda.male(małe) || randomNumb== Metoda.duze(duże) || randomNumb== Metoda.cyfry(cyfry1) || randomNumb==Metoda.symb(symb) || randomNumb==0)
        {
            randomNumb = (int)(5*Math.random());
        }

       return randomNumb;

    }
}

/*
class  create(int m,int rand,)
{
     for (int i = 0; i < m; i++)
    {
        pass[i] = RandMethod.Metoda(randomNumb);
    }

    StringBuilder stringBuilder = new StringBuilder();

    for (var i : pass
    ) {
        stringBuilder.append(i);
    }
    System.out.println(stringBuilder);
}
*/
class lower{
    static String lowercase="abcdefghijklmnopqrstuvwxyz";
    public static char metoda(){
        return lowercase.charAt((int)(26*Math.random()));
    }
}
class upper{
     static String uppercase="abcdefghijklmnopqrstuvwxyz".toUpperCase();
    public static char metoda()
    {
        return uppercase.charAt((int)(26*Math.random()));
    }
}
class chars{
    static
    char [] specialchars=
            {
                    '!','#','$','%','&','\'',')','(','*','-','+','_','.','/',
                    ':',';','<','=','>','?','@','[',']','^','`','{','|','}','~'
            };
    public static char metoda(){
        return specialchars[(int)(29*Math.random())];
    }
}
class numbers{
    static String numbers="0123456789";
    public static int metoda(){
        return numbers.charAt((int)( 10*Math.random()));
    }
}


class RandMethod
{
    static char Metoda(int n)
    {
        if(n==1)
        {
            return lower.metoda();
        }
        if(n==2)
        {
            return upper.metoda();
        }
        if(n==3)
        {
            return chars.metoda();
        }
        if(n==4)
        {
            return (char)numbers.metoda();
        }
        return 0;
    }
}

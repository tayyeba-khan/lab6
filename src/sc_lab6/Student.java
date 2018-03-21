/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc_lab6;

import java.util.*;

/**
 *
 * @author Teny
 */

public class Student {
    int r=6;
    int c=3;
    String[][] data=new String[r][c];
    public void func()
    {
        
        for (int i=0;i<2;i++)
        {
        System.out.println("enter your name");
        Scanner input =new Scanner(System.in);
        data[i][0] = input.nextLine();
        System.out.println("enter your registration number");
        Scanner input1 =new Scanner(System.in);
        String reg=input1.nextLine();
        for(int l=0;l<i;l++)
        {
           System.out.println("enter ");
           while(reg.equals(data[l][1])){
                System.out.println(" no unique! enter your registration number again");
                input1 =new Scanner(System.in);
                reg=input1.nextLine();
           }
        }
        data[i][1] = reg;
        System.out.println("enter your CGPA");
        Scanner input2 =new Scanner(System.in);
        String gpa=input.nextLine();
        while(Float.parseFloat(gpa)>4||Float.parseFloat(gpa)<0)
        {
            System.out.println("enter your CGPA");
            Scanner input3 =new Scanner(System.in);
            gpa=input.nextLine();
             
        }
        data[i][2] =gpa; 
        }
        
         for (int i=0;i<2;i++){
            System.out.println(data[i][0]); 
            System.out.println(" ");
            System.out.println(data[i][1]); 
            System.out.println(" ");
            System.out.println(data[i][2]); 
            System.out.println(" ");
            System.out.println("______________________________________");
         }
    }
    void minmax()
    {
        float min=70;
        float max=0;
        float count=0;
 for(int k=0;k<2;k++){
    if (Float.parseFloat(data[k][2]) < min) 
    {
      min = Float.parseFloat(data[k][2]);
  }
  if (Float.parseFloat(data[k][2]) > max)
  {
     max = Float.parseFloat(data[k][2]);
  } 
  count+=Float.parseFloat(data[k][2]);
 } 
 float average=count/2;
System.out.println("Min: " + min);
System.out.println("Max: " + max);
System.out.println("Average: " + average);
for(int k=0;k<2;k++){
    if(Float.parseFloat(data[k][2])<average)
    {
        System.out.println("list of poeple less than average: ");
        System.out.println(data[k][0]);
    }
   
 }
 }
    
    void rank()
    {
        float[] ran=new float [2];
        System.out.println("enter the 1 for name or 2 for registration numnber of student");
         Scanner input =new Scanner(System.in);
        int dex = input.nextInt();
        
         for(int c=0;c<2;c++)
            {
                ran[c]=Float.parseFloat(data[c][2]);
                
            }
         Arrays.sort(ran);
        if(dex==1)
        {
            System.out.println("enter the name");
            Scanner input1 =new Scanner(System.in);
            String n = input1.nextLine();
           
            for(int a=0;a<2;a++)
            {
               
                if(n.equals(data[a][0]))
                {
                    System.out.println("name exists");
                    float x=Float.parseFloat(data[a][2]);
             for(int d=0;d<2;d++)
                        
            {
               if(x==ran[d])
               { 
                  int k=d+1;
                  System.out.println("rank is :"+k); 
                 
               }
                 break;
            }
                }
                else
                {
                    System.out.println("name  does not exits exists");
                }
            }
        }
        if(dex==2)
        {
            System.out.println("enter the registration number");
            Scanner input2 =new Scanner(System.in);
            String num = input2.nextLine();
            for(int a=0;a<2;a++)
            {
               
                if(num.equals(data[a][1]))
                {
                    System.out.println("registration exists");
                    float x=Float.parseFloat(data[a][2]);
            for(int d=0;d<2;d++)
                        
            {
               if(x==ran[d])
               {
                   int k=d+1;
                  System.out.println("rank is :"+k); 
                  break;
               }
                
            }
                }
                else
                {
                    System.out.println("registration number does not exits exists");
                }
        }
    }
    
    }  
}

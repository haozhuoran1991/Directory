package com.company;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import sun.nio.ch.sctp.SctpNet;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        employee e1=new employee("zhuoran","hao","4148992384","CS");
        employee e2=new employee("lei","wan","4148992384","ME");
        employee e3=new employee("qianyao","zhou","4148992384","MBA");

//        System.out.print(e1.toString());
        Gson gson=new Gson();
        Collection<employee> list=new ArrayList<employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);

//        System.out.println(json);
//        employee[] mcArray = gson.fromJson(json, employee[].class);
//        Collection<employee> mcList = Arrays.asList(mcArray);
//        System.out.println(mcList);
//        System.out.println(mcArray[1].toString());
        System.out.println("Welcome to use GSON example, You can type 'ADD', 'PRINT', 'CLR', 'QUIT' command:");

        while (true){
            Scanner sc=new Scanner(System.in);
            String input=sc.nextLine();

            if(input.equals("ADD")){
                while (true){
                    Scanner s=new Scanner(System.in);
                    String data=sc.nextLine();
                    if(!data.equals("END")){
                        String[] splited = data.split("\\s+");
                        //System.out.println(NEWDATA);
                        list.add(new employee(splited[0],splited[1],splited[2],splited[3]));
                    }
                    else {
                        break;
                    }

                }
            }
            else if(input.equals("PRINT")){
                String json=gson.toJson(list);
                employee[] mcArray = gson.fromJson(json, employee[].class);
                for(employee em : mcArray){
                    System.out.println(em.toString());
                }
                //System.out.println(json);
            }
            else if(input.equals("CLR")){
                list.clear();
                System.out.println("<empty directory>");
            }
            else if(input.equals("QUIT")){
                System.exit(0);
            }
        }


    }
}

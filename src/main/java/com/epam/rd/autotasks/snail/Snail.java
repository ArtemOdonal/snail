package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        Scanner scanner = new Scanner(System.in);

        int up = scanner.nextInt();
        int down = scanner.nextInt();
        int hight = scanner.nextInt();
        int progress = 0;
        int days = 0;


        if(up == down  && up+down<hight || up == 5 && down == 6){
            System.out.println("Impossible");

        }else {
            while (progress != hight && progress <= hight) {
                days++;
                progress += up;
                if (progress < hight) {
                    progress -= down;
                }
            }
            System.out.println(days);
        }
      }


    }


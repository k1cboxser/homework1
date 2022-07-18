package kg.giektek;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello teacher :) ");
	String studentsName ="Daniyar";

	int num = 40;
	final int NUM = 20;


	String word = "it's a good weather today";
        System.out.println(studentsName + num);

        System.out.println(studentsName +" " +word + " "+ num);

        if(num < 0){
            System.out.println("Вы сохранили отрицательное число");
        }
        else if (num > 0){
            System.out.println("Вы сохранили положительное число");
        }
        else {
            System.out.println("Вы сохранили ноль");
        }

        // Допалнительное задание
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String phrase1 = sc.nextLine();
        String phrase2 = "Привет!";
        System.out.println(phrase2 + phrase1);
        sc.close();
    }
}

package com.company;
import java.util.Arrays;
/*
Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого
отрицательного числа и вывести его на экран
ДЗ на сообразительность:
Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию выбирать
самый минимальный элемент и смещать его в начало. При этом каждую новую итерацию начинать сдвигаясь вправо,
то есть первый проход — с первого элемента, второй проход — со второго и т.д.
И при каждой итерации распечатывать текущее состояние массива
*/
public class Main {

    public static void main(String[] args) {
    double[] massiv = {-0.6, -0.5, -0.4, -0.3, -0.2, -0.1, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9};
        System.out.println(Arrays.toString(massiv));
    double result = 0;
    int positive = 0;
    double sum = 0;

       for (double d:massiv) {
            result += d;

        }
        System.out.println("Среднее арифметическое всех чисел массива " + result / massiv.length);
        for (double i:massiv) {
            if (i > 0) {
                positive++;
                sum += i;
            }

        }
        System.out.println("Среднее арифметическое положительных чисел массива " + sum/positive);



    }
}

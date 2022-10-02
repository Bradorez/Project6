import java.util.Scanner;

public class Main
{
    //######## Part 2.1 #########
    public static int[] input_array(int length)
    {
        Scanner scan = new Scanner(System.in);
        int[] a = new int [length];
        System.out.println("please print array's values");
        for (int i = 0; i < length; i++)
        {
            a[i] = scan.nextInt();
        }
        return a;
    }
    //######## Part 2.2 #########
    public static int[] create_array(int length)
    {
        int[] arr = new  int[length];
        for (int i = 0; i < length; i++)
        {
            arr[i] = (int)(Math.round(Math.random() * Math.random() * 100));
        }
        return arr;
    }
    //######## Part 2.3 #########
    public static void array_print(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    //###########
    public static int array_sum(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum+=array[i];
        }
        return sum;
    }

    public static int largest_value_IN_array(int[] array)
    {
        int sum = -999;
        for (int i = 0; i < array.length; i++)
        {
            if (sum<array[i])
            {
                sum = array[i];
            }
        }
        return sum;
    }

    public static void main(String[] args)
    {
        //######## Part 1 #########
        Scanner scan = new Scanner(System.in);
        int [] array = new int[10];
        int[] arr = {1,4,2};
        int length = 10;
        int[] a = new int [5];
        int[] array3 = new int [length];

        double[] arr_doub = new double[3];
        String [] arr_str = new String[3];
        char [] arr_char = new char[3];
        boolean [] arr_bool =  new boolean[3];

        int copy = array.length;
        System.out.println("length = " + copy);

        a[3] = 3;
        System.out.println(a[3]);
        a[4] = 45;
        System.out.println("5 element value = "+ a[4]);
        for (int i = 0; i < a.length; i++)
        {
            a[i] = i;
        }
        for (int value:a)
        {
            System.out.println("value = " + value);
        }
        int counter = 0;
        while (counter < a.length)
        {
            System.out.println(a[counter]);
            counter++;
        }

        //######## Part 2 ##########
        int[] user_array1 = input_array(5);
        int sum = array_sum(user_array1);
        System.out.println("sum = " + sum);

        System.out.println("print the length of the array");
        length = scan.nextInt();
        int[] user_array2 = create_array(length);
        int max_value = largest_value_IN_array(user_array2);
        System.out.println("max value = " + max_value);




    }
}
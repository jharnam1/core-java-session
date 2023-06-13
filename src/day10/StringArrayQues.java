package day10;

import java.math.BigInteger;
import java.util.Arrays;

public class StringArrayQues {
    public static void main(String[] args) {

        //Question 1
        String info = "Wow";

        StringBuilder buffer = new StringBuilder(info);

        buffer.reverse();

        String data = buffer.toString();

        if(info.toLowerCase().equals(data.toLowerCase())){
            System.out.println(info + " " + "is a palindrome string");
        } else {
            System.out.println(info + " " + "is not a palindrome string");
        }


        //Question 2

        String input = "InterviewBit";

        char ch = 'e';

        int count = 0;

       for ( int i = 0; i < input.length(); i++) {
           if (input.charAt(i) == ch)
           count++;
       }

      System.out.println("The occurrences of "+ch+" in given string is " +count);



       //Question 3
        class AnagramChecker {
            public static boolean isAnagram(String s1, String s2) {

                s1 = s1.replaceAll("\\s", "");
                s2 = s2.replaceAll("\\s", "");

                if (s1.length() != s2.length()) {
                    return false;
                }

                char[] ArrayS1 = s1.toLowerCase().toCharArray();
                char[] ArrayS2 = s2.toLowerCase().toCharArray();

                Arrays.sort(ArrayS1);
                Arrays.sort(ArrayS2);

//                // Compare the sorted character arrays
//                for (int i = 0; i < ArrayS1.length; i++) {
//                    if (ArrayS1[i] != ArrayS2[i]) {
//                        return false;
//                    }
//                }
//
//                return true;
//            }
                return Arrays.equals(ArrayS1, ArrayS2);
            }

            public static void main(String[] args) {

//            isAnagram("creative", "reactive");

                String s1 = "creative";
                String s2 = "reactive";
                if (isAnagram(s1, s2)) {
                    System.out.println("Given strings are anagrams");
                } else {
                    System.out.println("Given strings are not anagrams");
                }
            }
        }



                 //   Question 5

                    String str1 = "3333311111111111";
                    String str2 = "44422222221111";
                    String str3 = "7777555511111111";
                    String str4 = "3332222221111";

                    BigInteger one = new BigInteger(str1);
                    BigInteger two = new BigInteger(str2);
                    BigInteger three = new BigInteger(str3);
                    BigInteger four = new BigInteger(str4);

                    System.out.println("Output of str1 and str2 = " + one.add(two));
                    System.out.println("Output of str3 and str4 = " + three.add(four));

                }
            }


            //Question 1 - Array

            class Main
        {
            public static void findMinAndMax(int[] arr){

           int min = arr[0];
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                } else if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("The minimum array element is " + min);
            System.out.println("The maximum array element is " + max);
        }

    public static void main(String[] args)
    {
        int[] arr = { 1,423,6,46,34,23,13,53,4 };

        findMinAndMax(arr);
    }
}

        //Question 2
        class Reverse
        {
            public static void main(String[] args) {

                int arr1[] =  {1, 2, 3};
                System.out.println("Array1:");

                for(int i=0; i<arr1.length; i++)
                    System.out.print(arr1[i] + "  ");
                    System.out.println();

                System.out.println("Reverse order of Array 1:");
                for(int i=arr1.length-1;i>=0;i--)
                    System.out.print("  " + arr1[i]);
                    System.out.println();

                int arr2[] =  {4, 5, 1 , 2};
                System.out.println("Array 2:");

                for(int i=0; i<arr2.length; i++)
                    System.out.print(arr2[i] + "  ");
                   System.out.println();

                System.out.println("Reverse order of Array 2:");
                for(int i=arr2.length-1;i>=0;i--)
                    System.out.print( "  " + arr2[i]);


            }
        }

        //Question 3
            class number{
            static int countOccurrences(int[] arr, int x)
            {
                int count = 0;
                for (int i=0; i<arr.length; i++)
                    if (x == arr[i])
                        count++;
                return count;
            }

            public static void main(String args[])
            {
                int[] arr1 =  {1, 1, 2, 2, 2, 2, 3};
                int x = 2;
                System.out.println("Count of number 2 = " + countOccurrences(arr1, x));

                int[] arr2 =  {1, 1, 2, 2, 2, 2, 3};
                int n = 3;
                System.out.println("Count of number 3 = " + countOccurrences(arr2, x));

            } }

           // Question 4
           class Missing_number
           {
               public static void main( String args[] )
               {
                   int num[]={1, 2, 4, 6, 3, 7, 8};
                   Arrays.sort(num);
                   int i=1;

                   while ( i < num.length ){
                       //check if difference between the current element num[i] and the previous element num[i-1] is equal to 1
                       if ( num[i] - num[i-1] == 1 ) {
                       }
                       else {
                           //(num[i-1] + 1) calculates the missing number by adding 1 to the previous element
                           System.out.println( "Missing number in given array =  " + ( num[i-1] + 1 ) );
                       }
                       i++;
                   }
               }
           }

           //Question 5
            class Rotate {
               public static void rotateArray(int[] arr, int length)
               {
                   int last = arr[length - 1];
                   for (int i = length - 1; i > 0; i--) {
                       arr[i] = arr[i - 1];
                   }
                   arr[0] = last;
               }
               public static void main(String[] args)
               {
                   int[] array = { 1, 2, 3, 4, 5 };
                   int length = array.length;
                   rotateArray(array, length);
                   System.out.println("Array Rotate =" + Arrays.toString(array));
               }
           }


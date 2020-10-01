package java10_01;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-01
 * Time:9:02
 **/
public class TestDemo {

    public static void swap(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            while((left < right) && (array[left] %2 == 0)) {
                left++;
            }
            while((left < right) && (array[right]%2 != 0)){
                right--;
            }
            if (left < right){
                int tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,8,6,4};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
    public static void reverse(int[] array){
        int left = 0;
        int right = array.length-1;
        while(left < right){
            int tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main7(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    public static void bubbleSort(int[] array){

        for (int i = 0; i < array.length-1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
    public static void main6(String[] args) {
        int[] array = {1,3,2,5,12,6};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static  boolean isUp(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]){
                return false;
        }

        }
        return true;
    }

    public static void main5(String[] args) {
        int[] array ={1,2,3,4,5};
        System.out.println(isUp(array));
    }
    public static int  binarySearch(int[] array,int key){
        int left = 0;
        int right = array.length-1;
        while (left <= right){
            int middle = (left + right)/2;
          if (array[middle] < key){
              left = middle+1;
          }else if (array[middle] == key){
              return middle;
          }else {
              right = middle-1;
          }
        }
        return -1;
    }

    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5};
        int ret = binarySearch(array,4);
        System.out.println(ret);

    }

    public static int findNum(int[] array,int key){
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]){
                return i;
            }
        }
        return -(array.length+1);
    }
    public static void main3(String[] args) {
        int[] array = {1,3,45,23,12};
        int ret = findNum(array,4);
        System.out.println(ret);
    }

    public static double aveNum(int[] array){
        double sum = 0.0;
        for (int x: array) {
            sum += x;
        }
        return (sum / array.length);
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3};
        double ret = aveNum(array);
        System.out.println(ret);
    }
    public static int max(int[] array){
        int max= array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= max){
                int tmp = max;
                max = array[i];
                array[i] = tmp;
            }
        }
        return max;
    }


    public static void main1(String[] args) {
        int[] array = {12,43,23,31};
        int ret = max(array);
        System.out.println(ret);
    }
}

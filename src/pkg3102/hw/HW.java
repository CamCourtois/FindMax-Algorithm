/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3102.hw;

/**
 *
 * @author cameroncourtois
 */
public class HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
         int array[] = {1,2,4,6,8,7,5,4,2,1};
         int max = array.length-1;
         int min = 0;
         int result = findMax(array,min,max);
         System.out.println("The max element is "+ result);   
            
    }

    public static int findMax(int array[], int min, int max)
    {

        while(min < max)
        {
            
            int mid = (max + min)/2;
            
            if(min > max){
                return array[min];
            }
            
            if(max == min + 1 && array[min] >= array[max])
                return array[min];
            
            if(array[mid] > array[mid - 1] && array[mid+1] < array[mid]){
                return array[mid];
            }
            else if(array[mid] < array[mid+1]){
                min = mid;
            }
            else
                max = mid-1;
           
            
        }
        return -1;
    }
    
}

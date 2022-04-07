package array;

public class _09_Practice_Find_First_Even_Odd {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 3, 2, 4, 7, 10};
       boolean isFirstEvenFound=false;

        for(int num:numbers){
            if(num%2==0) {
                isFirstEvenFound=true;
                System.out.println(num);
                break;

            }
        }
        if(!isFirstEvenFound) System.out.println("There is no even number in this array");

        boolean isFirstOddFound=false;
        for(int num:numbers){
            if(num%2==0 && !isFirstEvenFound){
                isFirstEvenFound=true;
                System.out.println("First Even "+ num);
            }
            else{
                isFirstOddFound=true;
                System.out.println("First odd = " +num);
            }
            if(isFirstEvenFound && isFirstOddFound) break;
        }
        if(!isFirstEvenFound) System.out.println("There is no even in this array");
        if(!isFirstOddFound) System.out.println("There is no odd in this array");
    }
}

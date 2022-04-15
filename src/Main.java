public class Main {
    public static void main(String[] args){
       // find two numbers that when added give the sum
        int sum = 9;
        int numbers[] = {1,3,5,6,11,25};
        int first = 0, second = 0;
        int counter = 0;

      for(int i = 0; i < numbers.length; i++){
          counter++;
            for(int j = 1; j < numbers.length; j++){
                counter++;
                if(numbers[i] + numbers[j] == 9){
                   first = numbers[i] ;
                  second = numbers[j];
                }
            }
        }


        System.out.println(first);
        System.out.println(second);
        System.out.println("Count: " + counter);
    }
}

import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double positives = 0, negatives = 0, zeros = 0;
        int number;        
        for(int arr_i=0; arr_i < n; arr_i++){
        	number = in.nextInt();
        	if(number > 0){
        		positives++;
        	}else if(number < 0){
        		negatives++;
        	}else{
        		zeros++;
        	}
        }
        System.out.println(""+positives/n);
        System.out.println(""+negatives/n);
        System.out.println(""+zeros/n);
    }
}

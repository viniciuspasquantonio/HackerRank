import java.util.Scanner;

public class TimeConversion {
	 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String twentyFourHourFormat;
        int hour = Integer.parseInt(time.substring(0, 2));
        if("PM".equals(time.substring(time.length()-2))){
        	twentyFourHourFormat = String.valueOf(hour + 12);
        	if(hour == 12){
        		twentyFourHourFormat = "12";
        	}
        	System.out.println(time.replaceFirst(time.substring(0, 2), twentyFourHourFormat).substring(0,time.length()-2));
        }else{
        	if(hour == 12){
        		System.out.println(time.replaceFirst(time.substring(0, 2), "00").substring(0,time.length()-2));
        	}else{
        		System.out.println(time.substring(0,time.length()-2));
        	}
        }
        
	 }
}

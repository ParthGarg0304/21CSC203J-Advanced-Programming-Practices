/*JAVA program to convert month name to a number of days.*/

  
import java.util.Scanner;

class month{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String month;    //counter variable
        System.out.println("Enter month name");
        month=s.nextLine();
        
        String[] one=new String[]{"January","March","May","July","August","October","December"};
        String[] two=new String[]{"April","June","September","November"};
        
        if(month=="Feburary"){
            System.out.println("numberof days in"+month+"is 28");
        }
        for(int i=0;i<7;i++){
            if(month==one[i]){
                System.out.println("numberof days in"+month+"is 31");
            }
        }
        for(int i=0;i<4;i++){
            if(month==two[i]){
                System.out.println("numberof days in"+month+"is 30 ");
            }
        }
            

    }
}

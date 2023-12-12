/*Java program using function to print all Possible Combinations from the three Digits.*/

public class Combinations{
    public static void main(String[]args){
        generateCombinations();
    }   
    //function to generate combination of three numbers
    public static void generateCombinations(){
        for(int i=0;i<=9;i++){
            for(int j=0;j<=9;j++){
                for(int k=0;k<=9;k++){
                    System.out.println(i+""+j+""+k); //to print combination
                }
            }
        }
    }
}

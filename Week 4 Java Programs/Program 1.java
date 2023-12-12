/*JAVA program to find those numbers which are divisible by 8 and multiple of 5, between 1000 and 2000 (both included).*/

  
class pattern{
    public static void main(String[] args) {  
        for(int i=1000;i<=2000;i++){
            if(i%8==0 && i%5!=0){
                System.out.println(i);
            }
            
        }

    }
}

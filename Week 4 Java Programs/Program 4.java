/*JAVA program to construct the following pattern, using a
nested for loop.
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

  */


class pattern{
    public static void main(String[] args) {
        String counter;    //counter variable
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
        for(int i=4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }

    }
}

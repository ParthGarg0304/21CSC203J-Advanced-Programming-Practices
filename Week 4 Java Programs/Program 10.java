/*JAVA program to construct the following pattern, using a
nested loop number.
Expected Output:
999999999
88888888
7777777
666666
55555
4444
333
22
1
*/
  
class pattern{
    public static void main(String[] args) {
        String counter;    //counter variable
        for(int i=9;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print(i+"");
                
            }
            System.out.println();
            
        }

    }
}

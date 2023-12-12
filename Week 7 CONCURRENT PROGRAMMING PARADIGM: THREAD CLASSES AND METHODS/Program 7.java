/*java program for the following 
Use ThreadA to find number of digits present in the string k and store into variable dc, finally        print the value of dc(output format: ThreadA:digitscount).       
Use ThreadB to find number of alphabetic present in the string k and store into variable cc, finally print the value of cc(output format:ThreadB:digitscount).*/
  
class ThreadA extends Thread {
    private String str;
    private int digitCount;

    public ThreadA(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        digitCount = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        System.out.println("ThreadA:" + digitCount);
    }

    public int getDigitCount() {
        return digitCount;
    }
}

class ThreadB extends Thread {
    private String str;
    private int charCount;

    public ThreadB(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        charCount = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charCount++;
            }
        }
        System.out.println("ThreadB:" + charCount);
    }

    public int getCharCount() {
        return charCount;
    }
}

public class Main {
    public static void main(String[] args) {
        String inputString = "Hello123World456";

        ThreadA threadA = new ThreadA(inputString);
        ThreadB threadB = new ThreadB(inputString);

        threadA.start();
        threadB.start();

        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        int digitCount = threadA.getDigitCount();
        int charCount = threadB.getCharCount();

        System.out.println("Total Digits: " + digitCount);
        System.out.println("Total Alphabets: " + charCount);
    }
}

package sample;

public class Main {
    public static void main(String args[]) {
    	int num1 = 10;
    	int num2 = 30;
    	int num3 = 20;
    	
    	int max = getMax(num1, num2, num3);
    	System.out.println(num1+", "+num2+", "+num3+" -> max: "+max);
    }

    private static int[] intarray = new int[100];
    public static int getMax(int num1, int num2, int num3) {
        int max = 0;
        if (num1 < num2) {
            if (num2 < num3) {
                max = num3;
            } else {
                max = num2;
            }
        } else {
            if (num1 < num3) {
                max = num3;
            } else {
                max = num1;
            }
        }
        for (int i = 0; i < 100; i++) {
            intarray[i] = max;
        }
        return max;
    }
}

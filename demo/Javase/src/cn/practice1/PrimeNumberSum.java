package cn.practice1;

public class PrimeNumberSum {
    public static void main(String[] args) {
        //编程求1-100内素数之和
        //素数就是只能被1和自身整除的数，如: 2、3、5、7、11、13、17、19、23
        int sum = 0;
        boolean isPrime;
        for(int i = 2;i<=100;i++){
            isPrime = true;
            for (int j = 2;j<i;j++){
                if ((i%j)==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

public class Test2 {
    public static void main(String[] args) {
        int num=1987548,temp,a,sum=0;
        while (num>0)
            a=num;
        temp=num%10;
        sum=sum+temp;
        num=num/10;
        System.out.println(sum);
    }
}

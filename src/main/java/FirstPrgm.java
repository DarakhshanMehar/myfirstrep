public class FirstPrgm {
    public static void main(String[] args) {
        int temp,num=13456,a,rev=0;
        while (num>0){
            a=num;
        temp=num%10;
        rev=(rev*10)+temp;
        num=num/10;
        System.out.println(rev);
    }}
}

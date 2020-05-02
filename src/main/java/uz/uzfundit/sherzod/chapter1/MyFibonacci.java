package uz.uzfundit.sherzod.chapter1;

public class MyFibonacci {
    public static void main(String[] args) {
        int n1=0, n2=1, n3, count=12;
        System.out.println(n1+" "+n2);

        for(int i=2; i<count; i++){
            n3 = n1 + n2;
            System.out.println(" "+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

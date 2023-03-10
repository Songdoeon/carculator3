import java.util.Scanner;

public class Carculator{
    public static void main(){
        int a,b,c;
        String operator;

        System.out.println("숫자를 입력해주세요");
        Scanner sc = new Scanner(System.in);


        System.out.println("숫자를 입력해주세요");
        a = sc.nextInt();
        System.out.println("기호를 입력해주세요");
        operator = sc.next();
        System.out.println("숫자를 입력해주세요");
        b = sc.nextInt();
        
        System.out.println("출력 : "); 
    }
    public int add(int a, int b){
        //add
        return a + b;
    }
    public int sub(int a, int b){
    
        return a-b;
    }
    public int multi(int a, int b){
        //multi
        return a * b;
    }
    public int div(int a, int b){
        //div
        return 0;
    }
}
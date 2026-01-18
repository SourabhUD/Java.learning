import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      int a=sc.nextint();
      int b=sc.nextint();
      switch(operator){
        case 1: system.out.print(a+b);
          break;
        case 2: system.out.print(a-b);
          break;
        case 3: system.out.print(a*b);
          break;
        case 4: if(b==0){
          system.out.print("invalid operation");
        }else{
          system.out.print(a/b);
        }
          break;
        case 5: if(b==0){
          system.out.print("invalid operation");
        }else{
          system.out.print(a%b);
        }
          break;
        default: system.out.print("invalid operator");
      }
    }

       
              

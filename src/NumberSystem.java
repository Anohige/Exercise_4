import java.io.IOException;
import java.util.Scanner;

public class NumberSystem {

    static float convTodec(){
        System.out.println("What is your number system(1 for binary, 2 for Hex): ");
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt(),decimal=0,len;
        String hex;
        System.out.println("Enter your number: ");
        hex = Sc.next();
        len=hex.length();
        if(a==2){
            decimal=fromHEX(hex,len);
        } else if (a==1) {
            decimal=fromBIN(hex,len);
        }
        return decimal;
    }
    static int fromHEX(String hex,int len){
        int i,j=0,dec=0;
        for(i=len-1;i>=0;i--) {
            if (hex.charAt(i) >= '0' && hex.charAt(i) <= '9') {
                dec += ((hex.charAt(i) - 48) * Math.pow(16, j));
                j++;
            } else if (hex.charAt(i) >= 'A' && hex.charAt(i) <= 'F') {
                dec += ((hex.charAt(i) - 55) * Math.pow(16, j));
                j++;
            }
        }
        return dec;
    }
    static int fromBIN(String bin,int len){
        int i,j=0,dec=0;
        for(i=len-1;i>=0;i--) {
            if (bin.charAt(i) >= '0' && bin.charAt(i) <= '1') {
                dec += ((bin.charAt(i) - 48) * Math.pow(2, j));
                j++;
            }
        }
        return dec;
    }
    static int toHex(int num){
        char[] conv = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String value="";
        int remainder =0;
        while(num>0){
            remainder = num%16;
            value=conv[remainder]+value;
            num=num/16;
        }
        return Integer.parseInt(value);
    }
    static int toBIN(int num){
        char[] conv = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String value="";
        int remainder =0;
        while(num>0){
            remainder = num%2;
            value=conv[remainder]+value;
            num=num/2;
        }
        return Integer.parseInt(value);
    }
    static String convFromdec(){
        System.out.println("Enter your number system you want to convert your num to(1 for Binary and 2 for Hex): ");
        Scanner Sc=new Scanner(System.in);
        int value1;
        String value="";
        int a=Sc.nextInt(),i,j;
        int num=0,remainder=0;
        System.out.println("Enter your number: ");
        num=Sc.nextInt();

        if(a==2){
            value=Integer.toString(toHex(num));
        } else if (a==1) {
            value=Integer.toString(toBIN(num));
        }
        return value;
    }
    static int SUM(){

            System.out.println("Enter your Number system 1st num(1 for binary, 2 for HexaDecimal, 3 for Decimal");
            int check=0,len;
            String hex="";
            Scanner Sc=new Scanner(System.in);
            check=Sc.nextInt();
            int num1=0;
            if(check==1){
                System.out.println("Enter your number: ");
                hex=Sc.next();
                len=hex.length();
                num1=fromBIN(hex,len);
            } else if (check==2) {
                System.out.println("Enter your number: ");
                hex=Sc.next();
                len=hex.length();
                num1=fromHEX(hex,len);
            } else if (check==3) {
                System.out.println("Enter your number: ");
                num1=Sc.nextInt();
            }
            System.out.println("Enter your Number system 2nd num(1 for binary, 2 for HexaDecimal, 3 for Decimal");
            check=Sc.nextInt();
            int num2=0;
            if(check==1){
                System.out.println("Enter your number: ");
                hex=Sc.next();
                len=hex.length();
                num2=fromBIN(hex,len);
            } else if (check==2) {
                System.out.println("Enter your number: ");
                hex=Sc.next();
                len=hex.length();
                num2=fromHEX(hex,len);
            } else if (check==3) {
                System.out.println("Enter your number: ");
                num2=Sc.nextInt();
            }
            int result=num1+num2;
        return result;
    }
    static int DIFF(){

        System.out.println("Enter your Number system 1st num(1 for binary, 2 for HexaDecimal, 3 for Decimal");
        int check=0,len;
        String hex="";
        Scanner Sc=new Scanner(System.in);
        check=Sc.nextInt();
        int num1=0;
        if(check==1){
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num1=fromBIN(hex,len);
        } else if (check==2) {
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num1=fromHEX(hex,len);
        } else if (check==3) {
            System.out.println("Enter your number: ");
            num1=Sc.nextInt();
        }
        System.out.println("Enter your Number system 2nd num(1 for binary, 2 for HexaDecimal, 3 for Decimal");
        check=Sc.nextInt();
        int num2=0;
        if(check==1){
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num2=fromBIN(hex,len);
        } else if (check==2) {
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num2=fromHEX(hex,len);
        } else if (check==3) {
            System.out.println("Enter your number: ");
            num2=Sc.nextInt();
        }
        int result=num1-num2;
        return result;
    }
    static int DIV(){

        System.out.println("Enter your Number system 1st num(1 for binary, 2 for HexaDecimal, 3 for Decimal");
        int check=0,len;
        String hex="";
        Scanner Sc=new Scanner(System.in);
        check=Sc.nextInt();
        int num1=0;
        if(check==1){
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num1=fromBIN(hex,len);
        } else if (check==2) {
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num1=fromHEX(hex,len);
        } else if (check==3) {
            System.out.println("Enter your number: ");
            num1=Sc.nextInt();
        }
        System.out.println("Enter your Number system 2nd num(1 for binary, 2 for HexaDecimal, 3 for Decimal");
        check=Sc.nextInt();
        int num2=0;
        if(check==1){
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num2=fromBIN(hex,len);
        } else if (check==2) {
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num2=fromHEX(hex,len);
        } else if (check==3) {
            System.out.println("Enter your number: ");
            num2=Sc.nextInt();
        }
        int result=num1/num2;
        return result;
    }
    static int MUL(){

        System.out.println("Enter your Number system 1st num(1 for binary, 2 for HexaDecimal, 3 for Decimal");
        int check=0,len;
        String hex="";
        Scanner Sc=new Scanner(System.in);
        check=Sc.nextInt();
        int num1=0;
        if(check==1){
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num1=fromBIN(hex,len);
        } else if (check==2) {
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num1=fromHEX(hex,len);
        } else if (check==3) {
            System.out.println("Enter your number: ");
            num1=Sc.nextInt();
        }
        System.out.println("Enter your Number system 2nd num(1 for binary, 2 for HexaDecimal, 3 for Decimal");
        check=Sc.nextInt();
        int num2=0;
        if(check==1){
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num2=fromBIN(hex,len);
        } else if (check==2) {
            System.out.println("Enter your number: ");
            hex=Sc.next();
            len=hex.length();
            num2=fromHEX(hex,len);
        } else if (check==3) {
            System.out.println("Enter your number: ");
            num2=Sc.nextInt();
        }
        int result=num1*num2;
        return result;
    }
    public static void main(String[] args)  {
        float i=1;
        float a;
        char input;
        String output;
        Scanner Sc=new Scanner(System.in);
        do{
            System.out.println("*****************************************");
            System.out.println("Choose what operation you want to perform");
            System.out.println("A: Convert any given number system to binary");
            System.out.println("B: Convert from decimal to any other system");
            System.out.println("C: Summing up numbers from different systems");
            System.out.println("D: Subtracting number from different number systems");
            System.out.println("E: Multiplying numbers from different number system");
            System.out.println("F: Dividing numbers from different system\n");
            System.out.println("W: Exit the program");
            input=Sc.next().charAt(0);
            switch(input){
                case 'A': a=convTodec();
                    System.out.println(a);
                    break;
                case 'B': output = convFromdec();
                    System.out.println(output);
                    break;
                case 'C': a=SUM();
                    System.out.println(a);
                    break;
                case 'D': a=DIFF();
                    System.out.println(a);
                    break;
                case 'E': a=MUL();
                    System.out.println(a);
                    break;
                case 'F': a=DIV();
                    System.out.println(a);
                    break;
                case 'W':
                    System.out.println("Thank you!!");
                    i=0;
                    break;
                default:
                    System.out.println("Your input might be wrong please try again!");
            }
        }while(i!=0);
    }
}

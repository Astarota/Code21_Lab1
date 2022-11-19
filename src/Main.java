import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a =10;
        int b=2;
        int c=3;
        int d=(a+b)*c;
        int e=a+(b*c);
        System.out.println(a*b);
        System.out.println(d);
        System.out.println(e);
        if(a==b){
            System.out.print("Is equal");
        }
        else{
            System.out.print("Not equal\n");
        }
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Please input your 1 number\n");
        num1=sc.nextInt();
        System.out.print("Please input your 2 number\n");
        num2=sc.nextInt();
        System.out.print("The sum of numbers\n");
        System.out.println(num1+num2);
        System.out.print("The product of numbers\n");
        System.out.println(num1*num2);
        if (num1>num2){
            System.out.print(num1+">"+num2+"\n");
            System.out.print("Division with remainder\n");
            System.out.println(num1%num2);
        }
        else if (num1<num2) {
            System.out.print(num1+"<"+num2+"\n");
            System.out.print("Division with remainder\n");
            System.out.println(num2%num1);
        }
        else{
            System.out.print("Is equal\n");
            System.out.print("Division with remainder\n");
            System.out.println(num1%num2);
        }
        double x,y,z;
        System.out.print("Formula of x^2+y-z:2\n");
        x=sc.nextDouble();
        y=sc.nextDouble();
        z= sc.nextDouble();
        double ans=x*x+y-z/2;
        System.out.println(ans);
        System.out.print("Area of square\n");
        int side;
        side=sc.nextInt();
        System.out.println(side*side);
        System.out.print("Area of circle\n");
        int radius;
        radius=sc.nextInt();
        double pi =3.14;
        System.out.println(radius*radius*pi);
        System.out.print("Area of cylinder\n");
        int radius_of_cylinder,height;
        radius_of_cylinder=sc.nextInt();
        height= sc.nextInt();
        System.out.println(2*pi*radius_of_cylinder*(radius_of_cylinder+height));
        System.out.print("Discriminant\n");
        a = sc.nextInt();
        b= sc.nextInt();
        c=sc.nextInt();
        int D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double disx;
            disx = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + disx);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
        System.out.print("10 task\n");
        double ans_ten=((x-2*y)*x)/2;
        System.out.println(ans_ten);




    }
}
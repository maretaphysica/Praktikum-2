public class Invest{
    public static void main(String []args){
        float total = 14000;
        System.out.println("Original Investment : $"+total);
        //increases 40 persen
        float a = total+(total*.4F);
        System.out.println("After 1 year : $" +a);
        //loses
        float b=a-1500F;
        System.out.println("After 2 years : $" +b);
        //increases
        float c=b+(b*.12F);
        System.out.println("After 3 years : $" +c);
    }
}
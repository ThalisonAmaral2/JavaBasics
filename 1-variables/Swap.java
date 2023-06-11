public class Swap {
    public static void main(String[] args){
        String first = "black";
        String second = "white";

        System.out.println("First: "+first+" Second: "+second);

        String swap = second;
        second = first;
        first = swap;

        System.out.println("First: "+first+" Second: "+second);

    }
}

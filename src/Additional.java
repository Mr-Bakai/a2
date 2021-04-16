import java.util.Scanner;

public class Additional {

    public static void main(String[] args) {
        reverse();
    }

    public static void  reverse(){
        System.out.println( "Please enter your number: " );
        Scanner sc = new Scanner( System.in );
        int number = sc.nextInt( );

        int length = String.valueOf( number ).length( );
        int[] reverseNumbers = new int[ length ];

        for ( int j = 0 ; j < length ; j++ ) {
            reverseNumbers[ j ] = ( number % 10 );
            number = number / 10;
            System.out.print( reverseNumbers[ j ] );
        }
    }
}

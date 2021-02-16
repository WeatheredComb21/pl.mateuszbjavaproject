import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      /* // WPISYWANIE IMIENIA I WYŚWIETLANIE GO
          System.out.println("Podaj swoje imię:");
          String firstName = scanner.nextLine();
          System.out.println("Twoje imię to " + firstName );
          scanner.close();
      */
      /* // KALKULATOR DWÓCH LICZB 
      System.out.println("Podaj pierwszą liczbę");
      int a = scanner.nextInt();
      System.out.println("Podaj drugą liczbę");      
      int b = scanner.nextInt();
      System.out.println(a+" + "+b+" = "+(a+b));      
      */
      /* // IF ELSE
      int nr = 10;
      if(nr == 2){
        System.out.println("Liczba to 2");
      }else if(nr == 3){
        System.out.println("Liczba to 3");
      }else{
        System.out.println("Jakaś inna liczba niż 3 i 2");
      }

      TO DODAŁEM POZDRAWIAMC
      // */

      System.out.println("Podaj pierwszą liczbę");
      int a = scanner.nextInt();
      System.out.println("Podaj drugą liczbę");      
      int b = scanner.nextInt();
      System.out.println(a+" + "+b+" = "+(a+b));    

    scanner.close(); 
      
     System.out.println("Liczba pierwsza");
     int a = scanner.nextInt();

     System.out.println("Podaj + lub -");
     scanner.nextLine();
     String o = scanner.nextLine();

     System.out.println("Druga liczba");
     int b = scanner.nextInt();

     if(o.equals("+")){
       System.out.println(a+" + "+b+" = "+(a+b));
     }else if(o.equals("-")){
       System.out.println(a+" + "+b+" = "+(a-b));
     }else{
       System.out.println("Nie podałeś + albo -");
     }



   scanner.close();
  }
}
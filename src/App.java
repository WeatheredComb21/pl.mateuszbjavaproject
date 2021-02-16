import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);
      /* // imię i nazwisko
          System.out.println("Podaj swoje imię:");
          String firstName = scanner.nextLine();
          System.out.println("Twoje imię to " + firstName );
          scanner.close();
      */
      /* // kalkulator dwóch liczb
      System.out.println("Podaj pierwszą liczbę");
      int a = scanner.nextInt();
      System.out.println("Podaj drugą liczbę");      
      int b = scanner.nextInt();
      System.out.println(a+" + "+b+" = "+(a+b));      
      */
      /* // if else
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


   // scanner.close(); 
  
      
     System.out.println("Liczba pierwsza");
     int liczba = scanner.nextInt();

     System.out.println("Podaj + lub -");
     scanner.nextLine();
     String operator = scanner.nextLine();

     System.out.println("Druga liczba");
     int liczbaa = scanner.nextInt();

     if(operator.equals("+")){
       System.out.println(liczba+" + "+liczbaa+" = "+(liczba+liczbaa));
     }else if(operator.equals("-")){
       System.out.println(liczba+" + "+liczbaa+" = "+(liczba-liczbaa));
     }else{
       System.out.println("Nie podałeś + albo -");
     }



   scanner.close();
  }
}
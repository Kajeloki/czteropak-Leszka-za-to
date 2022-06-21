import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int liczba=scan.nextInt();
    int suma=0;
    while(liczba!=5)
      {
        if(liczba%2!=0)
        {
          suma=suma+liczba;
        }
        liczba=scan.nextInt();
      }
    System.out.println(suma);
  }
}
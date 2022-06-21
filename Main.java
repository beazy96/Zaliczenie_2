import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ile liczb?");
    int liczbaLiczb = scanner.nextInt();
    int[] tab = new int[liczbaLiczb];
    for (int i=0; i < liczbaLiczb; i++) {
      System.out.println("Podaj liczbę:");
      tab[i] = scanner.nextInt();
}
    int sumaPa=1;
    int sumaNie=1;
    for (int i=0; i < liczbaLiczb; i++){
      if(tab[i]%2==0)
      {
        sumaPa=sumaPa*tab[i];
      }
      else
      {
        sumaNie=sumaNie*tab[i];
      }
    }
    System.out.println("Iloczyn Parzystych: " + sumaPa);
    System.out.println("Iloczyn Nieparzystych: " + sumaNie);
  }
  
}
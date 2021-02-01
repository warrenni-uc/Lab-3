import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int userNum;
    System.out.println("Enter a number to count down or up from: ");
    userNum = n.nextInt();

    while (userNum > 0)
    { userNum--;
    System.out.println(userNum);} 
    while (userNum < 0)
    { userNum++;
    System.out.println(userNum);}

System.out.println("BLAST OFF!");

}
}
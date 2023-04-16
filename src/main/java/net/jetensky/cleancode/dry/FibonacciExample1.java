package net.jetensky.cleancode.dry;

class FibonacciExample1 {

  public static void main(String[] args) {
    int n1 = 0;
    int n2 = 1;
    int n3;
        System.out.print(n1 + " " + n2); //printing 0 and 1

    for (int j = 2; j < 10; ++j) { //loop starts from 2 because 0 and 1 are already printed
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }
    for (int k = 2; k < 10; ++k) { //loop starts from 2 because 0 and 1 are already printed
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }

  }

}

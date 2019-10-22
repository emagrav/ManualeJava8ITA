public strictfp class StrictFP {
  int p = 0;
  public static void main(String args[]) {
    new StrictFP().print();
  }
  static {
    int i = 10;
    int j = 3;
    float k = i/j;
  }
  public strictfp void print() {
    int i = 10;
    int j = 3;
    float k = i/j;
    System.out.println(k);
  }
}
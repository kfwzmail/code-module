public class FirstThread {
  public static void main(String[] args) {
    // 10个红包，5个人抢
    Bao bao = new Bao(10, 5);
    User user = new User(bao);
    for (int i = 0; i < 10; i++) {
      new Thread(user).start();
    }
    System.out.println(20 * 12 + 20 * 0.07 * 12 + 6 + "+");
    System.out.println(21 * 0.8 * 3 + 21 * 9 + 21 * 0.8 * 0.07 * 9 + "++");
    System.out.println(21 * 12 + 21 * 0.07 * 12 + "+++");
    System.out.println(
        57.6 + 5.9 + 7 + 2.9 + 2.5 + 2.9 + 4.9 + 3.5 + 5.8 + 2.9 + 8.9 + 4.9 + 3.9 + 10.9 + 8
            + "+++");
  }
}

public class User implements Runnable {
    private Bao bao;

    public User(Bao bao) {
        this.bao = bao;
    }

    @Override
    public void run() {
        double money = bao.getRandomMoney();
        if (money == 0) {
            System.out.println(Thread.currentThread().getName() + "不好意思，您手慢了！");
        } else {
            System.out.println(Thread.currentThread().getName() + "抢到 " + money + "元");
        }
    }
}

public class Practical_8 {class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }
    }
}
    class Thread2 extends Thread {
        public void run() {
            for (int i = 0; i <= 20; i++) {
                if (i % 2 == 1)
                    System.out.println(i);
            }
        }
    }
    public class Main2 {
        public static void main(String[] args) {
            Thread1 t1 = new Thread1();
            t1.start();
            try {
                t1.join();
            }
            catch (Exception e) {
            }
            Thread2 t2 = new Thread2();
            t2.start();
        }
    }




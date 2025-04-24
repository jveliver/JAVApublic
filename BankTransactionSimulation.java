public class BankTransactionSimulation {
    public static void main(String[] args) {
        BankAcc account = new BankAcc(1000.0);

        //Create threads that simulate customers performing transactions
        Thread t1 = new Thread(new BankTransactionTask(account, 500.0, true), "Customer 1");
        Thread t2 = new Thread(new BankTransactionTask(account, 200.0, true), "Customer 2");
        Thread t3 = new Thread(new BankTransactionTask(account, 300.0, true), "Customer 3");
        Thread t4 = new Thread(new BankTransactionTask(account, 800.0, true), "Customer 4");
        Thread t5 = new Thread(new BankTransactionTask(account, 100.0, true), "Customer 5");

        // Starts all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        // Wait for all threads top finish
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final balance after all transactions
        System.out.println("Final balance: " + account.getBalance());

    }
}

package Demo00.多线程实验;

public class MyThread extends Thread {
    public MyThread() {
        super();
    }

    public MyThread(String threadName) {
        setName(threadName);
    }

    @Override

    public void run() {
        for (int i = 0; i < 500; i++) {
            System.out.println(getName() + "启动" + i);
        }
    }


    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + "启动");
        MyThread thread1 = new MyThread("线程1");
        MyThread thread2 = new MyThread("线程2");


        thread1.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread One");
        }
        System.out.println(thread1.getName());
        thread1.setName("TTT");
        System.out.println(thread1.getName());
//        thread2.start();
        /*
         * Thread.sleep(long mills)使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）
         * 工作流程：A. 挂起线程并修改其运行状态
         * 		     B.用mills设置一个定时器
         *           C.当时间结束后，定时器会触发，内核收到信号后会修改线程运行状态。比如被标记为就绪状态
         * 而进入就绪队列等待OS调度
         * 交出CPU的执行时间片，在暂停期间不会参与CPU时间片的获取，等待时间过后会不会执行还要看OS的调度
         * 会阻断主线程，即后面的都得延迟mills ms
         */
        try{
            long startTime = System.currentTimeMillis();

            Thread.sleep(1);
            System.out.println("线程1开始休眠");
            thread2.run();
            /*
             * sleep(0)意义
             * 完成sleep工作流程的第一个
             * 使线程挂起，让出CPU资源
             * 只是挂起后又立刻参与到CPU时间片的竞争中
             */
            long endTime = System.currentTimeMillis();
            //thread2.start();
            System.out.println(endTime - startTime);//睡眠过后不一定立即执行，还要等待OS的调度，所以执行结果不一定是1000
        }catch(InterruptedException e) {
            e.printStackTrace();
        }

        //thread2.start();
    }
}

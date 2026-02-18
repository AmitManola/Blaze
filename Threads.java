class T1 extends Thread { 
    public void run() { 
        for (int i = 0; i < 6; i++) { 
            System.out.println("Thread 1: " + i); 
        } 
    } 
}
class T2 extends Thread { 
    public void run() { 
        for (int i = 6; i < 11; i++) { 
            System.out.println("Thread 2: " + i); 
        } 
    } 
}
class Threads { 
    public static void main(String[] args) { 
        T1 thread1 = new T1(); 
        T2 thread2 = new T2(); 
        thread1.start(); 
        thread2.start(); 
    } 
}

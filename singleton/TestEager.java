package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class EagerInitializedSingleton {
    
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){
    	System.out.println("CreatingEager..");
    }

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}

class TestEager{
	static void useEager() {
		EagerInitializedSingleton Eager1=EagerInitializedSingleton .getInstance();
		System.out.println(Eager1.hashCode());
	}
	public static void main(String[] args) {
		EagerInitializedSingleton Eager1=EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton Eager2=EagerInitializedSingleton.getInstance();
	System.out.println(Eager1.hashCode());
		System.out.println(Eager2.hashCode());
/// 	Eager initialization is broblamatic with multithread 
		/// because with multithreading 
		/// if more than one thread access our Easger initializaton block
		/// than each thread get instanc as null
		/// hence create its instance
		ExecutorService service=Executors.newFixedThreadPool(2);
		service.submit(TestEager::useEager);
		service.submit(TestEager::useEager);
		service.shutdown();
	}
}
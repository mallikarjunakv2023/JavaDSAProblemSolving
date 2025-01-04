package CollectionAndDSA;

public class SingletonClass {
    private static SingletonClass singletonClass = null;
    private SingletonClass(){
        System.out.println("Singleton class instance created only once");
    }

    public static SingletonClass getInstance(){
        if (singletonClass == null){
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }

    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s3 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
    }

}

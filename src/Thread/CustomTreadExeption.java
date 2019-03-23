package Thread;


public class CustomTreadExeption implements Thread.UncaughtExceptionHandler {

    public void uncaughtException(Thread t,Throwable e){

        System.out.println("une exc est gerée est déclanché : +"+e.getMessage());
        System.out.println("cette exeption est de type : "+e.getClass());
    }
}

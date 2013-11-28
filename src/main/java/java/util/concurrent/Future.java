package java.util.concurrent;

public interface Future {
  public boolean cancel(boolean cancel);
  public boolean isCancelled();
  public boolean isDone();
  public Object get() throws InterruptedException;
  //public Object get(long l, TimeUnit time) throws InterruptedException;
}


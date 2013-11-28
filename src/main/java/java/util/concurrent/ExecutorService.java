package java.util.concurrent;

import java.util.List;

public interface ExecutorService {
    public void shutdown();
    public List shutdownNow();
    public boolean isShutdown();
    public boolean isTerminated();
    public Future submit(Callable callable);
    public Future submit(Runnable runnable, Object o);
    public Future submit(Runnable runnable);
}


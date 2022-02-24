package com.segovelo.async;

import java.util.concurrent.Future;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/**
 * 18 Feb 2022 10:35:26 @Javadoc TODO
 *
 * @author Sebastian Vergara Losada *
 */
@Component
public class AsyncComponent {

  @Async
  public void asyncMethodWithVoidReturnType() {
    System.out.println("\t Inside asyncMethodWithVoidReturnType()");
    System.out.println(
        "\t Execute method asynchronously. " + Thread.currentThread().getName() + "\n\n");
  }

  @Async
  public Future<String> asyncMethodWithReturnType() {
    System.out.println("\t Inside asyncMethodWithReturnType()");
    System.out.println("\t Execute method asynchronously " + Thread.currentThread().getName());
    try {
      Thread.sleep(5000);
      return new AsyncResult<>("  hello world !!!!");
    } catch (final InterruptedException e) {

    }

    return null;
  }

  @Async("threadPoolTaskExecutor")
  public void asyncMethodWithConfiguredExecutor() {
    System.out.println("\t Inside asyncMethodWithConfiguredExecutor()");
    System.out.println(
        "\t Execute method asynchronously with configured executor "
            + Thread.currentThread().getName()
            + "\n\n");
  }

  @Async
  public void asyncMethodWithExceptions() throws Exception {
    System.out.println("\t Inside asyncMethodWithExceptions()\n\n");
    throw new Exception(" Throw message from asynchronous method. ");
  }
}

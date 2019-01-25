import com.sun.corba.se.impl.interceptors.PICurrent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.JupiterTestEngine;

import java.util.Arrays;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class ExecutorExecutorServiceTest {
    PizzaStatus status;

    public enum PizzaStatus{
        OREDERED,DELIVERY,READY;
    };
  @Test
  public void givenSingleThread_whenExecute_thenCorrect() throws InterruptedException {
      if (status == PizzaStatus.DELIVERY){
        System.out.println("delivery ok");
      }else{
        System.out.println("devivery notok " + status.name());
      }
  }

}

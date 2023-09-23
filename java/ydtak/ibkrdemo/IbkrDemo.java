package ydtak.ibkrdemo;

import com.ib.client.EClientSocket;
import com.ib.client.EJavaSignal;
import com.ib.client.EWrapper;

/**
 * Demo which demonstrates connecting to IBKR's IB Gateway for paper trading. This demo connects to
 * IB Gateway, waits for 5 seconds, then disconnects.
 */
public class IbkrDemo {
  public static void main(String[] args) {
    EWrapper wrapper = new DemoWrapper();
    IbkrDemo connector = new IbkrDemo(wrapper);
    connector.connect(4002 /* Paper trading port. */);
  }

  private final EClientSocket clientSocket;

  public IbkrDemo(EWrapper wrapper) {
    clientSocket = new EClientSocket(wrapper, new EJavaSignal());
  }

  public void connect(int port) {
    clientSocket.eConnect("127.0.0.1", port, 0);

    // Check connection to IB Gateway.
    if (clientSocket.isConnected()) {
      System.out.println("Successfully connected to IB Gateway!");
    } else {
      System.err.println("Failed to connect to IB Gateway.");
    }

    // Wait 5 seconds before disconnecting.
    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      // Do nothing.
    }
    clientSocket.eDisconnect();
  }
}

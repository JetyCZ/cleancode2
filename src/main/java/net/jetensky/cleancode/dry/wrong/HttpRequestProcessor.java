package net.jetensky.cleancode.dry.wrong;

import java.io.Writer;

import org.apache.http.HttpRequest;

public class HttpRequestProcessor {
  public void process(HttpRequest request) {
    // some impl
  }
  private void processHeaders(HttpRequest request, Writer httpOutput) {
    // some impl
  }
  private void processCookies(HttpRequest request, Writer httpOutput) {
    // some impl
  }
}

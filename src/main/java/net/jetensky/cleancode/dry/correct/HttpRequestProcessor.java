package net.jetensky.cleancode.dry.correct;

import java.io.Writer;

import org.apache.http.HttpRequest;

public class HttpRequestProcessor {
  HttpRequest request;
  Writer writer;

  public HttpRequestProcessor(HttpRequest request, Writer writer) {
    this.request = request;
    this.writer = writer;
  }

  public void process() {
    // some impl
  }
  private void processHeaders() {
    // some impl
  }
  private void processCookies() {
    // some impl
  }
}

package com.server;

public interface HttpHandler {
    String handle(HttpRequest request, HttpResponse response);
}

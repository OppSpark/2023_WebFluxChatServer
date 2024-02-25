package com.java.webfluxchatserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.reactive.result.view.Rendering;
import reactor.core.publisher.Mono;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public Mono<Rendering> home() {
        return Mono.just(Rendering.view("index").build());
    }
}

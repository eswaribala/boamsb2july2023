package com.boa.cloudgateway.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Component
@Slf4j
public class LoggingGlobalPreFilter implements GlobalFilter,Ordered {

    

    @Override
    public Mono<Void> filter(
      ServerWebExchange exchange,
      GatewayFilterChain chain) {
        log.info("Global Pre Filter executed");
        return chain.filter(exchange).then(Mono.fromRunnable(()->{
            var response = exchange.getResponse();
            response.setRawStatusCode(201);
            exchange.mutate().response(response).build();
        }));
    }
    @Override
    public int getOrder() {
        return 0;
    }
}
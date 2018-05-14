package com.imooc.kafka;

/*
* Kafka Java API 测试
* */
public class KafkaClientApp {
    public static void main(String[] args) {
        new KafkaProducer(KafkaProperties.TOPIC).start();
    }
}

package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Transaction;
import org.apache.kafka.clients.consumer.Consumer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.core.ConsumerFactory;

import java.util.Properties;

public class KafkaConsumer {
    private final JsonDeserializer jsonDeserializer = new JsonDeserializer<Transaction>();
    private final String topic;


    public KafkaConsumer (String topicName){
        this.topic = topicName;
    }
    @KafkaListener(topics = "midas-core-topic")
    public Transaction listen(byte[] data){

    }


    //  @KafkaListener(topics = "general.kafka-topic", id="general.kafka-consumer-id")
//    public void listen(byte[] data){
//        System.out.println("Consumed data successfully");
//        System.out.println(data);
//        JsonDeserializer<Transaction> transactionJsonDeserializer = new JsonDeserializer<>(Transaction.class);
//        Transaction midasTran = transactionJsonDeserializer.deserialize("general.kafka-topic", data);
//    }
}

//package com.jpmc.midascore;
//
//import com.jpmc.midascore.foundation.Transaction;
//import org.apache.kafka.common.serialization.Deserializer;
//import org.apache.kafka.common.serialization.Serializer;
//
//import java.util.Map;
//
//public class TransactionSerDe implements Deserializer<Transaction>, Serializer<Transaction>{
//
//
//    @Override
//    public void configure(Map<String, ?> configs, boolean isKey) {
//        Deserializer.super.configure(configs, isKey);
//    }
//
//    @Override
//    public Transaction deserialize(String s, byte[] bytes) {
//        Transaction retTran = new Transaction();
//        retTran.
//    }
//
//    @Override
//    public void close() {
//        Deserializer.super.close();
//    }
//
//    @Override
//    public byte[] serialize(String s, Transaction transaction) {
//        return new byte[0];
//    }
//}

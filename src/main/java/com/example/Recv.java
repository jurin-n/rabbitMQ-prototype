package com.example;

import java.io.IOException;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class Recv {
    private final static String QUEUE_NAME = "hello";

    public static void main(String[] argv) throws Exception {
        ConnectionFactory factory = new ConnectionFactory(); // 1.Connection作成
        factory.setHost("localhost");// 1.Connection作成
        Connection connection = factory.newConnection();// 2.Connection作成
        Channel channel = connection.createChannel(); // 2.Channel作成

        channel.queueDeclare(QUEUE_NAME, false, false, false, null); // 3.queue宣言
        System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

        Consumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                    AMQP.BasicProperties properties, byte[] body)
                            throws IOException {
                String message = new String(body, "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
            }
        }; // 4. DefaultConsumerをoverride
        channel.basicConsume(QUEUE_NAME, true, consumer); // 5. messageのconsume
    }
}

package com.hito.manage.cms.client.config;

import org.springframework.amqp.core.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Rabbitmq配置类
 *
 * @author HitoM
 * @date 2019/11/20 22:29
 **/
@Configuration
public class RabbitmqConfig {
    //队列注入bean的名称
    public static final String QUEUE_CMS_POSTPAGE = "queue_cms_postpage";
    //交换机注入bean的名称
    public static final String EX_ROUTING_CMS_POSTPAGE="ex_routing_cms_postpage";

    //队列的名称
    @Value("${xuecheng.mq.queue}")
    public  String queue_cms_postpage_name;

    @Value("${xuecheng.mq.routingKey}")
    public  String routingKey;

    /**
     * 交换机配置使用direct类型
     * @return the exchange
     */
    @Bean(EX_ROUTING_CMS_POSTPAGE)
    public Exchange EXCHANGE_TOPICS_INFORM() {
        return ExchangeBuilder.directExchange(EX_ROUTING_CMS_POSTPAGE).durable(true).build();
    }

    //声明队列
    @Bean(QUEUE_CMS_POSTPAGE)
    public Queue QUEUE_CMS_POSTPAGE() {
        return new Queue(queue_cms_postpage_name);
    }

    /**
     * 绑定队列到交换机
     *
     * @param queue    the queue
     * @param exchange the exchange
     * @return the binding
     */
    @Bean
    public Binding BINDING_QUEUE_INFORM_SMS(@Qualifier(QUEUE_CMS_POSTPAGE) Queue queue, @Qualifier(EX_ROUTING_CMS_POSTPAGE) Exchange exchange) {
        return BindingBuilder.bind(queue).to(exchange).with(routingKey).noargs();
    }
}

package cn.com.sky.spring.jms.async.session_aware_message_listener.listener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleMessageListener implements MessageListener {
    
    private static final Logger LOG = LoggerFactory.getLogger(SimpleMessageListener.class);

    public void onMessage(Message message) {
        try {
            LOG.error("Received reply message: {}", ((TextMessage)message).getText());
        } catch (JMSException e) {
            LOG.error(e.getMessage(), e);
        }
    }

}

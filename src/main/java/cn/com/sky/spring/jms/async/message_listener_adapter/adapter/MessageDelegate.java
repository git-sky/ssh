package cn.com.sky.spring.jms.async.message_listener_adapter.adapter;

import javax.jms.BytesMessage;
import javax.jms.MapMessage;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

public interface MessageDelegate {

    public abstract void processMessage(TextMessage message);

    public abstract void processMessage(BytesMessage message);

    public abstract void processMessage(MapMessage message);

    public abstract void processMesage(ObjectMessage message);

}
package com.egovorushkin.scoreborad.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationType",
                propertyValue = "javax.jms.Topic"),
        @ActivationConfigProperty(propertyName = "destination",
                propertyValue = "activemq/topic/ScoreboardTopic")})
public class ScoreboardConsumer implements MessageListener {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(ScoreboardConsumer.class);

    @Inject
    private PushBean pushBean;

    @Override
    public void onMessage(Message message) {
        LOGGER.info("Received message from activemq/topic/ScoreboardTopic");
        pushBean.pushUpdate();
    }
}

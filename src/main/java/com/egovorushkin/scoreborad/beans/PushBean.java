package com.egovorushkin.scoreborad.beans;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.push.Push;
import javax.faces.push.PushContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.logging.Logger;

@Named
@ApplicationScoped
public class PushBean implements Serializable {

    private static final Logger LOGGER = Logger.getLogger(PushBean.class.getName());

    @Inject
    @Push(channel = "websocket")
    private PushContext push;

    public void pushUpdate() {
        push.send("update");
    }
}

package org.hswebframework.web.authorization.token.event;

import org.hswebframework.web.authorization.token.UserToken;
import org.hswebframework.web.authorization.events.AuthorizationEvent;
import org.springframework.context.ApplicationEvent;

public class UserTokenCreatedEvent extends ApplicationEvent implements AuthorizationEvent {
    private final UserToken detail;

    public UserTokenCreatedEvent(UserToken detail) {
        super(detail);
        this.detail = detail;
    }

    public UserToken getDetail() {
        return detail;
    }
}

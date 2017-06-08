package com.li.test.property;

import org.springframework.context.annotation.PropertySource;

/**
 * Created by lihn on 17-6-8.
 */
@PropertySource()
public class LoadProperty {
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

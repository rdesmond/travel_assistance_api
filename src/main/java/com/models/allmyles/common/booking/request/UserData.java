package com.models.allmyles.common.booking.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by yovaliceroman on 5/10/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserData {

    String ip;
    String browser_agent;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBrowser_agent() {
        return browser_agent;
    }

    public void setBrowser_agent(String browser_agent) {
        this.browser_agent = browser_agent;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "ip='" + ip + '\'' +
                "browser_agent='" + browser_agent +
                '}';
    }
}

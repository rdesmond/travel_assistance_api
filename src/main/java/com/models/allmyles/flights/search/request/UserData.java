package com.models.allmyles.flights.search.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserData {
    //the end user’s IP address, e.g. 12.123.45.67.
    String ip;

    // the end user’s browser agent based on the User-Agent HTTP header, e.g. Mozilla/5.0 (X11; Linux x86_64; rv:12.0)
    // Gecko/20100101 Firefox/21.0
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
                ", browser_agent='" + browser_agent + '\'' +
                '}';
    }
}
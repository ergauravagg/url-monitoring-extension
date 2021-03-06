package com.appdynamics.extensions.urlmonitor.config;

@SuppressWarnings("unused")
public class DefaultSiteConfig extends SiteConfigBase {

    public DefaultSiteConfig()
    {
        method = "HEAD";
        socketTimeout = 30000;
        connectTimeout = 30000;
        treatAuthFailedAsError = true;
        numAttempts = 1;
    }
}

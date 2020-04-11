package com.DesignPatterns.Creational.Factory;

import static com.DesignPatterns.Creational.Factory.WebsiteType.BLOG;
import static com.DesignPatterns.Creational.Factory.WebsiteType.SHOP;

public class WebsiteFactory {
    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType){
            case BLOG: {
                return new Blog();
            }
            case SHOP : {
                return new Shop();
            }
            default: {
                return null;
            }
        }
    }
}

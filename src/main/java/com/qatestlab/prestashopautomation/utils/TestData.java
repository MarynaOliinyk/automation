package com.qatestlab.prestashopautomation.utils;

import static com.qatestlab.prestashopautomation.utils.PropertiesCache.getProperty;

public class TestData {

    public static class Login {

        public static final String BASE_URL = getProperty("login.base.url"),
                EMAIL = getProperty("login.user.email"),
                PASSWORD = getProperty("login.user.password");
    }
}
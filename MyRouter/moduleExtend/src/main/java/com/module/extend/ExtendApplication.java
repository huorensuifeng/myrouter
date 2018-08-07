package com.module.extend;

import android.app.Application;

public class ExtendApplication extends Application{
    /** Instance of the current application. */
    private static ExtendApplication instance;

    /**
     * Constructor.
     */
    public ExtendApplication() {
        instance = this;
    }

    /**
     * Gets the application context.
     *
     * @return the application context
     */
    public static ExtendApplication getInstance() {
        return instance;
    }

}

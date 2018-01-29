package hxgstudio.compliplenty;

import android.app.Application;

public class MyApp extends Application {

    private Boolean loggedIn = false;

    public Boolean getLoggedIn()
    {
        return loggedIn;
    }

    public void setLoggedIn(Boolean bool)
    {
        loggedIn = bool;
    }

}

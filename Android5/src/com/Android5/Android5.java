
package com.Android5;

import android.app.Activity;
import android.widget.TextView;
import android.os.Bundle;

public class Android5 extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        /* Create a TextView and set its text to "Hello world" */
        TextView  tv = new TextView(this);
        tv.setText("Hello World! what's your name ?");
        setContentView(tv);
    }
}

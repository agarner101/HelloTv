package io.andrewgarner.hellotv;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Main activity for the app. Simply shows text.
 * Created by andrewgarner on 7/27/18.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
}

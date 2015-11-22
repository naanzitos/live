package app.toothless.addictionfree;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;


/**
 * Created by Toothless on 21/11/2015.
 */

public class UserPresentBroadcastReceiver extends BroadcastReceiver {

    public int intValue;

    @Override
    public void onReceive(Context arg0, Intent intent) {

        SharedPreferences prefs = arg0.getSharedPreferences(
                "app.toothless.addictionfree", Context.MODE_PRIVATE);
        String SharedPath = "app.toothless.addictionfree.count";

        intValue = prefs.getInt(SharedPath, 0);

        if(intent.getAction().equals(Intent.ACTION_USER_PRESENT)) {

            intValue++;
            prefs.edit().putInt(SharedPath, intValue).apply();

        }

    }
}
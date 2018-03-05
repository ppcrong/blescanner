package com.ppcrong.blescanner;

import android.support.v7.app.AppCompatActivity;

/**
 * BleScanner
 */
public class BleScanner {

    public static void showScanner(AppCompatActivity activity) {

        showDeviceScanningDialog(activity);
    }

    // region [Private Function]
    private static void showDeviceScanningDialog(AppCompatActivity activity) {
        final ScannerFragment dialog = ScannerFragment.getInstance(null); // Device that is advertising directly does not have the GENERAL_DISCOVERABLE nor LIMITED_DISCOVERABLE flag set.
        dialog.show(activity.getSupportFragmentManager(), "scan_fragment");
    }
    // endregion [Private Function]
}

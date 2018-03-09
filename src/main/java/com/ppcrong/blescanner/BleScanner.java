package com.ppcrong.blescanner;

import android.support.v7.app.AppCompatActivity;

import java.util.UUID;

/**
 * BleScanner
 */
public class BleScanner {

    public static void showScanner(AppCompatActivity activity, UUID uuid) {

        showDeviceScanningDialog(activity, uuid);
    }

    // region [Private Function]
    private static void showDeviceScanningDialog(AppCompatActivity activity, UUID uuid) {
        final ScannerFragment dialog = ScannerFragment.getInstance(uuid); // Device that is advertising directly does not have the GENERAL_DISCOVERABLE nor LIMITED_DISCOVERABLE flag set.
        dialog.show(activity.getSupportFragmentManager(), "scan_fragment");
    }
    // endregion [Private Function]
}

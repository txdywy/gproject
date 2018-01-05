package com.google.android.gms.peerdownloadmanager.comms.p294a;

import android.bluetooth.BluetoothDevice;

public final class C5401c implements C5400g {
    public BluetoothDevice f28027a;

    public C5401c(BluetoothDevice bluetoothDevice) {
        this.f28027a = bluetoothDevice;
    }

    public final String mo4985a() {
        return this.f28027a.getAddress();
    }

    public final String toString() {
        String bluetoothDevice = this.f28027a.toString();
        return new StringBuilder(String.valueOf(bluetoothDevice).length() + 11).append("Bluetooth{").append(bluetoothDevice).append("}").toString();
    }
}

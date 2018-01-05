package com.google.android.wallet.common.util;

import android.util.Log;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;

public final class C6597i {
    public static ArrayList m29926a() {
        ArrayList arrayList = new ArrayList();
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return arrayList;
            }
            while (networkInterfaces.hasMoreElements()) {
                Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                    if (!inetAddress.isLoopbackAddress()) {
                        arrayList.add(inetAddress);
                    }
                }
            }
        } catch (SocketException e) {
            Throwable e2 = e;
            Log.e("NetUtils", "Unable to retrieve network interfaces", e2);
            return arrayList;
        } catch (NullPointerException e3) {
            e2 = e3;
            Log.e("NetUtils", "Unable to retrieve network interfaces", e2);
            return arrayList;
        }
        return arrayList;
    }
}

package com.google.android.gms.peerdownloadmanager.comms.p296c;

import android.net.wifi.WifiConfiguration;
import java.lang.reflect.Field;
import java.net.InetAddress;

final class C5419g implements C5418f {
    C5419g() {
    }

    public final void mo5000a(WifiConfiguration wifiConfiguration, InetAddress inetAddress, InetAddress inetAddress2) {
        try {
            Class cls = Class.forName("android.net.StaticIpConfiguration");
            Class cls2 = Class.forName("android.net.LinkAddress");
            Class asSubclass = Class.forName("android.net.IpConfiguration$IpAssignment").asSubclass(Enum.class);
            Object a = new C5415b(cls.getConstructor(new Class[0])).mo4999a(new Object[0]);
            Object a2 = new C5415b(cls2.getConstructor(new Class[]{InetAddress.class, Integer.TYPE})).mo4999a(inetAddress, Integer.valueOf(24));
            Field field = a.getClass().getField("ipAddress");
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            new C5417d(field, a).mo4999a(a2);
            Field field2 = a.getClass().getField("gateway");
            if (!field2.isAccessible()) {
                field2.setAccessible(true);
            }
            new C5417d(field2, a).mo4999a(inetAddress2);
            Class[] clsArr = new Class[]{cls};
            new C5416c(wifiConfiguration.getClass().getMethod("setStaticIpConfiguration", clsArr), wifiConfiguration).mo4999a(a);
            Enum valueOf = Enum.valueOf(asSubclass, "STATIC");
            Class[] clsArr2 = new Class[]{asSubclass};
            new C5416c(wifiConfiguration.getClass().getMethod("setIpAssignment", clsArr2), wifiConfiguration).mo4999a(valueOf);
        } catch (Throwable e) {
            throw new IllegalStateException("reflection failed on the static ip network apis", e);
        }
    }

    public final void mo5001b(WifiConfiguration wifiConfiguration, InetAddress inetAddress, InetAddress inetAddress2) {
        try {
            Class cls = Class.forName("android.net.LinkAddress");
            Class cls2 = Class.forName("android.net.RouteInfo");
            Class asSubclass = Class.forName("android.net.wifi.WifiConfiguration$IpAssignment").asSubclass(Enum.class);
            Object a = new C5415b(cls.getConstructor(new Class[]{InetAddress.class, Integer.TYPE})).mo4999a(inetAddress, Integer.valueOf(24));
            Object a2 = new C5415b(cls2.getConstructor(new Class[]{InetAddress.class})).mo4999a(inetAddress2);
            Field field = wifiConfiguration.getClass().getField("linkProperties");
            if (!field.isAccessible()) {
                field.setAccessible(true);
            }
            Object obj = field.get(wifiConfiguration);
            Class[] clsArr = new Class[0];
            new C5416c(obj.getClass().getMethod("clear", clsArr), obj).mo4999a(new Object[0]);
            clsArr = new Class[]{cls};
            new C5416c(obj.getClass().getMethod("addLinkAddress", clsArr), obj).mo4999a(a);
            Class[] clsArr2 = new Class[]{cls2};
            new C5416c(obj.getClass().getMethod("addRoute", clsArr2), obj).mo4999a(a2);
            Enum valueOf = Enum.valueOf(asSubclass, "STATIC");
            Field field2 = wifiConfiguration.getClass().getField("ipAssignment");
            if (!field2.isAccessible()) {
                field2.setAccessible(true);
            }
            new C5417d(field2, wifiConfiguration).mo4999a(valueOf);
        } catch (Throwable e) {
            throw new IllegalStateException("reflection failed on the static ip network apis", e);
        }
    }
}

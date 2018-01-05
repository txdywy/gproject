package org.chromium.base;

import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class C7908s implements C7907u {
    public Method f40555a;

    C7908s() {
        try {
            this.f40555a = Class.forName("android.os.Message").getMethod("setAsynchronous", new Class[]{Boolean.TYPE});
        } catch (ClassNotFoundException e) {
            C7893j.m37818b("cr.SysMessageHandler", "Failed to find android.os.Message class", e);
        } catch (NoSuchMethodException e2) {
            C7893j.m37818b("cr.SysMessageHandler", "Failed to load Message.setAsynchronous method", e2);
        } catch (RuntimeException e3) {
            C7893j.m37818b("cr.SysMessageHandler", "Exception while loading Message.setAsynchronous method", e3);
        }
    }

    public final void mo6570a(Message message) {
        if (this.f40555a != null) {
            try {
                this.f40555a.invoke(message, new Object[]{Boolean.valueOf(true)});
            } catch (IllegalAccessException e) {
                C7893j.m37818b("cr.SysMessageHandler", "Illegal access to async message creation, disabling.", new Object[0]);
                this.f40555a = null;
            } catch (IllegalArgumentException e2) {
                C7893j.m37818b("cr.SysMessageHandler", "Illegal argument for async message creation, disabling.", new Object[0]);
                this.f40555a = null;
            } catch (InvocationTargetException e3) {
                C7893j.m37818b("cr.SysMessageHandler", "Invocation exception during async message creation, disabling.", new Object[0]);
                this.f40555a = null;
            } catch (RuntimeException e4) {
                C7893j.m37818b("cr.SysMessageHandler", "Runtime exception during async message creation, disabling.", new Object[0]);
                this.f40555a = null;
            }
        }
    }
}

package com.google.android.finsky.dw;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.os.UserManager;
import android.support.v4.os.C0327a;
import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@TargetApi(17)
final class C2908b extends C2907a {
    public UserManager f15459a;
    public Method f15460b;
    public Method f15461c;
    public Method f15462d;

    C2908b(Context context) {
        this.f15459a = (UserManager) context.getSystemService("user");
        Class cls = this.f15459a.getClass();
        Class cls2 = UserHandle.class;
        Class[] clsArr = new Class[0];
        Method method = cls.getMethod("getUsers", clsArr);
        if (method.getReturnType().equals(List.class)) {
            this.f15460b = method;
        } else {
            FinskyLog.m21669e("Return type %s is not correct for getUsers", method.getReturnType());
            this.f15460b = null;
        }
        try {
            this.f15462d = cls2.getMethod("isOwner", new Class[0]);
        } catch (NoSuchMethodException e) {
        }
        if (VERSION.SDK_INT >= 18) {
            Method method2 = cls.getMethod("isLinkedUser", clsArr);
            if (method2.getReturnType().equals(Boolean.TYPE)) {
                this.f15461c = method2;
                return;
            }
            FinskyLog.m21669e("Return type %s is not correct for isLimited", method2.getReturnType());
            this.f15461c = null;
        }
    }

    public final boolean mo3193b() {
        if (this.f15461c == null) {
            return super.mo3193b();
        }
        try {
            return ((Boolean) this.f15461c.invoke(this.f15459a, null)).booleanValue();
        } catch (IllegalArgumentException e) {
            return false;
        } catch (IllegalAccessException e2) {
            return false;
        } catch (InvocationTargetException e3) {
            return false;
        }
    }

    public final boolean mo3192a() {
        if (this.f15460b == null) {
            return super.mo3192a();
        }
        try {
            return ((List) this.f15460b.invoke(this.f15459a, null)).size() > 1;
        } catch (IllegalArgumentException e) {
            return false;
        } catch (InvocationTargetException e2) {
            return false;
        } catch (IllegalAccessException e3) {
            return false;
        }
    }

    @TargetApi(17)
    public final List mo3194c() {
        if (!C0327a.m1721a()) {
            return m15167f();
        }
        long[] serialNumbersOfUsers = this.f15459a.getSerialNumbersOfUsers(true);
        List arrayList = new ArrayList(serialNumbersOfUsers.length);
        for (long userForSerialNumber : serialNumbersOfUsers) {
            arrayList.add(this.f15459a.getUserForSerialNumber(userForSerialNumber));
        }
        return arrayList;
    }

    @TargetApi(17)
    private final List m15167f() {
        if (this.f15460b == null) {
            return null;
        }
        try {
            List list = (List) this.f15460b.invoke(this.f15459a, null);
            if (!(list == null || list.isEmpty())) {
                Method method = list.get(0).getClass().getMethod("getUserHandle", new Class[0]);
                if (method.getReturnType().equals(UserHandle.class)) {
                    int size = list.size();
                    List arrayList = new ArrayList(size);
                    for (int i = 0; i < size; i++) {
                        arrayList.add((UserHandle) method.invoke(list.get(i), null));
                    }
                    return arrayList;
                }
                FinskyLog.m21669e("Return type %s is not correct for getUserHandle", method.getReturnType());
            }
        } catch (IllegalArgumentException e) {
        } catch (IllegalAccessException e2) {
        } catch (InvocationTargetException e3) {
        } catch (NoSuchMethodException e4) {
        } catch (SecurityException e5) {
        }
        return null;
    }

    @TargetApi(21)
    public final boolean mo3195d() {
        if (VERSION.SDK_INT >= 23) {
            return this.f15459a.isSystemUser();
        }
        return m15168g();
    }

    @TargetApi(21)
    private final boolean m15168g() {
        if (this.f15462d == null) {
            return true;
        }
        for (UserHandle invoke : this.f15459a.getUserProfiles()) {
            try {
                if (((Boolean) this.f15462d.invoke(invoke, new Object[0])).booleanValue()) {
                    return true;
                }
            } catch (IllegalArgumentException e) {
                return true;
            } catch (IllegalAccessException e2) {
                return true;
            } catch (InvocationTargetException e3) {
                return true;
            } catch (SecurityException e4) {
                return true;
            }
        }
        return false;
    }

    public final boolean mo3196e() {
        return false;
    }
}

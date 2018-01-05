package com.google.android.gms.internal;

final class ux implements vc {
    public static final ux f27544a = new ux();
    public static zzfwr f27545b = new zzfwr();

    private ux() {
    }

    public final int mo4929a(boolean z, int i, boolean z2, int i2) {
        if (z == z2 && i == i2) {
            return i;
        }
        throw f27545b;
    }

    public final ud mo4930a(boolean z, ud udVar, boolean z2, ud udVar2) {
        if (z == z2 && udVar.equals(udVar2)) {
            return udVar;
        }
        throw f27545b;
    }

    public final vf mo4931a(vf vfVar, vf vfVar2) {
        if (vfVar.equals(vfVar2)) {
            return vfVar;
        }
        throw f27545b;
    }

    public final vk mo4932a(vk vkVar, vk vkVar2) {
        if (vkVar == null && vkVar2 == null) {
            return null;
        }
        if (vkVar == null || vkVar2 == null) {
            throw f27545b;
        }
        vk vkVar3 = (uu) vkVar;
        if (vkVar3 == vkVar2 || !((uu) vkVar3.mo4849a(vb.f27557g, null, null)).getClass().isInstance(vkVar2)) {
            return vkVar;
        }
        Object obj = (uu) vkVar2;
        vkVar3.mo4849a(vb.f27552b, (Object) this, obj);
        vkVar3.f27255h = mo4933a(vkVar3.f27255h, obj.f27255h);
        return vkVar;
    }

    public final wb mo4933a(wb wbVar, wb wbVar2) {
        if (wbVar.equals(wbVar2)) {
            return wbVar;
        }
        throw f27545b;
    }

    public final String mo4934a(boolean z, String str, boolean z2, String str2) {
        if (z == z2 && str.equals(str2)) {
            return str;
        }
        throw f27545b;
    }
}

package com.google.android.gms.internal;

public final class va implements vc {
    public static final va f27550a = new va();

    private va() {
    }

    public final int mo4929a(boolean z, int i, boolean z2, int i2) {
        return z2 ? i2 : i;
    }

    public final ud mo4930a(boolean z, ud udVar, boolean z2, ud udVar2) {
        return z2 ? udVar2 : udVar;
    }

    public final vf mo4931a(vf vfVar, vf vfVar2) {
        int size = vfVar.size();
        int size2 = vfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!vfVar.mo4888a()) {
                vfVar = vfVar.mo4937a(size2 + size);
            }
            vfVar.addAll(vfVar2);
        }
        return size > 0 ? vfVar : vfVar2;
    }

    public final vk mo4932a(vk vkVar, vk vkVar2) {
        return (vkVar == null || vkVar2 == null) ? vkVar == null ? vkVar2 : vkVar : vkVar.mo4847g().mo4852a(vkVar2).mo4856e();
    }

    public final String mo4934a(boolean z, String str, boolean z2, String str2) {
        return z2 ? str2 : str;
    }

    public final wb mo4933a(wb wbVar, wb wbVar2) {
        return wbVar2 == wb.f27585a ? wbVar : wb.m25817a(wbVar, wbVar2);
    }
}

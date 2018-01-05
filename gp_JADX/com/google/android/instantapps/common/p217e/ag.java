package com.google.android.instantapps.common.p217e;

import com.google.android.play.p179a.C6228m;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class ag implements C0000a {
    public final C0000a f29040a;

    public ag(C0000a c0000a) {
        this.f29040a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        bg bgVar = (bg) this.f29040a.mo1a();
        C6228m c6228m = new C6228m();
        c6228m.f31171g = (String) bgVar.m27118a("Logging__").m27116a("odyssey_server_url", "https://play.googleapis.com/play/log").mo5158a();
        c6228m.f31169e = ((Long) bgVar.m27118a("Logging__").m27115a("odyssey_upload_delay_ms", 300000).mo5158a()).longValue();
        c6228m.f31170f = ((Long) bgVar.m27118a("Logging__").m27115a("odyssey_min_upload_delay_ms", 60000).mo5158a()).longValue();
        c6228m.f31173i = ((Integer) bgVar.m27118a("Logging__").m27114a("odyssey_server_timeout_ms", c6228m.f31173i).mo5158a()).intValue();
        c6228m.f31166b = ((Long) bgVar.m27118a("Logging__").m27115a("odyssey_max_storage_size", c6228m.f31166b).mo5158a()).longValue();
        c6228m.f31167c = ((Long) bgVar.m27118a("Logging__").m27115a("odyssey_recommended_log_file_size", c6228m.f31167c).mo5158a()).longValue();
        c6228m.f31181q = ((Boolean) bgVar.m27118a("Logging__").m27117a("odyssey_allow_non_existing_log_dirs", true).mo5158a()).booleanValue();
        c6228m.f31177m = true;
        return (C6228m) C0004c.m7a(c6228m, "Cannot return null from a non-@Nullable @Provides method");
    }
}

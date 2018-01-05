package com.google.android.finsky.instantapps;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.bm;
import android.util.Log;
import com.google.android.finsky.instantapps.p216c.C3410c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.C5316d;
import com.google.android.gms.phenotype.C5502b;
import com.google.android.gms.phenotype.C5553l;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.instantapps.common.C5804k;
import com.google.android.instantapps.common.p217e.C5743e;
import com.google.android.instantapps.common.p217e.bb;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.protobuf.nano.C0757i;
import java.io.File;
import java.io.IOException;

public class PhenotypeUpdateService extends bm {
    public bb f17320i;
    public C5710a f17321j;
    public bf f17322k;

    public static void m16866a(Context context) {
        Intent intent = new Intent(context, PhenotypeUpdateService.class);
        intent.setAction("com.google.android.gms.phenotype.UPDATE");
        bm.m1346a(context, PhenotypeUpdateService.class, 174406261, intent);
    }

    public static void m16867b(Context context) {
        Intent intent = new Intent(context, PhenotypeUpdateService.class);
        intent.setAction("com.google.android.finsky.instantapps.REGISTER_PHENOTYPE");
        bm.m1346a(context, PhenotypeUpdateService.class, 174406261, intent);
    }

    public static void m16868c(Context context) {
        Intent intent = new Intent(context, PhenotypeUpdateService.class);
        intent.setAction("com.google.android.finsky.instantapps.UNREGISTER_PHENOTYPE");
        bm.m1346a(context, PhenotypeUpdateService.class, 174406261, intent);
    }

    public void onCreate() {
        super.onCreate();
        Log.d("PhenotypeUpdateService", "onCreate called");
        ((C3410c) C3947d.m18649a(C3410c.class)).mo3511a(this);
    }

    protected final void mo3486a(Intent intent) {
        String valueOf;
        String valueOf2;
        this.f17321j.mo5136a(1805);
        String action = intent.getAction();
        int i = -1;
        switch (action.hashCode()) {
            case -1899454920:
                if (action.equals("com.google.android.finsky.instantapps.REGISTER_PHENOTYPE")) {
                    i = 0;
                    break;
                }
                break;
            case 280531345:
                if (action.equals("com.google.android.finsky.instantapps.UNREGISTER_PHENOTYPE")) {
                    i = 1;
                    break;
                }
                break;
            case 2019499159:
                if (action.equals("com.google.android.gms.phenotype.UPDATE")) {
                    i = 2;
                    break;
                }
                break;
        }
        C5058o b;
        Status status;
        switch (i) {
            case 0:
                Log.d("PhenotypeUpdateService", "Registering with Phenotype");
                bb bbVar = this.f17320i;
                b = new C5089p(bbVar.f29069b).m23647a(C5502b.f28324c).m23652b();
                b.mo4558f();
                if (bb.m27101a(bbVar.f29069b)) {
                    bb.f29068a.m27209b("No sync required", new Object[0]);
                    status = (Status) bbVar.f29071d.mo4772a(b, bbVar.f29075h, bbVar.m27102a(bbVar.f29069b.getPackageName()), new String[]{"WESTINGHOUSE", "WESTINGHOUSE_COUNTERS"}, C0757i.m4909a(bbVar.m27104b())).mo4487a();
                    bb.f29068a.m27209b("Phenotype register status = %s", status);
                    bbVar.f29070c.mo5136a(1802);
                } else {
                    bb.f29068a.m27209b("Sync required", new Object[0]);
                    C5316d c5316d = (C5316d) bbVar.f29071d.mo4773a(b, bbVar.f29075h, bbVar.m27102a(bbVar.f29069b.getPackageName()), new String[]{"WESTINGHOUSE", "WESTINGHOUSE_COUNTERS"}, C0757i.m4909a(bbVar.m27104b()), bbVar.m27105c()).mo4487a();
                    if (c5316d.mo4505b().m23271a()) {
                        bb.f29068a.m27209b("Committing configuration = %s", c5316d.mo4789a());
                        C5743e c5743e = bbVar.f29073f;
                        Configurations a = c5316d.mo4789a();
                        C5553l.m26537a(c5743e.f29135a.getSharedPreferences("phenotypeConfigurations", 0), a);
                        c5743e.f29138d.mo4774b(b, a.f28286a).mo4487a();
                        c5743e.f29137c.m27037a(b, c5743e.f29138d);
                        File file = new File(bbVar.f29069b.getFilesDir(), "FlagsSynced");
                        try {
                            file.createNewFile();
                        } catch (IOException e) {
                            C5804k c5804k = bb.f29068a;
                            String str = "Failed to create flags synced marker file ";
                            valueOf = String.valueOf(file.getAbsolutePath());
                            c5804k.m27210c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
                            C5804k c5804k2 = bb.f29068a;
                            valueOf2 = String.valueOf(e);
                            c5804k2.m27209b(new StringBuilder(String.valueOf(valueOf2).length() + 58).append("NOT A CRASH: Exception creating flags synced marker file: ").append(valueOf2).toString(), new Object[0]);
                        }
                    } else {
                        bb.f29068a.m27210c("Phenotype registerSync status = %s", c5316d.mo4505b());
                        bbVar.f29070c.mo5136a(1811);
                    }
                    bbVar.f29070c.mo5136a(1801);
                }
                b.mo4559g();
                InstantAppHygieneService.m16860a((Context) this, ((Long) this.f17322k.mo5158a()).longValue());
                break;
            case 1:
                Log.d("PhenotypeUpdateService", "Unregistering with Phenotype");
                bb bbVar2 = this.f17320i;
                bbVar2.f29070c.mo5136a(1803);
                new File(bbVar2.f29069b.getFilesDir(), "FlagsSynced").delete();
                b = new C5089p(bbVar2.f29069b).m23647a(C5502b.f28324c).m23652b();
                b.mo4558f();
                status = (Status) bbVar2.f29071d.mo4771a(b, bbVar2.f29075h).mo4487a();
                bb.f29068a.m27209b("Phenotype unregister status = %s", status);
                b.mo4559g();
                InstantAppHygieneService.m16863b(this);
                break;
            case 2:
                Log.d("PhenotypeUpdateService", "Updating Phenotype configs");
                this.f17320i.m27103a();
                InstantAppHygieneService.m16860a((Context) this, ((Long) this.f17322k.mo5158a()).longValue());
                break;
            default:
                valueOf2 = "Unexpected action: ";
                valueOf = String.valueOf(intent.getAction());
                throw new RuntimeException(valueOf.length() != 0 ? valueOf2.concat(valueOf) : new String(valueOf2));
        }
        this.f17321j.mo5136a(1806);
    }
}

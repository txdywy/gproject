package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

public abstract class ke extends nh implements kd {
    public ke() {
        attachInterface(this, "com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        switch (i) {
            case 1:
                mo4776a((Status) ni.m25192a(parcel, Status.CREATOR));
                break;
            case 2:
                mo4782b((Status) ni.m25192a(parcel, Status.CREATOR));
                break;
            case 3:
                mo4784c((Status) ni.m25192a(parcel, Status.CREATOR));
                break;
            case 4:
                mo4777a((Status) ni.m25192a(parcel, Status.CREATOR), (Configurations) ni.m25192a(parcel, Configurations.CREATOR));
                break;
            case 5:
                mo4785d((Status) ni.m25192a(parcel, Status.CREATOR));
                break;
            case 6:
                mo4779a((Status) ni.m25192a(parcel, Status.CREATOR), (ExperimentTokens) ni.m25192a(parcel, ExperimentTokens.CREATOR));
                break;
            case 7:
                mo4778a((Status) ni.m25192a(parcel, Status.CREATOR), (DogfoodsToken) ni.m25192a(parcel, DogfoodsToken.CREATOR));
                break;
            case 8:
                mo4786e((Status) ni.m25192a(parcel, Status.CREATOR));
                break;
            case 9:
                mo4780a((Status) ni.m25192a(parcel, Status.CREATOR), (Flag) ni.m25192a(parcel, Flag.CREATOR));
                break;
            case 10:
                mo4783b((Status) ni.m25192a(parcel, Status.CREATOR), (Configurations) ni.m25192a(parcel, Configurations.CREATOR));
                break;
            case 11:
                mo4787f((Status) ni.m25192a(parcel, Status.CREATOR));
                break;
            case 12:
                mo4788g((Status) ni.m25192a(parcel, Status.CREATOR));
                break;
            case 13:
                mo4781a((Status) ni.m25192a(parcel, Status.CREATOR), (FlagOverrides) ni.m25192a(parcel, FlagOverrides.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}

package com.google.android.gms.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.DogfoodsToken;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverrides;

public interface kd extends IInterface {
    void mo4776a(Status status);

    void mo4777a(Status status, Configurations configurations);

    void mo4778a(Status status, DogfoodsToken dogfoodsToken);

    void mo4779a(Status status, ExperimentTokens experimentTokens);

    void mo4780a(Status status, Flag flag);

    void mo4781a(Status status, FlagOverrides flagOverrides);

    void mo4782b(Status status);

    void mo4783b(Status status, Configurations configurations);

    void mo4784c(Status status);

    void mo4785d(Status status);

    void mo4786e(Status status);

    void mo4787f(Status status);

    void mo4788g(Status status);
}

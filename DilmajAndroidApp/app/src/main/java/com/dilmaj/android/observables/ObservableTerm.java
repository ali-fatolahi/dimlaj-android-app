package com.dilmaj.android.observables;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.dilmaj.android.BR;
import com.dilmaj.android.model.Term;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */

public class ObservableTerm extends BaseObservable {
    protected Term term;

    public ObservableTerm() {
        term = new Term();
    }

    public ObservableTerm(String contents) {
        this.term = new Term(contents);
    }

    @Bindable
    public String getContents() {
        return term.getContents();
    }

    public void setContents(String contents) {
        term.setContents(contents);
        notifyPropertyChanged(BR.contents);
    }
}

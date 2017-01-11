package com.dilmaj.android.observables;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.dilmaj.android.BR;
import com.dilmaj.android.model.Term;
import com.dilmaj.android.model.Word;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */

public class ObservableWord extends ObservableTerm {
    public ObservableWord() {
        term = new Word();
    }

    public ObservableWord(String contents) {
        this.term = new Word(contents);
    }
}

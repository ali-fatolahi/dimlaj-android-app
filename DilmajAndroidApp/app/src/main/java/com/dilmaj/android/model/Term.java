package com.dilmaj.android.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.dilmaj.android.BR;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */

public class Term {
    private String contents;

    public Term() {
        contents = "";
    }

    public Term(String contents) {
        this.contents = contents;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}

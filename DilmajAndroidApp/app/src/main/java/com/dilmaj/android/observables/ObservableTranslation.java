package com.dilmaj.android.observables;

import com.dilmaj.android.model.Translation;
import com.dilmaj.android.model.Word;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */

public class ObservableTranslation extends ObservableTerm {
    public ObservableTranslation() {
        term = new Translation();
    }

    public ObservableTranslation(String contents) {
        this.term = new Translation(contents);
    }
}

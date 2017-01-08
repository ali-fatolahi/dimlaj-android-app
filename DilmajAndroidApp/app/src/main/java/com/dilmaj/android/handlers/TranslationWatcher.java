package com.dilmaj.android.handlers;

import android.text.Editable;
import android.text.TextWatcher;

import com.dilmaj.android.databinding.MainBinding;
import com.dilmaj.android.model.Translation;
import com.dilmaj.android.model.Word;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */

public class TranslationWatcher implements TextWatcher {
    private final MainBinding binding;

    public TranslationWatcher(final MainBinding binding) {
        this.binding = binding;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        binding.setTranslation(new Translation(s.toString()));
    }
}

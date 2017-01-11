package com.dilmaj.android;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.dilmaj.android.databinding.MainBinding;
import com.dilmaj.android.handlers.HandlersSetup;
import com.dilmaj.android.handlers.TranslationWatcher;
import com.dilmaj.android.handlers.WordWatcher;
import com.dilmaj.android.model.Translation;
import com.dilmaj.android.model.Word;
import com.dilmaj.android.observables.ObservableTerm;
import com.dilmaj.android.observables.ObservableTranslation;
import com.dilmaj.android.observables.ObservableWord;

/**
 * Created by Ali_Fatolahi on 1/7/2017.
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainBinding binding = DataBindingUtil.setContentView(this, R.layout.main);
        ObservableWord word = new ObservableWord();
        word.setContents("test");
        ObservableTranslation translation = new ObservableTranslation("Test Translation");
        binding.setWord(word);
        binding.setTranslation(translation);
        //HandlersSetup.addEditTextWatcher(binding.wordInput, new WordWatcher(binding));
        //HandlersSetup.addEditTextWatcher(binding.translationInput, new TranslationWatcher(binding));
    }
}

package com.dilmaj.android.observables;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by Ali_Fatolahi on 1/11/2017.
 */

public class ObservableWordUnitTest {
    @Test
    public void testDefaultConstructorCreatesEmptyWord() {
        ObservableWord observableWord = new ObservableWord();

        Assert.assertThat(observableWord.getContents(), is(""));
    }

    @Test
    public void testConstructorCreatesWordWithGivenContents() {
        String expectedContetns = "contents";

        ObservableWord observableWord = new ObservableWord(expectedContetns);

        Assert.assertThat(observableWord.getContents(), is(expectedContetns));
    }

    @Test
    public void testSetterWithGivenContents() {
        String expectedContetns = "contents";

        ObservableWord observableWord = new ObservableWord();
        observableWord.setContents(expectedContetns);

        Assert.assertThat(observableWord.getContents(), is(expectedContetns));
    }
}

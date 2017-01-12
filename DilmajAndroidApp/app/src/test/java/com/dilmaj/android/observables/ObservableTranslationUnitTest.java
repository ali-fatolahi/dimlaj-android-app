package com.dilmaj.android.observables;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by Ali_Fatolahi on 1/11/2017.
 */

public class ObservableTranslationUnitTest {
    @Test
    public void testDefaultConstructorCreatesEmptyTranslation() {
        ObservableTranslation observableTranslation = new ObservableTranslation();

        Assert.assertThat(observableTranslation.getContents(), is(""));
    }

    @Test
    public void testConstructorCreatesTranslationWithGivenContents() {
        String expectedContetns = "contents";

        ObservableTranslation observableTranslation = new ObservableTranslation(expectedContetns);

        Assert.assertThat(observableTranslation.getContents(), is(expectedContetns));
    }

    @Test
    public void testSetterWithGivenContents() {
        String expectedContetns = "contents";

        ObservableTranslation observableTranslation = new ObservableTranslation();
        observableTranslation.setContents(expectedContetns);

        Assert.assertThat(observableTranslation.getContents(), is(expectedContetns));
    }
}

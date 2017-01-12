package com.dilmaj.android.observables;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by Ali_Fatolahi on 1/11/2017.
 */

public class ObservableTermUnitTest {
    @Test
    public void testDefaultConstructorCreatesEmptyTerm() {
        ObservableTerm observableTerm = new ObservableTerm();

        Assert.assertThat(observableTerm.getContents(), is(""));
    }

    @Test
    public void testConstructorCreatesTermWithGivenContents() {
        String expectedContetns = "contents";

        ObservableTerm observableTerm = new ObservableTerm(expectedContetns);

        Assert.assertThat(observableTerm.getContents(), is(expectedContetns));
    }

    @Test
    public void testSetterWithGivenContents() {
        String expectedContetns = "contents";

        ObservableTerm observableTerm = new ObservableTerm();
        observableTerm.setContents(expectedContetns);

        Assert.assertThat(observableTerm.getContents(), is(expectedContetns));
    }
}

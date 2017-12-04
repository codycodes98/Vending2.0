package com.VendingMachineLads;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ButtonTest {

    @Test
    public void shouldCreateButton() {
        Button button = new Button(1);

        assertThat(button.getId(), is(1));
    }
}
package com.guidetojavaemployment.designpatterns.creationalpattern.abstractfactory;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FactoryTest {

    @Nested
    class WinFactoryTest {

        @Test
        void shouldCreateWinFactory() {
            WinFactory winFactory = new WinFactory();
            Button button = winFactory.createButton();
            Checkbox checkbox = winFactory.createCheckbox();

            assertThat(button.click()).isEqualTo("Windows button clicked");
            assertTrue(checkbox.check());
        }
    }

    @Nested
    class MacFactoryTest {

        @Test
        void shouldCreateMacFactory() {
            MacFactory macFactory = new MacFactory();
            Button button = macFactory.createButton();
            Checkbox checkbox = macFactory.createCheckbox();

            assertThat(button.click()).isEqualTo("Mac button clicked");
            assertFalse(checkbox.check());
        }
    }

}
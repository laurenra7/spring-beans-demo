package org.learn.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by laurenra on 1/18/17.
 */
public class TextEditorSetterInjection implements TextEditor {

    private static final Logger log = LoggerFactory.getLogger(TextEditorSetterInjection.class);

    private SpellChecker spellChecker;

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setSpellChecker(SpellChecker spellChecker) {
        log.info("lauren-sample: in TextEditorSetterInjection setSpellChecker, setting dependency...");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}

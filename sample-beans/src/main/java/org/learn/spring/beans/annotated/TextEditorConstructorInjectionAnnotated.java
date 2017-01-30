package org.learn.spring.beans.annotated;

import org.learn.spring.beans.SpellChecker;
import org.learn.spring.beans.TextEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by laurenra on 1/18/17.
 */
@Component
public class TextEditorConstructorInjectionAnnotated implements TextEditor {

    private static final Logger log = LoggerFactory.getLogger(TextEditorConstructorInjectionAnnotated.class);

    private SpellChecker spellChecker;

    @Autowired
    public TextEditorConstructorInjectionAnnotated(@Qualifier("spellCheckerEnglishUSAnnotated") SpellChecker spellChecker) {
        log.info("In TextEditorConstructorInjectionAnnotated constructor, setting dependency...");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}

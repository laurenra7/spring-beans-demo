package org.learn.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by laurenra on 1/18/17.
 */
public class TextEditorConstructorInjection implements TextEditor {

    private static final Logger log = LoggerFactory.getLogger(TextEditorConstructorInjection.class);

    private SpellChecker spellChecker;

//    @Autowired
    public TextEditorConstructorInjection(@Qualifier("spellCheckerGermanDE") SpellChecker spellChecker) {
        log.info("In TextEditorConstructorInjection constructor, setting dependency...");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}

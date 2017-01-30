package org.learn.spring.beans.annotated;

import org.learn.spring.beans.SpellChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by laurenra on 1/19/17.
 */
@Component
public class SpellCheckerEnglishUSAnnotated implements SpellChecker {

    private static final Logger log = LoggerFactory.getLogger(SpellCheckerEnglishUSAnnotated.class);

    public SpellCheckerEnglishUSAnnotated() {
        log.info("In SpellCheckerEnglishUSAnnotated constructor...");
    }

    public void checkSpelling() {
        log.info("In SpellCheckerEnglishUSAnnotated checkSpelling method...");
    }
}

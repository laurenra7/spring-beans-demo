package org.learn.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by laurenra on 1/19/17.
 */
public class SpellCheckerGermanDE implements SpellChecker {

    private static final Logger log = LoggerFactory.getLogger(SpellCheckerGermanDE.class);

    public SpellCheckerGermanDE() {
        log.info("In SpellCheckerGermanDE constructor...");
    }

    public void checkSpelling() {
        log.info("In SpellCheckerGermanDE checkSpelling method...");
    }
}

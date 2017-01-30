package org.learn.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by laurenra on 1/19/17.
 */
public class SpellCheckerEnglishUS implements SpellChecker {

    private static final Logger log = LoggerFactory.getLogger(SpellCheckerEnglishUS.class);

    public SpellCheckerEnglishUS() {
        log.info("In SpellCheckerEnglishUS constructor...");
    }

    public void checkSpelling() {
        log.info("In SpellCheckerEnglishUS EnglishUS checkSpelling method...");
    }
}

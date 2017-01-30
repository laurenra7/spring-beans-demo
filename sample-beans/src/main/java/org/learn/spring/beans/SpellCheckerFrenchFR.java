package org.learn.spring.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by laurenra on 1/19/17.
 */
public class SpellCheckerFrenchFR implements SpellChecker {

    private static final Logger log = LoggerFactory.getLogger(SpellCheckerFrenchFR.class);

    public SpellCheckerFrenchFR() {
        log.info("In SpellCheckerFrenchFR constructor...");
    }

    public void checkSpelling() {
        log.info("In SpellCheckerFrenchFR checkSpelling method...");
    }
}

package org.learn.spring.beans;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by laurenra on 1/26/17.
 */
@Configuration
@ComponentScan("org.learn.spring.beans") // Search the org.learn.spring.beans package for @Component classes (beans)
public class SpringConfig {
    // Nothing to do here, the annotations above take care of scanning for beans.
}

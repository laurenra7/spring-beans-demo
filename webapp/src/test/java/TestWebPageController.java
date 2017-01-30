//package java;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.learn.spring.web.WebPageController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by laurenra on 12/21/16.
 */
public class TestWebPageController extends TestCase {

    private static final Logger log = LoggerFactory.getLogger(TestWebPageController.class);

    private WebPageController controller;

    @Before
    public void setUp() {
        controller = new WebPageController();
    }

    @Test
    public void testPrintIndexRequestView() throws Exception {
        log.info("lauren test: starting testPrintIndexRequestView...");
        ModelAndView modelAndView = controller.printIndex(null, null);
        assertEquals("index", modelAndView.getViewName());
    }

    @Test
    public void testPrintHelloRequestView() throws Exception {
        log.info("lauren test: starting testPrintHelloRequestView...");
        ModelAndView modelAndView = controller.printHello(null, null);
        assertEquals("hello", modelAndView.getViewName());
    }
}

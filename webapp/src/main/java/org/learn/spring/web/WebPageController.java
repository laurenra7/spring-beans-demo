package org.learn.spring.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.learn.spring.beans.TextEditor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by laurenra on 12/16/16.
 */
@Controller
public class WebPageController {

    private static final Logger log = LoggerFactory.getLogger(WebPageController.class);

    public static final String ACAHOURS_DEEP_LINK = "hoursDeepLink2";
    public static final String TIMESHEET_DEEP_LINK = "timesheetDeepLink";

    private static final String PUNCHED_IN_MESSAGE="time.reporting.punched.in";
    private static final String PUNCHED_OUT_MESSAGE="time.reporting.punched.out";
    private static final String TIMECARD_EXCEPTION_MESSAGE = "time.reporting.timecard.exception";
    private static final String ERROR_MESSAGE_PARAM = "errorMessage";

    @Autowired
    private MessageSource messageSource;

    @Autowired
//    @Qualifier("textEditorConstructorInjection")
    @Qualifier("textEditorConstructorInjectionAnnotated")
            TextEditor textEditor;

    public WebPageController() {
        log.info("lauren: in YTimeController constructor...");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.learn.spring.beans");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView printIndex(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.info("lauren: processing home page (index)..."); // testing only
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("message", "This is the homepage");
        return modelAndView;
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public ModelAndView printHello(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        log.info("lauren: processing hello page (/hello)..."); // testing only
        ModelAndView model = new ModelAndView("hello"); // view name (hello.jsp) without .jsp
        model.addObject("message", "Hello Spring MVC Framework.");
//        return "hello"; // hello.jsp
        return model;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String printIndexOldWay(ModelMap model) {

        log.info("lauren: processing test page..."); // testing only
        textEditor.spellCheck(); // testing only

        model.addAttribute("message", "This is the test page.");
        return "test"; // View name (index.jsp) without .jsp
    }

}

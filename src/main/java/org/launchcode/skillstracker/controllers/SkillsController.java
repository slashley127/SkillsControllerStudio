package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class SkillsController {
    @GetMapping("")
    public String languages (){
        return "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<h3>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</h3>";
    }

    @GetMapping("form")
    public String nameAndLanguageForm(){
        return "<html>" +
                "<body>" +
                "<form action='form' method='post'>" +
                "<h2>Name:</h2>" +
                "<input type='text' name='name'></input>" +

                "<h2>My favorite language:</h2>" +
                "<select id='language1' name='language1'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +

                "<h2>My second favorite language:</h2>" +
                "<select id='language2' name='language2'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +

                "<h2>My third favorite language</h2>" +
                "<select id='language3' name='language3'>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select>" +

                "<h2>" +
                "<input type='submit' value='Submit'>" +
                "</h2>" +

                "</form>" +
                "</body>" +
                "</html>";
    }

    @RequestMapping(value="form", method = RequestMethod.POST)
    public String userResponses(@RequestParam String name, @RequestParam String language1, @RequestParam String language2, @RequestParam String language3){

        return createMessage(name, language1, language2, language3);
    }

    public static String createMessage(String n, String l1, String l2, String l3){
        String outcome =
                "<h1>" + n + "</h1>" +
                        "<h2>" +
                        "<ol>" +
                        "<li>" + l1 + "</li>" +
                        "<li>" + l2 + "</li>" +
                        "<li>" + l3 + "</li>";

        return outcome;
    }




}

package org.launchcode.skills_tracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String SkillsTracker() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2></h2>" +
                "<ol>" +
                "<li>JavaScript</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String userForm() {
        return "<html>" +
                "<body>" +
                "<form action='form' method='POST'>" +
                "<label for='name'>Name: </label>" +
                "<input type='text' name='name'>" +
                "</input>" +
                "<br>" +
                "<label for='firstProgrammingLanguage'>First Favorite Programming Language: </label>" +
                "<select id='firstProgrammingLanguage' name='FirstProgrammingLanguage'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for='secondProgrammingLanguage'>Second Favorite Programming Language: </label>" +
                "<select id='secondProgrammingLanguage' name='SecondProgrammingLanguage'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<label for='thirdProgrammingLanguage'>Third Favorite Programming Language: </label>" +
                "<select id='thirdProgrammingLanguage' name='ThirdProgrammingLanguage'>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br>" +
                "<input type='submit' value='Submit'>" +
                "</input>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("form")
    public String results(@RequestParam String name, @RequestParam String FirstProgrammingLanguage, @RequestParam String SecondProgrammingLanguage, @RequestParam String ThirdProgrammingLanguage) {
        return  "<html>" +
                "<body>" +
                "<div>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + FirstProgrammingLanguage +  "</li>" +
                "<li>" + SecondProgrammingLanguage +  "</li>" +
                "<li>" + ThirdProgrammingLanguage +  "</li>" +
                "</ol>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
}

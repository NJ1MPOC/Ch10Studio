package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody
    public String homePage() {
        return  "<html>" +
                "<body>" +
                "<h1>  Skills Tracker Home Page </h1>" +
                "<h2> \nSkills to learn:\n </h2>" +
                "<div>" +
                "<ol>" +
                "<li> Python </li>" +
                "<li> Rust </li>" +
                "<li> C# </li>" +
                "</ol>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
    @GetMapping("/form")
    @ResponseBody
    public String formPage() {
        return "<html>" +
                "<body>" +
                "<form action='form' method='post'>" + // submit a request to /form
                "<label for='name'>Name:" +
                "<br><input id='name' type='text' name='name'>" +
                "</label>" +

                "<br><br><label for='lang1'>My favorite language:</label>" +
                "<br><select id='lang1' name='languages'>" +
                "<option value=''>* Select One *</option>" +
                "<option value='Python'> Python </option>" +
                "<option value='Rust'> Rust </option>" +
                "<option value='Java'> Java </option>" +
                "</select><br><br>" +

                "<label for='lang2'>My second favorite language:</label>" +
                "<br><select id='lang2' name='languages'>" +
                "<option value=''>* Select One *</option>" +
                "<option value='Python'> Python </option>" +
                "<option value='Rust'> Rust </option>" +
                "<option value='Java'> Java </option>" +
                "</select><br><br>" +

                "<label for='lang3'>My third favorite language:</label>" +
                "<br><select id='lang3' name='languages'>" +
                "<option value=''>* Select One *</option>" +
                "<option value='Python'> Python </option>" +
                "<option value='Rust'> Rust </option>" +
                "<option value='Java'> Java </option>" +
                "</select><br>" +

                "<br><button type='submit' value='submit'>Submit</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String processForm(@RequestParam String name, @RequestParam String[] languages){
        return  "<html>" +
                "<body>" +
                "<h1>" + "" + name + "" + "</h1>" +
                "<div>" +
                "<ol>" +
                "<li>" + languages[0] + "</li>" +
                "<li>" + languages[1] + "</li>" +
                "<li>" + languages[2] + "</li>" +
                "</ol>" +
                "</div>" +
                "</body>" +
                "</html>";

    }
}

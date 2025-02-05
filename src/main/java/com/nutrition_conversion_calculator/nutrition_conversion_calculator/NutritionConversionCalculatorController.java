package com.nutrition_conversion_calculator.nutrition_conversion_calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.ArrayList;


@Controller
public class NutritionConversionCalculatorController {

    @Autowired
    FoodRepository foodRepository;

    /**
     * 
     * @return
     */
    @GetMapping("/view_calculator")
    public String viewCalculator() {
        return "view_calculator";
    }

    /**
     * 
     */
    @RequestMapping(value="/autofill")
    @ResponseBody
    public List<String> autofill(@RequestParam(value="term", required = false, defaultValue = "") String term) {
        List<String> suggestions = new ArrayList<String>();
        // Add options here for manual testing
        suggestions.add("Hello");
        suggestions.add("Help find cars");
        suggestions.add("Hospitality");
        return suggestions;

    }

}

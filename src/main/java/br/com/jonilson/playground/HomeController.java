package br.com.jonilson.playground;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Value("${app.environment.name}")
    private String environmentName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("appVersion", appVersion);
        model.addAttribute("environmentName", environmentName);
        return "home";
    }

    @GetMapping("/another")
    public String another(Model model) {
        model.addAttribute("appVersion", appVersion);
        return "another";
    }
}

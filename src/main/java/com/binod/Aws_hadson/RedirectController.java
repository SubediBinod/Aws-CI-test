package com.binod.Aws_hadson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class RedirectController {

    // Catch traffic going to the root URL "/"
    @GetMapping("/")
    public RedirectView redirectRootToDashboard() {
        // Instantly forward them to the /dashboard endpoint
        return new RedirectView("/api/greet");
    }
}

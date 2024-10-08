package com.esprit.FoyerSAE9.Controller;

import com.esprit.FoyerSAE9.Services.IFoyerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foyer")
public class FoyerController {

    private final IFoyerService iFoyerService;

    public FoyerController(IFoyerService iFoyerService) {
        this.iFoyerService = iFoyerService;
    }
}

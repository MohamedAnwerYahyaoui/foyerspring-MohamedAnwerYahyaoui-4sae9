package com.esprit.FoyerSAE9.Controller;

import com.esprit.FoyerSAE9.Services.IBlocService;
import com.esprit.FoyerSAE9.models.Bloc;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bloc")
public class BlocController {
    private final IBlocService iBlocService;

    public BlocController(IBlocService iBlocService) {
        this.iBlocService = iBlocService;
    }
    @PostMapping(path = "/addBloc")
    public Bloc addBloc(@RequestBody Bloc bloc){
        return iBlocService.addBloc(bloc);
    }

    @PostMapping(path = "/editBloc")
    public Bloc editBloc(@RequestBody Bloc bloc){
        return iBlocService.updateBloc(bloc);
    }
    @GetMapping(path = "/listBloc")
    public List<Bloc> blocList(){
        return iBlocService.getAllBloc();
    }
    @DeleteMapping(path = "deleteBy/{id}")
    public void deleteBloc(@PathVariable Long id){
        iBlocService.deletBloc(id);
    }


}

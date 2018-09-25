package pl.com.watroba.OtoRejs.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pl.com.watroba.OtoRejs.models.Skipper;
import pl.com.watroba.OtoRejs.repository.SkipperRepository;



@RestController
@RequestMapping("/skippers")
public class SkipperController {
    private final SkipperRepository skipperRepository;

    @Autowired
    public SkipperController(SkipperRepository skipperRepository){ this.skipperRepository=skipperRepository;}

    @RequestMapping(method=RequestMethod.POST) //Work in progress it's possible it is temporary solution
        public void addSkipper (@RequestBody Skipper skipper)
    {
        skipperRepository.save(skipper);
    }

    @RequestMapping(method= RequestMethod.GET)
    public Iterable<Skipper>  getSkippers (){return  skipperRepository.findAll();}
    {


    }





}

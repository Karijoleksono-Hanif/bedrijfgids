package sr.unasat.bedrijfgids.controller;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import sr.unasat.bedrijfgids.configuration.JPAConfig;
import sr.unasat.bedrijfgids.entity.Bedrijf;
import sr.unasat.bedrijfgids.service.BedrijfService;


import java.util.List;

@Path("bedrijven")
public class BedrijfController {

    private final BedrijfService bedrijfService;


    public BedrijfController() {
        this.bedrijfService = new BedrijfService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Bedrijf> readBedrijven(){
//                JPAConfig.getEntityManager();
        System.out.println("getBedrijven called....");

        return bedrijfService.readBedrijven();
    }

}
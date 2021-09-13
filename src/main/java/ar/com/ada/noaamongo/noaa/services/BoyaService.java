package ar.com.ada.noaamongo.noaa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.noaamongo.noaa.entities.Boya;
import ar.com.ada.noaamongo.noaa.repos.BoyaRepository;

@Service
public class BoyaService {

    @Autowired
    BoyaRepository repo;

    public Boya crear(double longitudInstalacion, double latitudInstalacion) {
        Boya boya = new Boya();
        boya.setColorLuz("");
        boya.setLatitudInstalacion(latitudInstalacion);
        boya.setLongitudInstalacion(longitudInstalacion);
        return repo.save(boya);
    }

    public List<Boya> traerTodas() {
        return repo.findAll();
    }

    
}

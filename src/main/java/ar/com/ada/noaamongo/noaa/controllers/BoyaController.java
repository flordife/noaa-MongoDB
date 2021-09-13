package ar.com.ada.noaamongo.noaa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.noaamongo.noaa.entities.Boya;
import ar.com.ada.noaamongo.noaa.models.request.InfoBoyaNueva;
import ar.com.ada.noaamongo.noaa.models.response.GenericResponse;
import ar.com.ada.noaamongo.noaa.services.BoyaService;

@RestController
public class BoyaController {
    
    @Autowired
    BoyaService service;

    @PostMapping("/boyas")
    public ResponseEntity<GenericResponse> crear(@RequestBody InfoBoyaNueva infoBoyaNueva) {

        GenericResponse respuesta = new GenericResponse();
        Boya boya = service.crear(infoBoyaNueva.latitudInstalacion, infoBoyaNueva.longitudInstalacion);

        respuesta.isOk = true;
        respuesta.id = boya.get_id().toHexString();
        respuesta.message = "La boya ha sido creada con exito";

        return ResponseEntity.ok(respuesta);

    }

    @GetMapping("/boyas")
    public ResponseEntity<List<Boya>> traerTodas() {
        return ResponseEntity.ok(service.traerTodas());
    }
    
}

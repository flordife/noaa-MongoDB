package ar.com.ada.noaamongo.noaa.repos;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ar.com.ada.noaamongo.noaa.entities.Boya;

@Repository
public interface BoyaRepository extends MongoRepository<Boya, ObjectId>{
    
}

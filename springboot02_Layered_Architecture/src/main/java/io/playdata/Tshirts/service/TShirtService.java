package io.playdata.Tshirts.service;

import io.playdata.Tshirts.model.TShirt;
import io.playdata.Tshirts.repository.TShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TShirtService {
    @Autowired
    private TShirtRepository tShirtRepository;
    public List<TShirt> getAllTShirts() {
        return tShirtRepository.findAll();
    }
    public TShirt getTShirtById(Long id) {
        return tShirtRepository.findById(id).orElse(null);
    }
    public TShirt addTShirt(TShirt tShirt) {
        return tShirtRepository.save(tShirt);
    }
    public TShirt updateTShirt (TShirt tShirt) {
        TShirt existingTShirt = tShirtRepository.findById(tShirt.getId()).orElse(null);
        if (existingTShirt != null) {
            existingTShirt.setColor(tShirt.getColor());
            existingTShirt.setLogo(tShirt.getLogo());
            existingTShirt.setSize(tShirt.getSize());
            existingTShirt.setPrice(tShirt.getPrice());
            return tShirtRepository.save(existingTShirt);
        } else {
            return null;
        }
    }
    public void deleteTShirtById(Long id) {
        tShirtRepository.deleteById(id);
    }
}





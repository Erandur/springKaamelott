package com.springRestAngular.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springRestAngular.business.Kaamelott;
import com.springRestAngular.repository.KaamelottRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class KaamelottController {

private KaamelottRepository repository;
	
	@Autowired
    public void setKaamelottService(KaamelottRepository repository) {
        this.repository = repository;
    }
	
	@GetMapping("/kaamelott")
	public List<Kaamelott> getAll() {
		return repository.findAll();
	}
	
	@GetMapping("/kaamelott/{id}")
	public Kaamelott getOne(@PathVariable String id) {
		return repository.findById(Long.valueOf(id)).get();
	}
	
	@PostMapping("/kaamelott")
	public Kaamelott creerKaamelott(@Valid @RequestBody Kaamelott kaamelott) {
		return repository.save(kaamelott);
	}
	
	@PutMapping("/kaamelott/{id}")
	public ResponseEntity<Kaamelott> updateKaamelott (@PathVariable String id, @Valid @RequestBody Kaamelott neoKaamelott) {
		Kaamelott kaamelott = repository.findById(Long.valueOf(id)).get();
		kaamelott.setPrenom(neoKaamelott.getPrenom());
		kaamelott.setRole(neoKaamelott.getRole());
		Kaamelott updateKaamelott = repository.save(kaamelott);
		return ResponseEntity.ok(updateKaamelott);
	}
	
	@DeleteMapping("/kaamelott/{id}")
	public void deleteKaamelott(@PathVariable String id) {
		Kaamelott kaamelott = repository.findById(Long.valueOf(id)).get();
		repository.delete(kaamelott);
	}
	
}

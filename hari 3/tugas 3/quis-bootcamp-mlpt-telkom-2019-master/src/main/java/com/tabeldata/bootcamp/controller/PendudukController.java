package com.tabeldata.bootcamp.controller;

import com.tabeldata.bootcamp.entity.Penduduk;
import com.tabeldata.bootcamp.repository.PendudukRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PendudukController {

    @Autowired
    private PendudukRepository repo;

    @GetMapping("/penduduk/{nip}")
    public ResponseEntity<?> findById(@PathVariable("nip") String nip) {
        Optional<Penduduk> pendudukOptional = repo.findById(nip);
        if (pendudukOptional.isPresent())
            return ResponseEntity.ok(pendudukOptional.get());
        else
            return ResponseEntity.noContent().build();
    }

    @GetMapping("/penduduk/list")
    public Iterable<Penduduk> listPenduduk() {
        return repo.findAll();
    }

    @DeleteMapping(value = "/penduduk/{nip}")
    public ResponseEntity<?> deleteById(@PathVariable("nip") String nip) {
        if (repo.existsById(nip)) {
            repo.deleteById(nip);
            return ResponseEntity.ok().build();
        } else
            return ResponseEntity.noContent().build();
    }

    @PostMapping("/penduduk")
    public ResponseEntity<?> save(@RequestBody Penduduk penduduk) {
        penduduk = repo.save(penduduk);
        return ResponseEntity.ok(penduduk);
    }
}

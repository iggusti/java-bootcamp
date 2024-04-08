package com.tabeldata.bootcamp.repository;

import com.tabeldata.bootcamp.entity.Penduduk;
import org.springframework.data.repository.CrudRepository;

public interface PendudukRepository extends CrudRepository<Penduduk, String> {
}

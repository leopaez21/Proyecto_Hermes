package com.hermes.api.service.jpa;

import com.hermes.api.entity.Saldo;
import com.hermes.api.repository.SaldosRepository;
import com.hermes.api.service.ISaldoService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaldosService implements ISaldoService{
    
   @Autowired
    private SaldosRepository repoSaldos;

    public List<Saldo> buscarTodos() {
        return repoSaldos.findAll();
    }
  
}

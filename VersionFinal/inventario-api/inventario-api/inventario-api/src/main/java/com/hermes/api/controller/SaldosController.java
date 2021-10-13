package com.hermes.api.controller;

import com.hermes.api.entity.Saldo;
import com.hermes.api.service.ISaldoService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

public class SaldosController {
    @Autowired
    private ISaldoService serviceSaldo;

    @GetMapping ("/saldos")
    public List<Saldo> buscarTodos() {
        return serviceSaldo.buscarTodos();
    }
}

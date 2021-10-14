
package com.hermes.api.service;

import com.hermes.api.entity.Remision;
import java.util.List;

public interface IRemisionService {
    List<Remision> buscarTodos();
    void guardar(Remision remision);
    List<Remision> searchByIdremision(int idremision);
}

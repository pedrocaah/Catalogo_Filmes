package com.mtanuri.t1113.controller.command.impl.diretor;

import com.mtanuri.t1113.repository.DiretorRepository;

import java.util.Map;

public class RemoveFilme extends DiretorCommand {
    public RemoveFilme(DiretorRepository repository) {
        super(repository);
    }

    @Override
    public void executar(Map<String, Object> params) {
        int idDiretor = (int) params.get("idDiretor");
        int idFilme = (int) params.get("idFilme");
        repository.removerFilme(idDiretor, idFilme);
    }
}

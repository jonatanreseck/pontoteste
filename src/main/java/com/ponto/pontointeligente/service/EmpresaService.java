package com.ponto.pontointeligente.service;

import java.util.Optional;
import com.ponto.pontointeligente.entities.Empresa;
import com.ponto.pontointeligente.repositories.EmpresaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface EmpresaService{

    /**
     * Retorna uma empresa dado um CNPJ.
     *
     * @param cnpj
     * @return Optional<Empresa>
     */
    Optional<Empresa> buscarPorCnpj(String cnpj);

    /**
     * Cadastra uma nova empresa na base de dados.
     *
     * @param empresa
     * @return Empresa
     */
    Empresa persistir(Empresa empresa);

}

package com.algaworks.algamoney.api.repository.lancamento;

import java.util.List;

import com.algaworks.algamoney.api.model.Pessoa;
import com.algaworks.algamoney.api.repository.filter.PessoaFilter;

public interface PessoaRepositoryQuery {
	public List<Pessoa> filtrar(PessoaFilter pessoaFilter);
}

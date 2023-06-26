package com.matheus.pagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.pagamentos.model.Pagamento;

public interface PagamentoRepositoy extends JpaRepository<Pagamento, Long> {
}

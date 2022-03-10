package com.teste.barbearia.model.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.teste.barbearia.model.enuns.NumeroHorariosOfertados;

import br.com.caelum.stella.ValidationMessage;
import br.com.caelum.stella.validation.CPFValidator;
/**
 * @author omar.lopes
 *
 */


public class Cliente{
  
  private Long id;
  private String nome;
  private String cpf;
  private Long id_endereco;
  
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public static NumeroHorariosOfertados quantidadeHorarios = NumeroHorariosOfertados.NUMERO_HORARIOS_OFERTADOS;
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    CPFValidator cpfValidator = new CPFValidator(); 
    List<ValidationMessage> erros = cpfValidator.invalidMessagesFor(cpf);
    this.cpf = cpf;
  }
  public Long getId_endereco() {
    return id_endereco;
  }
  public void setId_endereco(Long id_endereco) {
    this.id_endereco = id_endereco;
  }
  
  
  
  
}

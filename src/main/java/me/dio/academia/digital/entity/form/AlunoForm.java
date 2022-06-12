package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotEmpty(message = "Preencha o Campo Corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' Precisa Estar Entre {min} e {max} Caracteres.")
  private String nome;

  @NotEmpty(message = "Preencha o Campo Corretamente.")
  @CPF(message = "'${validatedValue}' é Inválido!")
  private String cpf;

  @NotEmpty(message = "Preencha o Campo Corretamente.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' Precisa Estar Entre {min} e {max} Caracteres.")
  private String bairro;

  @NotNull(message = "Preencha o Campo Corretamente.")
  @Past(message = "Data '${validatedValue}' é Inválida.")
  private LocalDate dataDeNascimento;
}

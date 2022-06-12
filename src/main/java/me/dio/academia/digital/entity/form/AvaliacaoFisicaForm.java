package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  // @Positive(message = "O Id do Aluno Precisa Ser Positivo.")
  private Long alunoId;

  // @NotNull(message = "Preencha o Campo Corretamente.")
  // @Positive(message = "${validatedValue}' Precisa Ser Positivo.")
  private double peso;

  // @NotNull(message = "Preencha o Campo Corretamente.")
  // @Positive(message = "${validatedValue}' Precisa Ser Positivo.")
  // @DecimalMin(value = "150", message = "'${validatedValue}' Precisa Ser no
  // Mínimo {value}.")
  private double altura;
}

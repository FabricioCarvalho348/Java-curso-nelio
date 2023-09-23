package datas.em.java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciandoEFormatandoDatas {
    public static void main(String[] args) {
        // Formatação com um determinado padrão
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Data e horario com hora e minuto
        DateTimeFormatter formatacaoDataHoraMinuto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Instanciação de Datas
        LocalDate dataLocal = LocalDate.now(); // Data agora (no exato momento que você executa o programa)
        LocalDateTime dataHoraLocal = LocalDateTime.now(); // data e horário local
        Instant dataHoraGlobal = Instant.now(); // data horario e time zone global (LONDRES)
        LocalDate dataNoFormatoISO8601 = LocalDate.parse("2023-09-16"); // data formato ISO 8601
        LocalDateTime dataHoraISO8601 = LocalDateTime.parse("2023-09-16T09:10:26"); // data formato ISO 8601
        Instant dataHoraUTC = Instant.parse("2023-09-16T09:10:26-03:00"); // Usando instant para data e horario em São Paulo GMT-03:00

        // o método parse tem uma sobrecarga que aceita como você vai formatar sua data
        LocalDate dataLocal02 = LocalDate.parse("20/07/2022", formatacaoData);
        LocalDateTime dataHoraLocal02 = LocalDateTime.parse("20/07/2022 01:30", formatacaoDataHoraMinuto);

        LocalDate dataAnoMesDia = LocalDate.of(2022, 7, 20);
        LocalDateTime dataAnoMesDiaHoraMinuto = LocalDateTime.of(2022, 7, 20, 1, 30);

        // Imprimindo em todos os formatos
        System.out.println("Data local neste momento: " + dataLocal + "\n"); // localmente (data do seu computador)

        System.out.println("Data e horário neste momento: " + dataHoraLocal + "\n"); // localmente (data e horário do seu computador)

        System.out.println("Data e horário global: " + dataHoraGlobal + "\n"); // data e horario global data-horario londres-timezone (HORARIO LONDRES/ UTC/ GMT)

        System.out.println("Data no formato ISO 8601: " + dataNoFormatoISO8601 + "\n"); // data no formato ISO 8601

        System.out.println("Data e Horário no formato ISO 8601: " + dataHoraISO8601 + "\n"); // DATA E HORÁRIO NO FORMATO ISO 8601

        System.out.println("Data e horario no GMT-03:00 (São Paulo) usando o Instant: " + dataHoraUTC + "\n"); // Data hora global para GMT-03:00 SP

        System.out.println("Data formatada: " + dataLocal02 + "\n"); // DATA COM FORMATAÇÃO USANDO DATE TIME FORMATTER

        System.out.println("Data formatada: " + dataHoraLocal02 + "\n"); // DATA E HORA COM FORMATAÇÃO USANDO DATE TIME FORMATTER

        System.out.println("data utilizando o método of: " + dataAnoMesDia + "\n"); // data com o método of

        System.out.println("data utilizando o método of: " + dataAnoMesDiaHoraMinuto + "\n"); // data e hora com o método of

    }
}

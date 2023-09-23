package datas.em.java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraParaTexto {
    public static void main(String[] args) {
        LocalDate primeiraDataFormatadaParaTexto = LocalDate.parse("2023-09-23");
        LocalDateTime dataHorarioISO8601 = LocalDateTime.parse("2023-09-23T10:14:26");
        Instant dataHoraFormatoUTC = Instant.parse("2023-09-23T10:14:26Z");


        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter formatacaoDaData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatacaoDataHoraMinuto = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Especificando o fuso horario que vou utilizando com withZone
        DateTimeFormatter formatacaoDataHorarioFusoHorario = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        // UTILIZANDO PADRÃO ISO
        DateTimeFormatter formatacaoPadraoISO = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatacaoPadraoISOInstant = DateTimeFormatter.ISO_INSTANT;

        // UTILIZANDO TRÊS FORMAS DIFERENTES PARA FORMATAR DATA PARA TEXTO
        System.out.println("Data para um padrão definido = " + primeiraDataFormatadaParaTexto.format(formatacaoDaData) + "\n");
        System.out.println("Data para um padrão definido mudando o parametro = " + formatacaoDaData.format(primeiraDataFormatadaParaTexto) + "\n");
        System.out.println("Data para um padrão definido passando o formato dentro do método format = " + primeiraDataFormatadaParaTexto.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n");

        System.out.println("Data no formato ISO8601 = " + dataHorarioISO8601.format(formatacaoDaData) + "\n");
        System.out.println("Data e o Horário no padrão ISO8601 para padrão = " + dataHorarioISO8601.format(formatacaoDataHoraMinuto) + "\n");
        System.out.println("Data e o Horário no formato ISO8601 utilizando ISO_DATE_TIME = " + dataHorarioISO8601.format(formatacaoPadraoISO) + "\n");

        System.out.println("Formatando especificando o fuso horario do meu sistema = " + formatacaoDataHorarioFusoHorario.format(dataHoraFormatoUTC) + "\n");
        System.out.println("Formatacao usando o método ISO_INSTANT = " + formatacaoPadraoISOInstant.format(dataHoraFormatoUTC) + "\n");
        System.out.println("Formatacao com toString (Imprime no padrão ISO) = " + dataHoraFormatoUTC.toString() + "\n");
    }

}


package utils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
    

/**
 * Classe DateUtils para fazer a conversão entre objetos do tipo LocalDate para
 * Date e vice-versa
 * @author andre
 */
public class DateUtils {

    /**
     * LocalDate para Date
     * @param localDate
     * @return 
     */
  public static Date asDate(LocalDate localDate) {
    return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
  }

  /**
   * LocalDateTime para Date
   * @param localDateTime
   * @return 
   */
  public static Date asDate(LocalDateTime localDateTime) {
    return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
  }

  /**
   * Date para LocalDate
   * @param date
   * @return 
   */
  public static LocalDate asLocalDate(Date date) {
    return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
  }

  /**
   * Date para LocalDateTime
   * @param date
   * @return 
   */
  public static LocalDateTime asLocalDateTime(Date date) {
    return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
  }
}
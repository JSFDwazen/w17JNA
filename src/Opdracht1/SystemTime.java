/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht1;

import com.sun.jna.Structure;

/**
 *
 * @author Vito Corleone
 */
public class SystemTime extends Structure{
    
  public short wYear;
  public short wMonth;
  public short wDayOfWeek;
  public short wDay;
  public short wHour;
  public short wMinute;
  public short wSecond;
  public short wMilliseconds;
  
  public String toString(){
      int uur = Short.toUnsignedInt(wHour) + 1;
      StringBuilder sb = new StringBuilder();
      sb.append("Het is: \n" );
      sb.append(wDay + "-" + wMonth + "-" + wYear + "\n" );
      sb.append( Integer.toString(uur)+ ":" + wMinute + ":" + wSecond + " and " + wMilliseconds + " ms \n");
      return sb.toString();
  }
  
  public int inMilliseconden(){
      return (wMinute * 60 * 1000) + (wSecond * 1000) + (wMilliseconds);
  }
}

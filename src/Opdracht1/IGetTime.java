/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht1;
import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 *
 * @author Vito Corleone
 */
public interface IGetTime extends Library{
    
    public IGetTime INSTANCE = (IGetTime)Native.loadLibrary("Kernel32", IGetTime.class);
   
    public void GetSystemTime(SystemTime result);   
}

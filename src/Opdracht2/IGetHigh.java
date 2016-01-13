/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht2;
import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.IntByReference;
/**
 *
 * @author Vito Corleone
 */
public interface IGetHigh extends Library{
        public IGetHigh INSTANCE = (IGetHigh)Native.loadLibrary("kernel32", IGetHigh.class);
        
        boolean GetDiskFreeSpaceA(String path, IntByReference r1,IntByReference r2, IntByReference r3, IntByReference r4); 

}

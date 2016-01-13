/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Opdracht2;
import com.sun.jna.Library;
import com.sun.jna.Native;
/**
 *
 * @author Vito Corleone
 */
public interface IGetHigh extends Library{
        public IGetHigh INSTANCE = (IGetHigh)Native.loadLibrary("Kernel32", IGetHigh.class);
        
        void GetDiskFreeSpaceA(String path, HighSpace result); 

}

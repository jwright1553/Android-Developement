/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
public class MaxVariablesDemo {
    public static void main(String args[]) {
 
        //integers
        byte largestByte = Byte.MIN_VALUE;
        short largestShort = Short.MIN_VALUE;
        int largestInteger = Integer.MIN_VALUE;
        long largestLong = Long.MIN_VALUE;
 
        //real numbers
        float largestFloat = Float.MIN_VALUE;
        double largestDouble = Double.MIN_VALUE;
 
        //other primitive types
 
        //Display them all.
        System.out.println("The smallest byte value is "
                           + largestByte + ".");
        System.out.println("The smallest short value is "
                           + largestShort + ".");
        System.out.println("The smallest integer value is "
                           + largestInteger + ".");
        System.out.println("The smallest long value is "
                           + largestLong + ".");
 
        System.out.println("The smallest float value is "
                           + largestFloat + ".");
        System.out.println("The smallest double value is "
                           + largestDouble + ".");
 
     }
}

/*

The output was as follows:
The smallest byte value is -128.
The smallest short value is -32768.
The smallest integer value is -2147483648.
The smallest long value is -9223372036854775808.
The smallest float value is 1.4E-45.
The smallest double value is 4.9E-324.

*/

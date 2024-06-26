/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.navercorp.mathutil.core;

/**
 *
 * @author HP
 */
public class MathUtility {
    
    // hàm tính n! = 1 . 2. 3. 4 . ... n
    //Hàm là static vì tính xong trả về th, không nhớ nhung gì cã
    //Thường các thư viện sẽ là static dùng chung tính toán mọi số liệu
    
    //Quy ước 0! = 1! = 1
    //Bài này chỉ làm từ 0 -> 20! vì 21! vượt (long)  
    public static long getFactorial(int n){
         //tích-kết quả phép nhân
        
        if( n < 0 || n >20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if ( n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n-1);
        
       
        
        
    }
}

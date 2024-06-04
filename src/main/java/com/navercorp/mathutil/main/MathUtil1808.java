/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.navercorp.mathutil.main;

//quy tac dat ten package trong java
import com.navercorp.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

//-Chu thuong toan tap
//-Ghi theo tên miền công ty đảo ngược
//com.tên-cty.Tên-dự-án.tên-module-nhóm-chức-năng
//com.microsoft.sqlserver.jdbc. Tên class import vào để dùng
//KMS (Katalon) com.kms
//C#   Giaolang.MathUtil
public class MathUtil1808 {
    public static void main(String[] args) {
        //Cách 2: test hàm = cách POPUP
        int n = 0;
        long expectedValue = 1; //hy vọng 0! = 1
        long actualValue; //=? chờ hàm trở về
        actualValue = MathUtility.getFactorial(n);
        String result = n + "! | expexted: " + expectedValue + " | Actual: " + actualValue;
        JOptionPane.showMessageDialog(null, result);
    }
    
    
    
    
    
    
    
//    public static void main(String[] args) {
//        //Test Case #01
//        //N=0, EX value: 1 , actual value: ? status: passed/Faild
//        int n = 0;
//        long expectedValue = 1; //hy vọng 0! = 1
//        long actualValue; //=? chờ hàm trở về
//        actualValue = MathUtility.getFactorial(n);
//
//        System.out.println("0! | Expected: " + expectedValue + " Actual: " + actualValue);
//
//        //Test Case #02
//        //N=1, EX value: 1 , actual value: ? status: passed/Faild
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1! | Expected: " + expectedValue + " Actual: " + actualValue);
//
//        //Test Case #03
//        //N=5, EX value: 1 , actual value: ? status: passed/Faild
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! | Expected: " + expectedValue + " Actual: " + actualValue);
//        
//        //Test Case #04
//        //N=-1, EX value: Thấy ngoại lệ , actual value: ? status: passed/Faild
//        n = -1;
//        System.out.println("Check if the illegal Argument Expection is thrown");
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("-1! | Expected: " + expectedValue + " Actual: " + actualValue);
//    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.navercorp.mathutil.core;
//Quy tắt đặt tên package trong java
// Tên miền city đảo ngược, đi kèm thông tin dự án/project và
//.com.tên-city.tên-dự án.moudle.tên-class
//com.microsoft.sqlserver.jdbc.
//.Net: chiều xuôi, chữ hoa từng đầu từ

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ASUS
 */
//class này chứa các test case dùng để test code của class
//Chính bên MathUtilityTest
public class MathUtilityTest {

    //Test case: là bộ data đầu vào + thao tác nhập xuất trên
    //          app, màn hình, trên hàm
    //          Để verify 1 hàm, màn hình, chức năng chạy đúng hay sai!!!PE
    //Test case #1: Check/test getF() with n = 0
    //Input/Given n = 0
    //Steps/Procedure (bước test)
    // call method getFactorial(n)
    //Expected Result: 1 (hy vọng 0! = 1)
    //*Actual Result: ??? chờ chạy hàm mới biết
    //* Status: passed | failed
    @Test    //Framework ép ta phải viết code theo 1 quy tắc nào đó
    //thư viện cho viết tự do, gọi hàm tự do
    //framework là thư viện, nhưng thư viện ko hẳn là framework
    public void testFactorialGivenRightArg0ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
    }

    //Test case: là bộ data đầu vào + thao tác nhập xuất trên
    //          app, màn hình, trên hàm
    //          Để verify 1 hàm, màn hình, chức năng chạy đúng hay sai!!!PE
    //Test case #2: Check/test getF() with n = 1
    //Input/Given n = 0
    //Steps/Procedure (bước test)
    // call method getFactorial(n)
    //Expected Result: 1 (hy vọng 1! = 1)
    //*Actual Result: ??? chờ chạy hàm mới biết
    //* Status: passed | failed
    @Test
    public void testFactorialGivenRightArg1ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
    }

    //Test case #3: check getF() with n = 5, expected =120
    public void testFactorialGivenRightArg2ReturnsWell() {
        assertEquals(120, MathUtility.getFactorial(5));
    }

    public void testFactorialGivenRightArg12345ReturnsWell() {
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
    }
    
    //Test case #5: check getF() with n = -1, the method throw Exception
    @Test
    public void testFactorialGivenRightArg_1ThrowsException() {
        //MathUtility.getFactorial(-1);
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
    }
}

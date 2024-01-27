package com.mycompany.laptrinhmang1;


import java.net.InetAddress;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hoang
 */
public class GetIP {
    public static void main(String[] args) {
        //Lay dia chi IP cua 1 may chu
        try {
            InetAddress inet = InetAddress.getByName("www.google.com");
            System.out.println("Dia chi IP cua trang web google.com "+inet.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package com.mycompany.laptrinhmang1;

import java.net.InetAddress;

/**
 *
 * @author hoang
 */
public class Laptrinhmang1 {

    public static void main(String[] args) {
        try{
            InetAddress inet=InetAddress.getByName("www.google.com");
            boolean isKN = inet.isReachable(5000);
            if(isKN){
                System.out.println("Co internet");
            }
            else{
                System.out.println("Khong co ket noi internet");
            }
        } catch (Exception e){
        }
    }
}
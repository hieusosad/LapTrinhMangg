/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laptrinhmang1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

/**
 *
 * @author hoang
 */
public class DisplayAllIP {
    public static void main(String[] args) {
        try {
            // Lay ve tat ca cac interface cua may
            Enumeration<NetworkInterface> netIntercae 
                    = NetworkInterface.getNetworkInterfaces();
            while (netIntercae.hasMoreElements()) {
                NetworkInterface networkInterface = netIntercae.nextElement();
                Enumeration<InetAddress> inetAdress 
                        = networkInterface.getInetAddresses();
                //Duyet qua tung dia chi IP va in ra man hinh
                while(inetAdress.hasMoreElements()){
                    InetAddress address
                            = inetAdress.nextElement();
                    System.out.println("Interface: "+networkInterface.getName()+"Dia chi IP: "+address.getHostAddress());
                }
            }
 
        } catch (Exception e) {
        }
    }
}
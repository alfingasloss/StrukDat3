/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3_Latihan;

import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Alfin Arif
 */
public class MainQueue {
    public void queueExample(){
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");
        
        System.out.println("Remove  : " + queue.remove());
        System.out.println("Element : " + queue.element());
        System.out.println("Poll    : " + queue.poll());
        System.out.println("Peek    : " + queue.peek());
    }
    
    public static void main(String[] args){
        new MainQueue().queueExample();
    }
}

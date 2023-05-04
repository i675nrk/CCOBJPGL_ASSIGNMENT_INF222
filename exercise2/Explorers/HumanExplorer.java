package Explorers;

import Planets.*;

public class HumanExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("hey hey !! starting to explore mercury.");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("hey hey !! starting to explore mars.");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("hey hey !! starting to explore earth.");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("hey hey !! starting to explore saturn.");
    }
    
    @Override
    public void visit(Pluto pluto) {
        System.out.println("hey hey !! starting to explore pluto.");
    }
    
    @Override
    public void visit(Uranus uranus) {
         System.out.println("hey hey !! starting to explore uranus.");
    }

    @Override
    public void visit(Venus venus) {
         System.out.println("hey hey !! starting to explore venus.");
    }

    @Override
    public void visit(Jupiter jupiter) {
         System.out.println("hey hey !! starting to explore jupiter.");
    }

    @Override
    public void visit(Neptune neptune) {
         System.out.println("hey hey !! starting to explore neptune.");
    }
    
}
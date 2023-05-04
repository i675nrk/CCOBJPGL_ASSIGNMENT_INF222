package Explorers;

import Planets.*;

public class RobotExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("bleep blop... exploring mercury");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("bleep blop... exploring mars");
    }

    @Override
    public void visit(Earth earth) {
        System.out.println("bleep blop... exploring earth");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("bleep blop... exploring saturn");
    }
    
    @Override
    public void visit(Pluto pluto) {
        System.out.println("bleep blop... exploring pluto");
    }
    
    @Override
    public void visit(Uranus uranus) {
         System.out.println("bleep blop... exploring uranus");
    }

    @Override
    public void visit(Venus venus) {
         System.out.println("bleep blop... exploring venus");
    }

    @Override
    public void visit(Jupiter jupiter) {
         System.out.println("bleep blop... exploring jupiter");
    }

    @Override
    public void visit(Neptune neptune) {
         System.out.println("bleep blop... exploring neptune");
    }
    
}
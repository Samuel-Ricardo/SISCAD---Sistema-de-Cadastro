/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Samuel
 */
public class Person {
    
    private int id;
    private String name;
    private String Genre;
    private String Address;
    private String cargo;
    private int ativo;

    public Person(int id, String name, String Genre, String Address, String cargo, int ativo) {
        this.id = id;
        this.name = name;
        this.Genre = Genre;
        this.Address = Address;
        this.cargo = cargo;
        this.ativo = ativo;
    }

    public Person() {
    }
    
}

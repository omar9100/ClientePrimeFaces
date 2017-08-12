/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.netec.controller;

import com.netec.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

/**
 *
 * @author Oracle
 */
@ManagedBean
@RequestScoped
public class ClienteController {
    private Cliente cliente;
    List<Cliente> listCliente;
    private List<String> lstMunicipios;


    
    @PostConstruct
    public void init(){
        cliente = new Cliente();
        listCliente = new ArrayList<>();
        listCliente.add(new Cliente("Pepe","Perez","Mexico"));
        listCliente.add(new Cliente("Pepe1","Perez1","Mexico1"));
        listCliente.add(new Cliente("Pepe2","Perez2","Mexico2"));
        listCliente.add(new Cliente("Pepe3","Perez3","Mexico3"));
        listCliente.add(new Cliente("Pepe4","Perez4","Mexico4"));
        listCliente.add(new Cliente("Pepe5","Perez5","Mexico5"));
        listCliente.add(new Cliente("Pepe6","Perez6","Mexico6"));
        listCliente.add(new Cliente("Pepe7","Perez7","Mexico7"));
        listCliente.add(new Cliente("Pepe8","Perez8","Mexico8"));
        listCliente.add(new Cliente("Pepe9","Perez9","Mexico9"));
        listCliente.add(new Cliente("Pepe10","Perez10","Mexico10"));
        listCliente.add(new Cliente("Pepe11","Perez11","Mexico11"));
       
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Cliente> getListCliente() {
        return listCliente;
    }

    public void setListCliente(List<Cliente> listCliente) {
        this.listCliente = listCliente;
    }
    
    public void cargarMunicipios(AjaxBehaviorEvent event){
        lstMunicipios = new ArrayList<>();
               
        switch(Integer.parseInt(cliente.getEstado())){
            case 1:
               // lstMunicipios = new ArrayList<>();
                lstMunicipios.add("Acapulco");
                lstMunicipios.add("Calera");
                break;
                
            case 2:
               // lstMunicipios = new ArrayList<>();
                lstMunicipios.add("Tampico");
                lstMunicipios.add("Altotonga");
                break;
                
            case 3:
               // lstMunicipios = new ArrayList<>();
                lstMunicipios.add("Jalisco");
                lstMunicipios.add("Zapopan");
                break;
        }
    }
    
        public List<String> getLstMunicipios() {
        return lstMunicipios;
    }

    public void setLstMunicipios(List<String> lstMunicipios) {
        this.lstMunicipios = lstMunicipios;
    }
}

package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.sound.midi.Soundbank;
import javax.swing.JOptionPane;

import Modelo.Mundo;
import Modelo.Registro;
import Vista.InterfazGUI;
import Vista.PanelEntrada;

public class Controlador implements ActionListener{

	//Atributos que vienen del Modelo (mundo) 
	private Mundo bd;
	 
	//Atributos que vienen de Vista - GUI
	private InterfazGUI gui;
	public static  ArrayList< Registro> objRegistro = new ArrayList();
	  public static String mNombre;
	  public static int mEdad ; 
	  public static int mSalario;
	
	public Controlador() {

		//aqui van los constructores tanto de Mundo, como de Vista
		
		bd = new Mundo();
		
		//se Modifica contructor de InterfazGUI para que reciba como parámetro la instancia de Controlador
		gui = new InterfazGUI(this);
		gui.setVisible(true); //hacer visible la ventana principal
		
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		// TODO Auto-generated method stub
		String resultado;
		if (evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR)) {
			resultado = bd.getBD().escribirArchivoBinario();
			gui.escribirMensaje(resultado);
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER)) {
			//haga algo de por Dios!!
			bd.getBD().leerArchivoBinario();
			mostrarCifras();
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().ESCRIBIR_REG)) {
			gui.escribirMensaje(bd.getBD().escribirRegistro());
		}
		
		if(evento.getActionCommand().equals(gui.getPanelEntrada().LEER_REG)) {
			bd.getBD().leerRegistro();
			mostrarRegistros();
		}
		
			if(evento.getActionCommand().equals(gui.getPanelEntrada().INGRESAR)) {
				mNombre= gui.getPanelEntrada().getTxtNombre().getText();
			     mEdad= Integer.parseInt(gui.getPanelEntrada().getTxtEdad().getText());
			     mSalario = Integer.parseInt(gui.getPanelEntrada().getTxtSalario().getText());
			     objRegistro.add(new Registro(mNombre,mEdad,mSalario));
			     for (int i = 0; i < objRegistro.size(); i++) {
			    	System.out.println(objRegistro.get(i).getNombre());
			    	 System.out.println(objRegistro.get(i).getEdad());
			    	 System.out.println(objRegistro.get(i).getSalario());
			     }
			}	
	}
	
	private void mostrarCifras() {
		for (int i= 0 ; i<bd.getBD().getREGISTROS() ; i++) {
			gui.getPanelResultados().getTxtMonto().append(String.valueOf(bd.getBD().getNumeros()[i])+"\n");
			gui.getPanelResultados().getTxtValores().append(String.valueOf(bd.getBD().getValores()[i])+"\n");
		}	
	}
	
	private void mostrarRegistros() {
		for (int i= 0 ; i<1 ; i++) {
			gui.getPanelRegistro().getTxtEdad().append(String.valueOf(bd.getBD().getDatos()[i].getEdad())+"\n");
			gui.getPanelRegistro().getTxtNombre().append(String.valueOf(bd.getBD().getDatos()[i].getNombre())+"\n");
			gui.getPanelRegistro().getTxtSalario().append(String.valueOf(bd.getBD().getDatos()[i].getSalario())+"\n");
		}	
	}
}

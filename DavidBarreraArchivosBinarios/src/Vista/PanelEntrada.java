package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import Modelo.Registro;

public class PanelEntrada extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel labEntrada;
	private JLabel labEdad;
	private JLabel labNombre;
	private JLabel labsalario;
	private JTextField txtNumero;
	private JTextField txtNombre;
	private JTextField txtEdad;
	private JTextField txtSalario;
	private JButton butLeer;
	private JButton butEscribir;
	private JButton butLeerReg;
	private JButton butEscribirReg;
	private JButton butIngresarDatos;
	public static final String INGRESAR = "Ingresar";
	public static final String ESCRIBIR = "Escribir";

	public static final String LEER = "Leer";
	public static final String ESCRIBIR_REG = "EscribirReg";
	public static final String LEER_REG = "LeerReg";

	public PanelEntrada() {
		setLayout(new GridLayout(2, 5));// se define el grid de 2x2
		TitledBorder border = BorderFactory.createTitledBorder("Archivos Binarios");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		labEntrada = new JLabel("Digite un Valor");
		txtNumero = new JTextField("");

		labNombre = new JLabel("Digite su nombre");
		txtNombre = new JTextField("");

		labEdad = new JLabel("Digite su edad ");
		txtEdad = new JTextField("");

		labsalario = new JLabel("Digite un salario");
		txtSalario = new JTextField("");

		txtNumero.setForeground(Color.BLACK);
		txtNumero.setBackground(Color.WHITE);
		butLeer = new JButton("Leer");
		butLeer.setActionCommand(LEER);
		butEscribir = new JButton("Escribir");
		butEscribir.setActionCommand(ESCRIBIR);

		butLeerReg = new JButton("Leer Registros");
		butLeerReg.setActionCommand(LEER_REG);

		butEscribirReg = new JButton("Escribir Registros");
		butEscribirReg.setActionCommand(ESCRIBIR_REG);

		butIngresarDatos = new JButton("INGRESAR");
		butIngresarDatos.setActionCommand(INGRESAR);

		labEntrada = new JLabel("Digite Su Valor");
		txtNumero = new JTextField("");

		// add(labEntrada);
		// add(txtNumero);
		add(butEscribir);
		add(butLeer);
		add(butEscribirReg);
		add(butLeerReg);

		add(labNombre);
		add(txtNombre);
		add(new JLabel(""));

		add(labEdad);
		add(txtEdad);
		add(new JLabel(""));

		add(labsalario);
		add(txtSalario);
		add(new JLabel(""));

		add(butIngresarDatos);
	}
	

	public static String getLeerReg() {
		return LEER_REG;
	}

	public JButton getButLeerReg() {
		return butLeerReg;
	}

	public void setButLeerReg(JButton butLeerReg) {
		this.butLeerReg = butLeerReg;
	}

	public JButton getButEscribirReg() {
		return butEscribirReg;
	}

	public void setButEscribirReg(JButton butEscribirReg) {
		this.butEscribirReg = butEscribirReg;
	}

	public static String getEscribirReg() {
		return ESCRIBIR_REG;
	}

	public JLabel getLabEntrada() {
		return labEntrada;
	}

	public void setLabEntrada(JLabel labEntrada) {
		this.labEntrada = labEntrada;
	}

	public JTextField getTxtNumero() {
		return txtNumero;
	}

	public void setTxtNumero(JTextField txtNumero) {
		this.txtNumero = txtNumero;
	}

	public JButton getButLeer() {
		return butLeer;
	}

	public void setButLeer(JButton butLeer) {
		this.butLeer = butLeer;
	}

	public JButton getButEscribir() {
		return butEscribir;
	}

	public void setButEscribir(JButton butEscribir) {
		this.butEscribir = butEscribir;
	}


	public JTextField getTxtNombre() {
		return txtNombre;
	}


	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}


	public JTextField getTxtEdad() {
		return txtEdad;
	}


	public void setTxtEdad(JTextField txtEdad) {
		this.txtEdad = txtEdad;
	}


	public JTextField getTxtSalario() {
		return txtSalario;
	}


	public void setTxtSalario(JTextField txtSalario) {
		this.txtSalario = txtSalario;
	}


	public JButton getButIngresarDatos() {
		return butIngresarDatos;
	}


	public void setButIngresarDatos(JButton butIngresarDatos) {
		this.butIngresarDatos = butIngresarDatos;
	}


	public static String getIngresar() {
		return INGRESAR;
	}
	
	
	 
    	
     
	
	
	

}

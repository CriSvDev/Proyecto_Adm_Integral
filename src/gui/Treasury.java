package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Treasury extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnRegistro;
	private JMenu mnConsultas;
	private JMenu mnConciliacionBancaria;
	private JMenu mnProcesos;
	private JMenu mnReportes;
	private JMenu mnCartas;
	private JMenu mnGeneracinDeOp;
	private JMenu mnReportesGerenciales;
	private JMenu mnSalir;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	private JMenuItem mntmNewMenuItem_5;
	private JMenuItem mntmNewMenuItem_6;
	private JMenuItem mntmNewMenuItem_7;
	private JMenuItem mntmNewMenuItem_8;
	private JMenuItem mntmNewMenuItem_9;
	private JMenuItem mntmNewMenuItem_10;
	private JMenuItem mntmNewMenuItem_11;
	private JMenuItem mntmNewMenuItem_12;
	private JMenuItem mntmNewMenuItem_13;
	private JMenuItem mntmNewMenuItem_14;
	private JMenuItem mntmNewMenuItem_15;
	private JMenuItem mntmNewMenuItem_16;
	private JMenuItem mntmNewMenuItem_17;
	private JMenuItem mntmNewMenuItem_18;
	private JMenuItem mntmPagoDeMovilidades;
	private JMenuItem mntmNewMenuItem_19;
	private JMenuItem mntmNewMenuItem_20;
	private JMenuItem mntmNewMenuItem_21;
	private JMenuItem mntmNewMenuItem_22;
	private JMenuItem mntmNewMenuItem_23;
	private JMenuItem mntmNewMenuItem_24;
	private JMenuItem mntmNewMenuItem_25;
	private JMenuItem mntmNewMenuItem_26;
	private JMenuItem mntmNewMenuItem_27;
	private JMenuItem mntmNewMenuItem_28;
	private JMenuItem mntmNewMenuItem_29;
	private JMenuItem mntmNewMenuItem_30;
	private JMenuItem mntmNewMenuItem_31;
	private JMenuItem mntmNewMenuItem_32;
	private JMenuItem mntmNewMenuItem_33;
	private JMenuItem mntmNewMenuItem_34;
	private JMenuItem mntmNewMenuItem_35;
	private JMenuItem mntmNewMenuItem_36;
	private JMenuItem mntmNewMenuItem_37;
	private JMenuItem mntmNewMenuItem_38;
	private JMenuItem mntmNewMenuItem_39;
	private JMenuItem mntmNewMenuItem_40;
	private JMenuItem mntmNewMenuItem_41;
	private JMenuItem mntmNewMenuItem_42;
	private JMenuItem mntmNewMenuItem_43;
	private JMenuItem mntmNewMenuItem_44;
	private JMenuItem mntmNewMenuItem_45;
	private JMenuItem mntmNewMenuItem_46;
	private JMenuItem mntmNewMenuItem_47;
	private JMenuItem mntmNewMenuItem_48;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Treasury frame = new Treasury();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Treasury() {
		setTitle("Sistema de Tesorer\u00EDa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 524);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Tablas");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Cuentas Bancarias");
		mnNewMenu.add(mntmNewMenuItem);
		
		mntmNewMenuItem_2 = new JMenuItem("Movimientos");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		mntmNewMenuItem_3 = new JMenuItem("Cheques");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		mntmNewMenuItem_4 = new JMenuItem("Programaci\u00F3n de Pagos");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		mntmNewMenuItem_5 = new JMenuItem("Configuraci\u00F3n");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		mntmNewMenuItem_1 = new JMenuItem("Cambio de Clave");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		mnRegistro = new JMenu("Registro");
		menuBar.add(mnRegistro);
		
		mntmNewMenuItem_6 = new JMenuItem("Emisi\u00F3n de Vouchers");
		mnRegistro.add(mntmNewMenuItem_6);
		
		mntmNewMenuItem_8 = new JMenuItem("Extorno / Anulaci\u00F3n de Vouchers");
		mnRegistro.add(mntmNewMenuItem_8);
		
		mntmNewMenuItem_7 = new JMenuItem("Sobregiro Cuentas Bancarias");
		mnRegistro.add(mntmNewMenuItem_7);
		
		mntmNewMenuItem_9 = new JMenuItem("Enviar y Recibir Liquidaciones / Comprobante de Pago");
		mnRegistro.add(mntmNewMenuItem_9);
		
		mntmNewMenuItem_10 = new JMenuItem("R\u00E9gimen de Retenciones SUNAT");
		mnRegistro.add(mntmNewMenuItem_10);
		
		mntmNewMenuItem_11 = new JMenuItem("Programaci\u00F3n de Pagos");
		mnRegistro.add(mntmNewMenuItem_11);
		
		mntmNewMenuItem_13 = new JMenuItem("Habilitaciones po Agencia");
		mnRegistro.add(mntmNewMenuItem_13);
		
		mntmNewMenuItem_12 = new JMenuItem("Cheque de Gerencia");
		mnRegistro.add(mntmNewMenuItem_12);
		
		mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		mntmNewMenuItem_14 = new JMenuItem("Busca Cheques en General");
		mnConsultas.add(mntmNewMenuItem_14);
		
		mntmNewMenuItem_15 = new JMenuItem("Busca Vouchers en General");
		mnConsultas.add(mntmNewMenuItem_15);
		
		mntmNewMenuItem_16 = new JMenuItem("Busca Cheques de Clientes");
		mnConsultas.add(mntmNewMenuItem_16);
		
		mnConciliacionBancaria = new JMenu("Conciliacion Bancaria");
		menuBar.add(mnConciliacionBancaria);
		
		mntmNewMenuItem_18 = new JMenuItem("Mantenimiento");
		mnConciliacionBancaria.add(mntmNewMenuItem_18);
		
		mntmNewMenuItem_17 = new JMenuItem("Procesos");
		mnConciliacionBancaria.add(mntmNewMenuItem_17);
		
		mnProcesos = new JMenu("Procesos");
		menuBar.add(mnProcesos);
		
		mntmNewMenuItem_19 = new JMenuItem("Bco. Continental");
		mnProcesos.add(mntmNewMenuItem_19);
		
		mntmNewMenuItem_20 = new JMenuItem("Generaci\u00F3n Contable");
		mnProcesos.add(mntmNewMenuItem_20);
		
		mntmPagoDeMovilidades = new JMenuItem("Pago de Movilidades");
		mnProcesos.add(mntmPagoDeMovilidades);
		
		mntmNewMenuItem_21 = new JMenuItem("Agencias");
		mnProcesos.add(mntmNewMenuItem_21);
		
		mnReportes = new JMenu("Reportes");
		menuBar.add(mnReportes);
		
		mntmNewMenuItem_22 = new JMenuItem("Voucher");
		mnReportes.add(mntmNewMenuItem_22);
		
		mntmNewMenuItem_24 = new JMenuItem("Bancos");
		mnReportes.add(mntmNewMenuItem_24);
		
		mntmNewMenuItem_23 = new JMenuItem("Tipos de Cambio");
		mnReportes.add(mntmNewMenuItem_23);
		
		mntmNewMenuItem_26 = new JMenuItem("Cheques");
		mnReportes.add(mntmNewMenuItem_26);
		
		mntmNewMenuItem_25 = new JMenuItem("Moneda Extranjera");
		mnReportes.add(mntmNewMenuItem_25);
		
		mntmNewMenuItem_27 = new JMenuItem("Reporte de movimientos de tesoreia");
		mnReportes.add(mntmNewMenuItem_27);
		
		mntmNewMenuItem_28 = new JMenuItem("Reporte de movimientos estados de cta. de Bancos");
		mnReportes.add(mntmNewMenuItem_28);
		
		mnCartas = new JMenu("Cartas");
		menuBar.add(mnCartas);
		
		mntmNewMenuItem_30 = new JMenuItem("Remesa");
		mnCartas.add(mntmNewMenuItem_30);
		
		mntmNewMenuItem_31 = new JMenuItem("Transferencias");
		mnCartas.add(mntmNewMenuItem_31);
		
		mntmNewMenuItem_32 = new JMenuItem("Compra de M.E.");
		mnCartas.add(mntmNewMenuItem_32);
		
		mntmNewMenuItem_29 = new JMenuItem("Venta M.E.");
		mnCartas.add(mntmNewMenuItem_29);
		
		mntmNewMenuItem_33 = new JMenuItem("Mantenimiento");
		mnCartas.add(mntmNewMenuItem_33);
		
		mnGeneracinDeOp = new JMenu("Generaci\u00F3n de OP");
		menuBar.add(mnGeneracinDeOp);
		
		mntmNewMenuItem_34 = new JMenuItem("Ord Pago Proveedores");
		mnGeneracinDeOp.add(mntmNewMenuItem_34);
		
		mntmNewMenuItem_36 = new JMenuItem("Ord Pago Terceros");
		mnGeneracinDeOp.add(mntmNewMenuItem_36);
		
		mntmNewMenuItem_37 = new JMenuItem("Ord Pago Detracciones");
		mnGeneracinDeOp.add(mntmNewMenuItem_37);
		
		mntmNewMenuItem_35 = new JMenuItem("Gen. Voucher Pago AFP");
		mnGeneracinDeOp.add(mntmNewMenuItem_35);
		
		mntmNewMenuItem_38 = new JMenuItem("Gen. Voucher Pago Planillas");
		mnGeneracinDeOp.add(mntmNewMenuItem_38);
		
		mnReportesGerenciales = new JMenu("Reportes Gerenciales");
		menuBar.add(mnReportesGerenciales);
		
		mntmNewMenuItem_40 = new JMenuItem("Mantenimiento Agencia Bancos");
		mnReportesGerenciales.add(mntmNewMenuItem_40);
		
		mntmNewMenuItem_39 = new JMenuItem("Parametros de Flujo de Caja");
		mnReportesGerenciales.add(mntmNewMenuItem_39);
		
		mntmNewMenuItem_42 = new JMenuItem("Flujo de Caja");
		mnReportesGerenciales.add(mntmNewMenuItem_42);
		
		mntmNewMenuItem_44 = new JMenuItem("Flujo de Caja Proyectado");
		mnReportesGerenciales.add(mntmNewMenuItem_44);
		
		mntmNewMenuItem_43 = new JMenuItem("Flujo de Caja Det");
		mnReportesGerenciales.add(mntmNewMenuItem_43);
		
		mntmNewMenuItem_45 = new JMenuItem("Saldo de Cta Cte");
		mnReportesGerenciales.add(mntmNewMenuItem_45);
		
		mntmNewMenuItem_46 = new JMenuItem("Buscador de Documentos");
		mnReportesGerenciales.add(mntmNewMenuItem_46);
		
		mntmNewMenuItem_47 = new JMenuItem("Saldo Disponible de la Empresa");
		mnReportesGerenciales.add(mntmNewMenuItem_47);
		
		mntmNewMenuItem_41 = new JMenuItem("Reporte de inversiones");
		mnReportesGerenciales.add(mntmNewMenuItem_41);
		
		mnSalir = new JMenu("Salir");
		menuBar.add(mnSalir);
		
		mntmNewMenuItem_48 = new JMenuItem("Salir");
		mnSalir.add(mntmNewMenuItem_48);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}

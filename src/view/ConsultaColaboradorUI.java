package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ConsultaColaboradorUI extends JInternalFrame {
	private JTable jtColaboradores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaColaboradorUI frame = new ConsultaColaboradorUI();
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
	public ConsultaColaboradorUI() {
		setClosable(true);
		setTitle("Consulta de Colaboradores");
		setBounds(100, 100, 634, 320);
		
		jtColaboradores = new JTable();
		
		JButton btnFechar = new JButton("Fechar");
		
		JButton btnEditar = new JButton("Editar");
		
		JButton btnExcluir = new JButton("Excluir");
		
		JButton btnAtualizar = new JButton("Atualizar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnAtualizar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnExcluir)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnEditar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnFechar))
						.addComponent(jtColaboradores, GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jtColaboradores, GroupLayout.PREFERRED_SIZE, 197, GroupLayout.PREFERRED_SIZE)
					.addGap(31)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnFechar)
						.addComponent(btnEditar)
						.addComponent(btnExcluir)
						.addComponent(btnAtualizar))
					.addContainerGap(59, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);

	}

}

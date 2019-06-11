package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import Modelo.Regulares;
import vistaVentana.UIGazpacho;

public class ParaUI extends UIGazpacho {

	LocalDateTime fechaActual = LocalDateTime.of(2020, 01, 01, 8, 00);

	public ParaUI() {
		assert getAltaPaciente().getTxtNombre() != null
				&& Validadores.validar(Regulares.comunLetras, getAltaPaciente().getTxtNombre());
		assert getAltaPaciente().getTextApellidos() != null
				&& Validadores.validar(Regulares.comunLetras, getAltaPaciente().getTextApellidos());
		assert getAltaPaciente().getTextDireccion() != null;
		assert getAltaPaciente().getTextTelefono() != null
				&& Validadores.validar(Regulares.telefono, getAltaPaciente().getTextTelefono());
		assert getAltaPaciente().getTxtNacimiento() != null
				&& Validadores.validar(Regulares.fecha, getAltaPaciente().getTxtNacimiento());
		assert getAltaPaciente().getTextField() != null
				&& Validadores.validar(Regulares.comunLetras, getAltaPaciente().getTextField());

		assert getBajaPaciente().getTxtNombre() != null
				&& Validadores.validar(Regulares.comunLetras, getBajaPaciente().getTxtNombre());
		assert getBajaPaciente().getTextApellidos() != null
				&& Validadores.validar(Regulares.comunLetras, getBajaPaciente().getTextApellidos());
		assert getBajaPaciente().getTextDireccion() != null;
		assert getBajaPaciente().getTextTelefono() != null
				&& Validadores.validar(Regulares.telefono, getBajaPaciente().getTextTelefono());
		assert getBajaPaciente().getTxtNacimiento() != null
				&& Validadores.validar(Regulares.fecha, getBajaPaciente().getTxtNacimiento());
		assert getBajaPaciente().getTextField() != null
				&& Validadores.validar(Regulares.comunLetras, getBajaPaciente().getTextField());

		assert getConsultaDatosPacientes().getTxtNombre() != null
				&& Validadores.validar(Regulares.comunLetras, getConsultaDatosPacientes().getTxtNombre());
		assert getConsultaDatosPacientes().getTextApellidos() != null
				&& Validadores.validar(Regulares.comunLetras, getConsultaDatosPacientes().getTextApellidos());
		assert getConsultaDatosPacientes().getTextDireccion() != null;
		assert getConsultaDatosPacientes().getTextTelefono() != null
				&& Validadores.validar(Regulares.telefono, getConsultaDatosPacientes().getTextTelefono());
		assert getConsultaDatosPacientes().getTxtNacimiento() != null
				&& Validadores.validar(Regulares.fecha, getConsultaDatosPacientes().getTxtNacimiento());

		assert getModificacionPaciente().getTxtNombre() != null
				&& Validadores.validar(Regulares.comunLetras, getModificacionPaciente().getTxtNombre());
		assert getModificacionPaciente().getTextApellidos() != null
				&& Validadores.validar(Regulares.comunLetras, getModificacionPaciente().getTextApellidos());
		assert getModificacionPaciente().getTextDireccion() != null;
		assert getModificacionPaciente().getTextTelefono() != null
				&& Validadores.validar(Regulares.telefono, getModificacionPaciente().getTextTelefono());
		assert getModificacionPaciente().getTxtNacimiento() != null
				&& Validadores.validar(Regulares.fecha, getModificacionPaciente().getTxtNacimiento());
		assert getModificacionPaciente().getTextField() != null
				&& Validadores.validar(Regulares.comunLetras, getModificacionPaciente().getTextField());

		assert getPedirCitaEspecialista().getTextField() != null
				&& Validadores.validar(Regulares.comunLetras, getPedirCitaEspecialista().getTextField());

		assert getPedirCitaPrimaria().getTextField() != null
				&& Validadores.validar(Regulares.comunLetras, getPedirCitaPrimaria().getTextField());
		
		assert getPedirOperacion().getTextField() != null
				&& Validadores.validar(Regulares.comunLetras, getPedirOperacion().getTextField());
		
		assert getAltaMedico().getTxtNombre() != null
				&& Validadores.validar(Regulares.comunLetras, getAltaMedico().getTxtNombre());
		assert getAltaMedico().getTextApellidos() != null
				&& Validadores.validar(Regulares.comunLetras, getAltaMedico().getTextApellidos());
		assert getAltaMedico().getTextDireccion() != null;
		assert getAltaMedico().getTextTelefono() != null
				&& Validadores.validar(Regulares.telefono, getAltaMedico().getTextTelefono());
		assert getAltaMedico().getTxtNacimiento() != null
				&& Validadores.validar(Regulares.fecha, getAltaMedico().getTxtNacimiento());
		assert getAltaMedico().getTextField() != null
				&& Validadores.validar(Regulares.comunLetras, getAltaMedico().getTextField());
		assert getAltaMedico().getAltaHorario() != null
				&& Validadores.validar(Regulares.hora, getAltaMedico().getAltaHorario().toString());
		assert getAltaMedico().getAltaConsulta() != null
				&& Validadores.validar(Regulares.comunLetras, getAltaMedico().getAltaConsulta().toString());
		
		assert getBajaMedico().getTxtNombre() != null
				&& Validadores.validar(Regulares.comunLetras, getBajaMedico().getTxtNombre());
		assert getBajaMedico().getTextApellidos() != null
				&& Validadores.validar(Regulares.comunLetras, getBajaMedico().getTextApellidos());
		assert getBajaMedico().getTextDireccion() != null;
		assert getBajaMedico().getTextTelefono() != null
				&& Validadores.validar(Regulares.telefono, getBajaMedico().getTextTelefono());
		assert getBajaMedico().getTxtNacimiento() != null
				&& Validadores.validar(Regulares.fecha, getBajaMedico().getTxtNacimiento());
		assert getBajaMedico().getTextField() != null
				&& Validadores.validar(Regulares.comunLetras, getBajaMedico().getTextField());
		assert getBajaMedico().getTxtEspecialidad() != null
				&& Validadores.validar(Regulares.comunLetras, getBajaMedico().getTxtEspecialidad().toString());
		assert getBajaMedico().getBajaConsulta() != null
				&& Validadores.validar(Regulares.comunLetras, getBajaMedico().getBajaConsulta().toString());
		assert getBajaMedico().getBajaHorario() != null
				&& Validadores.validar(Regulares.hora, getBajaMedico().getBajaHorario().toString());
		
		assert getAtenderCita().getCitaDosis() != null
				&& Validadores.validar(Regulares.comunNumero, getAtenderCita().getCitaDosis().toString());
		assert getAtenderCita().getCitaHora() != null
				&& Validadores.validar(Regulares.hora, getAtenderCita().getCitaHora().toString());
		assert getAtenderCita().getCitaPaciente() != null
				&& Validadores.validar(Regulares.comunLetras, getAtenderCita().getCitaPaciente().toString());
		assert getAtenderCita().getCitaPeriodo() != null
				&& Validadores.validar(Regulares.comunNumero, getAtenderCita().getCitaPeriodo().toString());
		assert getAtenderCita().getTextField() != null
				&& Validadores.validar(Regulares.comunLetras, getAtenderCita().getTextField());
		
		assert getConsultaDatosMedico().getTxtNombre() != null
				&& Validadores.validar(Regulares.comunLetras, getConsultaDatosMedico().getTxtNombre());
		assert getConsultaDatosMedico().getTextApellidos() != null
				&& Validadores.validar(Regulares.comunLetras, getConsultaDatosMedico().getTextApellidos());
		assert getConsultaDatosMedico().getTextDireccion() != null;
		assert getConsultaDatosMedico().getTextTelefono() != null
				&& Validadores.validar(Regulares.telefono, getConsultaDatosMedico().getTextTelefono());
		assert getConsultaDatosMedico().getTxtNacimiento() != null
				&& Validadores.validar(Regulares.fecha, getConsultaDatosMedico().getTxtNacimiento());
		assert getConsultaDatosMedico().getAltaConsulta() != null
				&& Validadores.validar(Regulares.comunLetras, getConsultaDatosMedico().getAltaConsulta().toString());
		assert getConsultaDatosMedico().getAltaEspecialidad() != null
				&& Validadores.validar(Regulares.comunLetras, getConsultaDatosMedico().getAltaEspecialidad().toString());
		assert getConsultaDatosMedico().getAltaHorario() != null
				&& Validadores.validar(Regulares.hora, getConsultaDatosMedico().getAltaHorario().toString());
		
		assert getCierreOperacion().getTextField() != null
				&& Validadores.validar(Regulares.comunLetras, getCierreOperacion().getTextField());

		btnPasarTiempo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int diaNuevo = (int) spnPasarDía.getValue();
				int horaNueva = (int) spnPasarHora.getValue();
				fechaActual = fechaActual.plusDays(diaNuevo);
				fechaActual = fechaActual.plusHours(horaNueva);
				System.out.println(fechaActual);
				spnPasarDía.setValue(0);
				spnPasarHora.setValue(0);
			}
		});
		getAltaPaciente().getBtnMensaje().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hola");
			}
		});
	}
}

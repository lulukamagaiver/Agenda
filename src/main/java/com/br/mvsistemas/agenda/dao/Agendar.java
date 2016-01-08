package com.br.mvsistemas.agenda.dao;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.ScheduleEntryMoveEvent;
import org.primefaces.event.ScheduleEntryResizeEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultScheduleEvent;
import org.primefaces.model.DefaultScheduleModel;
import org.primefaces.model.ScheduleEvent;
import org.primefaces.model.ScheduleModel;

import com.br.mvsistemas.agenda.bean.Cliente;

@ManagedBean
@ViewScoped
public class Agendar implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5222593532605491920L;

	private ScheduleModel eventModel;

	private ScheduleEvent event = new DefaultScheduleEvent();
	
	private Cliente cliente;
	
	private Date inicio, fim, todoDia;

	@PostConstruct
	public void init() {
		eventModel = new DefaultScheduleModel();
		eventModel.addEvent(new DefaultScheduleEvent("Champions League Match",hora(2016, 01, 07, 14, 30), hora(2016, 01, 2016, 15, 30)));
		eventModel.addEvent(new DefaultScheduleEvent("Vinicius",new Date(),new Date()));
		
		/*eventModel.addEvent(new DefaultScheduleEvent(cliente.getPessoa().getNome(), inicio, fim));*/
	}
	

	/**
	 * @return the eventModel
	 */
	public ScheduleModel getEventModel() {
		return eventModel;
	}

	/**
	 * @param eventModel
	 *            the eventModel to set
	 */
	public void setEventModel(ScheduleModel eventModel) {
		this.eventModel = eventModel;
	}

	/**
	 * @return the event
	 */
	public ScheduleEvent getEvent() {
		return event;
	}

	/**
	 * @param event
	 *            the event to set
	 */
	public void setEvent(ScheduleEvent event) {
		this.event = event;
	}

	public void onEventSelect(SelectEvent selectEvent) {
		event = (ScheduleEvent) selectEvent.getObject();
	}

	public void onDateSelect(SelectEvent selectEvent) {
		event = new DefaultScheduleEvent("", (Date) selectEvent.getObject(),
				(Date) selectEvent.getObject());
	}

	public void onEventMove(ScheduleEntryMoveEvent event) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Agendamento Movido", "Day delta:" + event.getDayDelta()
						+ ", Minute delta:" + event.getMinuteDelta());

		addMessage(message);
	}

	public void onEventResize(ScheduleEntryResizeEvent event) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
				"Agendamento Redimensionado", "Day delta:"
						+ event.getDayDelta() + ", Minute delta:"
						+ event.getMinuteDelta());

		addMessage(message);
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the inicio
	 */
	public Date getInicio() {
		return inicio;
	}

	/**
	 * @param inicio the inicio to set
	 */
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	/**
	 * @return the fim
	 */
	public Date getFim() {
		return fim;
	}

	/**
	 * @param fim the fim to set
	 */
	public void setFim(Date fim) {
		this.fim = fim;
	}

	/**
	 * @return the todoDia
	 */
	public Date getTodoDia() {
		return todoDia;
	}

	/**
	 * @param todoDia the todoDia to set
	 */
	public void setTodoDia(Date todoDia) {
		this.todoDia = todoDia;
	}

	private void addMessage(FacesMessage message) {
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public void addEvent(ActionEvent actionEvent) {
		if (event.getId() == null)
			eventModel.addEvent(event);
		else
			eventModel.updateEvent(event);

		event = new DefaultScheduleEvent();
	}
	
	private Calendar today() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE), 0, 0, 0);
 
        return calendar;
    }
	
	private Date hora(int ano, int mes, int data, int hora, int minutos) {
        Calendar t = (Calendar) today().clone();
        t.set(ano, mes, data, hora, minutos);
         
        return t.getTime();
    }
     
}

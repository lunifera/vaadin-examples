package org.lunifera.example.vaadin.osgi.simplest.ds.bootstrap;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

/**
 * An implementation of VaadinServlet that uses SimpleUI as its base UI.
 */
@SuppressWarnings("serial")
@VaadinServletConfiguration(ui = SimpleDSUI.class, productionMode = false)
public class SimpleVaadinServlet extends VaadinServlet {

}